-- phpMyAdmin SQL Dump
-- version 4.9.0.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: May 21, 2020 at 12:34 AM
-- Server version: 10.4.6-MariaDB
-- PHP Version: 7.3.9

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `responsi_pbo`
--

-- --------------------------------------------------------

--
-- Table structure for table `kereta`
--

CREATE TABLE `kereta` (
  `idKereta` varchar(30) NOT NULL,
  `namaKereta` varchar(30) NOT NULL,
  `kelasKereta` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `kereta`
--

INSERT INTO `kereta` (`idKereta`, `namaKereta`, `kelasKereta`) VALUES
('BM-500', 'Bersama Melaju', 'Bisnis'),
('DK-360', 'Duta Kencana', 'Ekonomi'),
('LP-200', 'Laskar Pelangi', 'Bisnis'),
('TDR-3000', 'Tok Dalang Ranggi', 'VIP');

-- --------------------------------------------------------

--
-- Table structure for table `tiket`
--

CREATE TABLE `tiket` (
  `nama` varchar(30) NOT NULL,
  `jenisKelamin` varchar(10) NOT NULL,
  `stasiunTujuan` varchar(30) NOT NULL,
  `idKereta` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `tiket`
--

INSERT INTO `tiket` (`nama`, `jenisKelamin`, `stasiunTujuan`, `idKereta`) VALUES
('ekky', 'Laki-laki', 'Tugu Jogja', 'BM-500'),
('dani', 'Laki-laki', 'Tugu Jogja', 'TDR-3000'),
('willian', 'Laki-laki', 'Lempuyungan', 'DK-360'),
('caca', 'Perempuan', 'Maguwo', 'LP-200'),
('rahul', 'Laki-laki', 'Tugu Jogja', 'BM-500');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `kereta`
--
ALTER TABLE `kereta`
  ADD PRIMARY KEY (`idKereta`);

--
-- Indexes for table `tiket`
--
ALTER TABLE `tiket`
  ADD KEY `pkid_kereta` (`idKereta`);

--
-- Constraints for dumped tables
--

--
-- Constraints for table `tiket`
--
ALTER TABLE `tiket`
  ADD CONSTRAINT `pkid_kereta` FOREIGN KEY (`idKereta`) REFERENCES `kereta` (`idKereta`) ON DELETE CASCADE ON UPDATE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
