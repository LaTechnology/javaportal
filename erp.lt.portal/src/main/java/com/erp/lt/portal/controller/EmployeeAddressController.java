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
import com.erp.lt.portal.service.EmployeeAddressService;
import com.erp.lt.portal.vo.EmployeeAddressVO;

import javassist.NotFoundException;

@RestController
@RequestMapping(path = ERPConstants.URL_BASE)
public class EmployeeAddressController {
	@Autowired
	EmployeeAddressService employeeAddressService;

	@GetMapping(path = ERPConstants.EMPLOYEE_DETAILS_GET_URL)
	public List<EmployeeAddressVO> getAddress(@PathVariable(value = "Id") int Id) {
		System.out.println("Given id is" + Id);

		List<EmployeeAddressVO> addressVO = employeeAddressService.getEmployeeAddress(Id);

		return addressVO;
	}

	@PostMapping(path = ERPConstants.EMPLOYEE_ADDRESS_ADD_URL, consumes = { MediaType.APPLICATION_JSON_VALUE }) 

	public void addemployeeadress(@RequestBody EmployeeAddressVO employeeaddressvo) {
		employeeAddressService.addemployeaddress(employeeaddressvo);
	}

	@PutMapping(path = ERPConstants.EMPLOYEE_ADDRESS_EDIT_URL)
	public boolean editemployeeaddress(@RequestBody EmployeeAddressVO employeeaddressvo) {
           boolean status =false;
		try {
			status= employeeAddressService.editemployeaddress(employeeaddressvo);

		} catch (NotFoundException e) {

			e.printStackTrace();
		}
		if(status) {
		    System.out.println("employee address not founded");
		}else
		{
			try
			{
				employeeAddressService.editemployeaddress(employeeaddressvo);
			}catch(NotFoundException e) {
				e.printStackTrace();
			}
		}
	return status;
	}

	@DeleteMapping(path = ERPConstants.EMPLOYEE_ADDRESS_DELETE_URL)
	public void deleteEmployee(@PathVariable(value = "employeeNumber") int employeeNumber) {

		employeeAddressService.deleteemployeaddress(employeeNumber);

	}
}
