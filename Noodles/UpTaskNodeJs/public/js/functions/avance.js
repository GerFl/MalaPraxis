import Swal from 'sweetalert2';

export const actualizarAvance = () => {
    // Seleccionar las tareas existentes
    const tareas = document.querySelectorAll('li.tarea');
    if (tareas.length) {
        // Seleccionar las tareas completadas
        const tareasCompletas = document.querySelectorAll('i.completo');

        // Calcular el avance
        const avance = Math.round((tareasCompletas.length / tareas.length) * 100);

        // Mostrar el avance
        const porcentaje = document.querySelector('#porcentaje');
        porcentaje.style.width = avance + "%";
        // console.log(avance);
        if (avance === 100) {
            // alert("Que pasa");
            // console.log("No se");
            Swal.fire(
                'Completaste el proyecto',
                'Date un descanso papi.',
                'success'
            );
        }
    }
}