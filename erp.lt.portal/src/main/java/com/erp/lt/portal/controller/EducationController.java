	package com.erp.lt.portal.controller;
	
	import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
	import org.springframework.web.bind.annotation.GetMapping;
	import org.springframework.web.bind.annotation.PathVariable;
	import org.springframework.web.bind.annotation.PostMapping;
	import org.springframework.web.bind.annotation.RequestBody;
	import org.springframework.web.bind.annotation.RestController;
	
	import com.erp.lt.portal.service.EducationService;
	import com.erp.lt.portal.vo.EducationDetailsVO;
	
	@RestController
	public class EducationController {
	
	
		@Autowired
		EducationService  educationService;
		
		@PostMapping(path = "/add/educationdetails", consumes = {MediaType.APPLICATION_JSON_VALUE })
		public void addEmployeeEdu(@RequestBody EducationDetailsVO dto) {
			    educationService.addemployeeEducation(dto);
		}
		
		@GetMapping(path = "/get/EducationDetails/{eduId}")
		public EducationDetailsVO getEmployeeEdu(@PathVariable(value = "eduId") int eduId) {		
			return educationService.getEmployeeEducationDetail(eduId);
			}
	
		@DeleteMapping(path ="/Delete/EducationDetails/{eduId}")
	      public void deleteEmployeeEducation(@PathVariable(value = "eduId") int eduId) {
			educationService.deleteEmployeeEducation(eduId);
		}
	      
		
	}
