const mongoose = require('mongoose');
mongoose.Promise = global.Promise; // Habilitar las promesas
const bcrypt = require('bcrypt'); // Librería diferente

const usuariosSchema = new mongoose.Schema({
    email: {
        type: String,
        unique: true,
        lowercase: true,
        trim: true,

    },
    nombre: {
        type: String,
        required: 'Agrega tu nombre'
    },
    password: {
        type: String,
        required: true,
        trim: true
    },
    token: String,
    expira: Date
});

// Método para hashear los passwords
// pre() es similar a un hook en Sequelize
usuariosSchema.pre('save', async function(next) {
    // Si el password ya está hasheado
    // is Modified es un método que ya existe en Express
    if (!this.isModified('password')) {
        return next(); // Detén la ejecución y continúa con el siguiente middleware
    }

    // Si no está hasheado
    // Pasa el objeto completo y accedemos a .password.
    const hash = await bcrypt.hash(this.password, 12);
    this.password = hash;
    next();
});

module.exports = mongoose.model('Usuarios', usuariosSchema);