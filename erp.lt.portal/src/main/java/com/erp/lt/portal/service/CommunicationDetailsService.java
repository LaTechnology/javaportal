/**
 * 
 */
package com.erp.lt.portal.service;

import com.erp.lt.portal.vo.CommunicationDetailsVO;

/**
 * @author User
 *
 */
public interface CommunicationDetailsService {

	public void addCommunicationDetials(CommunicationDetailsVO communicationDetailVo);

	public void editCommunicationDetials(CommunicationDetailsVO communicationDetailVo);

	public CommunicationDetailsVO getCommunicationDetailsByEmpId(int empId);

	public void deleteCommunicationDetailsByEmpId(int empId);
}
