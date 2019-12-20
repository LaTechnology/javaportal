package com.erp.lt.portal.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.erp.lt.portal.dto.EducationDetailsDto;
import com.erp.lt.portal.service.EmployeeEduService;

@RestController
public class EducationController {
	
	@Autowired
	EmployeeEduService employeeEduService;

	@PostMapping(path = "/add/EducationDetails", consumes = { "application/json" })
	public void addEmployeeEdu(@RequestBody EducationDetailsDto dto) {
	employeeEduService.addEmployeeEdu(dto);
	}

	@GetMapping(path = "/get/EducationDetails/{empId}")
	public EducationDetailsDto getEmployeeEdu(@PathVariable(value = "empId") long empid) {
	Optional<EducationDetailsDto> optional = employeeEduService.getEmployeeEducationDetail(empid);
	return optional.get();
	}

	@PutMapping(path = "/edit/EducationDetails/{empid}")
	public void editEmployeeEdu(@PathVariable(value = "empid") Long empid, @RequestBody EducationDetailsDto dto) {
	Optional<EducationDetailsDto> optional = employeeEduService.getEmployeeEducationDetail(empid);
	if (optional == null) {
	System.out.println("Employ Not Found");
	} else {
	employeeEduService.editEmployeeEdu(dto);
	}
	}
	@PatchMapping(path = "/patch/EducationDetails/{empid}")
	public void patchEmployeeEdu(@PathVariable(value = "empid") Long empid, @RequestBody EducationDetailsDto dto) {
	Optional<EducationDetailsDto> optional = employeeEduService.getEmployeeEducationDetail(empid);
	if (optional == null) {
	System.out.println("Employ Not Found");
	} else {
	employeeEduService.editEmployeeEdu(dto);
	}
	}

	@DeleteMapping(path = "/Delete/EducationDelete/{empid}")
	public void deleteEmployeeEdu(@PathVariable(value = "empid") long EmpId) {
	employeeEduService.deleteEmployeeEdu(EmpId);

	}

}
