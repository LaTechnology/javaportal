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
import com.erp.lt.portal.model.EmployementHistory;
import com.erp.lt.portal.service.EmployeeHistoryService;
import com.erp.lt.portal.vo.EmployeeHistoryVO;

@RestController
@RequestMapping(path = ERPConstants.URL_BASE)
public class EmployeeHistoryController {
	@Autowired
	EmployeeHistoryService employeeHistoryService;

	@DeleteMapping(path = ERPConstants.EMPLOYEEHISTORY_DELETE_URL)
	public void deleteEmployeeHistoryByEmployeeId(@PathVariable(value = "employeeCode") int employeeCode) {
		employeeHistoryService.deleteEmployeeHistory(employeeCode);

	}

	@PostMapping(path = ERPConstants.EMPLOYEEHISTORY_ADD_URL, consumes = { MediaType.APPLICATION_JSON_VALUE})
	public void addEmployeeHistory(@RequestBody EmployeeHistoryVO employeeHistoryVO) {
		employeeHistoryService.addEmployeeHistory(employeeHistoryVO);
	}
	@GetMapping(path = ERPConstants.EMPLOYEEHISTORY_GETALL_URL)
	public List<EmployementHistory> getAllEmployeeHistory(){
		return employeeHistoryService.getAllEmployeeHistory();
	}
	@GetMapping(path = ERPConstants.EMPLOYEEHISTORY_GET_URL)
	public EmployeeHistoryVO getEmployeeHistory(@PathVariable(value = "employeeCode") int employeeCode) {
		return employeeHistoryService.getEmployeeHistory(employeeCode);
	}
	@PutMapping(path = ERPConstants.EMPLOYEEHISTORY_EDIT_URL)
	public boolean editEmployeeHistory(@RequestBody EmployeeHistoryVO employeeHistoryVO) {
		boolean historyVO=true;
		try {
			historyVO=employeeHistoryService.editEmployeeHistory(employeeHistoryVO);
		} catch (javassist.NotFoundException e1) {
			System.out.println("Employee not found" );
		}
		if(historyVO) {
				System.out.println("Employee History Not Found");
			}
			else {
				try {
					employeeHistoryService.editEmployeeHistory(employeeHistoryVO);
				} catch (javassist.NotFoundException e) {
					System.out.println("Employee not found");
				}
				
			}
			return historyVO;

	}

}
