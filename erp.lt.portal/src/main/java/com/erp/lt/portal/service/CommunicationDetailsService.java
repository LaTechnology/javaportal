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
	public CommunicationDetail getCommunicationDetailByEmpId(int empId) throws NotFoundException;

	public void addCommunicationDetials(CommunicationDetailsVO communicationDetailVo) throws NotFoundException;

	public void editCommunicationDetials(CommunicationDetailsVO communicationDetailVo) throws NotFoundException;

	public CommunicationDetailsVO getCommunicationDetailsByEmpId(int empId) throws NotFoundException ;

	public void deleteCommunicationDetailsByEmpId(int empId) throws NotFoundException;

	public void doMap(CommunicationDetailsVO input, CommunicationDetail output) throws NotFoundException;
}
