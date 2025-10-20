-- MySQL dump 10.13  Distrib 8.0.43, for Win64 (x86_64)
--
-- Host: localhost    Database: homework2
-- ------------------------------------------------------
-- Server version	8.0.43

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `sorder`
--

DROP TABLE IF EXISTS `sorder`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `sorder` (
  `id` int NOT NULL AUTO_INCREMENT,
  `username` varchar(45) DEFAULT NULL,
  `yoyo` int DEFAULT NULL,
  `candy` int DEFAULT NULL,
  `car` int DEFAULT NULL,
  `ball` int DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=35 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `sorder`
--

LOCK TABLES `sorder` WRITE;
/*!40000 ALTER TABLE `sorder` DISABLE KEYS */;
INSERT INTO `sorder` VALUES (1,'haveaniceday',3,22,11,33),(2,'haveaniceday',3,22,11,33),(3,'haveaniceday',22,2,1,3),(4,'grateful',1,2,1,3),(5,'grateful',2,1,1,1),(6,'grateful',1,1,1,1),(7,'happiness',1,0,0,4),(8,'happiness',1,0,0,4),(9,'happiness',1,1,2,3),(10,'username',1,1,0,1),(11,'username',0,1,1,0),(12,'username',1,0,0,0),(13,'username',6,2,14,5),(14,'username',1,0,0,0),(15,'username',1,0,0,0),(16,'username',0,1,0,0),(17,'username',1,0,0,0),(18,'username',0,0,1,0),(19,'username',0,0,1,0),(20,'username',1,0,0,0),(21,'username',1,0,0,0),(22,'username',1,0,0,0),(23,'username',2,0,0,0),(24,'username',2,0,0,0),(25,'username',1,0,0,0),(26,'username',1,1,0,0),(27,'username',1,0,0,0),(28,'username',1,0,0,0),(29,'username',1,0,0,0),(30,'username',1,0,0,0),(31,'username',1,0,0,0),(32,'username',1,1,0,0),(33,'username',1,1,0,0),(34,'username',1,0,0,0);
/*!40000 ALTER TABLE `sorder` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2025-10-06 23:43:28
