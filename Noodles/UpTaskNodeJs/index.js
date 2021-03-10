// EM6 import express from 'express';
const express = require('express');
const routes = require('./routes'); // Importa las rutas del index.js de Routes
const path = require('path');
const bodyParser = require('body-parser');
const expressValidator = require('express-validator');
const flash = require('connect-flash');
const cookieParser = require('cookie-parser');
const session = require('express-session');
const passport = require('./config/passport');

// Helpers con algunas funciones
const helpers = require('./helpers');

// Crear la conexión a la BD
const db = require('./config/db');
// Importar el modelo para que sepa qué crear
require('./models/Proyectos');
require('./models/Tareas');
require('./models/Usuarios');


db.sync()
    .then(() => console.log('Conectado al servidor'))
    .catch(error => console.log(error));

// Crear una aplicación de Express
const app = express(); // Pasa la variable de arriba como función. La app recibe lo necesario para hacer el servidor

// Donde cargar los archivos estáticos
app.use(express.static('public'));

// Habilitar el view engine - Pug, Handlebars, EJS, etc.
app.set('view engine', 'pug');

// Habilitar bodyParser para leer datos del formulario
app.use(bodyParser.urlencoded({ extend: true }));
// BodyParser ayuda a leer los datos de un HTTP Request, o algo así

// Añadir Express validator
// app.use(expressValidator());

// Agregar flash messages
app.use(flash());
app.use(cookieParser());
// Express session para navegar entre distintas páginas sin volvernos a autenticar
app.use(session({
    secret: 'supersecreto',
    resave: false,
    saveUninitialized: false
}));

app.use(passport.initialize());
app.use(passport.session());


// Añadir la carpeta de las vistas
app.set('views', path.join(__dirname, './views'));

// Pasar vardump a la aplicación
app.use((req, res, next) => {
    // res.locals es un método para crear variables y consumirlas en cualquier archivo, por eso tiene el res y req
    res.locals.vardump = helpers.vardump; // Se lee esta acción
    res.locals.mensajes = req.flash();
    res.locals.usuario = {...req.user } || null; // Crear una copia del sesion, si está undefined entonces null
    next(); // Se va a la siguiente acción
});





app.use('/', routes());

app.listen(3000); // Decir el puerto en el que va a correr. .listen es un método de express