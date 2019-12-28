/**
 * 
 */
package com.erp.lt.portal.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.erp.lt.portal.ERPConstants;
import com.erp.lt.portal.service.CommunicationDetailsService;
import com.erp.lt.portal.vo.CommunicationDetailsVO;

import lombok.extern.slf4j.Slf4j;

/**
 * @author User
 *
 */
@RestController
@Slf4j
@RequestMapping(path = ERPConstants.URL_BASE)
public class CommunicationDetailsController {

	@Autowired
	CommunicationDetailsService communicationDetailsService;

	@GetMapping(path =ERPConstants.COMMUNICATION_DETAILS_GET_URL  )
	public CommunicationDetailsVO getByEmpId(@PathVariable(value = "empId") int empId) {
		return communicationDetailsService.getCommunicationDetailsByEmpId(empId);
	}

	@PostMapping(path =ERPConstants.COMMUNICATION_DETAILS_ADD_URL, consumes = {MediaType.APPLICATION_JSON_VALUE} )
	public void addCommunicationDetials(@RequestBody CommunicationDetailsVO communicationDetailsVO) {
		communicationDetailsService.addCommunicationDetials(communicationDetailsVO);

	}

	@PutMapping(path =ERPConstants.COMMUNICATION_DETAILS_EDIT_URL )
	public void editCommunicationDetials(@RequestBody CommunicationDetailsVO communicationDetailsVO) {
		communicationDetailsService.editCommunicationDetials(communicationDetailsVO);

	}
	
	@PatchMapping(path = ERPConstants.COMMUNICATION_DETAILS_PATCHING_URL)
	public void patchCommunicationDetials(@RequestBody CommunicationDetailsVO communicationDetailsVO) {
		communicationDetailsService.editCommunicationDetials(communicationDetailsVO);

	}

	@DeleteMapping(path =ERPConstants.COMMUNICATION_DETAILS_DELETE_URL)
	public void deleteCommunicationDetailsByEmpId(@PathVariable(value = "empId") int empId) {
		communicationDetailsService.deleteCommunicationDetailsByEmpId(empId);

	}
}
