package com.erp.lt.portal.service.impl;

//import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.erp.lt.portal.model.EmployeeInfo;
import com.erp.lt.portal.model.EmployementHistory;
import com.erp.lt.portal.repository.EmployeeHistoryRepository;
import com.erp.lt.portal.service.EmployeeHistoryService;
import com.erp.lt.portal.vo.EmployeeHistoryVO;

@Service
public class EmployeeHistoryServiceImpl implements EmployeeHistoryService {
	@Autowired
	EmployeeHistoryRepository employeeHistoryRepository;

	@Override
	public void addEmployeeHistory(EmployeeHistoryVO employeeHistoryVO) {
		EmployementHistory employementHistory = new EmployementHistory();

		if (0 != employeeHistoryVO.getId()) {
			employementHistory.setId(employeeHistoryVO.getId());
		}

		if (0 != employeeHistoryVO.getAddressAddressCode()) {
			employementHistory.setAddressAddressCode(employeeHistoryVO.getAddressAddressCode());
		}
		if(null!=employementHistory.getEmployeeInfo()) {
			employeeHistoryVO.setEmployeeCode(""+employementHistory.getEmployeeInfo().getEmployeeCode());
		}
	
		if (null != employeeHistoryVO.getBeginDate()) {
			employementHistory.setBeginDate(employeeHistoryVO.getBeginDate());
		}
		if (null != employeeHistoryVO.getEndDate()) {
			employeeHistoryVO.setEndDate(employeeHistoryVO.getEndDate());
		}

		if (null != employeeHistoryVO.getCtc()) {
			employementHistory.setCtc(employeeHistoryVO.getCtc());
		}
		if (null != employeeHistoryVO.getEmployerNmae()) {
			employementHistory.setEmployerNmae(employeeHistoryVO.getEmployerNmae());
		}

		if (null != employeeHistoryVO.getReference()) {
			employementHistory.setReference(employeeHistoryVO.getReference());
		}

	}

	@Override
	public void editEmployeeHistory(EmployementHistory employeeHistoryVO) {

		employeeHistoryRepository.save(employeeHistoryVO);

	}

	@Override
	public void deleteEmployeeHistory(int employeeCode) {

		employeeHistoryRepository.deleteById(employeeCode);

	}

	@Override
	public List<EmployementHistory> getAllEmployeeHistory(EmployementHistory employementHistory) {

		return null;
	}

	@Override
	public EmployeeHistoryVO getEmployeeHistory(int employeeCode) {
		EmployeeHistoryVO empvo = new EmployeeHistoryVO();
		Optional<EmployementHistory> empDeatil = employeeHistoryRepository.findById(employeeCode);
		EmployementHistory emphistory = empDeatil.get();
		if (null != emphistory) {
			if (0 != emphistory.getAddressAddressCode()) {
				empvo.setAddressAddressCode(emphistory.getAddressAddressCode());
			}

			if (0 != emphistory.getId()) {
				empvo.setId(emphistory.getId());
			}

			if (null != emphistory.getBeginDate()) {
				empvo.setBeginDate(emphistory.getBeginDate());
			}

			if (null != emphistory.getCtc()) {
				empvo.setCtc(emphistory.getCtc());
			}
			if (0 != emphistory.getDesignationType().getCode()) {
				empvo.setDesignationCode(emphistory.getDesignationType().getCode());
			}

			if (null != emphistory.getEmployeeInfo()) {
				empvo.setEmployeeCode(""+emphistory.getEmployeeInfo().getEmployeeCode());
			}

			if (null != emphistory.getEmployerNmae()) {
				empvo.setEmployerNmae(emphistory.getEmployerNmae());
			}

			if (null != emphistory.getEndDate()) {
				empvo.setEndDate(emphistory.getEndDate());
			}

			if (null != emphistory.getReference()) {
				empvo.setReference(emphistory.getReference());
			}

		}

		return empvo;
	}

}
