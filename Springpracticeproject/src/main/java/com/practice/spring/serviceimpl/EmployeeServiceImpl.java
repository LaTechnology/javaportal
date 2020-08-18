package com.practice.spring.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.practice.spring.DAO.EmployeeDAO;
import com.practice.spring.model.Employee;
import com.practice.spring.model.Loginform;
import com.practice.spring.service.EmployeeService;


@Service
@Transactional
public class EmployeeServiceImpl implements EmployeeService  {

	@Autowired
	private EmployeeDAO employeeDao;
	
	public EmployeeDAO getEmployeeDao() {
		return employeeDao;
	}

	public void setEmployeeDao(EmployeeDAO employeeDao) {
		this.employeeDao = employeeDao;
	}

	public void addnew(Employee employee) {
		employeeDao.addnew(employee);
	}
	@Override
	@Transactional
	public List<Employee> getAllEmployees() {
        return employeeDao.getAllEmployees();
    }

	@Override
	public Employee getEmployee(int Id) {
		
		return  employeeDao.getEmployee(Id);
	}

	@Override
	public Employee updatenew(Employee employee) {
		return employeeDao.updatenew(employee);
		
	}

	@Override
	public Boolean  checklogin(String name)  {
		// TODO Auto-generated method stub
		return employeeDao.checklogin(name);
	}


 
}
