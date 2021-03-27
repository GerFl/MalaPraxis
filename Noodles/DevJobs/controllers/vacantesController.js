// Cualquier de las dos formas jala
// const Vacante=require('../models/Vacantes');
const mongoose = require('mongoose');
const Vacante = mongoose.model('Vacante');
const multer = require('multer');
const shortid = require('shortid');

exports.formularioNuevaVacante = (req, res) => {
    res.render('nueva-vacante', {
        nombrePagina: "Nueva vacante",
        tagline: "Llena el formulario y publica tu vacante",
        cerrarSesion: true,
        nombre: req.user.nombre,
        imagen: req.user.imagen
    });
}

// Agregar vacantes a la base de datos
exports.agregarVacante = async(req, res) => {
    const vacante = new Vacante(req.body); // Pasamos el request que se va a mapear gracias a los names
    // Usuario autor de la vacante
    vacante.autor = req.user._id;
    // Crear arreglo de habilidades
    // Los skills vienen como un string, los separamos con split
    vacante.skills = req.body.skills.split(',');

    // Almacenar en la BD
    const nuevaVacante = await vacante.save();
    // Redireccionar
    res.redirect(`/vacantes/${nuevaVacante.url}`);
}

// Muestra una vacante
exports.mostrarVacante = async(req, res, next) => {
    const vacante = await Vacante.findOne({ url: req.params.url }).populate('autor').lean(); // Hacemos un join en mongoose para poder traer los datos del autor
    console.log(vacante);
    // Si no hay resultados
    if (!vacante) return next(); // Siguiente middleware

    res.render('vacante', {
        vacante, // Pasamos todo el objeto
        nombrePagina: vacante.titulo,
        barra: true
    });
}

exports.formEditarVacante = async(req, res, next) => {
    const vacante = await Vacante.findOne({ url: req.params.url }).lean();

    if (!vacante) return next();

    res.render('editar-vacante', {
        vacante,
        nombrePagina: `Editar - ${vacante.titulo}`,
        cerrarSesion: true,
        nombre: req.user.nombre,
        imagen: req.user.imagen
    });
}

exports.editarVacante = async(req, res) => {
    const vacanteActualizada = req.body;
    console.log(vacanteActualizada);
    vacanteActualizada.skills = req.body.skills.split(',');
    console.log(vacanteActualizada);
    const vacante = await Vacante.findOneAndUpdate({ url: req.params.url }, vacanteActualizada, {
        new: true, // Se traerá el documento actualizado
        runValidators: true
    });
    res.redirect(`/vacantes/${vacante.url}`);
}

// Validar y sanitizar los campos de las vacantes
exports.validarVacante = (req, res, next) => {
    // Sanitizar los campos
    req.sanitizeBody('titulo').escape();
    req.sanitizeBody('empresa').escape();
    req.sanitizeBody('ubicacion').escape();
    req.sanitizeBody('salario').escape();
    req.sanitizeBody('contrato').escape();
    req.sanitizeBody('skills').escape();

    // Validar los campos
    req.checkBody('titulo', "Agrega un título a la vacante").notEmpty();
    req.checkBody('empresa', "Agrega el nombre de la empresa").notEmpty();
    req.checkBody('ubicacion', "Indica la ubicación").notEmpty();
    req.checkBody('contrato', "Selecciona el tipo de contrato").notEmpty();
    req.checkBody('skills', "Agrega al menos una habilidad").notEmpty();

    const errores = req.validationErrors();

    if (errores) {
        // Recargar la vista con los errores
        console.log(errores);
        req.flash('error', errores.map(error => error.msg));
        res.render('nueva-vacante', {
            nombrePagina: "Nueva vacante",
            tagline: "Llena el formulario y publica tu vacante",
            cerrarSesion: true,
            nombre: req.user.nombre,
            mensajes: req.flash()
        });
        return;
    }

    next(); // Siguiente middleware

}

exports.eliminarVacante = async(req, res, next) => {
    const { id } = req.params;
    const vacante = await Vacante.findById(id);
    if (verificarAutor(vacante, req.user)) {
        // Todo bien, si es el usuario. Eliminar
        vacante.remove();
        res.status(200).send("La vacante fue eliminada correctamente");
    } else {
        // No permitido
        res.status(403).send("Error");
    }
    console.log(vacante);
    console.log(id);

}

const verificarAutor = (vacante = {}, usuario = {}) => {
    if (!vacante.autor.equals(usuario._id)) {
        return false;
    } else {
        return true;
    }
};

// CANDIDATOS
// Subir archivos en PDF

exports.subirCV = (req, res, next) => {
        upload(req, res, function(error) { // Esta funcion se comunica con Multer
            if (error) {
                if (error instanceof multer.MulterError) {
                    if (error.code === 'LIMIT_FILE_SIZE') {
                        req.flash('error', "El archivo es muy grande: Máximo 1Mb");
                    } else {
                        req.flash('error', error.message);
                    }
                } else {
                    req.flash('error', error.message);
                }
                res.redirect('back'); // Nos envía a la página en donde estamos, donde se originó el error
                return;
            } else {
                next();
            }
        });
    }
    // Opciones de Multer
const configuracionMulter = {
    limits: { fileSize: 1000000 },
    storage: fileStorage = multer.diskStorage({
        destination: (req, file, cb) => {
            cb(null, __dirname + '../../public/uploads/cv');
        },
        filename: (req, file, cb) => {
            // console.log(file); // file contiene la información del archivo que se sube
            const extension = file.mimetype.split('/')[1];
            cb(null, `${shortid.generate()}.${extension}`);
            console.log(extension);
        }
    }),
    fileFilter(req, file, cb) {
        if (file.mimetype === 'application/pdf') {
            // Se ejecuta el callback como true o false : true cuando la imagen se acepta
            cb(null, true);
        } else {
            // callback actua como un next
            cb(new Error('Formato no válido'), false);
        }
    }
}

const upload = multer(configuracionMulter).single('cv');

// Almacenar los candidatos en la BD
exports.contactar = async(req, res, next) => {
    const vacante = await Vacante.findOne({ url: req.params.url });

    // Si no hay vacante
    if (!vacante) return next();

    // Todo bien, construir el nuevo objeto

    const nuevoCandidato = {
        nombre: req.body.nombre,
        email: req.body.email,
        cv: req.file.filename
    }

    // Almacenar la vacante
    vacante.candidatos.push(nuevoCandidato);
    await vacante.save();

    // Mensaje flash y redirección
    req.flash('correcto', "Se envió tu currículum correctamente");
    res.redirect('/');
}

exports.mostrarCandidatos = async(req, res, next) => {
    const vacante = await Vacante.findById(req.params.id).lean();

    if (vacante.autor != req.user._id.toString()) {
        return next();
    }
    if (!vacante) return next();

    res.render('candidatos', {
        nombrePagina: `Candidatos vacante - ${vacante.titulo}`,
        cerrarSesion: true,
        nombre: req.user.nombre,
        imagen: req.user.imagen,
        candidatos: vacante.candidatos
    });

}