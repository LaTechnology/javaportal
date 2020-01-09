/**
 * 
 */
package com.erp.lt.portal.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.erp.lt.portal.model.LoginDetails;

import lombok.val;

/**
 * @author admin
 *
 */
@Repository
public interface ERPAccountRepository extends JpaRepository<LoginDetails, Integer> {
	
	
	@Query(value = "select ld from LoginDetails ld where ld.employeeInfo.employeeCode=:employeeCode")
	public LoginDetails getLoginDetailByEmpID(@Param(value = "employeeCode") int employeeCode);
	
	@Query(value = "select ld from LoginDetails ld where ld.emailId =:emailId and ld.newPassword=:newPassword")
	public LoginDetails getLoginDetail(@Param(value = "emailId") String emailId, @Param(value = "newPassword") String newPassword);
	}
