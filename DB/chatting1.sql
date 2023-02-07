CREATE DATABASE  IF NOT EXISTS `chatting` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `chatting`;
-- MySQL dump 10.13  Distrib 8.0.32, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: chatting
-- ------------------------------------------------------
-- Server version	8.0.32

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
-- Table structure for table `role_dtl`
--

DROP TABLE IF EXISTS `role_dtl`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `role_dtl` (
  `role_dtl_id` int NOT NULL AUTO_INCREMENT,
  `role_id` varchar(45) NOT NULL,
  `user_id` varchar(45) NOT NULL,
  PRIMARY KEY (`role_dtl_id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `role_dtl`
--

LOCK TABLES `role_dtl` WRITE;
/*!40000 ALTER TABLE `role_dtl` DISABLE KEYS */;
INSERT INTO `role_dtl` VALUES (1,'1','1'),(2,'2','1'),(3,'3','1');
/*!40000 ALTER TABLE `role_dtl` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `role_mst`
--

DROP TABLE IF EXISTS `role_mst`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `role_mst` (
  `role_id` int NOT NULL AUTO_INCREMENT,
  `role_name` varchar(45) NOT NULL,
  PRIMARY KEY (`role_id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `role_mst`
--

LOCK TABLES `role_mst` WRITE;
/*!40000 ALTER TABLE `role_mst` DISABLE KEYS */;
INSERT INTO `role_mst` VALUES (1,'ROLE_ADMIN'),(2,'ROLE_MANAGER'),(3,'ROLE_USER'),(4,'ROLE_TESTER'),(5,'ROLE_TESTER'),(6,'ROLE_TESTER');
/*!40000 ALTER TABLE `role_mst` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `user_mst`
--

DROP TABLE IF EXISTS `user_mst`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `user_mst` (
  `user_id` int NOT NULL AUTO_INCREMENT,
  `username` varchar(45) NOT NULL,
  `userpassword` varchar(100) NOT NULL,
  `name` varchar(45) NOT NULL,
  `email` varchar(45) NOT NULL,
  PRIMARY KEY (`user_id`),
  UNIQUE KEY `user_name_UNIQUE` (`username`),
  UNIQUE KEY `email_UNIQUE` (`email`)
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user_mst`
--

LOCK TABLES `user_mst` WRITE;
/*!40000 ALTER TABLE `user_mst` DISABLE KEYS */;
INSERT INTO `user_mst` VALUES (1,'aaab','1234','김이삼','aaab@gmail.com'),(2,'bbb','1234','bbb','bbb@gmail.com'),(3,'ccc','1234','ccc','ccc@gmail.com'),(4,'ddd','1234','ddd','ddd@gmail.com'),(7,'eee','1234','eee','eee@gmail.com'),(9,'aaaaa','$2a$10$VX3O8TRsAY5Drub2z0LSau/vhUokGUV.K6Tc8ofq/5rpfUgPOINra','aaaaa','aaaaa@gmail.com'),(11,'jiho','$2a$10$63kXhhgydkbbmXv1JWXF9eWemr2gv92.IM.iqDwco51vvRAUi4K2i','jihoson','jiho@gmail.com');
/*!40000 ALTER TABLE `user_mst` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping events for database 'chatting'
--

--
-- Dumping routines for database 'chatting'
--
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2023-01-26 17:46:17
