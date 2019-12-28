/**
 * 
 */
package com.erp.lt.portal.service.impl;

import java.util.Optional;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.erp.lt.portal.model.CommunicationDetail;
import com.erp.lt.portal.model.EmployeeInfo;
import com.erp.lt.portal.repository.CommunicationDetailsRepository;
import com.erp.lt.portal.service.CommunicationDetailsService;
import com.erp.lt.portal.vo.CommunicationDetailsVO;

/**
 * @author User
 *
 */
@Service
public class CommunicationDetailsServiceImpl implements CommunicationDetailsService {

	@Autowired
	CommunicationDetailsRepository communicationDetailsRepository;

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
			if (null != detail.getMobileDetails()) {
//				detailsVO.setMobileDetails("" + detail.getMobileDetails().getCode());
			}
			if (null != detail.getEmployeeInfo()) {
				detailsVO.setEmployeeInfo("" + detail.getEmployeeInfo().getEmployeeCode());
			}
			if (null != detail.getPersonalEmailId()) {
				detailsVO.setPersonalEmailId(detail.getPersonalEmailId());
			}
		}

		return detailsVO;
	}

	@Override
	public void addCommunicationDetials(CommunicationDetailsVO communicationDetailVo) {
		CommunicationDetail communicationDetail = new CommunicationDetail();
		Optional<EmployeeInfo> mobiledetail = null;
		

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
		
//		 if (null != communicationDetailVo.getMobileDetails()) {
//	communicationDetail.setMobileDetails(String.pcommunicationDetailVo.getMobileDetails());
		 
//		   if (null != communicationDetailVo.getEmployeeInfo()) {
//		  communicationDetail.setEmployeeInfo(communicationDetailVo.getEmployeeInfo());
//		   }
		 
//		if (null != communicationDetailVo.getPersonalEmailId()) {
//			communicationDetail.setPersonalEmailId(communicationDetailVo.getPersonalEmailId());
//		}
		communicationDetailsRepository.save(communicationDetail);
	}

	@Override
	public void editCommunicationDetials(CommunicationDetailsVO communicationDetailVo) {
		CommunicationDetail communicationDetail = new CommunicationDetail();

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

		/*
		 * if (null != communicationDetailVo.getMobileDetails()) {
		 * communicationDetail.setMobileDetails(communicationDetailVo.getMobileDetails()
		 * );
		 * 
		 * }
		 * 
		 * if (null != communicationDetailVo.getEmployeeInfo()) {
		 * communicationDetail.setEmployeeInfo(communicationDetailVo.getEmployeeInfo());
		 * }
		 */
		if (null != communicationDetailVo.getPersonalEmailId()) {
			communicationDetail.setPersonalEmailId(communicationDetailVo.getPersonalEmailId());
		}
		communicationDetailsRepository.save(communicationDetail);
	}

	@Override
	public void deleteCommunicationDetailsByEmpId(int empId) {
		if (empId > 0) {
			communicationDetailsRepository.deleteById(empId);
		}

	}

}
