/**
 * 
 */
package com.erp.lt.portal.service.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.erp.lt.portal.dto.PreviousEmployeeVO;
import com.erp.lt.portal.repository.PreviousEmployeeRepository;
import com.erp.lt.portal.service.PreviousEmployerService;

/**
 * @author User
 *
 */
@Service
public class PreviousEmployerServiceImpl implements PreviousEmployerService {

	 @Autowired
	 PreviousEmployeeRepository previousEmployeeRepository;
	 @Override
	 public void addPreviousEmpDetail(PreviousEmployeeVO previousEmployeeVO) {
		 previousEmployeeRepository.save(previousEmployeeVO);

	 }

	 @Override
	 public void editPreviousEmpDetail(PreviousEmployeeVO previousEmployeeVO) {
		 previousEmployeeRepository.save(previousEmployeeVO);


	 }

	 @Override
	 public void deletePreviousEmpDetail(Long empid) {
		 previousEmployeeRepository.deleteById(empid);

	 }

	 @Override
	 public Optional<PreviousEmployeeVO> getPreviousEmpDetail(Long empid) {
	 Optional<PreviousEmployeeVO> optional=previousEmployeeRepository.findById(empid);
	 return optional;
	 }

}
