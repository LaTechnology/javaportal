/**
 * 
 */
package com.erp.lt.portal.service.impl;

import java.util.List;
import java.util.Optional;

import org.apache.commons.math3.genetics.NPointCrossover;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.erp.lt.portal.model.CommunicationDetail;
import com.erp.lt.portal.model.EmployeeInfo;
import com.erp.lt.portal.model.MobileDetail;
import com.erp.lt.portal.repository.CommunicationDetailsRepository;
import com.erp.lt.portal.repository.EmployeeInfoRepository;
import com.erp.lt.portal.repository.MobileDetailsRepostiory;
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
	@Autowired
	MobileDetailsRepostiory mobileDetailsRepostiory;

	@Override
	public CommunicationDetail getCommunicationDetailByEmpId(int empId) throws NotFoundException {
		Optional<CommunicationDetail> optional = communicationDetailsRepository.getCommunicationDetailsByEmpId(empId);
		return optional.isPresent() ? optional.get() : null;
	}

	@Override
	public CommunicationDetailsVO getCommunicationDetailsByEmpId(int empId) throws NotFoundException {

		CommunicationDetailsVO detailsVO = new CommunicationDetailsVO();
		Optional<CommunicationDetail> detail = communicationDetailsRepository.getCommunicationDetailsByEmpId(empId);
		if (null != detail) {
			if (null != detail.get().getCompanyEmailId()) {
				detailsVO.setCompanyEmailId(detail.get().getCompanyEmailId());
			}
			if (null != detail.get().getBeginDate()) {
				detailsVO.setBeginDate(detail.get().getBeginDate());
			}
			if (null != detail.get().getEndDate()) {
				detailsVO.setEndDate(detail.get().getEndDate());
			}
			if (0 != detail.get().getCode()) {
				detailsVO.setCode(detail.get().getCode());
			}
			if (null != detail.get().getClientEmailId()) {
				detailsVO.setClientEmailId(detail.get().getClientEmailId());
			}
			if (null != detail.get().getEmergencyComunicationNumber()) {
				detailsVO.setEmergencyComunicationNumber(detail.get().getEmergencyComunicationNumber());
			}
			/*
			 * if (null != detail.getMobileDetails()) {
			 * detailsVO.setMobileDetails(detail.getMobileDetails()); }
			 */

			if (null != detail.get().getEmployeeInfo()) {
				detailsVO.setEmployeeCode(detail.get().getEmployeeInfo().getemployeeCode());
			}

			if (null != detail.get().getPersonalEmailId()) {
				detailsVO.setPersonalEmailId(detail.get().getPersonalEmailId());
			}
		}

		return detailsVO;
	}

	@Override
	public void addCommunicationDetials(CommunicationDetailsVO communicationDetailVo) throws NotFoundException {
		CommunicationDetail communicationDetail = new CommunicationDetail();
		Optional<EmployeeInfo> employeeInfo = null;
		List<MobileDetail> detail = mobileDetailsRepostiory.getMobileDetailsComPost(communicationDetailVo.getCode());
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

		if (detail != null) {
			communicationDetail.setMobileDetails(detail);
		}
		communicationDetail.setStatus(1);
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
		if (communicationDetailVo.getStatus() != 0) {
			communicationDetail.setStatus(1);
		}
	}

	@Override
	public void deleteCommunicationDetailsByEmpId(int empId) throws NotFoundException {
		if (communicationDetailsRepository.getCommunicationDetailsByEmpId(empId).isPresent()) {
			communicationDetailsRepository.deleteById(empId);
		} else {
			throw new NotFoundException("Employee Not Found");
		}

	}
}
