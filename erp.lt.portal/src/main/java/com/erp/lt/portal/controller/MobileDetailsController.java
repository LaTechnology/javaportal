/**
 * 
 */
package com.erp.lt.portal.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.erp.lt.portal.service.MobileDetailsService;
import com.erp.lt.portal.vo.MobileDetailsVO;

/**
 * @author User
 *
 */
@RestController
public class MobileDetailsController {
	
	@Autowired
	MobileDetailsService detailsService;
	
	@GetMapping(path = "/get/mob/details/{code}")

	public MobileDetailsVO getMobileDetails(@PathVariable(value ="code") int code) {
		return detailsService.getMobileDetails(code);
	
}
	
	@PostMapping(path = "/add/mob/details/")
	public void addMobileDetials(@RequestBody MobileDetailsVO mobileDetailsVO) {
		detailsService.addMobileDetials(mobileDetailsVO);
	}
	
	@PutMapping(path = "/edit/mob/details/")
	public void editMobileDetials(@RequestBody MobileDetailsVO mobileDetailsVO) {
		detailsService.editMobileDetials(mobileDetailsVO);
	}
	
	@DeleteMapping(path = "/delete/mob/details")
	public void deleteMobileDetails(@PathVariable(value = "code") int code) {
		detailsService.deleteMobileDetailsByComCode(code);
	}

}

