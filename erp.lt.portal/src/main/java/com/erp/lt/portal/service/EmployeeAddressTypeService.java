package com.erp.lt.portal.service;

import java.util.List;
import com.erp.lt.portal.vo.EmployeeAddressTypeVO;

public interface EmployeeAddressTypeService {
	public List<EmployeeAddressTypeVO> getallemployeeaddresstype(EmployeeAddressTypeVO employeeaddresstypevo);
	public void addemployeeaddresstype(EmployeeAddressTypeVO employeeaddresstypevo);
				
	public EmployeeAddressTypeVO getemployeeaddresstype(int empcode);
	
	public void editemployeeaddresstype(EmployeeAddressTypeVO employeeaddresstypevo);
	
	public void deleteemployeeaddresstype(int code);


}