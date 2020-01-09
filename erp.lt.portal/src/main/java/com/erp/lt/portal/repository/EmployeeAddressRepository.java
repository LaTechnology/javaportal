package com.erp.lt.portal.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.erp.lt.portal.model.EmployeeAddress;
import com.erp.lt.portal.model.EmployementHistory;

@Repository
public interface EmployeeAddressRepository extends JpaRepository<EmployeeAddress, Integer> {
	

	
	/*
	 * @Query(value =
	 * "select empadd.employee_id, addtype.title, empadd.addressline1, empadd.addressline2, empadd.city, "
	 * + " empadd.country, empadd.pincode " +
	 * " from employee_address as empadd join address_type as addtype " +
	 * " on empadd.address_type_code = addtype.code  " +
	 * " where empadd.employee_id=:id", nativeQuery = true)
	 */	
	
	@Query(value= "SELECT e FROM EmployeeAddress e where e.employeeInfo.employeeCode=:id")
	public List<EmployeeAddress> getEmployeeAddress(@Param(value = "id") int id);
	
	@Query(value= "SELECT e FROM EmployeeAddress e where e.employeeInfo.employeeCode=:id and e.employementHistory.id =:HisId")
	public List<EmployeeAddress> getEmployeeAddressHistory(@Param(value = "id") int id,@Param(value = "HisId") int HisId);
	
	
	@Query(value= "SELECT e FROM EmployeeAddress e where e.employeeInfo.employeeCode=:id")
	public Optional<EmployeeAddress> getEmployeeAddressopt(@Param(value = "id") int id);
	
	@Query(value = "UPDATE EmployeeAddress ea SET ea.status =:status where ea.employeeInfo.employeeCode =:EmpID ",nativeQuery = true)
	public void softDeleteByEmpID(@Param(value = "EmpID") int EmpID, @Param(value = "status") int status);
	
	@Query(value = "SELECT e FROM EmployeeAddress e where e.employeeInfo.employeeCode=:empId and e.employementHistory.id=:OrgId")
	public EmployeeAddress editEmployeeHistoryByEmpIdAndOrgId(@Param(value = "empId") Integer empId,
			@Param(value = "OrgId") Integer OrgId);


}
