	/**
 * 
 */
package com.erp.lt.portal.controller;

import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.erp.lt.portal.ERPConstants;
import com.erp.lt.portal.service.ERPAccountService;
import com.erp.lt.portal.vo.ERPAccountVO;

import javassist.NotFoundException;

/**
 * @author admin
 *
 */
@RestController
public class ERPAccountController {
	@Autowired
	ERPAccountService erpAccountService;

	@GetMapping(path = "/portal/login/{emailId}/{newPassword}")
	public ERPAccountVO userLogin(@PathVariable(value = "emailId") String emailId,
			@PathVariable(value = "newPassword") String newPassword) {
		ERPAccountVO accountVO = null;
		try {
			accountVO = erpAccountService.userLogin(emailId, newPassword);
		} catch (NotFoundException e) {

			e.printStackTrace();
		}
		return accountVO;

	}

	@PostMapping(path =  ERPConstants.EMPLOYEE_LOGINPASSWORDRESET_URL, consumes = { MediaType.APPLICATION_JSON_VALUE })
	public void updateLoginDetails(@RequestBody ERPAccountVO erpAccountVO) {
		erpAccountService.updateLoginDetails(erpAccountVO);

	}

	@PostMapping(path =ERPConstants.EMPLOYEE_USERLOGIN_URL, consumes = { MediaType.APPLICATION_JSON_VALUE })
	public boolean addUserLogin(@RequestBody ERPAccountVO erpAccountVO) {
		boolean result = false;
		try {
			result = erpAccountService.performLogin(erpAccountVO.getEmailId(), erpAccountVO.getNewPassword());
		} catch (NotFoundException e) {
			e.printStackTrace();
		} catch (InvalidKeyException e) {
			e.printStackTrace();
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		} catch (NoSuchPaddingException e) {
			e.printStackTrace();
		} catch (IllegalBlockSizeException e) {
			e.printStackTrace();
		} catch (BadPaddingException e) {
			e.printStackTrace();
		}
		return result;
	}

}
