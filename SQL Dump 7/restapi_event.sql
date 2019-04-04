-- MySQL dump 10.13  Distrib 8.0.15, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: restapi
-- ------------------------------------------------------
-- Server version	8.0.15

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
 SET NAMES utf8 ;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `event`
--

DROP TABLE IF EXISTS `event`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `event` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `title` varchar(255) DEFAULT NULL,
  `description` text,
  `category1` int(11) DEFAULT NULL,
  `category2` int(11) DEFAULT NULL,
  `category3` int(11) DEFAULT NULL,
  `location` varchar(255) DEFAULT NULL,
  `latitude` float DEFAULT NULL,
  `longitude` float DEFAULT NULL,
  `date` datetime DEFAULT NULL,
  `photoid` varchar(255) DEFAULT NULL,
  `signupid` int(11) DEFAULT '0',
  `userid` int(11) DEFAULT '0',
  `eventid` int(11) DEFAULT '0',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `event`
--

LOCK TABLES `event` WRITE;
/*!40000 ALTER TABLE `event` DISABLE KEYS */;
INSERT INTO `event` VALUES (1,'Concert U2','U2 plays in Krakow Arena',1,2,0,'Krakow',50.0676,19.9918,'2019-06-22 20:00:00','photo1',0,0,0),(2,'Italian Cooking','Cooking lessons with famous chef',3,4,0,'Krakow',50.0629,19.9365,'2019-04-01 18:00:00','photo2',0,0,0),(3,'Footbal game','Casual footbal game',5,6,0,'Krakow',50.054,19.9394,'2019-04-05 19:30:00','photo4',0,0,0),(4,'Java lessons','Java training in machine learning',7,8,0,'Krakow',50.0656,19.9182,'2019-04-06 14:00:00','photo3',0,0,0),(7,'Asian cooking','Cooking lessons with Geslerowa',3,0,0,'Krakow',50.1629,19.1365,'2019-04-01 18:00:00','photo6',0,0,0),(8,'C# classes','WUP',3,0,0,'Krakow',50.1629,19.1365,'2019-04-01 18:00:00','photo10',0,0,0),(9,'C++ classes','WUP',4,0,0,'Krakow',51.1629,19.1365,'2019-05-01 18:00:00','photo10',0,0,0),(10,'C++ classes','WUP',4,0,0,'Krakow',51.1629,19.1365,'2019-05-01 18:00:00','photo10',0,0,0),(11,'C++ classes','WUP',4,0,0,'Krakow',51.1629,19.1365,'2019-05-01 18:00:00','photo10',0,0,0),(12,'Asian cooking','Cooking lessons with Geslerowa',3,0,0,'Krakow',50.1629,19.1365,'2019-04-01 18:00:00','photo6',NULL,NULL,NULL);
/*!40000 ALTER TABLE `event` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2019-04-04 20:31:42
