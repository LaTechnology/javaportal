/**
 * 
 */
package com.erp.lt.portal.repository;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.erp.lt.portal.model.CommunicationDetail;

/**
 * @author User
 *
 */
@Repository
public interface CommunicationDetailsRepository extends JpaRepository<CommunicationDetail, Integer> {

	@Query(value = "SELECT comdetails.code as code,comdetails.employee_code as employee_code,comdetails.personal_email_id as personal_email_id,"
			+ " comdetails.company_email_id as company_email_id,  "
			+ " comdetails.client_email_id as client_email_id, comdetails.emergency_comunication_number as emergency_comunication_number,"
			+ " comdetails.begin_date as begin_date,"
			+ " comdetails.end_date as end_date from communication_details as comdetails left join employee_info as empinfo "
			+ " on comdetails.employee_code = empinfo.employee_code left join mobile_details as mobdetails "
			+ " on comdetails.code = mobdetails.comminication_details_code  "
			+ " where comdetails.employee_code = empinfo.employee_code and"
			+ " comdetails.employee_code =:empId", nativeQuery = true)
	public Optional<CommunicationDetail> getCommunicationDetailsByEmpId(@Param(value = "empId") int empId);

}
