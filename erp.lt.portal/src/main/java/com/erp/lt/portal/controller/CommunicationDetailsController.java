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

import com.erp.lt.portal.service.CommunicationDetailsService;
import com.erp.lt.portal.vo.CommunicationDetailsVO;

/**
 * @author User
 *
 */
@RestController
public class CommunicationDetailsController {

	@Autowired
	CommunicationDetailsService communicationDetailsService;

	@GetMapping(path = "/get/com/details/{empId}")
	public CommunicationDetailsVO getByEmpId(@PathVariable(value = "empId") int empId) {
		return communicationDetailsService.getCommunicationDetailsByEmpId(empId);
	}

	@PostMapping(path = "/add/com/details/")
	public void addCommunicationDetials(@RequestBody CommunicationDetailsVO communicationDetailsVO) {
		communicationDetailsService.addCommunicationDetials(communicationDetailsVO);

	}

	@PutMapping(path = "/edit/com/details/")
	public void editmunicationDetials(@RequestBody CommunicationDetailsVO communicationDetailsVO) {
		communicationDetailsService.editCommunicationDetials(communicationDetailsVO);

	}

	@DeleteMapping(path = "/delete/com/details/{empId}")
	public void deleteCommunicationDetailsByEmpId(@PathVariable(value = "empId") int empId) {
		communicationDetailsService.deleteCommunicationDetailsByEmpId(empId);

	}
}
