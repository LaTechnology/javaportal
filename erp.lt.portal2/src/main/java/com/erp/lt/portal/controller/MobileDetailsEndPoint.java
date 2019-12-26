package com.erp.lt.portal.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.erp.lt.portal.Service.MobileDetailsService;
import com.erp.lt.portal.VO.MobileDetailsVO;

public class MobileDetailsEndPoint {

	@Autowired
	MobileDetailsService mobileDetailsService;

	@PostMapping(path = "/add/mobile/details")
	public void addMobileDetails(@RequestBody MobileDetailsVO mobileDetailsVO) {
		mobileDetailsService.addMobileDetails(mobileDetailsVO);
	}

	@GetMapping(path = "/get/mobile/details/{code}")
	public MobileDetailsVO getByEmpId(@PathVariable(value = "code") int code,
			@RequestBody MobileDetailsVO mobileDetailsVO) {
		Optional<MobileDetailsVO> optional = mobileDetailsService.getMobileDetailsByEmpID(code);
		return optional.get();
	}

	@PutMapping(path = "/edit/mobile/details/{empId}")
	public void editMobileDetails(@PathVariable(value = "code") int code,
			@RequestBody MobileDetailsVO mobileDetailsVO) {
		Optional<MobileDetailsVO> empdto = mobileDetailsService.getMobileDetailsByEmpID(code);
		if (empdto == null) {
			System.out.println("Employee Not found");
		} else {
			mobileDetailsService.editMobileDetails(mobileDetailsVO);
		}
	}

	@GetMapping(path = "/getall/com/details")
	public List<MobileDetailsVO> getAllEmployee(@RequestBody MobileDetailsVO mobileDetailsVO) {

		return mobileDetailsService.getAllMobileDetails(mobileDetailsVO);
	}

	@DeleteMapping(path = "/delete/com/details/{code}")
	public void deleteByEmpId(@PathVariable(value = "code") int code) {
		mobileDetailsService.deleteMobileDetailsByEmpID(code);
	}
}
