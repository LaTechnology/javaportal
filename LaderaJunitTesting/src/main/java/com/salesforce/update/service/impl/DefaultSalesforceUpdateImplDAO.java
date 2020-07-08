package com.salesforce.update.service.impl;

import java.util.ArrayList;
import java.util.List;

import com.salesforce.update.dto.EmployeeDto;

public class DefaultSalesforceUpdateImplDAO //implements Repository
{
//	@query
	public List<EmployeeDto> getEmployeeFromDB() {
		List<EmployeeDto> employees = new ArrayList<EmployeeDto>();
		EmployeeDto employee = new EmployeeDto();
		employee.setEmpId("2222");
		employee.setFirstName("Ajith Tamil");
		employee.setLastName("Tamil");
		employees.add(employee); 
		return employees;
	}
}
