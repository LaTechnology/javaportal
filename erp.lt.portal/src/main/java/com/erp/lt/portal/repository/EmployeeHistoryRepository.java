package com.erp.lt.portal.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.erp.lt.portal.model.EmployementHistory;
@Repository
public interface EmployeeHistoryRepository extends JpaRepository<EmployementHistory, Integer> {

	 @Query(value ="SELECT  eh.employee_code, eh.employer_name, eh.begin_date,eh.end_date,eh.ctc, dt.description, " + 
		 		" ea.address_line_1,ea.address_line_2,ea.city,ea.state,ea.country,ea.pincode " + 
		 		" FROM employee_selfservicedb.employement_history as eh join employee_info ei " + 
		 		" on ei.employee_code = eh.employee_code join designation_type dt " + 
		 		" on dt.code=eh.designation_type_code join employee_address as ea  " + 
		 		" on ea.address_type_code = eh.address_address_code join address_type as adtype " + 
		 		" where adtype.code = address_type_code and eh.employee_code=:employeeCode ", nativeQuery = true)
		  public EmployementHistory
		  getEmployementHistory(@Param(value="employeeCode")Integer employeeCode);	
}
