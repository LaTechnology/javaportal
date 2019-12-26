/**
 * 
 */
package com.erp.lt.portal2.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.erp.lt.portal2.VO.EmployeeInfoVo;


/**
 * @author admin
 *
 */
@Service
public interface EmployeeInfoService {
	public void addEmployeeInfo(EmployeeInfoVo employeeInfoVO);

	public void editEmployeeInfo(EmployeeInfoVo employeeInfoVO);

	public Optional<EmployeeInfoVo> getEmployeeInfoByEmpId(int employeeCode);

	public void deleteEmployeeInfo(int employeeCode);

	public List<EmployeeInfoVo> getAllEmployeeInfo(EmployeeInfoVo employeeInfoVO);

}
