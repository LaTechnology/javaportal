/**
 * 
 */
package com.erp.lt.portal2.EndPoint;

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

import com.erp.lt.portal2.Service.EmployeeInfoService;
import com.erp.lt.portal2.VO.EmployeeInfoVo;

/**
 * @author admin
 *
 */
@RestController
public class EmployeeInfoEndPoint {
	@Autowired
	EmployeeInfoService employeeinfoservice;

	@PostMapping(path = "/add/empinfomation", consumes = { "application/json" })
	public void addEmployee(@RequestBody EmployeeInfoVo employeeInfoVo) {
		employeeinfoservice.addEmployeeInfo(employeeInfoVo);

	}

	@GetMapping(path = "/get/empinfo/{employeeCode}")
	public EmployeeInfoVo getEmployee(@PathVariable(value = "employeeCode") int employeeCode) {

		Optional<EmployeeInfoVo> optional = employeeinfoservice.getEmployeeInfoByEmpId(employeeCode);

		return optional.get();
	}

	@GetMapping(path = "/getall")
	public List<EmployeeInfoVo> getAllEmployee(@RequestBody EmployeeInfoVo employeeInfoVo) {

		return employeeinfoservice.getAllEmployeeInfo(employeeInfoVo);
	}

	@PutMapping(path = "/edit/{employeeCode}")
	public void editEmployee(@PathVariable(value = "employeeCode") int employeeCode,
			@RequestBody EmployeeInfoVo employeeInfoVo) {
		Optional<EmployeeInfoVo> empdto = employeeinfoservice.getEmployeeInfoByEmpId(employeeCode);
		if (empdto == null) {
			System.out.println("Employee Not found");
		} else {
			employeeinfoservice.editEmployeeInfo(employeeInfoVo);
		}
	}

	@PatchMapping(path = "/patching/{employeeCode}")

	public void editedEmployeeInfo(@PathVariable(value = "employeeCode") int employeeCode,
			@RequestBody EmployeeInfoVo employeeInfoVo) {
		Optional<EmployeeInfoVo> empdto = employeeinfoservice.getEmployeeInfoByEmpId(employeeCode);

		if (empdto == null) {
			System.out.println("Employee Not found");
		} else {
			employeeinfoservice.editEmployeeInfo(employeeInfoVo);
		}

	}

	@DeleteMapping(path = "/delete/{employeeCode}")
	public void deleteEmployee(@PathVariable(value = "employeeCode") int employeeCode) {
		employeeinfoservice.deleteEmployeeInfo(employeeCode);

	}

}
