package com.erp.lt.portal2.Service.Impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.erp.lt.portal2.Repository.EmployeeInfoRepository;
import com.erp.lt.portal2.Service.EmployeeInfoService;
import com.erp.lt.portal2.VO.EmployeeInfoVo;
@Service
public class EmployeeInfoServiceImpl implements EmployeeInfoService {

	@Autowired
	EmployeeInfoRepository employeeInfoRepository;

	@Override
	public void addEmployeeInfo(EmployeeInfoVo employeeInfoVO) {
		employeeInfoRepository.save(employeeInfoVO);

	}

	@Override
	public void editEmployeeInfo(EmployeeInfoVo employeeInfoVO) {
		employeeInfoRepository.save(employeeInfoVO);

	}

	@Override
	public Optional<EmployeeInfoVo> getEmployeeInfoByEmpId(int employeeCode) {
		Optional<EmployeeInfoVo> optional = employeeInfoRepository.findById(employeeCode);
		return optional;
	}

	@Override
	public void deleteEmployeeInfo(int employeeCode) {
		employeeInfoRepository.deleteById(employeeCode);

	}

	@Override
	public List<EmployeeInfoVo> getAllEmployeeInfo(EmployeeInfoVo employeeInfoVO) {
		List<EmployeeInfoVo> optional = employeeInfoRepository.findAll();
		return optional;

	}
}
