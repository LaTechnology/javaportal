CREATE TABLE `education_details` (
  `educationId` int(11) NOT NULL,
  `instituteName` varchar(50) COLLATE utf8_bin NOT NULL,
  `universityName` varchar(50) COLLATE utf8_bin DEFAULT NULL,
  `education_type_code` int(11) NOT NULL,
  `beginDate` date NOT NULL,
  `endDate` date NOT NULL,
  `education_board_code` int(11) NOT NULL,
  `cgpa` decimal(10,0) NOT NULL,
  `additionalCertification` varchar(45) COLLATE utf8_bin DEFAULT NULL,
  `employee_code` int(11) DEFAULT NULL,
  PRIMARY KEY (`educationId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;


CREATE TABLE `educationboard` (
  `code` int(11) NOT NULL,
  `boardType` varchar(30) COLLATE utf8_bin NOT NULL,
  PRIMARY KEY (`code`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

CREATE TABLE `educationtype` (
  `code` int(11) NOT NULL,
  `educationStandards` varchar(10) COLLATE utf8_bin NOT NULL,
  PRIMARY KEY (`code`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;
