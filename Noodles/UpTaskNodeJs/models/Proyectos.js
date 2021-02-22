const Sequelize = require('sequelize');
const db = require('../config/db');
const slug = require('slug');
const shortid = require('shortid');

const Proyectos = db.define('proyectos', {
    id: {
        type: Sequelize.INTEGER,
        primaryKey: true,
        autoIncrement: true
    },
    nombre: Sequelize.STRING(100),
    url: Sequelize.STRING(100)

}, {
    hooks: { // Todo esto es trabajo del ORM
        beforeCreate(proyecto) {
            console.log('Antes de insertar en la BD');
            const url = slug(proyecto.nombre);
            // proyecto.url = url;
            proyecto.url = `${url}-${shortid.generate()}`;
        }
    }
});

module.exports = Proyectos; // Para que lo que tenemos aquí lo podamos importar en otras partes