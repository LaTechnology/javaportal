-- MySQL dump 10.13  Distrib 8.0.18, for Win64 (x86_64)
--
-- Host: localhost    Database: employee_selfservicedb
-- ------------------------------------------------------
-- Server version	8.0.18

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
-- Table structure for table `communication_details`
--

DROP TABLE IF EXISTS `communication_details`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `communication_details` (
  `code` int(11) NOT NULL,
  `employee_code` int(11) DEFAULT NULL,
  `company_email_id` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL,
  `personal_email_id` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL,
  `client_email_id` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL,
  `emergency_comunication_number` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL,
  `begin_date` date NOT NULL,
  `end_date` date NOT NULL,
  PRIMARY KEY (`code`),
  KEY `fk_comm_details_emp_info_idx` (`employee_code`),
  KEY `indx_search` (`company_email_id`,`personal_email_id`,`begin_date`,`end_date`),
  CONSTRAINT `fk_comm_details_emp_info` FOREIGN KEY (`employee_code`) REFERENCES `employee_info` (`employee_code`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `designation_type`
--

DROP TABLE IF EXISTS `designation_type`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `designation_type` (
  `code` int(11) NOT NULL,
  `description` varchar(45) CHARACTER SET utf8 COLLATE utf8_bin DEFAULT NULL,
  `status` tinyint(4) DEFAULT NULL,
  PRIMARY KEY (`code`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `education_details`
--

DROP TABLE IF EXISTS `education_details`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `education_details` (
  `educationId` int(11) NOT NULL,
  `instituteName` varchar(50) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL,
  `universityName` varchar(50) CHARACTER SET utf8 COLLATE utf8_bin DEFAULT NULL,
  `education_type_code` int(11) NOT NULL,
  `beginDate` date NOT NULL,
  `endDate` date NOT NULL,
  `education_board_code` int(11) NOT NULL,
  `cgpa` decimal(10,0) NOT NULL,
  `additionalCertification` varchar(45) CHARACTER SET utf8 COLLATE utf8_bin DEFAULT NULL,
  `employee_code` int(11) NOT NULL,
  PRIMARY KEY (`educationId`),
  KEY `fk_emp_education_details_idx` (`employee_code`),
  KEY `indx_begin_dt` (`beginDate`,`endDate`),
  KEY `Indx_name` (`instituteName`,`universityName`),
  KEY `fk_emp_edu_details_idx` (`education_board_code`),
  KEY `fk_emp_education_details_type_idx` (`education_type_code`),
  CONSTRAINT `fk_emp_edu_details` FOREIGN KEY (`education_board_code`) REFERENCES `educationboard` (`code`),
  CONSTRAINT `fk_emp_education_details` FOREIGN KEY (`employee_code`) REFERENCES `employee_info` (`employee_code`),
  CONSTRAINT `fk_emp_education_details_type` FOREIGN KEY (`education_type_code`) REFERENCES `educationtype` (`code`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `educationboard`
--

DROP TABLE IF EXISTS `educationboard`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `educationboard` (
  `code` int(11) NOT NULL,
  `boardType` varchar(30) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL,
  PRIMARY KEY (`code`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `educationtype`
--

DROP TABLE IF EXISTS `educationtype`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `educationtype` (
  `code` int(11) NOT NULL,
  `educationStandards` varchar(10) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL,
  PRIMARY KEY (`code`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `employee_info`
--

DROP TABLE IF EXISTS `employee_info`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `employee_info` (
  `employee_code` int(11) NOT NULL,
  `firstname` varchar(30) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL,
  `lastName` varchar(30) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL,
  `gender_type_code` int(11) NOT NULL,
  `dob` date NOT NULL,
  `marital_status_code` int(11) DEFAULT NULL,
  `marriage_date` date DEFAULT NULL,
  `nationality` varchar(20) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL,
  `citizen` varchar(15) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL,
  `countryofbirth` varchar(30) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL,
  `stateofbirth` varchar(30) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL,
  `status` tinyint(4) DEFAULT NULL,
  PRIMARY KEY (`employee_code`),
  KEY `gender_type_code_idx` (`gender_type_code`),
  KEY `marital_status_idx` (`marital_status_code`),
  CONSTRAINT `gender_type_code` FOREIGN KEY (`gender_type_code`) REFERENCES `gender_type` (`code`),
  CONSTRAINT `marital_status` FOREIGN KEY (`marital_status_code`) REFERENCES `marital_status` (`code`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `employement_history`
--

DROP TABLE IF EXISTS `employement_history`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `employement_history` (
  `id` int(11) NOT NULL,
  `employee_code` int(11) DEFAULT NULL,
  `employerNmae` varchar(45) CHARACTER SET utf8 COLLATE utf8_bin DEFAULT NULL,
  `beginDate` date DEFAULT NULL,
  `endDate` date DEFAULT NULL,
  `designation_type_code` int(11) DEFAULT NULL,
  `address_address_code` int(11) DEFAULT NULL,
  `ctc` decimal(10,3) DEFAULT NULL,
  `reference` varchar(45) CHARACTER SET utf8 COLLATE utf8_bin DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_emp_history_employee_info_idx` (`employee_code`),
  KEY `ind_dt` (`beginDate`,`endDate`) /*!80000 INVISIBLE */,
  KEY `ind_employeername` (`employerNmae`),
  KEY `fk_emp_history_des_type_idx` (`designation_type_code`),
  CONSTRAINT `fk_emp_history_des_type` FOREIGN KEY (`designation_type_code`) REFERENCES `designation_type` (`code`),
  CONSTRAINT `fk_emp_history_employee_info` FOREIGN KEY (`employee_code`) REFERENCES `employee_info` (`employee_code`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `gender_type`
--

DROP TABLE IF EXISTS `gender_type`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `gender_type` (
  `code` int(11) NOT NULL,
  `title` varchar(10) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL,
  PRIMARY KEY (`code`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `marital_status`
--

DROP TABLE IF EXISTS `marital_status`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `marital_status` (
  `code` int(11) NOT NULL,
  `title` varchar(5) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL,
  PRIMARY KEY (`code`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `mobile_details`
--

DROP TABLE IF EXISTS `mobile_details`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `mobile_details` (
  `code` int(11) NOT NULL,
  `comminication_details_code` int(11) NOT NULL,
  `mobile_number_1` int(10) NOT NULL,
  `moblie_number_2` int(10) DEFAULT NULL,
  PRIMARY KEY (`code`),
  UNIQUE KEY `mobile_number_1_UNIQUE` (`mobile_number_1`),
  UNIQUE KEY `moblie_number_UNIQUE` (`moblie_number_2`),
  KEY `communication_details_code_idx` (`comminication_details_code`),
  CONSTRAINT `communication_details_code` FOREIGN KEY (`comminication_details_code`) REFERENCES `communication_details` (`code`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;
/*!40101 SET character_set_client = @saved_cs_client */;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2019-12-23  9:52:46
