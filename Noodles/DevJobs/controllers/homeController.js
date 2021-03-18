// Importar el ORM y el modelo
const mongoose = require('mongoose');
const Vacante = mongoose.model('Vacante');

// Vista para la página principal. Se muestran los trabajos disponibles ahí.
exports.mostrarTrabajos = async(req, res, next) => {
    const vacantes = await Vacante.find().lean(); // Nos retornará todos las vacantes que existan. Investigar el lean() cuando puedas
    if (!vacantes) return next(); // Si no encuentra nada se pasa al siguiente middleware
    res.render('home', {
        nombrePagina: "devJobs",
        tagline: "Encuentra y publica trabajos para desarrolladores web.", // Titulo para la descripcion
        barra: true,
        boton: true,
        vacantes // Pasar los resultados del .find() a la vista
    });
}