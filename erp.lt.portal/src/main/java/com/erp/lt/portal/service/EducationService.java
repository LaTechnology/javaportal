package com.erp.lt.portal.service;

import java.util.List;

import com.erp.lt.portal.vo.EducationDetailsVO;

import javassist.NotFoundException;

public interface EducationService {

	public void addemployeeEducation(EducationDetailsVO dto);

	public boolean editEmployeeEducation(EducationDetailsVO dto) throws NotFoundException;

	public void deleteEmployeeEducation(int eduId);

	public List<EducationDetailsVO> getEmployeeEducationDetail(int eduId);

}
