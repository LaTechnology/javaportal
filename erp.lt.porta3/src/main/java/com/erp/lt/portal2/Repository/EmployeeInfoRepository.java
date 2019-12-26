/**
 * 
 */
package com.erp.lt.portal2.Repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.erp.lt.portal2.VO.EmployeeInfoVo;



/**
 * @author admin
 *
 */
@Repository
public interface EmployeeInfoRepository extends JpaRepository<EmployeeInfoVo, Integer>{
	
	@Query(value ="SELECT  eif.employee_code, eif.firstname,eif.lastName,gtc.title as gender ,eif.dob,ms.title as martial_status,eif.marriage_date, " + 
			"eif.citizen,eif.nationality,eif.countryofbirth,eif.stateofbirth " + 
			"FROM employee_selfservicedb.gender_type as gtc join employee_selfservicedb.employee_info as eif " + 
			"on eif.gender_type_code= gtc.code join employee_selfservicedb.marital_status   as ms " + 
			"on eif.marital_status_code = ms.code " + 
			"where eif-employee_code=employeeCode ", nativeQuery=true)

	public Optional<EmployeeInfoVo> getEmployeeInfo(@Param(value = "employeeCode") int employeeCode);

	@Query(value ="SELECT  eif.employee_code, eif.firstname,eif.lastName,gtc.title as gender ,eif.dob,ms.title as martial_status,eif.marriage_date,\r\n" + 
			"eif.citizen,eif.nationality,eif.countryofbirth,eif.stateofbirth\r\n" + 
			"FROM employee_selfservicedb.gender_type as gtc join employee_selfservicedb.employee_info as eif \r\n" + 
			"on eif.gender_type_code= gtc.code join employee_selfservicedb.marital_status   as ms\r\n" + 
			"on eif.marital_status_code = ms.code ", nativeQuery=true)

	public List<EmployeeInfoVo> getAllEmployeeInfo(EmployeeInfoVo employeeInfoVO);
	}


