/**
 * 
 */
package com.erp.lt.portal.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.erp.lt.portal.dto.EmployeeInfoVO;
import com.erp.lt.portal.repository.EmployeeInfoRepository;
import com.erp.lt.portal.service.EmployeeInfoService;

/**
 * @author User
 *
 */
@Service
public class EmployeeInfoServiceImpl implements EmployeeInfoService {

	@Autowired
	EmployeeInfoRepository employeeInfoRepository;

	@Override
	public void addEmployeeInfo(EmployeeInfoVO employeeInfoVO) {
	employeeInfoRepository.save(employeeInfoVO);

	}

	@Override
	public void editEmployeeInfo(EmployeeInfoVO employeeInfoVO) {
	employeeInfoRepository.save(employeeInfoVO);

	}

	@Override
	public Optional<EmployeeInfoVO> getEmployeeInfo(int empId) {
	Optional<EmployeeInfoVO> optional = employeeInfoRepository.findById(empId);
	return optional;
	}

	@Override
	public void deleteEmployeeInfo(int empId) {
	employeeInfoRepository.deleteById(empId);

	}

	@Override
	public List<EmployeeInfoVO> getAllEmployeeInfo(EmployeeInfoVO employeeInfoVO) {
	List<EmployeeInfoVO> optional = employeeInfoRepository.findAll();
	return optional;

	}
}
