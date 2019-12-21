CREATE TABLE `employee_selfservicedb.communication_details` (
  `code` int(11) NOT NULL,
  `employee_code` int(11) DEFAULT NULL,
  `company_email_id` varchar(255) COLLATE utf8_bin NOT NULL,
  `personal_email_id` varchar(255) COLLATE utf8_bin NOT NULL,
  `client_email_id` varchar(255) COLLATE utf8_bin NOT NULL,
  `emergency_comunication_number` varchar(255) COLLATE utf8_bin NOT NULL,
  `begin_date` date NOT NULL,
  `end_date` date NOT NULL,
  PRIMARY KEY (`code`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

CREATE TABLE `mobile_details` (
  `code` int(11) NOT NULL,
  `comminication_details_code` int(11) DEFAULT NULL,
  `mobile_number_1` varchar(45) COLLATE utf8_bin NOT NULL,
  `moblie_number_2` varchar(45) COLLATE utf8_bin DEFAULT NULL,
  PRIMARY KEY (`code`),
  UNIQUE KEY `mobile_number_1_UNIQUE` (`mobile_number_1`),
  UNIQUE KEY `moblie_number_UNIQUE` (`moblie_number_2`),
  KEY `communication_details_code_idx` (`comminication_details_code`),
  CONSTRAINT `communication_details_code` FOREIGN KEY (`comminication_details_code`) REFERENCES `communication_details` (`code`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

