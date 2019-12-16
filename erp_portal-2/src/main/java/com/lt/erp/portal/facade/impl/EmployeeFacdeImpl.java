/**
 * 
 */
package com.lt.erp.portal.facade.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.lt.erp.portal.dto.EmployeePersonalInfoDTO;
import com.lt.erp.portal.facade.EmployeeFacade;
import com.lt.erp.portal.service.EmployeeService;

/**
 * @author admin
 *
 */
@Component
public class EmployeeFacdeImpl implements EmployeeFacade {
	
	@Autowired
	EmployeeService employeeService;
	

	@Override
	public boolean addEmployee1(EmployeePersonalInfoDTO dto) {
		
		return false;
	}

	@Override
	public EmployeePersonalInfoDTO addEmployee(EmployeePersonalInfoDTO dto) {
		EmployeePersonalInfoDTO employeePersonalInfoDTO=employeeService.addEmployee(dto);
		return employeePersonalInfoDTO;
	}

	@Override
	public void addEmployee2(EmployeePersonalInfoDTO dto) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean editEmployee1(String empId) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public EmployeePersonalInfoDTO editEmployee(String empId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean deleteEmployee(String empId) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public EmployeePersonalInfoDTO updateEmployee(String empId) {
		// TODO Auto-generated method stub
		return null;
	}

}
