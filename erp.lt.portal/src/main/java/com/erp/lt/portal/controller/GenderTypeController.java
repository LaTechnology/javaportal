/**
 * 
 */
package com.erp.lt.portal.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.erp.lt.portal.service.GenderTypeService;
import com.erp.lt.portal.vo.GenderTypeVO;

/**
 * @author admin
 *
 */
@RestController
public class GenderTypeController {
	@Autowired
	GenderTypeService genderTypeService;

	@GetMapping(path = "/get/gendertype/{code}")
	public GenderTypeVO getGenderType(@PathVariable(value = "code") int code) {

		return genderTypeService.getGenderType(code);

	}
}
