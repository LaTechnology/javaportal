package com.practice.spring.DAO;

import java.util.List;

import com.practice.spring.model.Employee;
import com.practice.spring.model.Loginform;

public interface EmployeeDAO {

	
	public void addnew(Employee employee);
	public List<Employee> getAllEmployees();
		public Employee getEmployee(int Id) ;
		Employee updatenew(Employee employee);
		
		
		
		Boolean checklogin(String Name);

}
