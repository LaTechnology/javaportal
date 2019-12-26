/**
 * 
 */
package com.erp.lt.portal.Service;

import java.util.List;
import java.util.Optional;

import com.erp.lt.portal.VO.CommunicationDetailsVo;

import model.CommunicationDetail;

/**
 * @author User
 *
 */
public interface CommunicationService {

public void addCommunicationDetials(CommunicationDetail communicationDetail);
	
	public void editCommunicationDetials(CommunicationDetail	 communicationDetail);

	public Optional<CommunicationDetail> getByEmpId(int empId);
	
	public void deleteByEmpId(int empId);
	
	public List<CommunicationDetail> getAllCommunicationDetails(CommunicationDetailsVo communicationDetail);
	
	
}
