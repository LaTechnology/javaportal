package com.erp.lt.portal.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


import com.erp.lt.portal.service.EducationTypeService;

import com.erp.lt.portal.vo.EducationTypeVO;

@RestController
public class EducationTypeController {


	@Autowired
	EducationTypeService educationTypeService;
	
	@GetMapping(path = "/get/educationtype/{code}")
	
	public EducationTypeVO getEmployeeEdu(@PathVariable(value = "code") int code) {		
		
		return educationTypeService.getEduType(code);
		
		
	
}

}