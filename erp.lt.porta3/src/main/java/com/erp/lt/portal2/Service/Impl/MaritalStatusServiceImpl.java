/**
 * 
 */
package com.erp.lt.portal2.Service.Impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.erp.lt.portal2.Repository.MaritalStatusRepository;
import com.erp.lt.portal2.Service.MaritalStatusService;
import com.erp.lt.portal2.VO.MaritalStatusVo;

/**
 * @author admin
 *
 */
@Service
public class MaritalStatusServiceImpl implements MaritalStatusService {
	@Autowired
	MaritalStatusRepository maritalStatusRepo;

	@Override
	public Optional<MaritalStatusVo> getMaritalStatus(int code) {
		// TODO Auto-generated method stub
		Optional<MaritalStatusVo> optional = maritalStatusRepo.findById(code);
		return optional;
	}

	

}
