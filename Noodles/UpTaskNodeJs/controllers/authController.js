const passport = require('passport');
const Usuarios = require('../models/Usuarios');
const crypto = require('crypto');
const Sequelize = require('sequelize');
const Op = Sequelize.Op;
const bcrypt = require('bcrypt-nodejs');
const enviarEmail = require('../handlers/email');

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

// Genera un token si el usuario es válido
exports.enviarToken = async(req, res) => {
    // Verificar que el usuario existe
    // req.body es tu nuevo amigo
    const { email } = req.body;
    const usuario = await Usuarios.findOne({ where: { email } });

    // Si no existe el usuario
    if (!usuario) {
        req.flash('error', 'No existe esa cuenta');
        res.redirect('/reestablecer');
    }

    // Usuario existe
    usuario.token = crypto.randomBytes(20).toString('hex');
    usuario.expiracion = Date.now() + 3600000;

    // Guardarlos en la BD
    await usuario.save();

    // URL de reset
    const resetUrl = `http://${req.headers.host}/reestablecer/${usuario.token}`;

    // Envia el correo con el token
    await enviarEmail.enviar({
        usuario,
        subject: 'Password reset',
        resetUrl,
        archivo: 'reestablecer-password'
    });

    req.flash('correcto', "Se envió un mensaje a tu correo.");
    res.redirect('/iniciar-sesion');

}

exports.validarToken = async(req, res) => {
    const usuario = await Usuarios.findOne({
        where: {
            token: req.params.token
        }
    });

    // Si no se encuentra el usuario
    if (!usuario) {
        req.flash('error', "No válido");
        res.redirect('/reestablecer');
    }

    // Formulario para generar el password
    res.render('resetPassword', {
        nombrePagina: "Reestablecer contraseña"
    });

}

// Cambia el password por uno nuevo
exports.actualizarPassword = async(req, res) => {
    // Verifica el token válido pero también la fecha de expiración
    const usuario = await Usuarios.findOne({
        where: {
            token: req.params.token,
            expiracion: {
                [Op.gte]: Date.now()
            }
        }
    });
    // Verificar si el usuario existe
    if (!usuario) {
        req.flash('error', "No válido");
        res.redirect('/reestablecer');
    }

    // Hashear el nuevo password
    usuario.password = bcrypt.hashSync(req.body.password, bcrypt.genSaltSync(10));
    usuario.token = null;
    usuario.expiracion = null;

    // Guardar el nuevo password
    await usuario.save();

    req.flash('correcto', 'Tu password se ha modificado correctamente.');
    res.redirect('/iniciar-sesion');
}