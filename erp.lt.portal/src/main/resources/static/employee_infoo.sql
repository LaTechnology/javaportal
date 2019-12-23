CREATE TABLE `employee_info` (
  `employee_code` int(11) NOT NULL,
  `firstname` varchar(30) COLLATE utf8_bin NOT NULL,
  `lastName` varchar(30) COLLATE utf8_bin NOT NULL,
  `gender_type_code` int(11) NOT NULL,
  `dob` date NOT NULL,
  `marital_status_code` int(11) DEFAULT NULL,
  `marriage_date` date DEFAULT NULL,
  `nationality` varchar(20) COLLATE utf8_bin NOT NULL,
  `citizen` varchar(15) COLLATE utf8_bin NOT NULL,
  `countryofbirth` varchar(30) COLLATE utf8_bin NOT NULL,
  `stateofbirth` varchar(30) COLLATE utf8_bin NOT NULL,
  `status` tinyint(4) DEFAULT NULL,
  PRIMARY KEY (`employee_code`),
  KEY `gender_type_code_idx` (`gender_type_code`),
  KEY `marital_status_idx` (`marital_status_code`),
  CONSTRAINT `gender_type_code` FOREIGN KEY (`gender_type_code`) REFERENCES `gender_type` (`code`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `marital_status` FOREIGN KEY (`marital_status_code`) REFERENCES `marital_status` (`code`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;
CREATE TABLE `gender_type` (
  `code` int(11) NOT NULL,
  `title` varchar(10) COLLATE utf8_bin NOT NULL,
  PRIMARY KEY (`code`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;
CREATE TABLE `marital_status` (
  `code` int(11) NOT NULL,
  `title` varchar(5) COLLATE utf8_bin NOT NULL,
  PRIMARY KEY (`code`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

