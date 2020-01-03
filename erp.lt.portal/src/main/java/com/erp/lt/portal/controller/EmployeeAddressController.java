package com.erp.lt.portal.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.erp.lt.portal.ERPConstantsAddress;
import com.erp.lt.portal.service.EmployeeAddressService;
import com.erp.lt.portal.vo.EmployeeAddressVO;

import javassist.NotFoundException;

@RestController
@RequestMapping(path = ERPConstantsAddress.URL_BASE)
public class EmployeeAddressController {
	@Autowired
	EmployeeAddressService employeeAddressService;

	@GetMapping(path = ERPConstantsAddress.EMPLOYEE_DETAILS_GET_URL)
	public EmployeeAddressVO getAddress(@PathVariable(value = "Id") int Id) {
		System.out.println("Given id is" + Id);
		EmployeeAddressVO addressVO = employeeAddressService.getEmployeeAddress(Id);
		return addressVO;
	}

	@PostMapping(path = ERPConstantsAddress.EMPLOYEE_ADDRESS_ADD_URL, consumes = { MediaType.APPLICATION_JSON_VALUE }) 

	public void addemployeeadress(@RequestBody EmployeeAddressVO employeeaddressvo) {
		employeeAddressService.addemployeaddress(employeeaddressvo);
	}

	@PutMapping(path = ERPConstantsAddress.EMPLOYEE_ADDRESS_EDIT_URL)
	public void editemployeeaddress(@RequestBody EmployeeAddressVO employeeaddressvo) {

		try {
			employeeAddressService.editemployeaddress(employeeaddressvo);
		} catch (NotFoundException e) {

			e.printStackTrace();
		}
	}

	/*
	 * @PatchMapping(path = ERPConstantsAddress.EMPLOYEE_ADDRESS_PATCHING_URL)
	 * public void patchingemployeeaddress(@RequestBody EmployeeAddressVO
	 * employeeaddressvo) { employeeAddressService.editemployeaddress(employeeaddressvo);
	 * }
	 */

	@DeleteMapping(path = ERPConstantsAddress.EMPLOYEE_ADDRESS_DELETE_URL)
	public void deleteEmployee(@PathVariable(value = "employeeNumber") int employeeNumber) {

		employeeAddressService.deleteemployeaddress(employeeNumber);

	}
}
