/**
 * 
 */
package com.erp.lt.portal.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.erp.lt.portal.dto.EmpAddressVO;
import com.erp.lt.portal.repository.EmpAddressRepository;
import com.erp.lt.portal.service.EmpAddressService;

/**
 * @author User
 *
 */
@Service
public class EmpAddressServiceImpl implements EmpAddressService {
	
	@Autowired
	EmpAddressRepository empaddressrepository;

	@Override
	public void addemployeeaddress(EmpAddressVO empaddressVO) {

		empaddressrepository.save(empaddressVO);

	}

	@Override
	public Optional<EmpAddressVO> getEmpAddress(int Emp_Address_id) {

		Optional<EmpAddressVO> empaddressVO = empaddressrepository.findById(Emp_Address_id);

		return empaddressVO;
	}

	@Override
	public void editemployeeaddress(EmpAddressVO empaddressVO) {
		empaddressrepository.save(empaddressVO);
	}

	@Override
	public void deleteemployeeaddress(int empAddressid) {
		empaddressrepository.deleteById(empAddressid);
	}

	@Override
	public List<EmpAddressVO> getallEmpAddress(EmpAddressVO empAddressVO) {
		List<EmpAddressVO> list = empaddressrepository.findAll();
		return list;

	}

}
