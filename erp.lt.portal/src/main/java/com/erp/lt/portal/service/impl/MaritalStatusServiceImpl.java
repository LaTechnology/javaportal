/**
 * 
 */
package com.erp.lt.portal.service.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.erp.lt.portal.model.MaritalStatus;
import com.erp.lt.portal.repository.MaritalStatusRepository;
import com.erp.lt.portal.service.MaritalStatusService;
import com.erp.lt.portal.vo.MaritalStatusVO;

/**
 * @author admin
 *
 */
@Service
public class MaritalStatusServiceImpl implements MaritalStatusService {
	@Autowired
	MaritalStatusRepository maritalStatusRepo;

	@Override
	public MaritalStatusVO getMaritalStatus(int code) {
		
		MaritalStatusVO maritalstatusVo = new MaritalStatusVO();
		
		Optional<MaritalStatus> optional = maritalStatusRepo.findById(code);
		
		MaritalStatus marital = optional.get();
		
		if (0 != marital.getCode()) {
			maritalstatusVo.setCode(marital.getCode());
		}
		if (null != marital.getTitle()) {
			maritalstatusVo.setTitle(marital.getTitle());
		}
		return maritalstatusVo;
	}
}
