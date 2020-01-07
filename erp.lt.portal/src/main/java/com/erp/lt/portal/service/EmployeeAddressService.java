package com.erp.lt.portal.service;

import java.util.List;

import com.erp.lt.portal.vo.EmployeeAddressVO;

import javassist.NotFoundException;

public interface EmployeeAddressService {


	public void addemployeaddress(EmployeeAddressVO employeeaddresstypevo);
    
	public List<EmployeeAddressVO> getEmployeeAddress(int Id);

	public boolean editemployeaddress(EmployeeAddressVO employeeaddressvo) throws NotFoundException;

	public void deleteemployeaddress(int employeeNumber);

}
