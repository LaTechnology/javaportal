package com.salesforce.update.service.impl;

import java.util.ArrayList;
import java.util.List;

import com.salesforce.update.dto.EmployeeDto;

public class DefaultMaxmindAddressCheck {
	public List<EmployeeDto> getEmployee() {
		List<EmployeeDto> employees = new ArrayList<EmployeeDto>();
		EmployeeDto employee = new EmployeeDto();
		employee.setEmpId("123");
		employee.setFirstName("Ajith");
		employee.setLastName("Tamil");
		employees.add(employee);
		return employees;
	}
}
