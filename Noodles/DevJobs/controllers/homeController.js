// Vista para la página principal. Se muestran los trabajos disponibles ahí.
exports.mostrarTrabajos = (req, res) => {
    res.render('home', {
        nombrePagina: "devJobs",
        tagline: "Encuentra y publica trabajos para desarrolladores web.",
        barra: true,
        boton: true // Título para descripción
    });
}