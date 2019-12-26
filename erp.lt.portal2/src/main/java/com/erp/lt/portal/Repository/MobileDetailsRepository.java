/**
 * 
 */
package com.erp.lt.portal.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.erp.lt.portal.VO.MobileDetailsVO;

/**
 * @author User
 *
 */
@Repository
public interface MobileDetailsRepository extends JpaRepository<MobileDetailsVO, Integer> {

}
