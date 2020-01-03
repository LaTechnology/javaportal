package com.erp.lt.portal.service;

import com.erp.lt.portal.vo.EmployeeAddressVO;

import javassist.NotFoundException;

public interface EmployeeAddressService {


	public void addemployeaddress(EmployeeAddressVO employeeaddresstypevo);
    
	public EmployeeAddressVO getEmployeeAddress(int id);

	public boolean editemployeaddress(EmployeeAddressVO employeeaddressvo) throws NotFoundException;

	public void deleteemployeaddress(int employeeNumber);

}
