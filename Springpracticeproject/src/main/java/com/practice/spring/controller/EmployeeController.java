package com.practice.spring.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.jboss.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


import org.springframework.web.servlet.ModelAndView;

import com.practice.spring.model.Employee;
import com.practice.spring.model.Loginform;
import com.practice.spring.service.EmployeeService;

@RestController 
@RequestMapping(path = "/api/v1")
public class EmployeeController {

	
	
	 
	    private static final Logger logger = Logger
	            .getLogger(EmployeeController.class);
	 
	    public EmployeeController() {
	        System.out.println("EmployeeController()");
	    }
	 
	    @Autowired
	    private EmployeeService employeeService;
	    
	    public EmployeeService getEmployeeService() {
			return employeeService;
		}


		public void setEmployeeService(EmployeeService employeeService) {
			this.employeeService = employeeService;
		}


		@RequestMapping(value = "/newEmployee", method = RequestMethod.GET)
	    public ModelAndView newContact(ModelAndView model) {
	        Employee employee = new Employee();
	        model.addObject("employee", employee);
	        model.setViewName("EmployeeForm");
	        return model;
	    }
	    
		
	    @RequestMapping(value = "/saveEmployee", method = RequestMethod.POST)
	    public ModelAndView saveEmployee(@ModelAttribute Employee employee) {
	        
	            employeeService.addnew(employee);
	       
	           
	        
	        return new ModelAndView("success");
	    }
	 
	    @RequestMapping(value = "/users")
	    public ModelAndView showAllUsers(ModelAndView model) {
	    	model.setViewName( "List");
	        List<Employee> users=employeeService.getAllEmployees() ;

	        

//	        System.out.println("/n/n/n/n" + (userService.findAll()).stream().map(Object::toString)
//	                .collect(Collectors.joining(", ")) + "/n/n/n/n");

	        model.addObject("users",users );
	        return model;
	    }
	    @RequestMapping(value="/getemp" ,method=RequestMethod.GET)
	    @ResponseBody
	    public ModelAndView editContact(@RequestParam(value="Id")int Id ) {
	        
	        Employee employee = employeeService.getEmployee(Id);
	        ModelAndView model = new ModelAndView("EmployeeUpdate");
	        return model.addObject("employee", employee);
	    	
	    }
	    @RequestMapping(value="/getemp/{Id}" ,method=RequestMethod.GET)
	    @ResponseBody
	    public ModelAndView getContact(@PathVariable(value="Id")int Id ) {
	        
	        Employee employee = employeeService.getEmployee(Id);
	        ModelAndView model = new ModelAndView("getempid");
	        return model.addObject("employee", employee);
	    	
	    	
	    }
	    
	    @RequestMapping(value = "/updateEmployee", method = RequestMethod.GET)
	    public ModelAndView editContact(ModelAndView model) {
	        Employee employee = new Employee();
	        model.addObject("employee", employee);
	        model.setViewName("EmployeeUpdate");
	        return model;
	    }
	    
	    @RequestMapping(value = "/updatingEmployee", method = RequestMethod.POST)
	    public ModelAndView updateEmployee(@ModelAttribute Employee employee) {
	        
	            employeeService.updatenew(employee);
	       
	           
	        
	        return new ModelAndView("redirect:/users");
	    }
	    @RequestMapping(value = "/check", method = RequestMethod.POST)
	    public String checklogin(@ModelAttribute Loginform employee,Employee emp ,String Name) {
	        
	    	ModelAndView  mv=new ModelAndView("Login");
	    	mv.addObject(emp);
	    	
	    	if(employeeService.checklogin(Name)) {
	        
	        return ("success");
	    }
	    	else {
	    		return("Login");
	    	}
	    }
	    
	    @RequestMapping(value = "/checkEmployee", method = RequestMethod.GET)
	    public ModelAndView Contact(ModelAndView model) {
	        Loginform employee = new Loginform();
	        model.addObject("employee", employee);
	        model.setViewName("Login");
	        return model;
	    }
	    
	    
	    
}
