package com.erp.lt.portal.service;

import java.util.List;
import java.util.Optional;

import com.erp.lt.portal.dto.EmployeeInfoVO;

public interface EmployeeInfoService {

	public void addEmployeeInfo(EmployeeInfoVO employeeInfoVO);

	public void editEmployeeInfo(EmployeeInfoVO employeeInfoVO);

	public Optional<EmployeeInfoVO> getEmployeeInfo(int empId);

	public void deleteEmployeeInfo(int empId);

	public List<EmployeeInfoVO> getAllEmployeeInfo(EmployeeInfoVO employeeInfoVO);

}
