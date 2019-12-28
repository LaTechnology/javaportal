/**
 * 
 */
package com.erp.lt.portal.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.erp.lt.portal.service.MaritalStatusService;
import com.erp.lt.portal.vo.MaritalStatusVO;

/**
 * @author admin
 *
 */
@RestController
public class MaritalStatusController {
	@Autowired
	MaritalStatusService maritalStatusservice;
	@GetMapping(path="/get/maritalStatus/{code}")
	public MaritalStatusVO getMaritalStatus(@PathVariable(value = "code") int code) {

		return 	maritalStatusservice .getMaritalStatus(code);

		
	}
}
