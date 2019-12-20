/**
 * 
 */
package com.erp.lt.portal.service.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.erp.lt.portal.dto.EducationDetailsDto;
import com.erp.lt.portal.repository.EmployeeEduRepo;
import com.erp.lt.portal.service.EmployeeEduService;

/**
 * @author User
 *
 */
@Service
public class EmployeeEduServiceImpl implements EmployeeEduService {
	
	@Autowired
	EmployeeEduRepo employeeEduRepo;


	@Override
	public void addEmployeeEdu(EducationDetailsDto educationDetailsDto) {
	employeeEduRepo.save(educationDetailsDto);

	}

	@Override
	public void editEmployeeEdu(EducationDetailsDto educationDetailsDto) {
	employeeEduRepo.save(educationDetailsDto);

	}

	@Override
	public void deleteEmployeeEdu(Long empid) {
	employeeEduRepo.deleteById(empid);

	}

	@Override
	public Optional<EducationDetailsDto> getEmployeeEducationDetail(Long empid) {
	Optional<EducationDetailsDto> optional=employeeEduRepo.findById(empid);
	return optional;
	}


}
