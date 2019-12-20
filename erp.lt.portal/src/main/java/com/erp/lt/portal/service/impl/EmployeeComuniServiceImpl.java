/**
 * 
 */
package com.erp.lt.portal.service.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.erp.lt.portal.dto.EmployeeComuniVO;
import com.erp.lt.portal.repository.EmployeeComuniRepository;
import com.erp.lt.portal.service.EmployeeComuniService;


/**
 * @author User
 *
 */
@Service
public class EmployeeComuniServiceImpl implements EmployeeComuniService {
	
	@Autowired
	EmployeeComuniRepository employeeComuniRepository;

	@Override
	public void addemployeecommuni(EmployeeComuniVO employeeComuniVO) {
		employeeComuniRepository.save(employeeComuniVO);

	}

	@Override
	public void editbyempId(EmployeeComuniVO employeeComuniVO) {

		employeeComuniRepository.save( employeeComuniVO);
	}

	@Override
	public Optional<EmployeeComuniVO> getbyempId(long empId) {
	Optional<EmployeeComuniVO> employeecommunidto=employeeComuniRepository.findById(empId);
	return employeecommunidto ;
	}



	@Override
	public void deletebyempId(Long empId)
	{
		employeeComuniRepository.deleteById(empId);

	}
	@Override
	public void editdatabyempId(EmployeeComuniVO employeeComuniVO) {

		employeeComuniRepository.save( employeeComuniVO);
	}


}
