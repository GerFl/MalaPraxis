// Importar
const passport = require('passport');
const mongoose = require('mongoose');
const Vacante = mongoose.model('Vacante');
const Usuarios = mongoose.model('Usuarios');
const crypto = require('crypto');
const enviarEmail = require('../handlers/email');

exports.autenticarUsuario = passport.authenticate('local', {
    successRedirect: '/administracion',
    failureRedirect: '/iniciar-sesion',
    failureFlash: true,
    badRequestMessage: "Ambos campos son obligatorios"
});

// Revisar si el usuario está autenticado o no
exports.verificarUsuario = (req, res, next) => {
    // Revisar el usuario
    if (req.isAuthenticated()) { // Método de passport
        return next(); // Está autenticado
    }
    // Redireccionar
    res.redirect('/iniciar-sesion');
}

exports.mostrarPanel = async(req, res) => {
    // Consultar el usuario autenticado
    const vacantes = await Vacante.find({ autor: req.user._id }).lean();

    res.render('administracion', {
        nombrePagina: "Panel de administración",
        tagline: "Crea y administra tus vacantes desde aquí",
        vacantes,
        cerrarSesion: true,
        nombre: req.user.nombre,
        imagen: req.user.imagen
    })
}

exports.cerrarSesion = (req, res) => {
    req.logout();
    req.flash('correcto', "Cerraste sesión correctamente");
    return res.redirect('/iniciar-sesion');
}

// Formulario para reestablecer el password
exports.formReestablecerPassword = (req, res) => {
    res.render('reestablecer-password', {
        nombrePagina: "Reestablece tu password",
        tagline: "Si ya tienes una cuenta pero olvidaste tu password, coloca tu email"
    });
}

// Generar el token en la tabla de usuario
exports.enviarToken = async(req, res, next) => {
    const usuario = await Usuarios.findOne({ email: req.body.email });

    if (!usuario) {
        req.flash('error', "No existe esa cuenta");
        return res.redirect('/iniciar-sesion');
    }

    // El usuario existe, generar token
    usuario.token = crypto.randomBytes(20).toString('hex');
    usuario.expira = Date.now() + 3600000;

    // Guardar el usuario
    await usuario.save();
    const resetUrl = `http://${req.headers.host}/reestablecer-password/${usuario.token}`;


    // Enviar notificación por correo
    console.log("Haciendo el await en authController");
    await enviarEmail.enviar({
        usuario,
        subject: "Password reset",
        resetUrl,
        archivo: 'reset'
    });
    console.log("Después del await en el authController");

    // Todo correcto
    req.flash('correcto', "Revisa tu e-mail para las indicaciones");
    res.redirect('/iniciar-sesion');

}

// Valida si el token es valido y el usuario existe
exports.reestablecerPassword = async(req, res) => {
    const usuario = await Usuarios.findOne({
        token: req.params.token,
        expira: {
            $gt: Date.now()
        }
    });

    if (!usuario) {
        req.flash('error', "El formulario ya no es válido. Intenta de nuevo.");
        return res.redirect('/reestablecer-password');
    }

    // Todo bien. Mostrar el formulario
    res.render('nuevo-password', {
        nombePagina: "Nuevo password"
    });
}

// Almacena el nuevo password en la BD
exports.guardarPassword = async(req, res) => {
    const usuario = await Usuarios.findOne({
        token: req.params.token,
        expira: {
            $gt: Date.now()
        }
    });

    // No existe el usuario o el token es invalido
    if (!usuario) {
        req.flash('error', "El formulario ya no es válido. Intenta de nuevo.");
        return res.redirect('/reestablecer-password');
    }

    // Asignar nuevo password, limpiar valores previos
    usuario.password = req.body.password;
    usuario.token = undefined;
    usuario.expira = undefined;
    // Agregar y eliminar valores del objeto
    await usuario.save();

    // Redirigir
    req.flash('correcto', "Password modificado correctamente");
    res.redirect('/iniciar-sesion');

}