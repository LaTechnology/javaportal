package com.erp.lt.portal.service.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.erp.lt.portal.model.DesignationType;
import com.erp.lt.portal.repository.EmployeeDesignationRepository;
import com.erp.lt.portal.service.EmployeeDesignationService;
import com.erp.lt.portal.vo.EmployeeDesignationVO;
@Service
public class EmployeeDesignationServiceImpl implements EmployeeDesignationService{

	@Autowired
	EmployeeDesignationRepository designationRepository;

	@Override
	public EmployeeDesignationVO getEmployeeDesignation(int code) {
		EmployeeDesignationVO empdvo=new EmployeeDesignationVO();
		Optional<DesignationType> emptype = designationRepository.findById(code);
		DesignationType empty=emptype.get();
		if(0!=empty.getCode()) {
			empdvo.setCode(empty.getCode());
		}
		if(null!=empty.getDescription()) {
			empdvo.setDescription(empty.getDescription());
		}
		if(0!=empty.getStatus()) {
			empdvo.setCode(empty.getCode());
		}
		/*
		 * if(null!=empty.getEmployementHistories()) {
		 * empdvo.setEmployementHistories(empty.getEmployementHistories()); }
		 */
		return empdvo;
	}

	
		
		
	}



	
		


