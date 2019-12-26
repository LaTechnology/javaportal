/**
 * 
 */
package com.erp.lt.portal.Service.Impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.erp.lt.portal.Repository.CommunicationRepository;
import com.erp.lt.portal.Service.CommunicationService;
import com.erp.lt.portal.VO.CommunicationDetailsVo;

import model.CommunicationDetail;

/**
 * @author User
 *
 */
public class CommunicationServiceImpl implements CommunicationService {

	@Autowired
	CommunicationRepository communicationRepository;

	@Override
	public void addCommunicationDetials(CommunicationDetail communicationDetail) {
		communicationRepository.save(communicationDetail);
	}

	@Override
	public void editCommunicationDetials(CommunicationDetail communicationDetail) {
		communicationRepository.save(communicationDetail);
	}

	@Override
	public Optional<CommunicationDetail> getByEmpId(int empId) {
		Optional<CommunicationDetail> optional = communicationRepository.findById(empId);
		return optional;
	}

	@Override
	public void deleteByEmpId(int empId) {
		communicationRepository.deleteById(empId);

	}

	@Override
	public List<CommunicationDetail> getAllCommunicationDetails(CommunicationDetailsVo communicationDetail) {
		List<CommunicationDetail> optional = communicationRepository.findAll();
		return optional;

	}

}
