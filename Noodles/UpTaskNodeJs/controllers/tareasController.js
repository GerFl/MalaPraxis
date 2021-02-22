const Proyectos = require('../models/Proyectos'); // Importamos los proyectos para poder acceder al parámetro de la url
const Tareas = require('../models/Tareas');

exports.agregarTarea = async(req, res, next) => { // Es una operación asíncrona 
    // res.send('Enviado'); // Se comunica bien el controlador con la vista de tareas.pug y con el router
    // console.log(req.params.url);
    const proyecto = await Proyectos.findOne({ // Buca y encuentra la primer coincidencia
        where: {
            url: req.params.url // Se filtra por el campo de url
        }
    });
    console.log(proyecto); // Despliega los valores para cada columna del proyecto actual
    console.log(req.body); // req.body para leer el valor del campo del input para el nombre de la tarea
    // Leer el valor del input
    const { tarea } = req.body; // Deja vu...
    // Poner estado incompleto
    const estado = 0;
    // Enlazar el proyecto ID
    // proyectoId es el nombre que nos generó la BD por el ORM, por lo tanto debe ser igual para mapear correctamente
    const proyectoId = proyecto.id; // Al traer el proyecto mediante el findOne() podemos acceder a dataValues donde se encuentra el ID del proyecto

    // Insertar en la BD
    const resultado = await Tareas.create({ tarea, estado, proyectoId });
    if (!resultado) {
        return next();
    }

    // Redireccionar al mismo proyecto con el valor que ya tenemos en la barra
    res.redirect(`/proyectos/${req.params.url}`);

}

exports.cambiarEstadoTarea = async(req, res, next) => {
    res.send('Todo bien');
    // console.log(req.params);
    const { id } = req.params;
    const tarea = await Tareas.findOne({
        where: {
            id
        }
    });
    // console.log(tarea);
    // Cambiar estado
    let estado = 0;
    if (tarea.estado === estado) {
        estado = 1;
    }
    tarea.estado = estado;
    const resultado = await tarea.save();
    if (!resultado) return next();

}

exports.eliminarTarea = async(req, res, next) => {
    // console.log(req.query);
    const { id } = req.params;
    // Eliminar la tarea
    const resultado = await Tareas.destroy({ where: { id } });
    if (!resultado) return next();
    res.status(200).send("Se eliminó correctamente del proyecto.");
}