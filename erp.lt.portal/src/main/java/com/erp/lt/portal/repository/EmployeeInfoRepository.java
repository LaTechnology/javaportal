/**
 * 
 */
package com.erp.lt.portal.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.erp.lt.portal.model.EmployeeInfo;
import com.erp.lt.portal.vo.EmployeeInfoVO;

/**
 * @author admin
 *
 */
@Repository
public interface EmployeeInfoRepository extends JpaRepository<EmployeeInfo, Integer> {

	
	  
	 
			
	
	@Query(value ="SELECT * FROM employee_info e where e.employee_code=:employeeCode", nativeQuery = true)
	public Optional<EmployeeInfo> getEmployeeInfo(@Param(value = "employeeCode") int employeeCode);
	
			@Query(value = "SELECT  eif.employee_code as employeecode, eif.firstname as firstname,"
			+ "gtc.code as genderCode ,eif.dob,ms.title as m_code, "
			+ "eif.marriage_date as marriageDate, eif.citizen as citizen,eif.nationality as nationality,eif.countryofbirth as countryofbirth,"
			+ "eif.stateofbirth as stateofbirth "
			+ "FROM employee_selfservicedb.gender_type as gtc join employee_selfservicedb.employee_info as eif  "
			+ "on eif.gender_type_code= gtc.code join marital_status as ms  "
			+ "on eif.marital_status_code = ms.code ", nativeQuery = true)
			public List<EmployeeInfoVO> getAllEmployeeInfo();
			@Query(value = "select employee_Code from employee_selfservicedb.employee_info  ORDER BY employee_Code  DESC LIMIT 1",nativeQuery=true)
			public int  getEmployeeCode();
	
}