package com.erp.lt.portal.service.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.erp.lt.portal.model.Educationtype;
import com.erp.lt.portal.repository.EducationTypeRepository;
import com.erp.lt.portal.service.EducationTypeService;
import com.erp.lt.portal.vo.EducationTypeVO;

@Service
public class EducationTypeServiceImpl implements EducationTypeService {

	@Autowired
	EducationTypeRepository educationtyperepo;
	
	@Override
	public EducationTypeVO getEduType(int code) {
		
		EducationTypeVO educationTypeVO = new EducationTypeVO();
	    Optional<Educationtype> type	=educationtyperepo.findById(code);
	   Educationtype educationtype= type.get();
		
	   if(0 != educationtype.getCode()) {
		   educationTypeVO.setCode(educationtype.getCode());
	   }
	   if(null != educationtype.getEducationStandards()) {
		   educationTypeVO.setEducationStandards(educationtype.getEducationStandards());
	   }
	   return educationTypeVO;
	}

}
