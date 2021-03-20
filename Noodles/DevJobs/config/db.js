// Importar ORM
const mongoose = require('mongoose');
require('dotenv').config({ path: 'variables.env' });

mongoose.connect(process.env.DATABASE, { useNewUrlParser: true });

// En caso de que haya error, se mostrará en la consola
mongoose.connection.on('error', (error) => {
    console.log(error);
});

// Importar los modelos
require('../models/Usuarios');
require('../models/Vacantes');