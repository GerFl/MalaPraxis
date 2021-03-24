const mongoose = require('mongoose');
const Usuarios = mongoose.model('Usuarios');

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