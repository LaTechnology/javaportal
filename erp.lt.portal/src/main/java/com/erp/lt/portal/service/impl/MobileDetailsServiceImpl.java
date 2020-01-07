/**
 * 
 */
package com.erp.lt.portal.service.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.erp.lt.portal.model.CommunicationDetail;
import com.erp.lt.portal.model.MobileDetail;
import com.erp.lt.portal.repository.CommunicationDetailsRepository;
import com.erp.lt.portal.repository.MobileDetailsRepostiory;
import com.erp.lt.portal.service.CommunicationDetailsService;
import com.erp.lt.portal.service.MobileDetailsService;
import com.erp.lt.portal.vo.MobileDetailsVO;

import javassist.NotFoundException;

/**
 * @author User
 *
 */
@Service
public class MobileDetailsServiceImpl implements MobileDetailsService {

	@Autowired
	MobileDetailsRepostiory mobileDetailsRepository;
	@Autowired
	CommunicationDetailsService communicationDetailsService;
	@Autowired
	CommunicationDetailsRepository communicationDetailsRepository;

	@Override
	public MobileDetailsVO getMobileDetails(Integer employeeCode) {
		MobileDetailsVO detailsVO = new MobileDetailsVO();
		Optional<CommunicationDetail> comdetail;
		Optional<MobileDetail> optional = null;
		comdetail = communicationDetailsRepository.getCommunicationDetailsByEmpId(employeeCode);
		for (MobileDetail mobileDetail : comdetail.get().getMobileDetails()) {
			if (mobileDetail.getCode() > 0) {
				optional = mobileDetailsRepository.findById(mobileDetail.getCode());
			}
		}
		MobileDetail detail = optional.get();

		if (0 != detail.getCode()) {
			detailsVO.setCode(detail.getCode());
		}

		if (0 != detail.getMobileNumber1()) {
			detailsVO.setMobileNumber1(detail.getMobileNumber1());

		}
		if (0 != detail.getMoblieNumber2()) {
			detailsVO.setMoblieNumber2(detail.getMoblieNumber2());

		}
		if (0 != detail.getCommunicationDetail().getCode()) {

			detailsVO.setCommunicationDetail(detail.getCommunicationDetail().getCode());
		}
		if (detail.getStatus() == 1 || detail.getStatus() == 0) {
			detailsVO.setStatus(detail.getStatus());
		}
		return detailsVO;
	}

	public void addMobileDetials(MobileDetailsVO mobileDetailsVO) throws NotFoundException {
		MobileDetail detail = new MobileDetail();
		Optional<CommunicationDetail> communicationOptional = communicationDetailsRepository
				.findById(mobileDetailsVO.getCommunicationDetail());

		if (null != mobileDetailsVO) {
			if (0 != mobileDetailsVO.getCode()) {

				detail.setCode(mobileDetailsVO.getCode());
			}
			if (0 != mobileDetailsVO.getMobileNumber1()) {
				detail.setMobileNumber1(mobileDetailsVO.getMobileNumber1());

			}
			if (0 != mobileDetailsVO.getMoblieNumber2()) {
				detail.setMoblieNumber2(mobileDetailsVO.getMoblieNumber2());
			}
			if (communicationOptional.isPresent()) {
				detail.setCommunicationDetail(communicationOptional.get());
			}
			detail.setStatus(1);

		}
		mobileDetailsRepository.save(detail);
	}

	public boolean editMobileDetials(MobileDetailsVO mobileDetailsVO) throws NotFoundException {
		boolean status = false;

		MobileDetail detail = new MobileDetail();

		CommunicationDetail comdetail = communicationDetailsService
				.getCommunicationDetailByEmpId(mobileDetailsVO.getCommunicationDetail());
		if (mobileDetailsVO.getCode() <= 0) {
			throw new NotFoundException("Employee Not Found");
		}

		if (0 != mobileDetailsVO.getCode()) {
			detail.setCode(mobileDetailsVO.getCode());
		}
		if (0 != mobileDetailsVO.getMobileNumber1()) {
			detail.setMobileNumber1(mobileDetailsVO.getMobileNumber1());

		}
		if (0 != mobileDetailsVO.getMoblieNumber2()) {
			detail.setMoblieNumber2(mobileDetailsVO.getMoblieNumber2());
		}
		if (null != comdetail) {
			detail.setCommunicationDetail(comdetail);
		}

		mobileDetailsRepository.save(detail);
		status = true;

		return status;
	}

	@Override
	public void deleteMobileDetails(Integer employeeCode) {
		CommunicationDetail comdetail;
		try {
			comdetail = communicationDetailsService.getCommunicationDetailByEmpId(employeeCode);
			for (MobileDetail mobileDetail : comdetail.getMobileDetails()) {
				if (mobileDetail.getCode() > 0) {
					mobileDetailsRepository.deleteById(mobileDetail.getCode());
				}
			}
		} catch (NotFoundException e) {
			e.printStackTrace();
		}
	}
}
