/**
 * 
 */
package com.erp.lt.portal.service;

import com.erp.lt.portal.model.CommunicationDetail;
import com.erp.lt.portal.vo.CommunicationDetailsVO;

import javassist.NotFoundException;

/**
 * @author User
 *
 */
public interface CommunicationDetailsService {

	public void addCommunicationDetials(CommunicationDetailsVO communicationDetailVo) throws NotFoundException;

	public void editCommunicationDetials(CommunicationDetailsVO communicationDetailVo) throws NotFoundException;

	public CommunicationDetailsVO getCommunicationDetailsByEmpId(int empId);

	public void deleteCommunicationDetailsByEmpId(int empId);

	public void doMap(CommunicationDetailsVO input, CommunicationDetail output) throws NotFoundException;
}
