/**
 * 
 */
package com.erp.lt.portal.service;

import com.erp.lt.portal.vo.MobileDetailsVO;

/**
 * @author User
 *
 */
public interface MobileDetailsService {
	public MobileDetailsVO getMobileDetails( int code);
	public void addMobileDetials(MobileDetailsVO mobileDetailsVO);
	public void editMobileDetials(MobileDetailsVO mobileDetailsVO);
	
	public void deleteMobileDetailsByComCode(int code);
}