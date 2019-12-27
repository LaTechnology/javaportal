/**
 * 
 */
package com.erp.lt.portal.service.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.erp.lt.portal.model.GenderType;
import com.erp.lt.portal.repository.GenderTypeRepository;
import com.erp.lt.portal.service.GenderTypeService;
import com.erp.lt.portal.vo.GenderTypeVO;

/**
 * @author admin
 *
 */
@Service
public class GenderTypeServiceImpl implements GenderTypeService {
	@Autowired
	GenderTypeRepository genderTypeRepo;

	@Override
	public GenderTypeVO getGenderType(int code) {
		
		GenderTypeVO genderTypeVo = new GenderTypeVO();
		Optional<GenderType> gender = genderTypeRepo.findById(code);
		GenderType genderType = gender.get();
		if (0 != genderType.getCode()) {
			genderTypeVo.setCode(genderType.getCode());
		}
		if (null != genderType.getTitle()) {
			genderTypeVo.setTitle(genderType.getTitle());
		}
		return genderTypeVo;
	}

}
