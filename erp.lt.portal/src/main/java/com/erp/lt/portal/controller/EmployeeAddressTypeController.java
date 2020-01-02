package com.erp.lt.portal.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.erp.lt.portal.ERPConstantAddressType;
import com.erp.lt.portal.ERPConstantsAddress;
import com.erp.lt.portal.service.EmployeeAddressTypeService;
import com.erp.lt.portal.vo.EmployeeAddressTypeVO;


@RequestMapping(path=ERPConstantsAddress.URL_BASE)
@RestController
public class EmployeeAddressTypeController {
	@Autowired
	EmployeeAddressTypeService empAddresstypeService;

	@GetMapping(path =ERPConstantAddressType.EMPLOYEE_ADDRESS_TYPE_GET_URL)
	
	public EmployeeAddressTypeVO getEmployeeAddressType(@PathVariable(value = "code") int EmpAddressid)
	{
	    return empAddresstypeService.getemployeeaddresstype(EmpAddressid);
	}
}