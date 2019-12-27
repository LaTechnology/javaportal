/**
 * 
 */
package com.erp.lt.portal.service.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.erp.lt.portal.model.MobileDetail;
import com.erp.lt.portal.repository.MobileDetailsRepostiory;
import com.erp.lt.portal.service.MobileDetailsService;
import com.erp.lt.portal.vo.MobileDetailsVO;

/**
 * @author User
 *
 */
@Service
public class MobileDetailsServiceImpl implements MobileDetailsService {

	@Autowired
	MobileDetailsRepostiory mobileDetailsRepository;
	@Override
	public MobileDetailsVO getMobileDetails(int code) {
		MobileDetailsVO detailsVO = new MobileDetailsVO();
		Optional<MobileDetail> optional = mobileDetailsRepository.getMobileDetails(code);
		MobileDetail detail = optional.get();
		
		if(0 !=detail.getCode()) {
			detailsVO.setCode(detail.getCode());
		}
		
		if(0 != detail.getMobileNumber1())
		{
			detailsVO.setMobileNumber1(detail.getMobileNumber1());
			
		}
		if(0 != detail.getMoblieNumber2())
		{
			detailsVO.setMoblieNumber2(detail.getMoblieNumber2());
			
		}
		if(null != detail.getCommunicationDetail()) {
			
			detailsVO.setCommunicationDetail(detail.getCommunicationDetail());
		}
	
	return detailsVO;
	}
	public void addMobileDetials(MobileDetailsVO mobileDetailsVO) {
		
		MobileDetail detail = new MobileDetail();
		
			if(0 !=mobileDetailsVO.getCode()) {
				detail.setCode(mobileDetailsVO.getCode());
			}
			if(0 != mobileDetailsVO.getMobileNumber1()) {
				detail.setMobileNumber1(mobileDetailsVO.getMobileNumber1());
			
			}
			if(0 != mobileDetailsVO.getMoblieNumber2()) {
				detail.setMoblieNumber2(mobileDetailsVO.getMoblieNumber2());
			}
			if(null != mobileDetailsVO.getCommunicationDetail()) {
				detail.setCommunicationDetail(mobileDetailsVO.getCommunicationDetail());
			}
			mobileDetailsRepository.save(detail);
}
	
	
	public void editMobileDetials(MobileDetailsVO mobileDetailsVO) {
		
		MobileDetail detail = new MobileDetail();
		
			if(0 !=mobileDetailsVO.getCode()) {
				detail.setCode(mobileDetailsVO.getCode());
			}
			if(0 != mobileDetailsVO.getMobileNumber1()) {
				detail.setMobileNumber1(mobileDetailsVO.getMobileNumber1());
			
			}
			if(0 != mobileDetailsVO.getMoblieNumber2()) {
				detail.setMoblieNumber2(mobileDetailsVO.getMoblieNumber2());
			}
			if(null != mobileDetailsVO.getCommunicationDetail()) {
				detail.setCommunicationDetail(mobileDetailsVO.getCommunicationDetail());
			}
			mobileDetailsRepository.save(detail);
}
	
	
	public void deleteMobileDetailsByComCode(int code) {
		if(code>0)
		{
			mobileDetailsRepository.deleteById(code);
		}
	}
}
	
