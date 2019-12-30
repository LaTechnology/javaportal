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

	public EmployeeInfoVO getEmployeeInfoByEmpId(String employeeCode);

	public List<EmployeeInfoVO> getAllEmployeeInfo();

	public boolean patchEmployeeInfo(EmployeeInfoVO employeeInfo) throws NotFoundException;

	// public void deleteEmployeeInfo(int employeeCode);
	// public boolean editEmployeeInfoById(EmployeeInfoVO employeeInfo, int
		// employeeCode) throws NotFoundException;

}
