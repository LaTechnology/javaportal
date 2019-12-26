/**
 * 
 */
package com.erp.lt.portal.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import model.CommunicationDetail;



/**
 * @author User
 *
 */
@Repository
public interface CommunicationRepository extends JpaRepository<CommunicationDetail, Integer> {
	
}
