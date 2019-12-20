/**
 * 
 */
package com.erp.lt.portal.service;

import java.util.Optional;

import com.erp.lt.portal.dto.PreviousEmployeeVO;

/**
 * @author User
 *
 */
public interface PreviousEmployerService {
	
	public void addPreviousEmpDetail(PreviousEmployeeVO previousEmployeeVO);

	public void editPreviousEmpDetail(PreviousEmployeeVO previousEmployeeVO);

	public void deletePreviousEmpDetail(Long empid);

	public Optional<PreviousEmployeeVO>getPreviousEmpDetail(Long empid);

}
