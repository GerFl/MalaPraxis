(function() {
    "use strict";
    document.addEventListener('DOMContentLoaded', function() {
        if (document.getElementById('map')) {
            var map = L.map('map').setView([25.6710764, -100.3062464], 20);
            L.tileLayer('https://{s}.tile.openstreetmap.org/{z}/{x}/{y}.png', {
                attribution: '&copy; <a href="https://www.openstreetmap.org/copyright">OpenStreetMap</a> contributors'
            }).addTo(map);

            L.marker([25.6710764, -100.3062464]).addTo(map)
                .bindPopup('Heart&Soul')
                .openPopup()
                .bindTooltip('ddFbb')
                .openTooltip();
        }

        enviar.addEventListener('click', checampos);

        function checampos() {
            if (document.getElementById("nombre").value == "" || document.getElementById("email").value == "" || document.getElementById("telefono").value == "" || document.getElementById("message").value == "") {
                alert("Por favor llene todos los campos");
            } else {
                alert("Mensaje enviado.");
            }
        }

        if (window.screen.width < 768) {
            $('.delete').hide();
        } else {
            $('.delete').show();
        }
    });
})();