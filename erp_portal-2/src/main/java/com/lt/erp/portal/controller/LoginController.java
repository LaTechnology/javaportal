/**
 * 
 */
package com.lt.erp.portal.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.lt.erp.portal.facade.EmployeeFacade;

/**
 * @author admin
 * @author selvaraja
 * @see
 *
 */
 
@RestController 
@RequestMapping(path = "/erpportal/api/v1/")
public class LoginController {

	@Autowired
	EmployeeFacade employeeFacade;

	@RequestMapping(name = "/employee/address/{empid}/editaddress", method = RequestMethod.PUT, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public boolean editEmployee(@PathVariable(name = "employeeId") String employeeId) {
		return false;
	}
}
