(function() {
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
    });

})();