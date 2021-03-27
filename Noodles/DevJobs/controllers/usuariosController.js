const mongoose = require('mongoose');
const Usuarios = mongoose.model('Usuarios');
const multer = require('multer');
const shortid = require('shortid');

exports.subirImagen = (req, res, next) => {
    upload(req, res, function(error) { // Esta funcion se comunica con Multer
        if (error) {
            if (error instanceof multer.MulterError) {
                if (error.code === 'LIMIT_FILE_SIZE') {
                    req.flash('error', "El archivo es muy grande: Máximo 1Mb");
                } else {
                    req.flash('error', error.message);
                }
            } else {
                req.flash('error', error.message);
            }
            res.redirect('/administracion');
            return;
        } else {
            next();
        }
    });
}

// Opciones de Multer
const configuracionMulter = {
    limits: { fileSize: 1000000 },
    storage: fileStorage = multer.diskStorage({
        destination: (req, file, cb) => {
            cb(null, __dirname + '../../public/uploads/perfiles');
        },
        filename: (req, file, cb) => {
            // console.log(file); // file contiene la información del archivo que se sube
            const extension = file.mimetype.split('/')[1];
            cb(null, `${shortid.generate()}.${extension}`);
            console.log(extension);
        }
    }),
    fileFilter(req, file, cb) {
        if (file.mimetype === 'image/jpeg' || file.mimetype === 'image/png') {
            // Se ejecuta el callback como true o false : true cuando la imagen se acepta
            cb(null, true);
        } else {
            // callback actua como un next
            cb(new Error('Formato no válido'), false);
        }
    }
}

const upload = multer(configuracionMulter).single('imagen');

exports.formCrearCuenta = (req, res) => {
    res.render('crear-cuenta', {
        nombrePagina: 'Crea tu cuenta en devJobs',
        tagline: 'Comienza a publicar tus vacantes gratis.'
    })
}

exports.validarRegistro = (req, res, next) => {
    // Sanitizar los campos
    // Mutar los datos : osea, cambiarlos
    console.log(req.body);
    req.sanitizeBody('nombre').escape(); // Cambiará nuestro req.body original
    req.sanitizeBody('email').escape();
    req.sanitizeBody('password').escape();
    req.sanitizeBody('confirmar').escape();
    console.log(req.body);

    // Validar
    req.checkBody('nombre', 'El nombre es obligatorio').notEmpty();
    req.checkBody('email', 'El correo electrónico debe ser válido').isEmail();
    req.checkBody('password', 'El password no puede ir vacío').notEmpty();
    req.checkBody('confirmar', 'Confirmar password').notEmpty();
    req.checkBody('confirmar', 'El password es diferente').equals(req.body.password);

    const errores = req.validationErrors(); // En caso de que checkbody esté vacío, todos los errores se almacenan en esta función

    if (errores) {
        // Si hay errores
        console.log(errores);
        req.flash('error', errores.map(error => error.msg)); // Con map iteramos en cada uno de los errores que se almacenaron
        // en el arreglo, y los mandamos para mostrar con flash
        res.render('crear-cuenta', {
            nombrePagina: 'Crea tu cuenta en devJobs',
            tagline: 'Comienza a publicar tus vacantes gratis.',
            mensajes: req.flash()
        });
        return;
    }
    // Si toda la validacion es correcta
    next();

}

exports.crearUsuario = async(req, res, next) => {
    // Crear el usuario
    const usuario = new Usuarios(req.body);
    try {
        await usuario.save();
        res.redirect('/iniciar-sesion');
    } catch (error) {
        req.flash('error', error);
        res.redirect('/crear-cuenta');
    }

}

// Formulario para iniciar sesión
exports.formIniciarSesion = (req, res) => {
    res.render('iniciar-sesion', {
        nombrePagina: "Iniciar sesión en DevJobs"
    });
}

// Formulario para editar perfil
exports.formEditarPerfil = (req, res) => {
    res.render('editar-perfil', {
        nombrePagina: "Edita tu perfil de DevJobs",
        usuario: req.user.toObject(),
        cerrarSesion: true,
        nombre: req.user.nombre,
        imagen: req.user.imagen
    });
}

// Guardar cambios editar perfil
exports.editarPerfil = async(req, res) => {
    const usuario = await Usuarios.findById(req.user._id);
    console.log(usuario);
    usuario.nombre = req.body.nombre;
    usuario.email = req.body.email;
    if (req.body.password) {
        usuario.password = req.body.password;
    }
    if (req.file) { // Unicamente cuando haya una imagen se va a insertar
        usuario.imagen = req.file.filename;
    }

    await usuario.save();

    req.flash('correcto', "Cambios guardados correctamente");
    // Redireccionar
    res.redirect('/administracion');
}

// Sanitizar y validar el formulario de editar perfil
exports.validarPerfil = (req, res, next) => {
    // Sanitizar
    req.sanitizeBody('nombre').escape();
    req.sanitizeBody('email').escape();
    if (req.body) {
        req.sanitizeBody('password').escape();
    }

    // Validar
    req.checkBody('nombre', "El nombre no puede ir vacío").notEmpty();
    req.checkBody('email', "El correo no puede ir vacío").notEmpty();

    const errores = req.validationErrors();

    if (errores) {
        console.log(errores);
        req.flash('error', errores.map(error => error.msg));
        res.render('editar-perfil', {
            nombrePagina: "Edita tu perfil de DevJobs",
            usuario: req.user.toObject(),
            cerrarSesion: true,
            nombre: req.user.nombre,
            imagen: req.user.imagen,
            mensajes: req.flash()
        });

        return;
    }

    next();

}