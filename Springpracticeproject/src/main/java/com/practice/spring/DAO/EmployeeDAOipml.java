package com.practice.spring.DAO;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.practice.spring.model.Address;
import com.practice.spring.model.Employee;
import com.practice.spring.model.Loginform;


@Repository
@Transactional
public class EmployeeDAOipml implements EmployeeDAO{

	@Autowired
    private SessionFactory sessionFactory;
	
	
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

     
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}


	@Override
	public void addnew(Employee employee) 
	
	{
		Address add=new Address();
		
		
		add.setPermanentaddress(employee.getPermanentadress());
		employee.setAddress(add);
		sessionFactory.getCurrentSession().save(employee);
		
	}
	@Override
	public Employee updatenew(Employee employee) 
	
	{
		Address add=new Address();
		
		
		add.setPermanentaddress(employee.getPermanentadress());
		employee.setAddress(add);
		sessionFactory.getCurrentSession().update(employee);
		return employee;
	}

	@SuppressWarnings("unchecked")
	@Override

   public  List<Employee> getAllEmployees() {
		
		return sessionFactory
				.getCurrentSession()
					.createQuery("FROM Employee" ).list();
						
	
		
        		
                
    }
	
	public Employee getEmployee(int Id) {
        return (Employee) sessionFactory.getCurrentSession().get(
                Employee.class, Id);
    }


	@SuppressWarnings("unchecked")
	@Override
	public Boolean  checklogin(String name) 
	{
		boolean flag = false;  
	    String hql = "from Employee where name = :name";
	    List<Employee> result =sessionFactory.getCurrentSession().createQuery(hql)
	        .setParameter("name", name)
	        .list();

	    Employee userAccount = (Employee)result.iterator().next();
	    System.out.println(result);
	    if (userAccount!=null && userAccount.getName().equalsIgnoreCase(name)) {
	        flag = true;
	    }

	    return flag;
		
	}
	
	
	
	
	
	
	
}
