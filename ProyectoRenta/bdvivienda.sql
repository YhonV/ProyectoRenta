-- phpMyAdmin SQL Dump
-- version 4.7.0
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 21-11-2023 a las 22:33:50
-- Versión del servidor: 10.1.25-MariaDB
-- Versión de PHP: 5.6.31

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `bdvivienda`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `casa`
--

CREATE TABLE `casa` (
  `id_vivienda` varchar(6) NOT NULL,
  `metros_cuadrados` double NOT NULL,
  `comuna` varchar(25) NOT NULL,
  `habitaciones` int(11) NOT NULL,
  `valor_renta` int(11) NOT NULL,
  `anio_antiguedad` int(11) NOT NULL,
  `cant_pisos` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `casa`
--

INSERT INTO `casa` (`id_vivienda`, `metros_cuadrados`, `comuna`, `habitaciones`, `valor_renta`, `anio_antiguedad`, `cant_pisos`) VALUES
('456A', 80, 'Providencia', 2, 850000, 30, 1),
('456B', 90.2, 'San Miguel', 3, 720000, 20, 2),
('456C', 74.4, 'Las Condes', 2, 950000, 20, 2),
('456D', 110, 'Providencia', 5, 1200000, 10, 1),
('456E', 60, 'Maipú', 2, 450000, 40, 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `departamento`
--

CREATE TABLE `departamento` (
  `id_vivienda` varchar(6) NOT NULL,
  `metros_cuadrados` double NOT NULL,
  `comuna` varchar(25) NOT NULL,
  `habitaciones` int(11) NOT NULL,
  `valor_renta` int(11) NOT NULL,
  `gasto_comun` int(11) NOT NULL,
  `terraza` varchar(2) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `departamento`
--

INSERT INTO `departamento` (`id_vivienda`, `metros_cuadrados`, `comuna`, `habitaciones`, `valor_renta`, `gasto_comun`, `terraza`) VALUES
('123A', 70.5, 'Providencia', 2, 700000, 100000, 'Si'),
('123B', 49.5, 'San Miguel', 3, 450000, 50000, 'No'),
('123C', 63, 'San Miguel', 2, 530000, 50000, 'Si'),
('123D', 42, 'Estación Central', 2, 300000, 30000, 'No'),
('123E', 35.3, 'Estación Central', 1, 280000, 30000, 'Si');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `casa`
--
ALTER TABLE `casa`
  ADD PRIMARY KEY (`id_vivienda`);

--
-- Indices de la tabla `departamento`
--
ALTER TABLE `departamento`
  ADD PRIMARY KEY (`id_vivienda`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
