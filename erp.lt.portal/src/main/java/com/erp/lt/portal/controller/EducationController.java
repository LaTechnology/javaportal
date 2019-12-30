package com.erp.lt.portal.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.erp.lt.portal.service.EducationService;
import com.erp.lt.portal.vo.EducationDetailsVO;

import javassist.NotFoundException;

@RestController
public class EducationController {

	@Autowired
	EducationService educationService;

	@PostMapping(path = "/add/educationdetails", consumes = { MediaType.APPLICATION_JSON_VALUE })
	public void addEmployeeEdu(@RequestBody EducationDetailsVO dto) {
		educationService.addemployeeEducation(dto);
	}

	@GetMapping(path = "/get/educationdetails/{eduId}")
	public EducationDetailsVO getEmployeeEdu(@PathVariable(value = "eduId") int eduId) {
		return educationService.getEmployeeEducationDetail(eduId);
	}

	@DeleteMapping(path = "/delete/educationdetails/{eduId}")
	public void deleteEmployeeEducation(@PathVariable(value = "eduId") int eduId) {
			educationService.deleteEmployeeEducation(eduId);
	}	
	
	/*
	 * @GetMapping(path = "/get/educationdetailsBycode/{employeeCode}") public
	 * EducationDetailsVO getEmployeeEduBycode(@PathVariable(value = "employeeCode")
	 * int employeeCode) { return
	 * educationService.getEmployeeEducationDetailByEmployeeCode(employeeCode); }
	 */
	
	
	@PutMapping(path= "/edit/educationdetails/")
	public boolean editEmployee(@RequestBody EducationDetailsVO detailsVO) {
		boolean status = false;	
	try {
		status= educationService.editEmployeeEducation(detailsVO);
	}catch(NotFoundException e){
		e.printStackTrace();
	}
	if(status) {
		System.out.println("Employee not founded");
	}else {
		try {
			educationService.editEmployeeEducation(detailsVO);
		}catch (NotFoundException e) {
		  e.printStackTrace();
		}
	}
		return status;
		
	}
	

}
