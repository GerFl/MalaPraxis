module.exports = {
    seleccionarSkills: (seleccionadas = [], opciones) => {
        console.log(seleccionadas);
        const skills = ['HTML5', 'CSS3', 'CSSGrid', 'Flexbox', 'JavaScript', 'jQuery', 'Node', 'Angular', 'VueJS', 'ReactJS', 'React Hooks', 'Redux', 'Apollo', 'GraphQL', 'TypeScript', 'PHP', 'Laravel', 'Symfony', 'Python', 'Django', 'ORM', 'Sequelize', 'Mongoose', 'SQL', 'MVC', 'SASS', 'WordPress'];
        let html = '';
        skills.forEach(skill => {
            html += `
            <li ${seleccionadas.includes(skill) ? ' class="activo"' : '' } >${skill}</li>
            `;
        });

        return opciones.fn().html = html;
    },
    tipoContrato: (seleccionado, opciones) => { // Seleccionado pues nos dirá que tipo de contrato es actualmente. Seleccionado es lo que está en la BD
        console.log(seleccionado);
        console.log(opciones.fn()); // Lo que hace fn() básicamente es retornar/convertir a HTML, algo así entiendo. Busca que la opción que seleccionamos esté dentro del html.
        return opciones.fn(this).replace( // Se evalua el html, que vendría siendo el valor del selected
            new RegExp(`value="${seleccionado}"`), '$& selected="selected"' // Cuando se encuentre el seleccionado se agregará el valor y además uel atributo selected. Se inyecta el atributo selected donde se encuentre el valor que se busca.
        );
    },
    mostrarAlertas: (errores = {}, alertas) => {
        const categoria = Object.keys(errores);
        console.log(errores[categoria]);
        console.log(categoria);
        let html = '';
        if (categoria.length) {
            errores[categoria].forEach(error => {
                html += `<div class="${categoria} alerta">
                    ${error}
                </div>
                `;
            });
        }
        console.log(html);
        return alertas.fn().html = html;
    }
}