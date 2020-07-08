package com.salesforce.update.service.impl;

import java.util.ArrayList;
import java.util.List;

import com.salesforce.update.dto.EmployeeDto;

public class DefaultSalesforceUpdateImpl {
	
	DefaultSalesforceUpdateImplDAO dao;
	public List<EmployeeDto> getEmployee() {
		List<EmployeeDto> employees = new ArrayList<EmployeeDto>();
		EmployeeDto employee = new EmployeeDto();
		employee.setEmpId("1234");
		employee.setFirstName("Ajith Tamil");
		employee.setLastName("Tamil");
		employees.add(employee);
		
		EmployeeDto employee1 = new EmployeeDto();
		employee1.setEmpId("1234");
		employee1.setFirstName("Ajith Tamil");
		employee1.setLastName("Tamil");
		employees.add(employee1);
		return employees;
	}

	public List<EmployeeDto> getEmployeeFromDB() {
		dao=new DefaultSalesforceUpdateImplDAO();
		return dao.getEmployeeFromDB();
	}
}
