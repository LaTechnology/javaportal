package com.erp.lt.portal.service;


import com.erp.lt.portal.vo.EducationDetailsVO;

import javassist.NotFoundException;

public interface EducationService {

	
	public void addemployeeEducation(EducationDetailsVO dto);

	public void editEmployeeEducation(EducationDetailsVO dto) throws NotFoundException;

	public void deleteEmployeeEducation(int eduId);

	public EducationDetailsVO getEmployeeEducationDetail(int eduId);
	
	
	
}
