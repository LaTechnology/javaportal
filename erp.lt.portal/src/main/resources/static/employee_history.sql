CREATE TABLE `employee_selfservicedb.designation_type` (
  `code` int(11) NOT NULL,
  `description` varchar(45) COLLATE utf8_bin DEFAULT NULL,
  `status` tinyint(4) DEFAULT NULL,
  PRIMARY KEY (`code`)
)

 ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;


CREATE TABLE `employee_selfservicedb.employement_history` (
  `id` int(11) NOT NULL,
  `employee_code` int(11) DEFAULT NULL,
  `employerNmae` varchar(45) COLLATE utf8_bin DEFAULT NULL,
  `beginDate` date DEFAULT NULL,
  `endDate` date DEFAULT NULL,
  `designation_type_code` int(11) DEFAULT NULL,
  `address_address_code` int(11) DEFAULT NULL,
  `ctc` decimal(10,3) DEFAULT NULL,
  `reference` varchar(45) COLLATE utf8_bin DEFAULT NULL,
  PRIMARY KEY (`id`)
) 

ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;
