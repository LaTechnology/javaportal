/**
 * 
 */
package com.erp.lt.portal.service.impl;

import java.util.Date;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.erp.lt.portal.model.LoginDetails;
import com.erp.lt.portal.repository.ERPAccountRepository;
import com.erp.lt.portal.service.ERPAccountService;
import com.erp.lt.portal.vo.ERPAccountVO;

import javassist.NotFoundException;

/**
 * @author admin
 *
 */
@Service
public class ERPAccountServiceImpl implements ERPAccountService {
	@Autowired
	ERPAccountRepository erpAccountRepository;
	private static String encodedPassword;
	private String decodedPassword;

	@Override
	public ERPAccountVO userLogin(String emailId, String newPassword) {

		LoginDetails loginDetail = erpAccountRepository.getLoginDetail(emailId, newPassword);
		ERPAccountVO erpAccountVO = new ERPAccountVO();
		if (loginDetail.getEmailId() == emailId && loginDetail.getNewPassword() == newPassword) {

			if (null != loginDetail.getNewPassword()) {
				erpAccountVO.setNewPassword(loginDetail.getNewPassword());
			}

			if (null != loginDetail.getEmailId()) {
				erpAccountVO.setEmailId(loginDetail.getEmailId());
			}
			if (loginDetail.getEmployeeInfo().getemployeeCode() > 0) {
				erpAccountVO.setEmployeeCode(loginDetail.getEmployeeInfo().getemployeeCode());
			}
			if (0 != loginDetail.getStatus()) {
				erpAccountVO.setStatus(0);
			}
		}
		return erpAccountVO;
	}

	@Override
	public void updateLoginDetails(ERPAccountVO erpAccountVO) {
		BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
		encodedPassword = encoder.encode(erpAccountVO.getNewPassword());
		boolean encodedFlag = encoder.matches(erpAccountVO.getNewPassword(), encodedPassword);
		LoginDetails loginDetail = null;
		loginDetail = erpAccountRepository.getLoginDetailByEmpID(erpAccountVO.getEmployeeCode());
		if (StringUtils.equalsIgnoreCase(erpAccountVO.getNewPassword(), erpAccountVO.getConfirmPassword())) {
			if (null != erpAccountVO.getNewPassword()) {
				loginDetail.setNewPassword(encodedPassword);
			}
			if (StringUtils.isNoneEmpty(erpAccountVO.getConfirmPassword())) {
				loginDetail.setConfirmPassword(encodedPassword);
			}
			loginDetail.setStatus(1);
			loginDetail.setLastLoginDate(new Date());
		}
		erpAccountRepository.save(loginDetail);
	}

	@Override
	public boolean performLogin(String emailId, String newPassword)
			throws NotFoundException {
		boolean methodstatus = false;
		LoginDetails details = erpAccountRepository.getLoginDetail(emailId, newPassword);

		if (null != details) {
			if (StringUtils.equalsIgnoreCase(emailId.trim(), details.getEmailId())
					&& StringUtils.equalsIgnoreCase(newPassword, details.getNewPassword()))
				methodstatus = true;
		} else {
			throw new NotFoundException("Invalid username or password.");
		}
		return methodstatus;
	}

}

/*
 * String s1 = details.getNewPassword(); char[] cs = s1.toCharArray(); for(int
 * index =0 ; index<cs.length;index++) {
 * 
 * decodedPassword =spring.datasource={decrypt(cs[index])}; }
 */
