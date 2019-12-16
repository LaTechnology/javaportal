/**
 * 
 */
package com.lt.erp.portal.service;

import com.lt.erp.portal.dto.EmployeePersonalInfoDTO;

/**
 * @author admin
 *
 */
public interface EmployeeService {

	public boolean addEmployee1(EmployeePersonalInfoDTO dto);

	public EmployeePersonalInfoDTO addEmployee(EmployeePersonalInfoDTO dto);

	public void addEmployee2(EmployeePersonalInfoDTO dto);

	public boolean editEmployee1(String empId);

	public EmployeePersonalInfoDTO editEmployee(String empId);

	public boolean deleteEmployee(String empId);

	public EmployeePersonalInfoDTO updateEmployee(String empId);

}
