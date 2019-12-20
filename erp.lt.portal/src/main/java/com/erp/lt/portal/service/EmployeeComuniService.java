/**
 * 
 */
package com.erp.lt.portal.service;

import java.util.Optional;

import com.erp.lt.portal.dto.EmployeeComuniVO;

/**
 * @author User
 *
 */
public interface EmployeeComuniService {
	
	public void addemployeecommuni(EmployeeComuniVO employeeComuniVO);
	
	public void editbyempId(EmployeeComuniVO employeeComuniVO);

	public Optional<EmployeeComuniVO> getbyempId(long empId);
	
	public void deletebyempId(Long empId);
	
	public void editdatabyempId(EmployeeComuniVO employeeComuniVO);


}
