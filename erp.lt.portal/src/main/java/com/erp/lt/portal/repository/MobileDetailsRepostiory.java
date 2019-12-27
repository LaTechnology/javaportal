/**
 * 
 */
package com.erp.lt.portal.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.erp.lt.portal.model.MobileDetail;

/**
 * @author User
 *
 */
@Repository 
public interface MobileDetailsRepostiory extends JpaRepository<MobileDetail, Integer> {
	@Query(value ="SELECT cd.employee_code,md.mobile_number_1,md.moblie_number_2  " + 
			"FROM employee_selfservicedb.communication_details cd join employee_selfservicedb.mobile_details md " + 
			"on cd.code = md.comminication_details_code where md.comminication_details_code=:code;", nativeQuery = true)
	public Optional<MobileDetail> getMobileDetails(@Param(value ="code") int code);
}