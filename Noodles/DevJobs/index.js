// Importar los modulos y demás archivos
const mongoose = require('mongoose'); // Debe ser el primero
require('./config/db');
const express = require('express');
const router = require('./routes');
const exphbs = require('express-handlebars');
const path = require('path');
const cookieParser = require('cookie-parser');
const session = require('express-session');
const MongoStore = require('connect-mongo')(session);
const bodyParser = require('body-parser');
const expressValidator = require('express-validator');
const flash = require('connect-flash');
const passport = require('./config/passport');
const createError = require('http-errors');

// Importamos el módulo para acceder al archivo de variables de entorno mediante el path
require('dotenv').config({ path: 'variables.env' });

// Inicializar la app pasando express como función
app = express();
// Habilitar body parser
app.use(bodyParser.json());
app.use(bodyParser.urlencoded({ extended: true }));

// Validación de campos
app.use(expressValidator());

// Habilitar Handlebars como Template Engine
app.engine('handlebars',
    exphbs({
        defaultLayout: 'layout',
        helpers: require('./helpers/handlebars') // En pug no era necesario indicar el layout principal, pero pues aqui si gg
            /* Aquí se indico el nombre del archivo que será nuestro layout principal.
            Dicho archivo está en la carpeta de layouts. Y en dicho archivo se puso toda la
            estructura de html, con una variable body que es donde se estará insertando el código de cada página correspondiente.
            Lo hace en automático por lo que ya no hay que definir bloques como tal, como en Pug. 
            */
            /* Los helpers ayudan a comunicarse con handlebars antes de que salga todo */
    })
);

// Habilitar el template engine
app.set('view engine', 'handlebars');

// Habilitar archivos estáticos
app.use(express.static(path.join(__dirname, 'public')));

app.use(cookieParser());
app.use(session({
    secret: process.env.SECRETO,
    key: process.env.KEY,
    resave: false,
    saveUninitialized: false,
    store: new MongoStore({ mongooseConnection: mongoose.connection })
}));
// Inicializar passport
app.use(passport.initialize());
app.use(passport.session());
app.use(flash());
// Alertas y flash messages
app.use(flash());
// Crear nuestro middleware para guardar los mensajes y ver el usuario autenticado
app.use((req, res, next) => {
    res.locals.mensajes = req.flash();
    next();
});

// Indicar la página principal
app.use('/', router());

// Manejo de errores
// 404 - pagina no existente
app.use((req, res, next) => {
    next(createError(404, "No encontrado")); // Declaramos el mensaje para este error
});
// Administracion de los errores
app.use((error, req, res, next) => {
    res.locals.mensaje = error.message;
    const status = error.status || 500; // En caso de que haya error pero no sea 404, ponemos 500 como default
    res.locals.status = status;
    res.status(status);
    res.render('error');
});

// Indicar el puerto mediante la variable de entorno
app.listen(process.env.PUERTO);