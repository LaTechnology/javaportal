/**
 * 
 */
package com.erp.lt.portal2.Service.Impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.erp.lt.portal2.Repository.GenderTypeRepository;
import com.erp.lt.portal2.Service.GenderTypeService;
import com.erp.lt.portal2.VO.GenderTypeVo;

/**
 * @author admin
 *
 */
@Service
public class GenderTypeServiceImpl implements GenderTypeService{
@Autowired
GenderTypeRepository genderTypeRepo;
	
@Override
public Optional<GenderTypeVo> getGenderType(int code) {
	Optional<GenderTypeVo> optional = genderTypeRepo.findById(code);
	return optional;
}



}
