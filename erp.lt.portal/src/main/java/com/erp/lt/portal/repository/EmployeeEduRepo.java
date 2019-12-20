package com.erp.lt.portal.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.erp.lt.portal.dto.EducationDetailsDto;
@Repository
public interface EmployeeEduRepo extends JpaRepository<EducationDetailsDto, Long> {

}
