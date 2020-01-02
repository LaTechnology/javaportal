/**
 * 
 */
package com.erp.lt.portal.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.erp.lt.portal.ERPConstants;
import com.erp.lt.portal.model.EmployeeInfo;
import com.erp.lt.portal.service.EmployeeInfoService;
import com.erp.lt.portal.vo.EmployeeInfoVO;

import javassist.NotFoundException;

/**
 * @author admin
 *
 */
@RestController
@RequestMapping(path = ERPConstants.URL_BASE)
public class EmployeeInfoController {
	@Autowired
	EmployeeInfoService employeeinfoservice;

	@PostMapping(path = ERPConstants.EMPLOYEE_ADD_URL, consumes = { MediaType.APPLICATION_JSON_VALUE })
	public void addEmployee(@RequestBody EmployeeInfoVO employeeInfoVo) {
		employeeinfoservice.addEmployeeInfo(employeeInfoVo);
	}

	@GetMapping(path = ERPConstants.EMPLOYEE_GET_URL)

	public EmployeeInfoVO getEmployee(@PathVariable(value = "employeeNumber") String employeeNumber) {
		EmployeeInfoVO employeeInfoVO = new EmployeeInfoVO();
		try {
			final EmployeeInfo employeeInfo = employeeinfoservice.getEmployeeInfoByEmpId(employeeNumber);
			employeeinfoservice.doMap(employeeInfo, employeeInfoVO);
		} catch (NotFoundException e) {
			e.printStackTrace();
		}
		return employeeInfoVO;

	}

	@GetMapping(path = ERPConstants.EMPLOYEE_GETALL_URL)
	public List<EmployeeInfoVO> getAllEmployee() {
		return employeeinfoservice.getAllEmployeeInfo();

	}

	@PutMapping(path = ERPConstants.EMPLOYEE_EDIT_URL)
	public boolean editEmployee(@RequestBody EmployeeInfoVO employeeInfoVo) {
		boolean infoVO = true;
		try {
			infoVO = employeeinfoservice.editEmployeeInfo(employeeInfoVo);
		} catch (NotFoundException e) { // TODO Auto-generated catch block
			e.printStackTrace();
		}
		if (infoVO) {
			System.out.println("Employee Not found");
		} else {
			try {
				employeeinfoservice.editEmployeeInfo(employeeInfoVo);
			} catch (NotFoundException e) { // TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return infoVO;
	}

	@PatchMapping(path = ERPConstants.EMPLOYEE_PATCHING_URL)

	public boolean editedEmployeeInfo(@RequestBody EmployeeInfoVO employeeInfoVo) {
		boolean status = false;
		try {
			status = employeeinfoservice.patchEmployeeInfo(employeeInfoVo);
		} catch (NotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		if (status) {
			System.out.println("Employee saved");
		} else {
			System.out.println("Employee not saved");
		}
		return status;
	}
	/*
	 * @DeleteMapping(path = ERPConstants.EMPLOYEE_DELETE_URL) public void
	 * deleteEmployee(@PathVariable(value = "employeeCode") int employeeCode) {
	 * employeeinfoservice.deleteEmployeeInfo(employeeCode);
	 * 
	 * if (0 >= employeeCode) {
	 * employeeinfoservice.deleteEmployeeInfo(employeeCode); } }
	 */

}
