/**
 * 
 */
package com.erp.lt.portal.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.erp.lt.portal.dto.PreviousEmployeeVO;

/**
 * @author User
 *
 */
@Repository
public interface PreviousEmployeeRepository extends JpaRepository<PreviousEmployeeVO, Long> {

}
