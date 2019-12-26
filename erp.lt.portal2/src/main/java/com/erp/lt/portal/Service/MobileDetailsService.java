/**
 * 
 */
package com.erp.lt.portal.Service;

import java.util.List;
import java.util.Optional;

import com.erp.lt.portal.VO.MobileDetailsVO;

/**
 * @author User
 *
 */
public interface MobileDetailsService {
	
	public void addMobileDetails(MobileDetailsVO mobileDetailsVO);

	public void editMobileDetails(MobileDetailsVO mobileDetailsVO);

	public Optional<MobileDetailsVO> getMobileDetailsByEmpID(int code);

	public List<MobileDetailsVO> getAllMobileDetails(MobileDetailsVO mobileDetailsVO);
	
	public void deleteMobileDetailsByEmpID(int code);

}
