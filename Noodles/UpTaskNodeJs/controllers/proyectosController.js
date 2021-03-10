const Proyectos = require('../models/Proyectos');
const slug = require('slug');
const Tareas = require('../models/Tareas');

exports.proyectosHome = async(req, res) => { // Request es cuando envias, response lo que devuelve el servidor
    // console.log(res.locals.usuario);
    const usuarioId = res.locals.usuario.id;
    const proyectos = await Proyectos.findAll({ where: { usuarioId } });

    res.render('index', {
        nombrePagina: 'Proyectos',
        proyectos
    }); // Tuve que reiniciar el servidor gg
}

exports.formularioProyecto = async(req, res) => {
    const usuarioId = res.locals.usuario.id;
    const proyectos = await Proyectos.findAll({ where: { usuarioId } });
    res.render('nuevoProyecto', {
        nombrePagina: 'Nuevo Proyecto',
        proyectos
    });
}
exports.nuevoProyecto = async(req, res) => {
    const usuarioId = res.locals.usuario.id;
    const proyectos = await Proyectos.findAll({ where: { usuarioId } });
    // res.send("Enviaste algo");
    // Enviar a la consola lo que el usuario escriba
    // console.log(req.body);

    // Validar que tengamos algo en el input
    const { nombre } = req.body;
    let errores = [];
    if (!nombre) {
        errores.push({ 'texto': 'Agregar un nombre al proyecto' });
    }
    // Si hay errores
    if (errores.length > 0) {
        res.render('nuevoProyecto', {
            nombrePagina: 'Nuevo Proyecto',
            errores,
            proyectos
        })
    } else {
        // No hay errores. Insertar en la BD
        const usuarioId = res.locals.usuario.id;
        await Proyectos.create({ nombre, usuarioId });
        res.redirect('/');
        // .then(() => console.log('Insertado correctamente'))
        // .catch(error => console.log(error));
    }
}

exports.proyectoPorUrl = async(req, res, next) => {
    /* const proyectos = await Proyectos.findAll();
    // Pa traerse solamente uno gg. Método de sequelize
    const proyecto = await Proyectos.findOne({
        where: {
            url: req.params.url
        }
    }); */
    /*  Debido a que listar todos los proyectos y obtener el proyecto actual
        no son dependientes, no es necesario utilizar el await. 
        Se pueden utilizar promesas para mejorar el performance.
        Props to ddFanybb
    */
    const usuarioId = res.locals.usuario.id;
    const proyectosPromise = Proyectos.findAll({ where: { usuarioId } }); // Estos promises corren en paralelo
    const proyectoPromise = Proyectos.findOne({
        where: {
            url: req.params.url,
            usuarioId
        }
    });
    // Object destructuring
    const [proyectos, proyecto] = await Promise.all([proyectosPromise, proyectoPromise]);

    // Consultar tareas del proyecto actual
    // console.log(proyecto);
    const tareas = await Tareas.findAll({
        where: {
            proyectoId: proyecto.id
        },
        // include:[
        //     {model:Proyectos}
        // ]
    });
    // console.log(tareas);

    if (!proyecto) return next();
    // console.log(proyecto)
    // res.send('Ok');

    // Render a la vista
    res.render('tareas', {
        nombrePagina: 'Tareas del proyecto',
        proyecto,
        proyectos,
        tareas
    });
}

exports.formularioEditar = async(req, res) => {
    // Listar todos
    // const proyectos = await Proyectos.findAll();
    // Buscar el que se va a editar. El await espera que el de arriba termine para continuar con el segundo await
    /* const proyecto=await Proyectos.findOne({
        where:{
            id:req.params.id
        }
    }); */
    /*  Debido a que listar todos los proyectos y obtener el proyecto actual
        no son dependientes, no es necesario utilizar el await. 
        Se pueden utilizar promesas para mejorar el performance.
        Props to ddFanybb
    */
    const usuarioId = res.locals.usuario.id;
    const proyectosPromise = Proyectos.findAll({ where: { usuarioId } });
    const proyectoPromise = Proyectos.findOne({
        where: {
            id: req.params.id,
            usuarioId
        }
    });
    // Object destructuring
    const [proyectos, proyecto] = await Promise.all([proyectosPromise, proyectoPromise]);
    // Render a la vista
    res.render('nuevoProyecto', {
        nombrePagina: 'Editar Proyecto',
        proyectos,
        proyecto
    });
}

exports.actualizarProyecto = async(req, res) => {
    const usuarioId = res.locals.usuario.id;
    const proyectos = await Proyectos.findAll({ where: { usuarioId } });
    // res.send("Enviaste algo");
    // Enviar a la consola lo que el usuario escriba
    // console.log(req.body);

    // Validar que tengamos algo en el input
    const { nombre } = req.body;
    let errores = [];
    if (!nombre) {
        errores.push({ 'texto': 'Agregar un nombre al proyecto' });
    }
    // Si hay errores
    if (errores.length > 0) {
        res.render('nuevoProyecto', {
            nombrePagina: 'Nuevo Proyecto',
            errores,
            proyectos
        })
    } else { // No hay errores. Actualizar en la BD
        await Proyectos.update({ nombre: nombre }, { where: { id: req.params.id } });
        res.redirect('/');
        // .then(() => console.log('Insertado correctamente'))
        // .catch(error => console.log(error));
    }
}

exports.eliminarProyecto = async(req, res, next) => {
    // req, query o param
    const { urlProyecto } = req.query;
    // destroy = DELETE
    const resultado = await Proyectos.destroy({
        where: {
            url: urlProyecto
        }
    });
    // En caso de que se haya perdido la conexión con la BD del servidor
    // Si no se llevó a cabo la función del await
    if (!resultado) {
        return next(); // Va al siguiente middleware
    }
    // El status 200 indica que el request está correcto, luego de eso manda por el send la respuesta al bloque de Swal en proyectos.js
    res.status(200).send('Proyecto eliminado correctamente.');
}