package com.erp.lt.portal.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.erp.lt.portal.model.EmployementHistory;

@Repository
public interface EmployeeHistoryRepository extends JpaRepository<EmployementHistory, Integer> {

	/*
	 * @Query(value =
	 * "SELECT  ei.employee_code, eh.employer_name,eh.begin_date,eh.end_date,eh.ctc, dt.description, "
	 * +
	 * " ea.address_line_1,ea.address_line_2,ea.city,ea.state,ea.country,ea.pincode "
	 * + " FROM  employement_history as eh join employee_info ei " +
	 * " on ei.employee_code = eh.employee_code join designation_type dt " +
	 * " on dt.code=eh.designation_type_code join employee_address as ea " +
	 * " on ea.address_type_code = eh.address_type_code  " +
	 * " where ei.employee_code=:employeeCode", nativeQuery = true)
	 */

	@Query(value = "SELECT e FROM EmployementHistory e")
	public List<EmployementHistory> getEmployementHistory(@Param(value = "employeeCode") Integer employeeCode);

	@Query(value = "UPDATE EmployementHistory eh SET eh.status =:status where eh.employeeInfo.employeeCode =:EmpID ",nativeQuery = true)
	public void softDeleteByEmpID(@Param(value = "EmpID") int EmpID, @Param(value = "status") int status);
	
	@Query(value = "SELECT e FROM EmployementHistory e where e.employeeInfo.employeeCode=:empId and e.id=:orgId")
	public EmployementHistory editEmployeeHistoryByEmpIdAndOrgId(@Param(value = "empId") Integer empId,
			@Param(value = "orgId") Integer orgId);
}
