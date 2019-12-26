/**
 * 
 */
package com.erp.lt.portal2.EndPoint;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.erp.lt.portal2.Service.GenderTypeService;
import com.erp.lt.portal2.VO.GenderTypeVo;

/**
 * @author admin
 *
 */
@RestController
public class GenderTypeEndPoint {
	@Autowired
	 GenderTypeService genderTypeService;
	@GetMapping(path="/get/gendertype/{code}")
	public GenderTypeVo getGenderType(@PathVariable(value = "code") int code) {

		Optional<GenderTypeVo> optional = genderTypeService.getGenderType(code);

		return optional.get();
	}
	

}
