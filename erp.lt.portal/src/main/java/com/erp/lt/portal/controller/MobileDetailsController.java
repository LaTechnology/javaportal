/**
 * 
 */
package com.erp.lt.portal.controller;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
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
import com.erp.lt.portal.service.MobileDetailsService;
import com.erp.lt.portal.vo.MobileDetailsVO;

import javassist.NotFoundException;
import lombok.extern.slf4j.Slf4j;

/**
 * @author User
 *
 */
@RestController
@RequestMapping(path = ERPConstants.URL_BASE)
@Slf4j
public class MobileDetailsController {

	private static final org.slf4j.Logger log = LoggerFactory.getLogger(MobileDetailsController.class.getName());

	@Autowired
	MobileDetailsService mobileDetailsService;

	@GetMapping(path = ERPConstants.MOBILE_DETAILS_GET_URL)

	public MobileDetailsVO getMobileDetails(@PathVariable(value = "code") int code) {
		return mobileDetailsService.getMobileDetails(code);

	}

	@PostMapping(path = ERPConstants.MOBILE_DETAILS_ADD_URL, consumes = { MediaType.APPLICATION_JSON_VALUE })
	public void addMobileDetials(@RequestBody MobileDetailsVO mobileDetailsVO) {
		try {
			mobileDetailsService.addMobileDetials(mobileDetailsVO);
		} catch (NotFoundException e) {
			e.printStackTrace();
		}
	}

	@PutMapping(path = ERPConstants.MOBILE_DETAILS_EDIT_URL, consumes = { MediaType.APPLICATION_JSON_VALUE })
	public boolean editMobileDetials(@RequestBody MobileDetailsVO mobileDetailsVO) {
		boolean detailsstatus = true;
		log.info("Entereing into editMobileDetials");
		try {
			detailsstatus = mobileDetailsService.editMobileDetials(mobileDetailsVO);
		} catch (NotFoundException e) {
			log.info("Employee Not Found " + mobileDetailsVO.getCode() + " " + e.getMessage());
		}
		if (detailsstatus) {
			log.info("Employee Not Found " + mobileDetailsVO.getCode() + " " + detailsstatus);
		} else {
			try {
				mobileDetailsService.editMobileDetials(mobileDetailsVO);
			} catch (NotFoundException e) {
				e.printStackTrace();
			}
		}
		log.info("Exitingt into editMobileDetials" + detailsstatus);
		return detailsstatus;
	}

	@PatchMapping(path = ERPConstants.MOBILE_DETAILS_PATCHING_URL)
	public boolean patchMobileDetials(@RequestBody MobileDetailsVO mobileDetailsVO) {
		boolean detailsstatus = true;
		try {
			detailsstatus = mobileDetailsService.editMobileDetials(mobileDetailsVO);
		} catch (NotFoundException e) {
			e.printStackTrace();
		}
		return detailsstatus;
	}

	@DeleteMapping(path = ERPConstants.MOBILE_DETAILS_DELETE_URL)
	public void deleteMobileDetails(@PathVariable(value = "empCode") Integer empCode,
			@PathVariable(value = "mobileCode") Integer mobileCode) {
		mobileDetailsService.deleteMobileDetails(empCode, mobileCode);
	}

}
