/**
 * 
 */
package com.erp.lt.portal.service;

import java.util.List;

import com.erp.lt.portal.vo.EmployeeInfoVO;

import javassist.NotFoundException;

/**
 * @author admin
 *
 */
public interface EmployeeInfoService {
	public void addEmployeeInfo(EmployeeInfoVO employeeInfoVO);

	public boolean editEmployeeInfo(EmployeeInfoVO employeeInfo) throws NotFoundException;

	// public boolean editEmployeeInfoById(EmployeeInfoVO employeeInfo, int
	// employeeCode) throws NotFoundException;

	public EmployeeInfoVO getEmployeeInfoByEmpId(int employeeCode);

	public List<EmployeeInfoVO> getEmployeeInfoByEmployeeName(String firstname);

	public List<EmployeeInfoVO> getAllEmployeeInfo();

	public boolean patchEmployeeInfo(EmployeeInfoVO employeeInfo) throws NotFoundException;

	// public void deleteEmployeeInfo(int employeeCode);
}
