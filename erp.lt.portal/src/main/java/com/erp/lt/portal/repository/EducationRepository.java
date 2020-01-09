package com.erp.lt.portal.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.erp.lt.portal.model.EducationDetail;

@Repository
public interface EducationRepository extends JpaRepository<EducationDetail, Integer> {

	@Query(value = "SELECT e FROM EducationDetail e where e.employeeInfo.employeeCode=:empId")
	public List<EducationDetail> getEducationDetail(@Param(value = "empId") Integer empId);

	@Query(value = "SELECT e FROM EducationDetail e where e.employeeInfo.employeeCode=:empId and e.educationId=:educationId")
	public EducationDetail editEmployeeByEmpIdAndEduId(@Param(value = "empId") Integer empId,
			@Param(value = "educationId") Integer educationId);

	/*
	 * @Query(value =
	 * "SELECT e FROM EducationDetail e where e.employeeInfo.employeeCode=:empId and e.educationId=:educationId"
	 * ) public EducationDetail getOneEducationDetail(@Param(value = "empId")
	 * Integer empId, @Param(value = "educationId") Integer educationId);
	 * 
	 */
	@Modifying
	@Transactional
	@Query(value = "UPDATE EducationDetail e SET e.status=:status where e.employeeInfo.employeeCode=:empId")
	public void softDeleteByEmpId(@Param(value = "empId") Integer empId, @Param(value = "status") Integer status);

}

