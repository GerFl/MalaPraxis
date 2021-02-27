const Usuarios = require('../models/Usuarios');

exports.formCrearCuenta = (req, res) => {
    res.render('crearCuenta', {
        nombrePagina: 'Crear cuenta en UpTask'
    })
}

exports.crearCuenta = async(req, res) => {
    // Leer los datos
    // console.log(req.body); // Gracias al body parser podemos leer los datos de este request
    const { email, password } = req.body;
    try {
        // Crear el usuario
        await Usuarios.create({
            email,
            password
        });
        res.redirect('/iniciar-sesion');

    } catch (error) {
        req.flash('error', error.errors.map(error => error.message));
        res.render('crearCuenta', {
            mensajes: req.flash(),
            nombrePagina: 'Crear cuenta en UpTask',
            email,
            password
        })
    }
}