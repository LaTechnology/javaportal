/**
 * 
 */
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

import com.erp.lt.portal.dto.EmployeeComuniVO;
import com.erp.lt.portal.service.EmployeeComuniService;

/**
 * @author User
 *
 */
@RestController
public class EmployeeComuniController {
	
	@Autowired
	EmployeeComuniService employeeComuniService;


	@PostMapping (path = "/add/comuniinfo",consumes= {"application/json"})
	public void addemployeecommuni(@RequestBody EmployeeComuniVO employeeComuniVO)
	{
		employeeComuniService.addemployeecommuni(employeeComuniVO);

	}

	@GetMapping(path = "/get/communi/{empId}")
	public EmployeeComuniVO getbyempId(@PathVariable(value = "empId") long empId) {

	Optional<EmployeeComuniVO> optional = employeeComuniService.getbyempId(empId);

	return optional.get();
	}

	@PutMapping(path = "/edit/comuni/{empId}")
	public void editbyempId(@PathVariable (value="empId") long empId, @RequestBody EmployeeComuniVO employeeComuniVO) {
	Optional<EmployeeComuniVO> empdto = employeeComuniService.getbyempId(empId);
	if(empdto == null) {
	System.out.println("Employee Not found");
	}else
	{
		employeeComuniService.editbyempId(employeeComuniVO);
	}
	}
	@PatchMapping(path = "/patch/communi/{empId}")
	public void patchbyempId(@PathVariable (value="empId") long empId, @RequestBody EmployeeComuniVO employeeComuniVO) {
	Optional<EmployeeComuniVO> empdto = employeeComuniService.getbyempId(empId);
	if(empdto == null) {
	System.out.println("Employee Not found");
	}else
	{
		employeeComuniService.editbyempId(employeeComuniVO);
	}
	}

	@DeleteMapping(path = "/delete/communication/{empId}")
	public void  deletebyempId(@PathVariable(value="empId")Long empId)
	{
		employeeComuniService.deletebyempId(empId);

	}

}
