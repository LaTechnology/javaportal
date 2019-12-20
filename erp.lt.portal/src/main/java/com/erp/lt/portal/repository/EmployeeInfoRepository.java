package com.erp.lt.portal.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.erp.lt.portal.dto.EmployeeInfoVO;

@Repository
public interface EmployeeInfoRepository extends JpaRepository<EmployeeInfoVO, Integer> {

}
