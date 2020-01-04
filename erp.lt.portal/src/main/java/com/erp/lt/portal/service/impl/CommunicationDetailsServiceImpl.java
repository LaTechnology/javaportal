/**
 * 
 */
package com.erp.lt.portal.service.impl;

import java.util.Optional;

import org.apache.commons.math3.genetics.NPointCrossover;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.erp.lt.portal.model.CommunicationDetail;
import com.erp.lt.portal.model.EmployeeInfo;
import com.erp.lt.portal.repository.CommunicationDetailsRepository;
import com.erp.lt.portal.repository.EmployeeInfoRepository;
import com.erp.lt.portal.service.CommunicationDetailsService;
import com.erp.lt.portal.service.EmployeeInfoService;
import com.erp.lt.portal.vo.CommunicationDetailsVO;

import javassist.NotFoundException;

/**
 * @author User
 *
 */
@Service
public class CommunicationDetailsServiceImpl implements CommunicationDetailsService {

	@Autowired
	CommunicationDetailsRepository communicationDetailsRepository;
	@Autowired
	EmployeeInfoRepository employeeInfoRepository;
	@Autowired
	EmployeeInfoService employeeInfoService;

	@Override
	public CommunicationDetail getCommunicationDetailByEmpId(int empId) throws NotFoundException {
		Optional<CommunicationDetail> optional = communicationDetailsRepository.getCommunicationDetailsByEmpId(empId);
		return optional.isPresent() ? optional.get() : null;
	}

	@Override
	public CommunicationDetailsVO getCommunicationDetailsByEmpId(int empId) throws NotFoundException {
		CommunicationDetailsVO detailsVO = new CommunicationDetailsVO();
		CommunicationDetail detail = getCommunicationDetailByEmpId(empId);
		if (null != detail) {
			if (null != detail.getCompanyEmailId()) {
				detailsVO.setCompanyEmailId(detail.getCompanyEmailId());
			}
			if (null != detail.getBeginDate()) {
				detailsVO.setBeginDate(detail.getBeginDate());
			}
			if (null != detail.getEndDate()) {
				detailsVO.setEndDate(detail.getEndDate());
			}
			if (0 != detail.getCode()) {
				detailsVO.setCode(detail.getCode());
			}
			if (null != detail.getClientEmailId()) {
				detailsVO.setClientEmailId(detail.getClientEmailId());
			}
			if (null != detail.getEmergencyComunicationNumber()) {
				detailsVO.setEmergencyComunicationNumber(detail.getEmergencyComunicationNumber());
			}
			/*
			 * if (null != detail.getMobileDetails()) {
			 * detailsVO.setMobileDetails(detail.getMobileDetails()); }
			 */

			if (null != detail.getEmployeeInfo()) {
				detailsVO.setEmployeeCode(detail.getEmployeeInfo().getemployeeCode());
			}

			if (null != detail.getPersonalEmailId()) {
				detailsVO.setPersonalEmailId(detail.getPersonalEmailId());
			}
		}

		return detailsVO;
	}

	@Override
	public void addCommunicationDetials(CommunicationDetailsVO communicationDetailVo) throws NotFoundException {
		CommunicationDetail communicationDetail = new CommunicationDetail();
		Optional<EmployeeInfo> employeeInfo = null;

		if (communicationDetailVo.getEmployeeCode() > 0) {
			employeeInfo = employeeInfoRepository.findById(communicationDetailVo.getEmployeeCode());
		}

		if (communicationDetailVo.getCode() > 0) {
			communicationDetail.setCode(communicationDetailVo.getCode());
		}
		if (communicationDetailVo.getBeginDate() != null) {
			communicationDetail.setBeginDate(communicationDetailVo.getBeginDate());
		}

		if (communicationDetailVo.getClientEmailId() != null) {
			communicationDetail.setClientEmailId(communicationDetailVo.getClientEmailId());
		}
		if (communicationDetailVo.getCompanyEmailId() != null) {
			communicationDetail.setCompanyEmailId(communicationDetailVo.getCompanyEmailId());
		}

		if (communicationDetailVo.getEmergencyComunicationNumber() != null) {
			communicationDetail.setEmergencyComunicationNumber(communicationDetailVo.getEmergencyComunicationNumber());
		}

		if (communicationDetailVo.getEndDate() != null) {
			communicationDetail.setEndDate(communicationDetailVo.getEndDate());
		}
		if (communicationDetailVo.getPersonalEmailId() != null) {
			communicationDetail.setPersonalEmailId(communicationDetailVo.getPersonalEmailId());
		}

		if (employeeInfo.isPresent()) {
			communicationDetail.setEmployeeInfo(employeeInfo.get());
		}
		communicationDetailsRepository.save(communicationDetail);
	}

	@Override
	public void editCommunicationDetials(CommunicationDetailsVO communicationDetailVo) throws NotFoundException {
		CommunicationDetail communicationDetail = new CommunicationDetail();
		doMap(communicationDetailVo, communicationDetail);
		communicationDetailsRepository.save(communicationDetail);
	}

	

	@Override
	public void doMap(CommunicationDetailsVO communicationDetailVo, CommunicationDetail communicationDetail)
			throws NotFoundException {

		Optional<EmployeeInfo> optional = null;
		if (-1 != communicationDetailVo.getEmployeeCode()) {
			optional = employeeInfoRepository.findById(communicationDetailVo.getEmployeeCode());
		}

		if (null != communicationDetailVo.getCompanyEmailId()) {
			communicationDetail.setCompanyEmailId(communicationDetailVo.getCompanyEmailId());

		}

		if (null != communicationDetailVo.getBeginDate()) {
			communicationDetail.setBeginDate(communicationDetailVo.getBeginDate());
		}

		if (null != communicationDetailVo.getEndDate()) {
			communicationDetail.setEndDate(communicationDetailVo.getEndDate());
		}

		if (0 != communicationDetailVo.getCode()) {
			communicationDetail.setCode(communicationDetailVo.getCode());
		}

		if (null != communicationDetailVo.getClientEmailId()) {
			communicationDetail.setClientEmailId(communicationDetailVo.getClientEmailId());
		}
		if (null != communicationDetailVo.getEmergencyComunicationNumber()) {
			communicationDetail.setEmergencyComunicationNumber(communicationDetailVo.getEmergencyComunicationNumber());
		}
		if (optional.isPresent()) {
			communicationDetail.setEmployeeInfo(optional.get());
		}

		if (null != communicationDetailVo.getPersonalEmailId()) {
			communicationDetail.setPersonalEmailId(communicationDetailVo.getPersonalEmailId());
		}
	}
	@Override
	public void deleteCommunicationDetailsByEmpId(int empId) throws NotFoundException {
		if(communicationDetailsRepository.getCommunicationDetailsByEmpId(empId).isPresent())
		{
			communicationDetailsRepository.deleteById(empId);
		}else {
			throw new NotFoundException("Employee Not Found");
		}

	}
}
