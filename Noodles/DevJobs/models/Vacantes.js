const mongoose = require('mongoose');
mongoose.Promise = global.Promise;
const slug = require('slug');
const shortid = require('shortid');

const vacantesSchema = new mongoose.Schema({
    titulo: {
        type: String,
        required: 'El nombre de la vacante es obligatorio',
        trim: true
    },
    empresa: {
        type: String,
        trim: true
    },
    ubicacion: {
        type: String,
        trim: true,
        required: 'La ubicación es obligatoria'
    },
    salario: {
        type: String,
        default: 0,
        trim: true
    },
    contrato: {
        type: String,
        trim: true
    },
    descripcion: {
        type: String,
        trim: true
    },
    url: {
        type: String,
        lowercase: true
    },
    skills: [String], // Va a ser un arreglo
    candidatos: [{ // Va a ser un objeto. Cada candidato se almacena con estas llaves
        nombre: String,
        email: String,
        cv: String
    }]
});
// Similar a un hook con Sequelize
vacantesSchema.pre('save', function(next) {
    // Crear la url
    // this va a hacer referencia al objeto de vacantesSchema, por lo que solo accedemos a su propiedad de titulo para aplicarle el slug
    // Igual se hace referencia al objeto y se accede a su propiedad de url para generarle el shortid
    const url = slug(this.titulo); // React developer -> React-developer
    this.url = `${url}-${shortid.generate()}`; // React-developer -> React-developer192834329487
    next(); // Pasar al siguiente middleware
});

module.exports = mongoose.model('Vacante', vacantesSchema);