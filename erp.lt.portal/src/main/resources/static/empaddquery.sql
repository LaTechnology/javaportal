
CREATE TABLE `address_type` (
  `current_address` varchar(45) COLLATE utf8_bin DEFAULT NULL,
  `permenant_address` varchar(45) COLLATE utf8_bin DEFAULT NULL,
  `mailing_address` varchar(45) COLLATE utf8_bin DEFAULT NULL,
  `office_address` varchar(45) COLLATE utf8_bin DEFAULT NULL,
  `emergency_contactadress` varchar(45) COLLATE utf8_bin DEFAULT NULL,
  `code` int(11) NOT NULL,
  PRIMARY KEY (`code`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;
CREATE TABLE `employee_address` (
  `id` int(11) NOT NULL,
  `employee_code` int(11) DEFAULT NULL,
  `pincode` varchar(45) COLLATE utf8_bin DEFAULT NULL,
  `city` varchar(45) COLLATE utf8_bin DEFAULT NULL,
  `country` varchar(45) COLLATE utf8_bin DEFAULT NULL,
  `state` varchar(45) COLLATE utf8_bin DEFAULT NULL,
  `code` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  CONSTRAINT `fk_Emp_add_code` FOREIGN KEY (`id`) REFERENCES `address_type` (`code`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;