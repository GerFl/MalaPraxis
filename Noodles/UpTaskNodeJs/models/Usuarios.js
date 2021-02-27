const Sequelize = require('sequelize');
const bcrypt = require('bcrypt-nodejs');
const db = require('../config/db');
const proyectos = require('./Proyectos');

const Usuarios = db.define('usuarios', {
    id: {
        type: Sequelize.INTEGER(11), // UUID para id's más randoms
        primaryKey: true,
        autoIncrement: true
    },
    email: {
        type: Sequelize.STRING(60),
        allowNull: false,
        validate: {
            isEmail: {
                msg: "Agrega un correo válido pendejo."
            },
            notEmpty: {
                msg: "El email no puede ir vacío pñts."
            }
        },
        unique: {
            args: true,
            msg: "Usuario ya registrado."
        }
    },
    password: {
        type: Sequelize.STRING(60),
        allowNull: false,
        validate: {
            notEmpty: {
                msg: "El password no puede ir vacío"
            }
        }
    }
}, {
    hooks: { // Todo esto es trabajo del ORM
        beforeCreate(usuario) {
            // console.log("Creando nuevo usuario");
            // console.log(usuario);
            usuario.password = bcrypt.hashSync(usuario.password, bcrypt.genSaltSync(10));
        }
    }
});
// Usuarios.hasMany(proyectos); // Indica que puede tener múltiples proyectos
// El problema es la linea de arriba

module.exports = Usuarios;