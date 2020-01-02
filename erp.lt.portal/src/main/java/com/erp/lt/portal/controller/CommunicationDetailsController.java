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

import com.erp.lt.portal.ERPConstantsCom;
import com.erp.lt.portal.service.CommunicationDetailsService;
import com.erp.lt.portal.vo.CommunicationDetailsVO;

import javassist.NotFoundException;

/**
 * @author User
 *
 */
@RestController
@RequestMapping(path = ERPConstantsCom.URL_BASE)

public class CommunicationDetailsController {

	@Autowired
	CommunicationDetailsService communicationDetailsService;

	@GetMapping(path = ERPConstantsCom.COMMUNICATION_DETAILS_GET_URL)
	public CommunicationDetailsVO getByEmpId(@PathVariable(value = "empId") int empId) {
		return communicationDetailsService.getCommunicationDetailsByEmpId(empId);
	}

	@PostMapping(path = ERPConstantsCom.COMMUNICATION_DETAILS_ADD_URL, consumes = { MediaType.APPLICATION_JSON_VALUE })
	public void addCommunicationDetials(@RequestBody CommunicationDetailsVO communicationDetailsVO) {
		try {
			communicationDetailsService.addCommunicationDetials(communicationDetailsVO);
		} catch (NotFoundException e) {
			e.printStackTrace();
		}

	}

	@PutMapping(path = ERPConstantsCom.COMMUNICATION_DETAILS_EDIT_URL)
	public void editCommunicationDetials(@RequestBody CommunicationDetailsVO communicationDetailsVO) {

		try {
			communicationDetailsService.editCommunicationDetials(communicationDetailsVO);
		} catch (NotFoundException e) {
			e.printStackTrace();
		}
	}

	/*
	 * @PutMapping(path = "/edit/com/details/{empId}") public void
	 * editCommunicationDetials(@PathVariable(value = "empId") int empId,
	 * 
	 * @RequestBody CommunicationDetailsVo communicationDetailsVo) {
	 * Optional<CommunicationDetailsVo> empdto =
	 * communicationService.getByEmpId(empId); if (empdto == null) {
	 * System.out.println("Employee Not found"); } else {
	 * communicationService.editCommunicationDetials(communicationDetailsVo); } }
	 */

	@PatchMapping(path = ERPConstantsCom.COMMUNICATION_DETAILS_PATCHING_URL)
	public void patchCommunicationDetials(@RequestBody CommunicationDetailsVO communicationDetailsVO) {
		try {
			communicationDetailsService.editCommunicationDetials(communicationDetailsVO);
		} catch (NotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@DeleteMapping(path = ERPConstantsCom.COMMUNICATION_DETAILS_DELETE_URL)
	public void deleteCommunicationDetailsByEmpId(@PathVariable(value = "empId") int empId) {
		communicationDetailsService.deleteCommunicationDetailsByEmpId(empId);

	}
}
