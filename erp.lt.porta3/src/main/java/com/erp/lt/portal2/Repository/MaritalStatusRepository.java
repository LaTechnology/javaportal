/**
 * 
 */
package com.erp.lt.portal2.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.erp.lt.portal2.VO.MaritalStatusVo;

/**
 * @author admin
 *
 */
@Repository
public interface MaritalStatusRepository extends JpaRepository<MaritalStatusVo, Integer>{

}