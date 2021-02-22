import Swal from 'sweetalert2';
import axios from 'axios';

const btnEliminar = document.querySelector('#eliminar-proyecto');
if (btnEliminar) {
    btnEliminar.addEventListener('click', e => {
        const urlProyecto = e.target.dataset.proyectoUrl;
        // console.log(urlProyecto);
        Swal.fire({
            title: '¿Deseas borrar este proyecto?',
            text: "Una vez eliminado no se puede recuperar.",
            icon: 'warning',
            showCancelButton: true,
            confirmButtonColor: '#3085d6',
            cancelButtonColor: '#d33',
            confirmButtonText: 'BORRAR',
            cancelButtonText: 'No, cancelar'
        }).then((result) => {
            // En caso de presionar si
            if (result.value) {
                // Enviar petición a Axios
                const url = `${location.origin}/proyectos/${urlProyecto}`;
                // console.log(url);
                // return;
                // Se elimina por url
                axios.delete(url, { params: { urlProyecto } })
                    .then(function(respuesta) {
                        console.log(respuesta);
                        Swal.fire(
                            'ELIMINADO',
                            respuesta.data, // Recibe la respuesta de proyectosController.js
                            'success'
                        );
                        // Redireccionar al inicio
                        setTimeout(() => {
                            window.location.href = '/'
                        }, 2000);
                    })
                    .catch(() => {
                        Swal.fire({
                            icon: 'error',
                            title: 'Hubo un error',
                            text: 'No se pudo eliminar el proyecto'
                        })
                    })
            }
        })
    })
}

export default btnEliminar;