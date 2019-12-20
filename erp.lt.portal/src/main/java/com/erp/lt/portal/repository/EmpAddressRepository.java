/**
 * 
 */
package com.erp.lt.portal.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.erp.lt.portal.dto.EmpAddressVO;

/**
 * @author User
 *
 */
@Repository
public interface EmpAddressRepository extends JpaRepository<EmpAddressVO, Integer> {

}
