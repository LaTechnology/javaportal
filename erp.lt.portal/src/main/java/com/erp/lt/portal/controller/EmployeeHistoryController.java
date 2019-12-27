package com.erp.lt.portal.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.erp.lt.portal.ERPConstants;
import com.erp.lt.portal.service.EmployeeHistoryService;
import com.erp.lt.portal.vo.EmployeeHistoryVO;

@RestController
@RequestMapping(path = ERPConstants.URL_BASE)
public class EmployeeHistoryController {
	@Autowired
	EmployeeHistoryService employeeHistoryService;

	@DeleteMapping(path = ERPConstants.EMPLOYEE_DELETE_URL)
	public void deleteEmployeeHistoryByEmployeeId(@PathVariable(value = "employeeCode") int employeeCode) {
		employeeHistoryService.deleteEmployeeHistory(employeeCode);

	}

	@PostMapping(path = ERPConstants.EMPLOYEE_ADD_URL, consumes = {MediaType.APPLICATION_JSON_VALUE})
	public void addEmployeeHistory(@RequestBody EmployeeHistoryVO employeeHistoryVO) {
		employeeHistoryService.addEmployeeHistory(employeeHistoryVO);
	}

	@GetMapping(path = ERPConstants.EMPLOYEE_GET_URL)
	public EmployeeHistoryVO getEmployeeHistory(@PathVariable(value = "employeeCode") int employeeCode) {
		return employeeHistoryService.getEmployeeHistory(employeeCode);
	}

}
