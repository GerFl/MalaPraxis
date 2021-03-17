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

// Importamos el módulo para acceder al archivo de variables de entorno mediante el path
require('dotenv').config({ path: 'variables.env' });

// Inicializar la app pasando express como función
app = express();

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

// Indicar la página principal
app.use('/', router());

// Indicar el puerto mediante la variable de entorno
app.listen(process.env.PUERTO);