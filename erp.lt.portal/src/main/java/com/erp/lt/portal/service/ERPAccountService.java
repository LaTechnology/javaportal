/**
 * 
 */
package com.erp.lt.portal.service;

import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;

import com.erp.lt.portal.vo.ERPAccountVO;

import javassist.NotFoundException;

/**
 * @author admin
 *
 */
public interface ERPAccountService {
	/*
	 * userLogin
	 * 
	 * updateLoginDetails
	 */
	public ERPAccountVO userLogin(String emailId, String newPassword) throws NotFoundException;

	public void updateLoginDetails(ERPAccountVO erpAccountVO);

	public boolean performLogin(String emailId, String newPassword)
			throws NotFoundException, InvalidKeyException, NoSuchAlgorithmException, NoSuchPaddingException, IllegalBlockSizeException, BadPaddingException;
}
