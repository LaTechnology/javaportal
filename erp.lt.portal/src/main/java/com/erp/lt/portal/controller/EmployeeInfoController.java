/**
 * 
 */
package com.erp.lt.portal.controller;

import java.util.List;
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

import com.erp.lt.portal.dto.EmployeeInfoVO;
import com.erp.lt.portal.service.EmployeeInfoService;

/**
 * @author User
 *
 */
@RestController
public class EmployeeInfoController {
	@Autowired
	EmployeeInfoService employeeinfoservice;

	@PostMapping(path = "/add/empinfo", consumes = { "application/json" })
	public void addEmployee(@RequestBody EmployeeInfoVO employeeInfoVO) {
		employeeinfoservice.addEmployeeInfo(employeeInfoVO);

	}

	@GetMapping(path = "/get/empinfo/{empId}")
	public EmployeeInfoVO getEmployee(@PathVariable(value = "empId") int empId) {

		Optional<EmployeeInfoVO> optional = employeeinfoservice.getEmployeeInfo(empId);

		return optional.get();
	}

	@GetMapping(path = "/getall/empinfo/empinfo")
	public List<EmployeeInfoVO> getAllEmployee(@RequestBody EmployeeInfoVO employeeInfoVO) {

		return employeeinfoservice.getAllEmployeeInfo(employeeInfoVO);
	}

	@PutMapping(path = "/edit/empinfo/{empId}")
	public void editEmployee(@PathVariable(value = "empId") int empId, @RequestBody EmployeeInfoVO employeeInfoVO) {
		Optional<EmployeeInfoVO> empdto = employeeinfoservice.getEmployeeInfo(empId);
		if (empdto == null) {
			System.out.println("Employee Not found");
		} else {
			employeeinfoservice.editEmployeeInfo(employeeInfoVO);
		}
	}

	@PatchMapping(path = "/patching/empinfo/{empId}")
	public void editedEmployee(@PathVariable(value = "empId") int empId, @RequestBody EmployeeInfoVO employeeInfoVO) {
		Optional<EmployeeInfoVO> empdto = employeeinfoservice.getEmployeeInfo(empId);
		if (empdto == null) {
			System.out.println("Employee Not found");
		} else {
			employeeinfoservice.editEmployeeInfo(employeeInfoVO);
		}

	}

	@DeleteMapping(path = "/delete/empinfo/{empId}")
	public void deleteEmployee(@PathVariable(value = "empId") int empId) {
		employeeinfoservice.deleteEmployeeInfo(empId);

	}

}
