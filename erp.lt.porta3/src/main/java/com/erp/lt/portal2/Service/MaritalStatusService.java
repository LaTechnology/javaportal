/**
 * 
 */
package com.erp.lt.portal2.Service;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.erp.lt.portal2.VO.MaritalStatusVo;

/**
 * @author admin
 *
 */
@Service
public interface MaritalStatusService {
 public Optional<MaritalStatusVo> getMaritalStatus(int code);

}
