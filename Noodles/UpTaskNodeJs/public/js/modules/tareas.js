import axios from 'axios';
import Swal from 'sweetalert2';
import { actualizarAvance } from '../functions/avance';

const tareas = document.querySelector('.listado-pendientes');

if (tareas) {
    // Delegation
    tareas.addEventListener('click', (e) => {
        // console.log(e.target.classList);
        if (e.target.classList.contains('fa-check-circle')) {
            // console.log("Actualizando");
            // Extraer el ID de la tarea
            const icono = e.target;
            const idTarea = icono.parentElement.parentElement.dataset.tarea; // Dataset es nuestro atributo personalizado
            // console.log(idTarea);

            // Request hacia /tareas/:id
            // location.origin nos detecta el dominio
            const url = `${location.origin}/tareas/${idTarea}`
                // console.log(url);

            // Patch sólo cambia una parte, no actualiza todo
            axios.patch(url, { idTarea })
                .then(function(respuesta) {
                    // console.log(respuesta); // Recibe la respuesta que dice "Todo bien"
                    // Status 200 si la conexión es correcta. 
                    if (respuesta.status === 200) {
                        icono.classList.toggle('completo');

                        actualizarAvance();
                    }
                })
        }

        if (e.target.classList.contains('fa-trash')) {
            // console.log("Eliminando.");
            const tareaHTML = e.target.parentElement.parentElement,
                idTarea = tareaHTML.dataset.tarea;

            // console.log(tareaHTML);
            // console.log(idTarea);

            Swal.fire({
                title: '¿Deseas borrar esta tarea?',
                text: "Una vez eliminada no se puede recuperar.",
                icon: 'warning',
                showCancelButton: true,
                confirmButtonColor: '#3085d6',
                cancelButtonColor: '#d33',
                confirmButtonText: 'BORRAR',
                cancelButtonText: 'No, cancelar'
            }).then((result) => {
                // En caso de presionar si
                if (result.value) {
                    const url = `${location.origin}/tareas/${idTarea}`;
                    // console.log("Eliminando tarea.");
                    // Enviar el delete por medio de Axios
                    axios.delete(url, { params: { idTarea } })
                        .then(function(respuesta) {
                            // console.log(respuesta);
                            if (respuesta.status === 200) {
                                // Eliminar el nodo
                                tareaHTML.parentElement.removeChild(tareaHTML);
                                // Opcional una alerta
                                Swal.fire(
                                    'Tarea eliminada',
                                    respuesta.data,
                                    'success'
                                )
                                actualizarAvance();
                            }
                        })
                }
            })
        }
    });
}

export default tareas;