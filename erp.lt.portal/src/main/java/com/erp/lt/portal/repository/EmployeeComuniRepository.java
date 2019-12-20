/**
 * 
 */
package com.erp.lt.portal.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.erp.lt.portal.dto.EmployeeComuniVO;

/**
 * @author User
 *
 */
@Repository
public interface EmployeeComuniRepository extends JpaRepository<EmployeeComuniVO, Long> {

}
