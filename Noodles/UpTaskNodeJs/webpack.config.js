const path = require('path');
const webpack = require('webpack');
module.exports = {
    // Entrada
    entry: './public/js/app.js',
    // Salida
    output: {
        // Crear carpeta y archivo en esta ruta del path
        filename: 'bundle.js',
        path: path.join(__dirname, './public/dist')
    },
    module: {
        rules: [{
            // JavaScript
            test: /\.m?js$/, //Expresión regular que busca todos los archivos JS
            use: {
                // Que plugin se va a utilizar y qué va a hacer
                loader: 'babel-loader',
                options: {
                    presets: ['@babel/preset-env']
                }
            }
        }]
    }
}