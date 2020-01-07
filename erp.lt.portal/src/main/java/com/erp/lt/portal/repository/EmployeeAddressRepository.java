package com.erp.lt.portal.repository;

import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.erp.lt.portal.model.EmployeeAddress;

@Repository
public interface EmployeeAddressRepository extends JpaRepository<EmployeeAddress, Integer> {


	@Query(value = "SELECT e FROM EmployeeAddress e where e.employeeInfo.employeeCode=:id")
	public List<EmployeeAddress> getEmployeeAddress(@Param(value = "id") int id);


}
