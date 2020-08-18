package com.practice.spring.service;

import java.util.List;

import com.practice.spring.model.Employee;
import com.practice.spring.model.Loginform;

public interface EmployeeService {

	public void addnew(Employee employee);
	public List<Employee> getAllEmployees() ;
	public Employee getEmployee(int Id);
	public Employee updatenew(Employee employee) ;
	public Boolean  checklogin(String name) ;
}
