/**
 * 
 */
package com.erp.lt.portal.service;

import java.util.Optional;

import com.erp.lt.portal.dto.EducationDetailsDto;

/**
 * @author User
 *
 */
public interface EmployeeEduService {
	
	public void addEmployeeEdu(EducationDetailsDto educationDetailsDto);

	public void editEmployeeEdu(EducationDetailsDto educationDetailsDto);

	public void deleteEmployeeEdu(Long empid);

	public Optional<EducationDetailsDto>getEmployeeEducationDetail(Long empid);


}
