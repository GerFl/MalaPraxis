// Express Router. Si no se ponen estas cosas entonces las rutas de abajo no van a funcionar
const express = require('express');
const router = express.Router();
// Importar Express Validator
const { body } = require('express-validator'); // Check tiene todos los métodos para revisar ese rollo
// Importar el controlador
const proyectosController = require('../controllers/proyectosController');
const tareasController = require('../controllers/tareasController');
const usuariosController = require('../controllers/usuariosController');

module.exports = function() { // Para exportar las rutas al archivo de index.js
    // Ruta para el Home
    /*
        .use - Para cualquier request, se correrá el código de ese bloque
        .send - Imprime un resultado
    */
    router.get('/', proyectosController.proyectosHome); // Middleware de Express
    router.get('/nuevo-proyecto', proyectosController.formularioProyecto);
    router.post('/nuevo-proyecto',
        body('nombre').not().isEmpty().trim().escape(),
        proyectosController.nuevoProyecto);

    // Listar proyectos
    router.get('/proyectos/:url', proyectosController.proyectoPorUrl);

    // Actualizar el proyecto
    router.get('/proyecto/editar/:id', proyectosController.formularioEditar);

    router.post('/nuevo-proyecto/:id',
        body('nombre').not().isEmpty().trim().escape(),
        proyectosController.actualizarProyecto);

    // Eliminar Proyecto
    router.delete('/proyectos/:url', proyectosController.eliminarProyecto);

    // Tareas
    // Se creó controlador nuevo debido a que ya van a ser operaciones diferentes xd
    router.post('/proyectos/:url', tareasController.agregarTarea);
    // Actualizar tarea
    // Patch solo cambia una porción del objeto, mientras que PUT sobreescribe todo básicamente
    router.patch('/tareas/:id', tareasController.cambiarEstadoTarea);
    // Eliminar tarea
    router.delete('/tareas/:id', tareasController.eliminarTarea);

    // Crear nueva cuenta
    router.get('/crear-cuenta', usuariosController.formCrearCuenta);

    return router;
}