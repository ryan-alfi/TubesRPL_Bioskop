-- phpMyAdmin SQL Dump
-- version 4.2.7.1
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Apr 28, 2015 at 06:22 PM
-- Server version: 5.6.20
-- PHP Version: 5.5.15

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `tubes_bioskop`
--

-- --------------------------------------------------------

--
-- Table structure for table `film`
--

CREATE TABLE IF NOT EXISTS `film` (
  `id_film` varchar(50) NOT NULL,
  `judul` varchar(100) NOT NULL,
  `harga` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `film`
--

INSERT INTO `film` (`id_film`, `judul`, `harga`) VALUES
('FCS', 'Focus (Copet)', 35000),
('MR', 'Merry Riana', 25000);

-- --------------------------------------------------------

--
-- Table structure for table `jadwal`
--

CREATE TABLE IF NOT EXISTS `jadwal` (
`id_jadwal` int(11) NOT NULL,
  `tanggal` date NOT NULL,
  `waktu` time NOT NULL,
  `id_film` varchar(50) NOT NULL
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=3 ;

--
-- Dumping data for table `jadwal`
--

INSERT INTO `jadwal` (`id_jadwal`, `tanggal`, `waktu`, `id_film`) VALUES
(1, '2015-01-01', '09:00:00', 'MR'),
(2, '2015-01-01', '11:30:00', 'FCS');

-- --------------------------------------------------------

--
-- Table structure for table `kursi`
--

CREATE TABLE IF NOT EXISTS `kursi` (
`id_kursi` int(11) NOT NULL,
  `no_kursi` varchar(2) NOT NULL,
  `status` varchar(100) NOT NULL,
  `id_theater` int(11) NOT NULL
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=8 ;

--
-- Dumping data for table `kursi`
--

INSERT INTO `kursi` (`id_kursi`, `no_kursi`, `status`, `id_theater`) VALUES
(1, 'C3', 'Booked', 1),
(2, 'C4', 'Booked', 2),
(3, 'E5', 'Booked', 2),
(4, 'B2', 'Booked', 1);

-- --------------------------------------------------------

--
-- Table structure for table `theater`
--

CREATE TABLE IF NOT EXISTS `theater` (
`id_theater` int(11) NOT NULL,
  `no_theater` varchar(11) NOT NULL,
  `id_film` varchar(50) NOT NULL
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=3 ;

--
-- Dumping data for table `theater`
--

INSERT INTO `theater` (`id_theater`, `no_theater`, `id_film`) VALUES
(1, 'Theater 1', 'MR'),
(2, 'Theater 3', 'FCS');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `film`
--
ALTER TABLE `film`
 ADD PRIMARY KEY (`id_film`);

--
-- Indexes for table `jadwal`
--
ALTER TABLE `jadwal`
 ADD PRIMARY KEY (`id_jadwal`);

--
-- Indexes for table `kursi`
--
ALTER TABLE `kursi`
 ADD PRIMARY KEY (`id_kursi`);

--
-- Indexes for table `theater`
--
ALTER TABLE `theater`
 ADD PRIMARY KEY (`id_theater`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `jadwal`
--
ALTER TABLE `jadwal`
MODIFY `id_jadwal` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=3;
--
-- AUTO_INCREMENT for table `kursi`
--
ALTER TABLE `kursi`
MODIFY `id_kursi` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=8;
--
-- AUTO_INCREMENT for table `theater`
--
ALTER TABLE `theater`
MODIFY `id_theater` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=3;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
