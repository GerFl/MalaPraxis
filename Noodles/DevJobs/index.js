// Importar los modulos y demás archivos
const express = require('express');
const router = require('./routes');
const exphbs = require('express-handlebars');
const path = require('path');

// Inicializar la app pasando express como función
app = express();

// Habilitar Handlebars como Template Engine
app.engine('handlebars',
    exphbs({
        defaultLayout: 'layout' // En pug no era necesario indicar el layout principal, pero pues aqui si gg
            /* Aquí se indico el nombre del archivo que será nuestro layout principal.
            Dicho archivo está en la carpeta de layouts. Y en dicho archivo se puso toda la
            estructura de html, con una variable body que es donde se estará insertando el código de cada página correspondiente.
            Lo hace en automático por lo que ya no hay que definir bloques como tal, como en Pug. 
            */
    })
);

// Habilitar el template engine
app.set('view engine', 'handlebars');

// Habilitar archivos estáticos
app.use(express.static(path.join(__dirname, 'public')));

// Indicar la página principal
app.use('/', router());

// Indicar el puerto 
app.listen(3003);