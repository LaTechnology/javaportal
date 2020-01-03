/**
 * 
 */
package com.erp.lt.portal.service.impl;

import java.util.Optional;

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
	public CommunicationDetailsVO getCommunicationDetailsByEmpId(int empId) {
		CommunicationDetailsVO detailsVO = new CommunicationDetailsVO();
		Optional<CommunicationDetail> optional = communicationDetailsRepository.getCommunicationDetailsByEmpId(empId);
		CommunicationDetail detail = optional.get();
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
		doMap(communicationDetailVo, communicationDetail);
		communicationDetailsRepository.save(communicationDetail);
	}

	@Override
	public void editCommunicationDetials(CommunicationDetailsVO communicationDetailVo) throws NotFoundException {
		CommunicationDetail communicationDetail = new CommunicationDetail();
		doMap(communicationDetailVo, communicationDetail);
		communicationDetailsRepository.save(communicationDetail);
	}

	@Override
	public void deleteCommunicationDetailsByEmpId(int empId) {
		if (empId > 0) {
			communicationDetailsRepository.deleteById(empId);
		}

	}

	@Override
	public void doMap(CommunicationDetailsVO communicationDetailVo, CommunicationDetail communicationDetail)
			throws NotFoundException {
		EmployeeInfo employeeInfo = null;
		/*
		 * if (-1 != communicationDetailVo.getEmployeeCode()) { employeeInfo =
		 * employeeInfoService
		 * .getEmployeeInfoByEmpId(String.valueOf(communicationDetailVo.getEmployeeCode(
		 * ))); }
		 */
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
		if (null != employeeInfo) {
			communicationDetail.setEmployeeInfo(employeeInfo);
		}

		if (null != communicationDetailVo.getPersonalEmailId()) {
			communicationDetail.setPersonalEmailId(communicationDetailVo.getPersonalEmailId());
		}
	}

}
