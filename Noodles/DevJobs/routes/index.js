// Importar
const express = require('express');
const router = express.Router();
const homeController = require('../controllers/homeController');

module.exports = () => {
    // Ruta para la página principal
    router.get('/', homeController.mostrarTrabajos);

    return router;
}