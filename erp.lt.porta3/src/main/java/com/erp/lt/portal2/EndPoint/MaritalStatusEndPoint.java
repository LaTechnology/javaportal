/**
 * 
 */
package com.erp.lt.portal2.EndPoint;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.erp.lt.portal2.Service.MaritalStatusService;
import com.erp.lt.portal2.VO.MaritalStatusVo;

/**
 * @author admin
 *
 */
@RestController
public class MaritalStatusEndPoint {
	@Autowired
	MaritalStatusService maritalStatusservice;
	@GetMapping(path="/get/maritalStatus/{code}")
	public MaritalStatusVo getMaritalStatus(@PathVariable(value = "code") int code) {

		Optional<MaritalStatusVo> optional =maritalStatusservice .getMaritalStatus(code);

		return optional.get();
	}
	
}
