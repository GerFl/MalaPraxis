// Importar
const express = require('express');
const router = express.Router();
const homeController = require('../controllers/homeController');
const vacantesController = require('../controllers/vacantesController');

module.exports = () => {
    // Ruta para la página principal
    router.get('/', homeController.mostrarTrabajos);

    // Crear vacantes
    router.get('/vacantes/nueva', vacantesController.formularioNuevaVacante);

    return router;
}