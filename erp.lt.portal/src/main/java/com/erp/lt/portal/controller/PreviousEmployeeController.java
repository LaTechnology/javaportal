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

import com.erp.lt.portal.dto.PreviousEmployeeVO;
import com.erp.lt.portal.service.PreviousEmployerService;

@RestController
public class PreviousEmployeeController {
	
	@Autowired
	PreviousEmployerService previousEmployerService;
	
	@PostMapping(path="/add/prevemp",consumes = {"application/json"})

	public void addPreviousEmpDetail(@RequestBody PreviousEmployeeVO previousEmployeeVO) {
		previousEmployerService.addPreviousEmpDetail(previousEmployeeVO);
	}
	@PutMapping(path="/edit/prevemp/{empid}")
	public void editPreviousEmpDetail(@PathVariable(value = "empid")Long empid,@RequestBody PreviousEmployeeVO previousEmployeeVO) {
	Optional<PreviousEmployeeVO>optional=previousEmployerService.getPreviousEmpDetail(empid);
	if(optional==null)
	{
	System.out.println("Employ Not Found");
	}
	else
	{
		previousEmployerService.editPreviousEmpDetail(previousEmployeeVO);
	}
	}
	@PatchMapping(path="/patch/prevemp/{empid}")
	public void patchPreviousEmpDetail(@PathVariable(value = "empid")Long empid,@RequestBody PreviousEmployeeVO previousEmployeeVO) {
	Optional<PreviousEmployeeVO>optional=previousEmployerService.getPreviousEmpDetail(empid);
	if(optional==null)
	{
	System.out.println("Employ Not Found");
	}
	else
	{
		previousEmployerService.editPreviousEmpDetail(previousEmployeeVO);
	}

	}
	@DeleteMapping(path="/delete/prevemp/{empid}")
	public void deletePreviousEmpDetail(@PathVariable(value="empid")Long empid) {
		previousEmployerService.deletePreviousEmpDetail(empid);
	}
	@GetMapping(path="/get/prevemp/{empid}")
	public PreviousEmployeeVO getPreviousEmpDetail(@PathVariable(value="empid")Long empid) {
	Optional<PreviousEmployeeVO>optional=previousEmployerService.getPreviousEmpDetail(empid);
	return optional.get();

	}

}
