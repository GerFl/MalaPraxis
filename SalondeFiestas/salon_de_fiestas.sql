-- phpMyAdmin SQL Dump
-- version 5.0.2
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 11-06-2020 a las 01:59:34
-- Versión del servidor: 10.4.11-MariaDB
-- Versión de PHP: 7.4.6

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `salon de fiestas`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `cliente`
--

CREATE TABLE `cliente` (
  `id_cliente` int(10) NOT NULL,
  `nombre` varchar(25) NOT NULL,
  `apellido` varchar(25) NOT NULL,
  `edad` tinyint(25) NOT NULL,
  `telefono` decimal(15,0) NOT NULL,
  `direccion` varchar(100) NOT NULL,
  `correo_electronico` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='informacion de los clientes';

--
-- Volcado de datos para la tabla `cliente`
--

INSERT INTO `cliente` (`id_cliente`, `nombre`, `apellido`, `edad`, `telefono`, `direccion`, `correo_electronico`) VALUES
(21, 'Rolando', 'Esquivel', 24, '1234567890', 'Col. Independencia', 'correo@email.com'),
(22, 'Fausta', 'Ramírez', 40, '8112038478', 'Valle Hermoso #203', 'correo@correo.com');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `evento`
--

CREATE TABLE `evento` (
  `id_evento` int(10) NOT NULL,
  `tipo_evento` varchar(30) NOT NULL,
  `fecha_evento` date NOT NULL,
  `duracion_evento` time(6) NOT NULL,
  `costo_evento` varchar(15) NOT NULL,
  `id_servicios` varchar(50) NOT NULL,
  `paquete_id` int(10) NOT NULL,
  `cliente_id` int(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='información de los eventos';

--
-- Volcado de datos para la tabla `evento`
--

INSERT INTO `evento` (`id_evento`, `tipo_evento`, `fecha_evento`, `duracion_evento`, `costo_evento`, `id_servicios`, `paquete_id`, `cliente_id`) VALUES
(40, 'Boda', '2020-06-08', '08:00:00.000000', '$46950', '10,09,04,13,15,11,06,07', 1, 21),
(41, 'Boda', '2020-06-09', '10:00:00.000000', '$65450', '09,10,04,13,15,06', 2, 21),
(43, 'Boda', '2020-06-05', '06:00:00.000000', '$42700', '01,12,09,05,14,13,04,10,03,02,07,06,11,08,15', 0, 21),
(44, 'Boda', '2020-06-09', '06:00:00.000000', '$30450', '01,12,09,05,14,13,04,10,07,06', 0, 22),
(45, 'XV años', '2020-06-08', '08:00:00.000000', '$34500', '09', 2, 22);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `paquetes`
--

CREATE TABLE `paquetes` (
  `id_paquetes` int(10) NOT NULL,
  `nombre paquete` varchar(30) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_nopad_ci NOT NULL,
  `costo` decimal(25,0) NOT NULL,
  `descripcion_paquete` varchar(10000) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_nopad_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `paquetes`
--

INSERT INTO `paquetes` (`id_paquetes`, `nombre paquete`, `costo`, `descripcion_paquete`) VALUES
(1, 'paquete 1', '23500', 'Renta del salon\r\n100 personas\r\nComida\r\nMúsica durante el evento\r\nMeseros\r\nPastel\r\nFotografías y video\r\n'),
(2, 'paquete 2', '33500', 'Renta del salon\r\n200 personas\r\nComida\r\nMúsica durante el evento\r\nMeseros\r\nPastel\r\nFotografías y video\r\nDecoracion del salon\r\nMesa de postres\r\nInvitaciones\r\n');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `servicios`
--

CREATE TABLE `servicios` (
  `id_servicios` int(10) NOT NULL,
  `servicio` varchar(30) NOT NULL,
  `costo servicio` decimal(25,0) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='información de los servicios del salón';

--
-- Volcado de datos para la tabla `servicios`
--

INSERT INTO `servicios` (`id_servicios`, `servicio`, `costo servicio`) VALUES
(1, 'decoracion salon', '2000'),
(2, 'platillo de comida p/p', '50'),
(3, 'meseros', '1500'),
(4, 'show', '3500'),
(5, 'musica', '2500'),
(6, 'iluminacion', '1000'),
(7, 'mesa de postres', '2500'),
(8, 'pastel', '1750'),
(9, 'coordinador del evento', '1000'),
(10, 'piñata', '450'),
(11, 'invitacion p/p', '10'),
(12, 'fotografia y video', '2500'),
(13, 'cabina fotografica', '2000'),
(14, 'renta salon', '130000'),
(15, 'barra libre', '120');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuario`
--

CREATE TABLE `usuario` (
  `id_usuario` int(10) NOT NULL,
  `Nombre` varchar(25) NOT NULL,
  `Apellido` varchar(25) NOT NULL,
  `Cargo` varchar(30) NOT NULL,
  `Telefono` decimal(10,0) NOT NULL,
  `Sexo` enum('Masculino','Femenino','Prefiero no decir') NOT NULL,
  `contraseña` varchar(250) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='guarda información de los usuarios del sistema';

--
-- Volcado de datos para la tabla `usuario`
--

INSERT INTO `usuario` (`id_usuario`, `Nombre`, `Apellido`, `Cargo`, `Telefono`, `Sexo`, `contraseña`) VALUES
(23, 'Antonio', 'Ceballos', 'Administrador', '1234567890', 'Masculino', 'a2ce23a2184d42000a5f8c31ff4a42efca225487'),
(26, 'Gerardo', 'Flores', 'Subgerente', '8126347431', 'Masculino', 'f7c3bc1d808e04732adf679965ccc34ca7ae3441'),
(27, 'Oscar', 'Esparza', 'Gerente', '8182576561', 'Masculino', '3dd050b52caffd9f759affb519640132be6106e0'),
(28, 'Administrador', 'Por defecto', 'Administrador', '1234567890', 'Masculino', '5baa61e4c9b93f3f0682250b6cf8331b7ee68fd8');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `cliente`
--
ALTER TABLE `cliente`
  ADD PRIMARY KEY (`id_cliente`);

--
-- Indices de la tabla `evento`
--
ALTER TABLE `evento`
  ADD PRIMARY KEY (`id_evento`),
  ADD KEY `cliente_id` (`cliente_id`);

--
-- Indices de la tabla `paquetes`
--
ALTER TABLE `paquetes`
  ADD PRIMARY KEY (`id_paquetes`);

--
-- Indices de la tabla `servicios`
--
ALTER TABLE `servicios`
  ADD PRIMARY KEY (`id_servicios`);

--
-- Indices de la tabla `usuario`
--
ALTER TABLE `usuario`
  ADD PRIMARY KEY (`id_usuario`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `cliente`
--
ALTER TABLE `cliente`
  MODIFY `id_cliente` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=23;

--
-- AUTO_INCREMENT de la tabla `evento`
--
ALTER TABLE `evento`
  MODIFY `id_evento` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=46;

--
-- AUTO_INCREMENT de la tabla `paquetes`
--
ALTER TABLE `paquetes`
  MODIFY `id_paquetes` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT de la tabla `servicios`
--
ALTER TABLE `servicios`
  MODIFY `id_servicios` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=16;

--
-- AUTO_INCREMENT de la tabla `usuario`
--
ALTER TABLE `usuario`
  MODIFY `id_usuario` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=29;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `evento`
--
ALTER TABLE `evento`
  ADD CONSTRAINT `evento_ibfk_1` FOREIGN KEY (`cliente_id`) REFERENCES `cliente` (`id_cliente`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
