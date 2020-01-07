package com.erp.lt.portal.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.erp.lt.portal.ERPConstants;
import com.erp.lt.portal.service.EducationService;
import com.erp.lt.portal.vo.EducationDetailsVO;

import javassist.NotFoundException;

@RestController
@RequestMapping(path = ERPConstants.URL_BASE)
public class EducationController {

	@Autowired
	EducationService educationService;

	@PostMapping(path =ERPConstants.EMPLOYEEEDUCATION_ADD_URL, consumes = { MediaType.APPLICATION_JSON_VALUE })
	public void addEmployeeEdu(@RequestBody EducationDetailsVO dto) {
		educationService.addemployeeEducation(dto);
	}

	@GetMapping(path = ERPConstants.EMPLOYEEEDUCATION_GET_URL)
	public List<EducationDetailsVO> getEmployeeEdu(@PathVariable(value = "eduId") int eduId) {
		return educationService.getEmployeeEducationDetail(eduId);
	}

	@DeleteMapping(path = ERPConstants.EMPLOYEEEDUCATION_SOFTDELETE_URL)
	public List<EducationDetailsVO> deleteEmployeeEducation(@PathVariable(value = "empId") int empId) {
		return educationService.deleteEmployeeEducation(empId);
	}

	@PutMapping(path = ERPConstants.EMPLOYEEEDUCATION_EDIT_URL)
	public boolean editEmployee(@RequestBody EducationDetailsVO detailsVO) {
		
		boolean status = false;
		try {
			status = educationService.editEmployeeEducation(detailsVO);
		} catch (NotFoundException e) {
			e.printStackTrace();
		}
		if (status) {
			System.out.println("Employee not founded");
		} else {
			try {
				educationService.editEmployeeEducation(detailsVO);
			} catch (NotFoundException e) {
				e.printStackTrace();
			}
		}
		return status;

	}

}
