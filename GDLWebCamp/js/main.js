(function() {
    "use strict";
    var regalo = document.getElementById('regalo');
    document.addEventListener('DOMContentLoaded', function() {

        // SOY EL MAPA, SOY EL MAPA
        if (document.getElementById('map')) {
            var map = L.map('map').setView([25.652954, -100.294211], 18);
            L.tileLayer('https://{s}.tile.openstreetmap.org/{z}/{x}/{y}.png', {
                attribution: '&copy; <a href="https://www.openstreetmap.org/copyright">OpenStreetMap</a> contributors'
            }).addTo(map);

            L.marker([25.652954, -100.294211]).addTo(map)
                .bindPopup('Wings.<br> Best day ever.')
                .openPopup()
                .bindTooltip('ddFbb')
                .openTooltip();
        }
        // CAMPOS DATOS USUARIO
        var nombre = document.getElementById('nombre');
        var apellido = document.getElementById('apellido');
        var email = document.getElementById('email');
        // CAMPOS PASES
        var pase_dia = document.getElementById('pase_dia');
        var pase_dosdias = document.getElementById('pase_dosdias');
        var pase_completo = document.getElementById('pase_completo');
        // BOTONES Y DIVS
        var calcular = document.getElementById('calcular');
        var errorDiv = document.getElementById('error');
        var btnregistro = document.getElementById('btnregistro');
        var listaproductos = document.getElementById('lista-productos');
        var sumatotal = document.getElementById('suma_total');

        // EXTRAS
        var etiquetas = document.getElementById('etiquetas');
        var camisas = document.getElementById('camisa_evento');

        btnregistro.disabled = true;


        if (document.getElementById('calcular')) {
            calcular.addEventListener('click', calcularMontos);
            pase_dia.addEventListener('blur', mostrardias);
            pase_dosdias.addEventListener('blur', mostrardias);
            pase_completo.addEventListener('blur', mostrardias);

            nombre.addEventListener('blur', validarCampos);
            apellido.addEventListener('blur', validarCampos);
            email.addEventListener('blur', validarCampos);
            email.addEventListener('blur', validarMail);



            function validarCampos() {
                if (this.value == '') {
                    errorDiv.style.display = 'block';
                    errorDiv.innerHTML = "Este campo es obligatorio";
                    this.style.border = '1px solid red';
                    errorDiv.style.border = '1px solid red';
                } else {
                    errorDiv.style.display = 'none';
                    this.style.border = '1px solid #CCCCCC';
                }
            }

            function validarMail() {
                if (this.value.indexOf("@") && this.value.indexOf(".com") > -1) {
                    errorDiv.style.display = 'none';
                    this.style.border = '1px solid #CCCCCC';
                } else {
                    errorDiv.style.display = 'block';
                    errorDiv.innerHTML = "Verifique que el correo sea correcto y contenga un '@' y '.com";
                    this.style.border = '1px solid red';
                    errorDiv.style.border = '1px solid red';
                }
            }

            function calcularMontos(event) {
                event.preventDefault();
                if (regalo.value === '') {
                    alert("Debes elegir un regalo.");
                    regalo.focus();
                } else {
                    var boletosdia = parseInt(pase_dia.value, 10) || 0,
                        boletosdosdias = parseInt(pase_dosdias.value, 10) || 0,
                        boletocompleto = parseInt(pase_completo.value, 10) || 0,
                        cantidadcamisas = parseInt(camisas.value, 10) || 0,
                        cantidadetiquetas = parseInt(etiquetas.value, 10) || 0;
                    var totalpagar = (boletosdia * 30) + (boletosdosdias * 45) + (boletocompleto * 50) + ((cantidadcamisas * 10) * .93) + (cantidadetiquetas * 2);
                    var listadoproductos = Array();

                    if (boletosdia >= 1) {
                        listadoproductos.push(boletosdia + ' pases por día');
                    }
                    if (boletosdosdias >= 1) {
                        listadoproductos.push(boletosdosdias + ' pases por 2 días');
                    }
                    if (boletocompleto >= 1) {
                        listadoproductos.push(boletocompleto + ' pases completos');
                    }
                    if (cantidadcamisas >= 1) {
                        listadoproductos.push(cantidadcamisas + ' camisas');
                    }
                    if (cantidadetiquetas >= 1) {
                        listadoproductos.push(cantidadetiquetas + ' paquetes de etiquetas');
                    }

                    lista_productos.style.display = 'block';
                    lista_productos.innerHTML = '';
                    for (let i = 0; i < listadoproductos.length; i++) {
                        lista_productos.innerHTML += listadoproductos[i] + '<br/>';
                    }

                    sumatotal.innerHTML = "$ " + totalpagar.toFixed(2);
                    btnregistro.disabled = false;
                    document.getElementById('total_pedido').value = totalpagar;

                }
            }

            function mostrardias() {
                var boletosdia = parseInt(pase_dia.value, 10) || 0,
                    boletosdosdias = parseInt(pase_dosdias.value, 10) || 0,
                    boletocompleto = parseInt(pase_completo.value, 10) || 0;
                var diaselegidos = [];
                if (boletosdia > 0) {
                    diaselegidos.push('viernes');
                }
                if (boletosdosdias > 0) {
                    diaselegidos.push('viernes', 'sabado');
                }
                if (boletocompleto > 0) {
                    diaselegidos.push('viernes', 'sabado', 'domingo');
                }
                if (boletosdia <= 0) {
                    document.getElementById('viernes').style.display = 'none';
                }
                if (boletosdosdias <= 0) {
                    document.getElementById('viernes').style.display = 'none';
                    document.getElementById('sabado').style.display = 'none';
                }
                if (boletocompleto <= 0) {
                    document.getElementById('viernes').style.display = 'none';
                    document.getElementById('sabado').style.display = 'none';
                    document.getElementById('domingo').style.display = 'none';
                }
                for (let i = 0; i < diaselegidos.length; i++) {
                    document.getElementById(diaselegidos[i]).style.display = 'block';
                }
            }

            console.log("Status: 'Clear'");
        }
    }); // DOM CONTENT LOADED
})();
$(function() {

    // LETTERING
    $('.nombre-sitio').lettering();

    // AGREGAR CLASES AL MENÚ

    $('body.conferencia .navegacion-principal a:contains("Conferencia")').addClass('activo');
    $('body.calendario .navegacion-principal a:contains("Calendario")').addClass('activo');
    $('body.invitados .navegacion-principal a:contains("Invitados")').addClass('activo');

    // MENU FIJO
    var windowHeight = $(window).height();
    var barraAltura = $('.barra').innerHeight();
    $(window).scroll(function() {
        var scroll = $(window).scrollTop();
        if (scroll > windowHeight) {
            $('.barra').addClass('fixed');
            $('body').css({ 'margin-top': barraAltura = 'px' });
        } else {
            $('.barra').removeClass('fixed');
            $('body').css({ 'margin-top': '0px' });
        }
    });

    // MENU RESPONSIVE
    $('.menu-movil').on('click', function() {
        $('.navegacion-principal').slideToggle();
    })

    // PROGRAMA DE CONFERENCIAS
    $('.programa-evento .info-curso:first').show();
    $('.menu-programa a:first').addClass('activo');

    $('.menu-programa a').on('click', function() {
        $('.menu-programa a').removeClass('activo');
        $(this).addClass('activo');
        $('.ocultar').hide();
        var enlace = $(this).attr('href');
        $(enlace).fadeIn(1000);
        return false;
    })

    // ANIMACIONES PARA LOS NUMEROS
    $('.resumen-evento li:nth-child(1) p').animateNumber({ number: 6 }, 1200);
    $('.resumen-evento li:nth-child(2) p').animateNumber({ number: 15 }, 1200);
    $('.resumen-evento li:nth-child(3) p').animateNumber({ number: 3 }, 1500);
    $('.resumen-evento li:nth-child(4) p').animateNumber({ number: 9 }, 1500);

    $('.cuenta-regresiva').countdown('2020/12/10 09:00:00', function(event) {
        $('#dias').html(event.strftime('%D'));
        $('#horas').html(event.strftime('%H'));
        $('#minutos').html(event.strftime('%M'));
        $('#segundos').html(event.strftime('%S'));
    });

    /* COLORBOX */
    $('.invitado-info').colorbox({ inline: true, width: "50%" });
});