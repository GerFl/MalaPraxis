// Cualquier de las dos formas jala
// const Vacante=require('../models/Vacantes');
const mongoose = require('mongoose');
const Vacante = mongoose.model('Vacante');

exports.formularioNuevaVacante = (req, res) => {
    res.render('nueva-vacante', {
        nombrePagina: "Nueva vacante",
        tagline: "Llena el formulario y publica tu vacante"
    });
}

// Agregar vacantes a la base de datos
exports.agregarVacante = async(req, res) => {
    const vacante = new Vacante(req.body); // Pasamos el request que se va a mapear gracias a los names
    // Crear arreglo de habilidades
    // Los skills vienen como un string, los separamos con split
    vacante.skills = req.body.skills.split(',');

    // Almacenar en la BD
    const nuevaVacante = await vacante.save();
    // Redireccionar
    res.redirect(`/vacantes/${nuevaVacante.url}`);
}

// Muestra una vacante
exports.mostrarVacante = async(req, res, next) => {
    const vacante = await Vacante.findOne({ url: req.params.url }).lean();

    // Si no hay resultados
    if (!vacante) return next(); // Siguiente middleware

    res.render('vacante', {
        vacante, // Pasamos todo el objeto
        nombrePagina: vacante.titulo,
        barra: true
    });
}

exports.formEditarVacante = async(req, res, next) => {
    const vacante = await Vacante.findOne({ url: req.params.url }).lean();

    if (!vacante) return next();

    res.render('editar-vacante', {
        vacante,
        nombrePagina: `Editar - ${vacante.titulo}`
    });
}

exports.editarVacante = async(req, res) => {
    const vacanteActualizada = req.body;
    console.log(vacanteActualizada);
    vacanteActualizada.skills = req.body.skills.split(',');
    console.log(vacanteActualizada);
    const vacante = await Vacante.findOneAndUpdate({ url: req.params.url }, vacanteActualizada, {
        new: true, // Se traerá el documento actualizado
        runValidators: true
    });
    res.redirect(`/vacantes/${vacante.url}`);
}