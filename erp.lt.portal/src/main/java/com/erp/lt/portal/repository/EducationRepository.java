package com.erp.lt.portal.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.erp.lt.portal.model.EducationDetail;

@Repository
public interface EducationRepository extends JpaRepository<EducationDetail, Integer>{
	@Query(value="SELECT e FROM EducationDetail e where e.educationId=:empId")
	   public EducationDetail getEducationDetail(@Param(value = "empId") Integer empId);

} 
