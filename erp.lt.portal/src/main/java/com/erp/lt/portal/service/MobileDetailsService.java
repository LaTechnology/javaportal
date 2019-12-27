/**
 * 
 */
package com.erp.lt.portal.service;

import com.erp.lt.portal.vo.MobileDetailsVO;

import javassist.NotFoundException;

/**
 * @author User
 *
 */
public interface MobileDetailsService {
	
	public MobileDetailsVO getMobileDetails(int code);

	public void addMobileDetials(MobileDetailsVO mobileDetailsVO);

	public boolean editMobileDetials(MobileDetailsVO mobileDetailsVO) throws NotFoundException;
	
	public void deleteMobileDetails(int code);
}