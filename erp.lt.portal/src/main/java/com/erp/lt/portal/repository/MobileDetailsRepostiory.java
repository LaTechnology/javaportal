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
	@Query(value = "select  mobiledt.code, mobiledt.mobile_number_1, mobiledt.moblie_number_2 , commd.code"
			+ " From  communication_details as commd left join mobile_details as "
			+ " mobiledt on commd.code = mobiledt.comminication_details_code "
			+ " where mobiledt.comminication_details_code=:communication_code", nativeQuery = true)
	public Optional<MobileDetail> getMobileDetails(@Param(value = "communication_code") int communication_code);
}