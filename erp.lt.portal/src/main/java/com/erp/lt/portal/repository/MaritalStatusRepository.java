/**
 * 
 */
package com.erp.lt.portal.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.erp.lt.portal.model.MaritalStatus;


/**
 * @author admin
 *
 */
@Repository
public interface MaritalStatusRepository extends JpaRepository<MaritalStatus, Integer>{

}
