/**
 * 
 */
package com.erp.lt.portal.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.erp.lt.portal.Service.CommunicationService;
import com.erp.lt.portal.VO.CommunicationDetailsVo;

import model.CommunicationDetail;

/**
 * @author User
 *
 */
@RestController
public class CommunicationEndPoint {

	@Autowired
	CommunicationService communicationService;

	@PostMapping(path = "/add/com/details")
	public void addCommunicationDetials(@RequestBody CommunicationDetail communicationDetail) 
	{
		communicationService.addCommunicationDetials(communicationDetail);
	}

	@GetMapping(path = "/get/com/details/{empId}")
	public CommunicationDetail getByEmpId(@PathVariable(value = "empId") int empId,
			@RequestBody CommunicationDetail communicationDetail) {
		Optional<CommunicationDetail> optional = communicationService.getByEmpId(empId);
		return optional.get();
	}

	@PutMapping(path = "/edit/com/details/{empId}")
	public void editCommunicationDetials(@PathVariable(value = "empId") int empId,
			@RequestBody CommunicationDetail communicationDetail) {
		Optional<CommunicationDetail> empdto = communicationService.getByEmpId(empId);
		if (empdto == null) {
			System.out.println("Employee Not found");
		} else {
			communicationService.editCommunicationDetials(communicationDetail);
		}
	}

	@PatchMapping(path = "/patch/com/details/{empId}")
	public void patchCommunicationDetials(@PathVariable(value = "empId") int empId,
			@RequestBody CommunicationDetail communicationDetail) {
		Optional<CommunicationDetail> empdto = communicationService.getByEmpId(empId);
		if (empdto == null) {
			System.out.println("Employee Not found");
		} else {
			communicationService.editCommunicationDetials(communicationDetail);
		}
	}

	@DeleteMapping(path = "/delete/com/details/{empId}")
	public void deleteByEmpId(@PathVariable(value = "empId") int empId) {
		communicationService.deleteByEmpId(empId);
	}

	@GetMapping(path = "/getall/com/details")
	public List<CommunicationDetail> getAllEmployee(@RequestBody CommunicationDetailsVo communicationDetail) {

		return communicationService.getAllCommunicationDetails(communicationDetail);
	}
}