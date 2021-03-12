const express = require('express');
const router = require('./routes');
const exphbs = require('express-handlebars');
const path = require('path');

app = express();

// Habilitar Handlebars como Template Engine
app.engine('handlebars',
    exphbs({
        defaultLayout: 'layout'
    })
);
app.set('view engine', 'handlebars');

// Habilitar archivos estáticos
app.use(express.static(path.join(__dirname, 'public')));

app.use('/', router());

app.listen(3003);