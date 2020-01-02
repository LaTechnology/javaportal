package com.erp.lt.portal.service;

import com.erp.lt.portal.vo.EmployeeAddressVO;

public interface EmployeeAddressService {


	public void addemployeaddress(EmployeeAddressVO employeeaddresstypevo);
    
	public EmployeeAddressVO getEmployeeAddress(int id);

	public void editemployeaddress(EmployeeAddressVO employeeaddressvo);

	public void deleteemployeaddress(String employeeNumber);

}
