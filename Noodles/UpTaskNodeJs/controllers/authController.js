const passport = require('passport');

exports.autenticarUsuario = passport.authenticate('local', {
    successRedirect: '/',
    failureRedirect: '/iniciar-sesion',
    failureFlash: true,
    badRequestMessage: "Ambos campos son obligatorios puñetas"
});

// Función para revisar si el usuario está loggeado o no
exports.usuarioAutenticado = (req, res, next) => {
    // Si el usuario está autenticado, adelante
    if (req.isAuthenticated()) {
        return next(); // Pasar al siguiente middleware
    }

    // Si no está autenticado, redirigir al formulario
    return res.redirect('/iniciar-sesion');
}

// Función para cerrar sesión
exports.cerrarSesion = (req, res) => {
    req.session.destroy(() => {
        res.redirect('/iniciar-sesion'); // Al cerrar sesión nos lleva al login
    })
}