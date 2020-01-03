package com.erp.lt.portal.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.erp.lt.portal.service.EmployeeDesignationService;
import com.erp.lt.portal.vo.EmployeeDesignationVO;

@RestController
public class EmployeeDesignationController {
	@Autowired
	EmployeeDesignationService employeeDesignationService;
	@GetMapping(path = "/get/EmpDesignation/{code}")
	public EmployeeDesignationVO getEmployeeEdu(@PathVariable(value = "code") int code) {
		 
			return employeeDesignationService.getEmployeeDesignation(code);
		}

}
