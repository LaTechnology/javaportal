package com.lt.erp.portal.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.lt.erp.portal.dto.EmployeePersonalInfoDTO;
import com.lt.erp.portal.facade.EmployeeFacade;

@RestController
@RequestMapping(path = "/erpportal/api/v1")
public class EmployeeEndpoint {

	@Autowired
	EmployeeFacade employeeFacade;

	@RequestMapping(name = "/employee/address/{empid}/editAdd", method = RequestMethod.DELETE, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public boolean anything(@PathVariable(name = "employeeId") String employeeId) {
		employeeFacade.editEmployee(employeeId);
		return false;
	}

	@RequestMapping(name = "/employee/address/createEmployee", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public EmployeePersonalInfoDTO createEmployee(
			@RequestBody(required = true) EmployeePersonalInfoDTO personalInfoDTO) {
		return null;
	}
}
