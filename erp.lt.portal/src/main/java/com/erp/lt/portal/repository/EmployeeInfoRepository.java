/**
 * 
 */
package com.erp.lt.portal.repository;

import java.util.List;


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

	@Query(value = "SELECT  eif.employee_code as employeeCode, eif.firstname as firstname,eif.lastName as lastName,"
			+ "gtc.code as genderCode ,eif.dob,ms.title as m_code, "
			+ "eif.marriage_date as marriageDate, eif.citizen as citizen,eif.nationality as nationality,eif.countryofbirth as countryofbirth,"
			+ "eif.stateofbirth as stateofbirth "
			+ "FROM employee_selfservicedb.gender_type as gtc join employee_selfservicedb.employee_info as eif  "
			+ "on eif.gender_type_code= gtc.code join marital_status as ms  "
			+ "on eif.marital_status_code = ms.code where eif.employee_code=:employeeCode ;", nativeQuery = true)
	public EmployeeInfoVO getEmployeeInfo(@Param(value = "employeeCode") int employeeCode);
	
	@Query(value = "SELECT  eif.employee_code as employeeCode FROM employee_info as eif where eif.employee_number=:employeeNumber;", nativeQuery = true)
	public EmployeeInfoVO getEmployeeCodeByEmployeeNumber(@Param(value = "employeeNumber") String employeeNumber);

	@Query(value = "SELECT  eif.employee_code as employeeCode, eif.firstname as firstname,eif.lastName as lastName,"
			+ "gtc.code as genderCode ,eif.dob,ms.title as m_code, "
			+ "eif.marriage_date as marriageDate, eif.citizen as citizen,eif.nationality as nationality,eif.countryofbirth as countryofbirth,"
			+ "eif.stateofbirth as stateofbirth "
			+ "FROM employee_selfservicedb.gender_type as gtc join employee_selfservicedb.employee_info as eif  "
			+ "on eif.gender_type_code= gtc.code join marital_status as ms  "
			+ "on eif.marital_status_code = ms.code ", nativeQuery = true)
	public List<EmployeeInfoVO> getAllEmployeeInfo();
	/*
	 * @Query(value
	 * ="SELECT  eif.employee_code as employeeCode, eif.firstname as firstname,eif.lastName as lastName,"
	 * +" gtc.code as genderCode ,eif.dob,ms.title as m_code, eif.marriage_date as marriageDate, eif.citizen as citizen,"
	 * + " eif.nationality as nationality,eif.countryofbirth as countryofbirth,"
	 * +" eif.stateofbirth as stateofbirth FROM employee_selfservicedb.gender_type as gtc join employee_selfservicedb.employee_info as eif "
	 * +
	 * "on eif.gender_type_code= gtc.code join marital_status as ms  on eif.marital_status_code = ms.code"
	 * + " where eif.status=1 and eif.firstname like '%firstname%'  ", nativeQuery =
	 * true) public List<EmployeeInfoVO> getEmployeeInfoByEmployeeName(@Param(value
	 * = "firstname") String firstname);
	 */
}