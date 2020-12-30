-- phpMyAdmin SQL Dump
-- version 4.9.5deb2
-- https://www.phpmyadmin.net/
--
-- Hôte : localhost:3306
-- Généré le : mer. 30 déc. 2020 à 21:19
-- Version du serveur :  8.0.22-0ubuntu0.20.04.3
-- Version de PHP : 7.4.3

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de données : `projetScala`
--

-- --------------------------------------------------------

--
-- Structure de la table `classe`
--

CREATE TABLE `classe` (
  `id` int NOT NULL,
  `libelle` varchar(45) DEFAULT NULL,
  `id_niveau` int DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Déchargement des données de la table `classe`
--

INSERT INTO `classe` (`id`, `libelle`, `id_niveau`) VALUES
(2, 'Big data P1', 5),
(3, 'Licence 2 P3', 3),
(4, 'Master 2', 5),
(5, 'master &', 5),
(6, 'Master 2', 5),
(7, 'master &', 5),
(8, 'Master 2', 5),
(9, 'master &', 5),
(10, 'Master 2', 5),
(11, 'master &', 5),
(12, 'Master 2', 5),
(13, 'master &', 5),
(14, 'Master 2', 5),
(15, 'master &', 5),
(16, 'Master 2', 5),
(17, 'master &', 5),
(18, 'Master 2', 5),
(19, 'master &', 5),
(20, 'Master 2', 5),
(21, 'master &', 5),
(22, 'Master 2', 5),
(23, 'master &', 5),
(24, 'Master 2', 5),
(25, 'master &', 5),
(26, 'Master 2', 5),
(27, 'master &', 5),
(28, 'Master 2', 5),
(29, 'master &', 5),
(30, 'Master 2', 5),
(31, 'master &', 5),
(32, 'Master 2', 5),
(33, 'master &', 5),
(34, 'Master 2', 5),
(35, 'master &', 5),
(36, 'Master 2', 5),
(37, 'master &', 5),
(38, 'Master 2', 5),
(39, 'master &', 5),
(40, 'Master 2', 5),
(41, 'master &', 5),
(42, 'Master 2', 5),
(43, 'master &', 5),
(44, 'Master 2', 5),
(45, 'master &', 5),
(46, 'Master 2', 5),
(47, 'master &', 5),
(48, 'Master 2', 5),
(49, 'master &', 5),
(50, 'Master 2', 5),
(51, 'master &', 5),
(52, 'Master 2', 5),
(53, 'master &', 5),
(54, 'Master 2', 5),
(55, 'master &', 5),
(56, 'Master 2', 5),
(57, 'master &', 5),
(58, 'Master 2', 5),
(59, 'master &', 5),
(60, 'Master 2', 5),
(61, 'master &', 5),
(62, 'Master 2', 5),
(63, 'master &', 5),
(64, 'Master 2', 5),
(65, 'master &', 5),
(66, 'Master 2', 5),
(67, 'master &', 5),
(68, 'Master 2', 5),
(69, 'master &', 5),
(70, 'Master 2', 5),
(71, 'master &', 5),
(72, 'Master 2', 5),
(73, 'master &', 5),
(74, 'Master 2', 5),
(75, 'master &', 5),
(76, 'Master 2', 5),
(77, 'master &', 5),
(78, 'Master 2', 5),
(79, 'master &', 5),
(80, 'Master 2', 5),
(81, 'master &', 5),
(82, 'Master 2', 5),
(83, 'master &', 5),
(84, 'Master 2', 5),
(85, 'master &', 5),
(86, 'Master 2', 5),
(87, 'master &', 5),
(88, 'Master 2', 5),
(89, 'master &', 5),
(90, 'Master 2', 5),
(91, 'master &', 5),
(92, 'Master 2', 5),
(93, 'master &', 5),
(94, 'Master 2', 5),
(95, 'master &', 5),
(96, 'Master 2', 5),
(97, 'master &', 5),
(98, 'Master 2', 5),
(99, 'master &', 5),
(100, 'Master 2', 5),
(101, 'master &', 5),
(102, 'Master 2', 5),
(103, 'master &', 5),
(104, 'Master 2', 5),
(105, 'master &', 5),
(106, 'Master 2', 5),
(107, 'master &', 5),
(108, 'Master 2', 5),
(109, 'master &', 5),
(110, 'Master 2', 5),
(111, 'master &', 5),
(112, 'Master 2', 5),
(113, 'master &', 5),
(114, 'Master 2', 5),
(115, 'master &', 5),
(116, 'Master 2', 5),
(117, 'master &', 5),
(118, 'Master 2', 5),
(119, 'master &', 5),
(120, 'Master 2', 5),
(121, 'master &', 5),
(122, 'Master 2', 5),
(123, 'master &', 5),
(124, 'Master 2', 5),
(125, 'master &', 5),
(126, 'Master 2', 5),
(127, 'master &', 5),
(128, 'Master 2', 5),
(129, 'master &', 5),
(130, 'Master 2', 5),
(131, 'master &', 5),
(132, 'Master 2', 5),
(133, 'master &', 5),
(134, 'Master 2', 5),
(135, 'master &', 5),
(136, 'Master 2', 5),
(137, 'master &', 5),
(138, 'Master 2', 5),
(139, 'master &', 5),
(140, 'Master 2', 5),
(141, 'master &', 5),
(142, 'Master 2', 5),
(143, 'master &', 5),
(144, 'Master 2', 5),
(145, 'master &', 5),
(146, 'Master 2', 5),
(147, 'master &', 5),
(148, 'Master 2', 5),
(149, 'master &', 5),
(150, 'Master 2', 5),
(151, 'master &', 5),
(152, 'Master 2', 5),
(153, 'master &', 5),
(154, 'Master 2', 5),
(155, 'master &', 5),
(156, 'Master 2', 5),
(157, 'master &', 5),
(158, 'Master 2', 5),
(159, 'master &', 5),
(160, 'Master 2', 5),
(161, 'master &', 5),
(162, 'Master 2', 5),
(163, 'master &', 5),
(164, 'Master 2', 5),
(165, 'master &', 5),
(166, 'Master 2', 5),
(167, 'master &', 5),
(168, 'Master 2', 5),
(169, 'master &', 5),
(170, 'Master 2', 5),
(171, 'master &', 5),
(172, 'Master 2', 5),
(173, 'master &', 5),
(174, 'Master 2', 5),
(175, 'master &', 5),
(176, 'Master 2', 5),
(177, 'master &', 5),
(178, 'Master 2', 5),
(179, 'master &', 5),
(180, 'Master 2', 5),
(181, 'master &', 5),
(182, 'Master 2', 5),
(183, 'master &', 5),
(184, 'Master 2', 5),
(185, 'master &', 5),
(186, 'Master 2', 5),
(187, 'master &', 5),
(188, 'Master 2', 5),
(189, 'master &', 5),
(190, 'Master 2', 5),
(191, 'master &', 5),
(192, 'Master 2', 5),
(193, 'master &', 5),
(194, 'Master 2', 5),
(195, 'master &', 5),
(196, 'Master 2', 5),
(197, 'master &', 5),
(198, 'Master 2', 5),
(199, 'master &', 5),
(200, 'Master 2', 5),
(201, 'master &', 5),
(202, 'Master 2', 5),
(203, 'master &', 5),
(204, 'Master 2', 5),
(205, 'master &', 5),
(206, 'Master 2', 5),
(207, 'master &', 5),
(208, 'Master 2', 5),
(209, 'master &', 5),
(210, 'Master 2', 5),
(211, 'master &', 5),
(212, 'Master 2', 5),
(213, 'master &', 5),
(214, 'Master 2', 5),
(215, 'master &', 5),
(216, 'Master 2', 5),
(217, 'master &', 5),
(218, 'Master 2', 5),
(219, 'master &', 5),
(220, 'Master 2', 5),
(221, 'master &', 5),
(222, 'Master 2', 5),
(223, 'master &', 5),
(224, 'Master 2', 5),
(225, 'master &', 5),
(226, 'Master 2', 5),
(227, 'master &', 5),
(228, 'Master 2', 5),
(229, 'master &', 5),
(230, 'Master 2', 5),
(231, 'master &', 5),
(232, 'Master 2', 5),
(233, 'master &', 5),
(234, 'Master 2', 5),
(235, 'master &', 5),
(236, 'Master 2', 5),
(237, 'master &', 5),
(238, 'Master 2', 5),
(239, 'master &', 5),
(240, 'Master 2', 5),
(241, 'master &', 5),
(242, 'Master 2', 5),
(243, 'master &', 5),
(244, 'Master 2', 5),
(245, 'master &', 5),
(246, 'Master 2', 5),
(247, 'master &', 5),
(248, 'Master 2', 5),
(249, 'master &', 5),
(250, 'Master 2', 5),
(251, 'master &', 5),
(252, 'Master 2', 5),
(253, 'master &', 5),
(254, 'Master 2', 5),
(255, 'master &', 5),
(256, 'Master 2', 5),
(257, 'master &', 5),
(258, 'Master 2', 5),
(259, 'master &', 5),
(260, 'Master 2', 5),
(261, 'master &', 5),
(262, 'Master 2', 5),
(263, 'master &', 5),
(264, 'Master 2', 5),
(265, 'master &', 5),
(266, 'Master 2', 5),
(267, 'master &', 5),
(268, 'Master 2', 5),
(269, 'master &', 5),
(270, 'Master 2', 5),
(271, 'master &', 5),
(272, 'Master 2', 5),
(273, 'master &', 5),
(274, 'Master 2', 5),
(275, 'master &', 5),
(276, 'Master 2', 5),
(277, 'master &', 5),
(278, 'Master 2', 5),
(279, 'master &', 5),
(280, 'Master 2', 5),
(281, 'master &', 5),
(282, 'Master 2', 5),
(283, 'master &', 5),
(284, 'Master 2', 5),
(285, 'master &', 5),
(286, 'Master 2', 5),
(287, 'master &', 5),
(288, 'Master 2', 5),
(289, 'master &', 5),
(290, 'Master 2', 5),
(291, 'master &', 5),
(292, 'Master 2', 5),
(293, 'master &', 5),
(294, 'Master 2', 5),
(295, 'master &', 5),
(296, 'Master 2', 5),
(297, 'master &', 5),
(298, 'Master 2', 5),
(299, 'master &', 5),
(300, 'Master 2', 5),
(301, 'master &', 5),
(302, 'Master 2', 5),
(303, 'master &', 5),
(304, 'Master 2', 5),
(305, 'master &', 5),
(306, 'Master 2', 5),
(307, 'master &', 5),
(308, 'Master 2', 5),
(309, 'master &', 5),
(310, 'Master 2', 5),
(311, 'master &', 5),
(312, 'Master 2', 5),
(313, 'master &', 5),
(314, 'Master 2', 5),
(315, 'master &', 5),
(316, 'Master 2', 5),
(317, 'master &', 5),
(318, 'Master 2', 5),
(319, 'master &', 5),
(320, 'Master 2', 5),
(321, 'master &', 5),
(322, 'Master 2', 5),
(323, 'master &', 5),
(324, 'Master 2', 5),
(325, 'master &', 5),
(326, 'Master 2', 5),
(327, 'master &', 5),
(328, 'Master 2', 5),
(329, 'master &', 5),
(330, 'Master 2', 5),
(331, 'master &', 5),
(332, 'Master 2', 5),
(333, 'master &', 5),
(334, 'Master 2', 5),
(335, 'master &', 5),
(336, 'Master 2', 5),
(337, 'master &', 5),
(338, 'Master 2', 5),
(339, 'master &', 5),
(340, 'Master 2', 5),
(341, 'master &', 5);

-- --------------------------------------------------------

--
-- Structure de la table `cours`
--

CREATE TABLE `cours` (
  `id` int NOT NULL,
  `date_debut` datetime DEFAULT NULL,
  `date_fin` datetime DEFAULT NULL,
  `id_professeur` int DEFAULT NULL,
  `id_classe` int DEFAULT NULL,
  `id_salle` int DEFAULT NULL,
  `id_matiere` int DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Déchargement des données de la table `cours`
--

INSERT INTO `cours` (`id`, `date_debut`, `date_fin`, `id_professeur`, `id_classe`, `id_salle`, `id_matiere`) VALUES
(2, '2020-12-09 20:32:26', '2020-12-09 23:32:26', 4, 2, 4, NULL),
(3, '2020-12-10 20:34:02', '2020-12-10 23:34:02', 5, 2, 4, NULL),
(4, '2020-12-31 07:34:02', '2020-12-30 09:34:02', 2, 3, 4, NULL),
(5, '2020-12-10 20:34:02', '2020-12-10 23:34:02', 5, 2, 4, NULL),
(6, '2020-12-31 07:34:02', '2020-12-30 09:34:02', 2, 3, 4, NULL),
(7, '2020-12-10 20:34:02', '2020-12-10 23:34:02', 5, 2, 4, NULL),
(8, '2020-12-31 07:34:02', '2020-12-30 09:34:02', 2, 3, 4, NULL),
(9, '2020-12-10 20:34:02', '2020-12-10 23:34:02', 5, 2, 4, NULL),
(10, '2020-12-31 07:34:02', '2020-12-30 09:34:02', 2, 3, 4, NULL),
(11, '2020-12-10 20:34:02', '2020-12-10 23:34:02', 5, 2, 4, NULL),
(12, '2020-12-31 07:34:02', '2020-12-30 09:34:02', 2, 3, 4, NULL),
(13, '2020-12-10 20:34:02', '2020-12-10 23:34:02', 5, 2, 4, NULL),
(14, '2020-12-31 07:34:02', '2020-12-30 09:34:02', 2, 3, 4, NULL),
(15, '2020-12-10 20:34:02', '2020-12-10 23:34:02', 5, 2, 4, NULL),
(16, '2020-12-31 07:34:02', '2020-12-30 09:34:02', 2, 3, 4, NULL),
(17, '2020-12-10 20:34:02', '2020-12-10 23:34:02', 5, 2, 4, NULL),
(18, '2020-12-31 07:34:02', '2020-12-30 09:34:02', 2, 3, 4, NULL),
(19, '2020-12-10 20:34:02', '2020-12-10 23:34:02', 5, 2, 4, NULL),
(20, '2020-12-31 07:34:02', '2020-12-30 09:34:02', 2, 3, 4, NULL),
(21, '2020-12-10 20:34:02', '2020-12-10 23:34:02', 5, 2, 4, NULL),
(22, '2020-12-31 07:34:02', '2020-12-30 09:34:02', 2, 3, 4, NULL),
(23, '2020-12-10 20:34:02', '2020-12-10 23:34:02', 5, 2, 4, NULL),
(24, '2020-12-31 07:34:02', '2020-12-30 09:34:02', 2, 3, 4, NULL),
(25, '2020-12-10 20:34:02', '2020-12-10 23:34:02', 5, 2, 4, NULL),
(26, '2020-12-31 07:34:02', '2020-12-30 09:34:02', 2, 3, 4, NULL),
(27, '2020-12-10 20:34:02', '2020-12-10 23:34:02', 5, 2, 4, NULL),
(28, '2020-12-31 07:34:02', '2020-12-30 09:34:02', 2, 3, 4, NULL),
(29, '2020-12-10 20:34:02', '2020-12-10 23:34:02', 5, 2, 4, NULL),
(30, '2020-12-31 07:34:02', '2020-12-30 09:34:02', 2, 3, 4, NULL),
(31, '2020-12-10 20:34:02', '2020-12-10 23:34:02', 5, 2, 4, NULL),
(32, '2020-12-31 07:34:02', '2020-12-30 09:34:02', 2, 3, 4, NULL),
(33, '2020-12-10 20:34:02', '2020-12-10 23:34:02', 5, 2, 4, NULL),
(34, '2020-12-31 07:34:02', '2020-12-30 09:34:02', 2, 3, 4, NULL),
(35, '2020-12-10 20:34:02', '2020-12-10 23:34:02', 5, 2, 4, NULL),
(36, '2020-12-31 07:34:02', '2020-12-30 09:34:02', 2, 3, 4, NULL),
(37, '2020-12-10 20:34:02', '2020-12-10 23:34:02', 5, 2, 4, NULL),
(38, '2020-12-31 07:34:02', '2020-12-30 09:34:02', 2, 3, 4, NULL),
(39, '2020-12-10 20:34:02', '2020-12-10 23:34:02', 5, 2, 4, NULL),
(40, '2020-12-31 07:34:02', '2020-12-30 09:34:02', 2, 3, 4, NULL),
(41, '2020-12-10 20:34:02', '2020-12-10 23:34:02', 5, 2, 4, NULL),
(42, '2020-12-31 07:34:02', '2020-12-30 09:34:02', 2, 3, 4, NULL),
(43, '2020-12-10 20:34:02', '2020-12-10 23:34:02', 5, 2, 4, NULL),
(44, '2020-12-31 07:34:02', '2020-12-30 09:34:02', 2, 3, 4, NULL),
(45, '2020-12-10 20:34:02', '2020-12-10 23:34:02', 5, 2, 4, NULL),
(46, '2020-12-31 07:34:02', '2020-12-30 09:34:02', 2, 3, 4, NULL),
(47, '2020-12-10 20:34:02', '2020-12-10 23:34:02', 5, 2, 4, NULL),
(48, '2020-12-31 07:34:02', '2020-12-30 09:34:02', 2, 3, 4, NULL);

-- --------------------------------------------------------

--
-- Structure de la table `etudiant`
--

CREATE TABLE `etudiant` (
  `id` int NOT NULL,
  `nom` varchar(45) DEFAULT NULL,
  `prenom` varchar(45) DEFAULT NULL,
  `id_classe` int DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Déchargement des données de la table `etudiant`
--

INSERT INTO `etudiant` (`id`, `nom`, `prenom`, `id_classe`) VALUES
(2, 'sarr', 'abdoulaye', 2),
(3, 'diallo', 'souleymane', 3),
(4, 'sy', 'aisa', 3),
(5, 'diop', 'moussa', 2),
(8, 'sarr', 'abdoulaye', 5),
(9, 'Ba', 'souleymane', 2),
(10, 'sarr', 'abdoulaye', 5),
(11, 'Ba', 'souleymane', 2),
(12, 'sarr', 'abdoulaye', 5),
(13, 'Ba', 'souleymane', 2),
(14, 'sarr', 'abdoulaye', 5),
(15, 'Ba', 'souleymane', 2),
(16, 'sarr', 'abdoulaye', 5),
(17, 'Ba', 'souleymane', 2),
(18, 'sarr', 'abdoulaye', 5),
(19, 'Ba', 'souleymane', 2),
(20, 'sarr', 'abdoulaye', 5),
(21, 'Ba', 'souleymane', 2),
(22, 'sarr', 'abdoulaye', 5),
(23, 'Ba', 'souleymane', 2),
(24, 'sarr', 'abdoulaye', 5),
(25, 'Ba', 'souleymane', 2),
(26, 'sarr', 'abdoulaye', 5),
(27, 'Ba', 'souleymane', 2),
(28, 'sarr', 'abdoulaye', 5),
(29, 'Ba', 'souleymane', 2),
(30, 'sarr', 'abdoulaye', 5),
(31, 'Ba', 'souleymane', 2),
(32, 'sarr', 'abdoulaye', 5),
(33, 'Ba', 'souleymane', 2),
(34, 'sarr', 'abdoulaye', 5),
(35, 'Ba', 'souleymane', 2),
(36, 'sarr', 'abdoulaye', 5),
(37, 'Ba', 'souleymane', 2),
(38, 'sarr', 'abdoulaye', 5),
(39, 'Ba', 'souleymane', 2),
(40, 'sarr', 'abdoulaye', 5),
(41, 'Ba', 'souleymane', 2),
(42, 'sarr', 'abdoulaye', 5),
(43, 'Ba', 'souleymane', 2);

-- --------------------------------------------------------

--
-- Structure de la table `grade`
--

CREATE TABLE `grade` (
  `id` int NOT NULL,
  `libelle` varchar(45) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Déchargement des données de la table `grade`
--

INSERT INTO `grade` (`id`, `libelle`) VALUES
(2, 'sshdvd'),
(3, 'hsjhqsjhv'),
(4, 'Grade 1'),
(5, 'grade 2'),
(6, 'grade 3'),
(7, 'Grade 1'),
(8, 'grade 2'),
(9, 'Grade 1'),
(10, 'grade 2'),
(11, 'Grade 1'),
(12, 'grade 2'),
(13, 'Grade 1'),
(14, 'grade 2');

-- --------------------------------------------------------

--
-- Structure de la table `matiere`
--

CREATE TABLE `matiere` (
  `codeMatiere` varchar(45) NOT NULL,
  `libelle` varchar(45) DEFAULT NULL,
  `coefficient` int NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Déchargement des données de la table `matiere`
--

INSERT INTO `matiere` (`codeMatiere`, `libelle`, `coefficient`) VALUES
('bd', 'Base de données', 4),
('C++', 'C++', 5),
('JAVA', 'JAVA J2E', 6),
('mat', 'Mathematique', 4),
('python', 'python', 8),
('R', 'langage R', 4),
('Scala', 'Programation fonctionnelle', 6),
('SQLDB', 'SQL', 6);

-- --------------------------------------------------------

--
-- Structure de la table `niveau`
--

CREATE TABLE `niveau` (
  `id` int NOT NULL,
  `libelle` varchar(45) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Déchargement des données de la table `niveau`
--

INSERT INTO `niveau` (`id`, `libelle`) VALUES
(2, 'Licence 1'),
(3, 'Licence 2'),
(4, 'these 3'),
(5, 'master 1'),
(6, 'master 2');

-- --------------------------------------------------------

--
-- Structure de la table `play_evolutions`
--

CREATE TABLE `play_evolutions` (
  `id` int NOT NULL,
  `hash` varchar(255) NOT NULL,
  `applied_at` timestamp NOT NULL,
  `apply_script` mediumtext,
  `revert_script` mediumtext,
  `state` varchar(255) DEFAULT NULL,
  `last_problem` mediumtext
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Déchargement des données de la table `play_evolutions`
--

INSERT INTO `play_evolutions` (`id`, `hash`, `applied_at`, `apply_script`, `revert_script`, `state`, `last_problem`) VALUES
(1, 'da39a3ee5e6b4b0d3255bfef95601890afd80709', '2020-12-30 11:02:56', '', '', 'applied', '');

-- --------------------------------------------------------

--
-- Structure de la table `professeur`
--

CREATE TABLE `professeur` (
  `id` int NOT NULL,
  `nom` varchar(45) DEFAULT NULL,
  `prenom` varchar(45) DEFAULT NULL,
  `id_grade` int DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Déchargement des données de la table `professeur`
--

INSERT INTO `professeur` (`id`, `nom`, `prenom`, `id_grade`) VALUES
(2, 'Mboup', 'Djibril', 4),
(3, 'Ba', 'mamadou', 5),
(4, 'SY', 'Amadou', 6),
(5, 'LAM', 'ABOU', 2),
(6, 'diallo', 'aisa', 9),
(7, 'Ba', 'moussa', 14),
(8, 'diallo', 'aisa', 9),
(9, 'Ba', 'moussa', 14),
(10, 'diallo', 'aisa', 9),
(11, 'Ba', 'moussa', 14),
(12, 'diallo', 'aisa', 9),
(13, 'Ba', 'moussa', 14),
(14, 'diallo', 'aisa', 9),
(15, 'Ba', 'moussa', 14),
(16, 'diallo', 'aisa', 9),
(17, 'Ba', 'moussa', 14),
(18, 'diallo', 'aisa', 9),
(19, 'Ba', 'moussa', 14),
(20, 'diallo', 'aisa', 9),
(21, 'Ba', 'moussa', 14),
(22, 'diallo', 'aisa', 9),
(23, 'Ba', 'moussa', 14),
(24, 'diallo', 'aisa', 9),
(25, 'Ba', 'moussa', 14),
(26, 'diallo', 'aisa', 9),
(27, 'Ba', 'moussa', 14),
(28, 'diallo', 'aisa', 9),
(29, 'Ba', 'moussa', 14),
(30, 'diallo', 'aisa', 9),
(31, 'Ba', 'moussa', 14),
(32, 'diallo', 'aisa', 9),
(33, 'Ba', 'moussa', 14),
(34, 'diallo', 'aisa', 9),
(35, 'Ba', 'moussa', 14),
(36, 'diallo', 'aisa', 9),
(37, 'Ba', 'moussa', 14),
(38, 'diallo', 'aisa', 9),
(39, 'Ba', 'moussa', 14),
(40, 'diallo', 'aisa', 9),
(41, 'Ba', 'moussa', 14),
(42, 'diallo', 'aisa', 9),
(43, 'Ba', 'moussa', 14),
(44, 'diallo', 'aisa', 9),
(45, 'Ba', 'moussa', 14),
(46, 'diallo', 'aisa', 9),
(47, 'Ba', 'moussa', 14),
(48, 'diallo', 'aisa', 9),
(49, 'Ba', 'moussa', 14),
(50, 'diallo', 'aisa', 9),
(51, 'Ba', 'moussa', 14),
(52, 'diallo', 'aisa', 9),
(53, 'Ba', 'moussa', 14),
(54, 'diallo', 'aisa', 9),
(55, 'Ba', 'moussa', 14),
(56, 'diallo', 'aisa', 9),
(57, 'Ba', 'moussa', 14);

-- --------------------------------------------------------

--
-- Structure de la table `salle`
--

CREATE TABLE `salle` (
  `id` int NOT NULL,
  `libelle` varchar(45) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Déchargement des données de la table `salle`
--

INSERT INTO `salle` (`id`, `libelle`) VALUES
(2, 'Salla A'),
(3, 'Salle B'),
(4, 'Salle C'),
(5, 'Salle D'),
(6, 'Salle E'),
(7, 'Salle F'),
(8, 'Salla G'),
(9, 'Salle H'),
(10, 'Salla K'),
(11, 'Salle L');

--
-- Index pour les tables déchargées
--

--
-- Index pour la table `classe`
--
ALTER TABLE `classe`
  ADD PRIMARY KEY (`id`),
  ADD KEY `id_niveau` (`id_niveau`);

--
-- Index pour la table `cours`
--
ALTER TABLE `cours`
  ADD PRIMARY KEY (`id`),
  ADD KEY `id_professeur` (`id_professeur`),
  ADD KEY `id_classe` (`id_classe`),
  ADD KEY `id_salle` (`id_salle`);

--
-- Index pour la table `etudiant`
--
ALTER TABLE `etudiant`
  ADD PRIMARY KEY (`id`),
  ADD KEY `id_classe` (`id_classe`);

--
-- Index pour la table `grade`
--
ALTER TABLE `grade`
  ADD PRIMARY KEY (`id`);

--
-- Index pour la table `matiere`
--
ALTER TABLE `matiere`
  ADD PRIMARY KEY (`codeMatiere`);

--
-- Index pour la table `niveau`
--
ALTER TABLE `niveau`
  ADD PRIMARY KEY (`id`);

--
-- Index pour la table `play_evolutions`
--
ALTER TABLE `play_evolutions`
  ADD PRIMARY KEY (`id`);

--
-- Index pour la table `professeur`
--
ALTER TABLE `professeur`
  ADD PRIMARY KEY (`id`),
  ADD KEY `id_grade` (`id_grade`);

--
-- Index pour la table `salle`
--
ALTER TABLE `salle`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT pour les tables déchargées
--

--
-- AUTO_INCREMENT pour la table `classe`
--
ALTER TABLE `classe`
  MODIFY `id` int NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=342;

--
-- AUTO_INCREMENT pour la table `cours`
--
ALTER TABLE `cours`
  MODIFY `id` int NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=49;

--
-- AUTO_INCREMENT pour la table `etudiant`
--
ALTER TABLE `etudiant`
  MODIFY `id` int NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=44;

--
-- AUTO_INCREMENT pour la table `grade`
--
ALTER TABLE `grade`
  MODIFY `id` int NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=15;

--
-- AUTO_INCREMENT pour la table `niveau`
--
ALTER TABLE `niveau`
  MODIFY `id` int NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- AUTO_INCREMENT pour la table `professeur`
--
ALTER TABLE `professeur`
  MODIFY `id` int NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=58;

--
-- AUTO_INCREMENT pour la table `salle`
--
ALTER TABLE `salle`
  MODIFY `id` int NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=12;

--
-- Contraintes pour les tables déchargées
--

--
-- Contraintes pour la table `classe`
--
ALTER TABLE `classe`
  ADD CONSTRAINT `classe_ibfk_1` FOREIGN KEY (`id_niveau`) REFERENCES `niveau` (`id`);

--
-- Contraintes pour la table `cours`
--
ALTER TABLE `cours`
  ADD CONSTRAINT `cours_ibfk_1` FOREIGN KEY (`id_professeur`) REFERENCES `professeur` (`id`),
  ADD CONSTRAINT `cours_ibfk_10` FOREIGN KEY (`id_professeur`) REFERENCES `professeur` (`id`),
  ADD CONSTRAINT `cours_ibfk_11` FOREIGN KEY (`id_classe`) REFERENCES `classe` (`id`),
  ADD CONSTRAINT `cours_ibfk_12` FOREIGN KEY (`id_salle`) REFERENCES `salle` (`id`),
  ADD CONSTRAINT `cours_ibfk_13` FOREIGN KEY (`id_professeur`) REFERENCES `professeur` (`id`),
  ADD CONSTRAINT `cours_ibfk_14` FOREIGN KEY (`id_classe`) REFERENCES `classe` (`id`),
  ADD CONSTRAINT `cours_ibfk_15` FOREIGN KEY (`id_salle`) REFERENCES `salle` (`id`),
  ADD CONSTRAINT `cours_ibfk_16` FOREIGN KEY (`id_professeur`) REFERENCES `professeur` (`id`),
  ADD CONSTRAINT `cours_ibfk_17` FOREIGN KEY (`id_classe`) REFERENCES `classe` (`id`),
  ADD CONSTRAINT `cours_ibfk_18` FOREIGN KEY (`id_salle`) REFERENCES `salle` (`id`),
  ADD CONSTRAINT `cours_ibfk_19` FOREIGN KEY (`id_professeur`) REFERENCES `professeur` (`id`),
  ADD CONSTRAINT `cours_ibfk_2` FOREIGN KEY (`id_classe`) REFERENCES `classe` (`id`),
  ADD CONSTRAINT `cours_ibfk_20` FOREIGN KEY (`id_classe`) REFERENCES `classe` (`id`),
  ADD CONSTRAINT `cours_ibfk_21` FOREIGN KEY (`id_salle`) REFERENCES `salle` (`id`),
  ADD CONSTRAINT `cours_ibfk_22` FOREIGN KEY (`id_professeur`) REFERENCES `professeur` (`id`),
  ADD CONSTRAINT `cours_ibfk_23` FOREIGN KEY (`id_classe`) REFERENCES `classe` (`id`),
  ADD CONSTRAINT `cours_ibfk_24` FOREIGN KEY (`id_salle`) REFERENCES `salle` (`id`),
  ADD CONSTRAINT `cours_ibfk_25` FOREIGN KEY (`id_professeur`) REFERENCES `professeur` (`id`),
  ADD CONSTRAINT `cours_ibfk_26` FOREIGN KEY (`id_classe`) REFERENCES `classe` (`id`),
  ADD CONSTRAINT `cours_ibfk_27` FOREIGN KEY (`id_salle`) REFERENCES `salle` (`id`),
  ADD CONSTRAINT `cours_ibfk_3` FOREIGN KEY (`id_salle`) REFERENCES `salle` (`id`),
  ADD CONSTRAINT `cours_ibfk_4` FOREIGN KEY (`id_professeur`) REFERENCES `professeur` (`id`),
  ADD CONSTRAINT `cours_ibfk_5` FOREIGN KEY (`id_classe`) REFERENCES `classe` (`id`),
  ADD CONSTRAINT `cours_ibfk_6` FOREIGN KEY (`id_salle`) REFERENCES `salle` (`id`),
  ADD CONSTRAINT `cours_ibfk_7` FOREIGN KEY (`id_professeur`) REFERENCES `professeur` (`id`),
  ADD CONSTRAINT `cours_ibfk_8` FOREIGN KEY (`id_classe`) REFERENCES `classe` (`id`),
  ADD CONSTRAINT `cours_ibfk_9` FOREIGN KEY (`id_salle`) REFERENCES `salle` (`id`);

--
-- Contraintes pour la table `etudiant`
--
ALTER TABLE `etudiant`
  ADD CONSTRAINT `etudiant_ibfk_1` FOREIGN KEY (`id_classe`) REFERENCES `classe` (`id`);

--
-- Contraintes pour la table `professeur`
--
ALTER TABLE `professeur`
  ADD CONSTRAINT `professeur_ibfk_1` FOREIGN KEY (`id_grade`) REFERENCES `grade` (`id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
