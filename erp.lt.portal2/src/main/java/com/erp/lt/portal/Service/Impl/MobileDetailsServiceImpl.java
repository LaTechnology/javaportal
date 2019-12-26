/**
 * 
 */
package com.erp.lt.portal.Service.Impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.erp.lt.portal.Repository.MobileDetailsRepository;
import com.erp.lt.portal.Service.MobileDetailsService;
import com.erp.lt.portal.VO.MobileDetailsVO;

/**
 * @author User
 *
 */
public class MobileDetailsServiceImpl implements MobileDetailsService {

	@Autowired
	MobileDetailsRepository mobileDetailsRepository;
	
	@Override
	public void addMobileDetails(MobileDetailsVO mobileDetailsVO) {
		mobileDetailsRepository.save(mobileDetailsVO);
	}

	@Override
	public void editMobileDetails(MobileDetailsVO mobileDetailsVO) {
		mobileDetailsRepository.save(mobileDetailsVO);
	}

	@Override
	public Optional<MobileDetailsVO> getMobileDetailsByEmpID(int code) {
		Optional<MobileDetailsVO> optional=mobileDetailsRepository.findById(code);
		return optional;
	}

	@Override
	public List<MobileDetailsVO> getAllMobileDetails(MobileDetailsVO mobileDetailsVO) {
		List<MobileDetailsVO> list =mobileDetailsRepository.findAll();
		return list;
	}

	@Override
	public void deleteMobileDetailsByEmpID(int code) {
		mobileDetailsRepository.deleteById(code);	

	}

}
