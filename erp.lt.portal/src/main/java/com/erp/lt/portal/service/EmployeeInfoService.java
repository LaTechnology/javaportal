/**
 * 
 */
package com.erp.lt.portal.service;

import java.util.List;

import com.erp.lt.portal.model.EmployeeInfo;
import com.erp.lt.portal.vo.EmployeeInfoVO;

import javassist.NotFoundException;

/**
 * @author admin
 *
 */
public interface EmployeeInfoService {
	public void addEmployeeInfo(EmployeeInfoVO employeeInfoVO);

	public boolean editEmployeeInfo(EmployeeInfoVO employeeInfo) throws NotFoundException;


	public EmployeeInfoVO getEmployeeInfoVOByEmpId(String employeeCode) throws NotFoundException;

	public EmployeeInfo getEmployeeInfoByEmpId(String employeeCode) throws NotFoundException;

	public List<EmployeeInfoVO> getAllEmployeeInfo();

	void doMap(EmployeeInfo employeeInfo, EmployeeInfoVO employeeInfoVO);

	public boolean patchEmployeeInfo(EmployeeInfoVO employeeInfo) throws NotFoundException;

}
