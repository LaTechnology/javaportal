/**
 * 
 */
package com.erp.lt.portal2.Service;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.erp.lt.portal2.VO.GenderTypeVo;

/**
 * @author admin
 *
 */
@Service
public interface GenderTypeService {
	public Optional<GenderTypeVo> getGenderType(int code);
	}
