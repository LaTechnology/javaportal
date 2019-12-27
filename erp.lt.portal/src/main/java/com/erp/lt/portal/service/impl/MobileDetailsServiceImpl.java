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
	CommunicationDetailsRepository communicationDetailsRepository;

	@Override
	public MobileDetailsVO getMobileDetails(int code) {
		MobileDetailsVO detailsVO = new MobileDetailsVO();
		Optional<MobileDetail> optional = mobileDetailsRepository.findById(code);
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

		return detailsVO;
	}

	public void addMobileDetials(MobileDetailsVO mobileDetailsVO) {

		MobileDetail detail = new MobileDetail();
		Optional<CommunicationDetail> mobiledetail = null;

		if (mobileDetailsVO.getCommunicationDetail() <= 0) {
			mobiledetail = communicationDetailsRepository.findById(mobileDetailsVO.getCommunicationDetail());
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

		if (null != mobiledetail) {
			detail.setCommunicationDetail(mobiledetail.get());
		}
		mobileDetailsRepository.save(detail);
	}

	public boolean editMobileDetials(MobileDetailsVO mobileDetailsVO) throws NotFoundException {
		boolean status = false;

		MobileDetail detail = null;

		Optional<CommunicationDetail> comdetail = null;
		if (mobileDetailsVO.getCode() <= 0) {
			throw new NotFoundException("Employee Not Found");
		}

		Optional<MobileDetail> mobileDetail = mobileDetailsRepository.findById(mobileDetailsVO.getCode());
		comdetail = communicationDetailsRepository.findById(mobileDetailsVO.getCode());

		if (mobileDetail.isPresent()) {
			detail = mobileDetail.get();

			if (0 != mobileDetailsVO.getCode()) {
				detail.setCode(mobileDetailsVO.getCode());
			}
			if (0 != mobileDetailsVO.getMobileNumber1()) {
				detail.setMobileNumber1(mobileDetailsVO.getMobileNumber1());

			}
			if (0 != mobileDetailsVO.getMoblieNumber2()) {
				detail.setMoblieNumber2(mobileDetailsVO.getMoblieNumber2());
			}
			if (null != comdetail.get()) {
				detail.setCommunicationDetail(comdetail.get());
			}
		}
		mobileDetailsRepository.save(detail);
		status = true;
		if (!mobileDetail.isPresent()) {
			throw new NotFoundException("Employee Not Found");
		}

		return status;
	}

	@Override
	public void deleteMobileDetails(int code) {
		mobileDetailsRepository.deleteById(code);
	}

}
