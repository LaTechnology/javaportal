package com.erp.lt.portal.service.impl;

//import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.erp.lt.portal.model.AddressType;
import com.erp.lt.portal.model.DesignationType;
import com.erp.lt.portal.model.EmployeeAddress;
import com.erp.lt.portal.model.EmployeeInfo;
import com.erp.lt.portal.model.EmployementHistory;
import com.erp.lt.portal.repository.EmployeeAddressRepository;
import com.erp.lt.portal.repository.EmployeeAddressTypeRepository;
import com.erp.lt.portal.repository.EmployeeDesignationRepository;
import com.erp.lt.portal.repository.EmployeeHistoryRepository;
import com.erp.lt.portal.repository.EmployeeInfoRepository;
import com.erp.lt.portal.service.EmployeeHistoryService;
import com.erp.lt.portal.vo.EmployeeAddressVO;
import com.erp.lt.portal.vo.EmployeeHistoryVO;

import javassist.NotFoundException;

@Service
public class EmployeeHistoryServiceImpl implements EmployeeHistoryService {
	@Autowired
	EmployeeHistoryRepository employeeHistoryRepository;
	@Autowired
	EmployeeDesignationRepository employeeDesignationRepository;
	@Autowired
	EmployeeAddressRepository employeeAddressRepository;
	@Autowired
	EmployeeInfoRepository employeeInfoRespository;
	@Autowired
	EmployeeAddressTypeRepository employeeAddressTypeRepository;

	@Override
	public void addEmployeeHistory(EmployeeHistoryVO employeeHistoryVO) {
		EmployementHistory employementHistory = new EmployementHistory();
		Optional<EmployementHistory> empinfo = null;
		Optional<AddressType> addressType = employeeAddressTypeRepository
				.findById(employeeHistoryVO.getAddressTypeCode());
		Optional<DesignationType> designationType = employeeDesignationRepository
				.findById(employeeHistoryVO.getDesignationCode());

		if (employeeHistoryVO.getEmployeeCode() < 0) {
			empinfo = employeeHistoryRepository.findById(employeeHistoryVO.getEmployeeCode());
		}

		if (0 != employeeHistoryVO.getId()) {
			employementHistory.setId(employeeHistoryVO.getId());// 1
		}

		if (null != empinfo) {
			employementHistory.setEmployeeInfo(empinfo.get().getEmployeeInfo());// 8
		}
		if (null != employeeHistoryVO.getBeginDate()) {
			employementHistory.setBeginDate(employeeHistoryVO.getBeginDate());// 2
		}
		if (null != employeeHistoryVO.getEndDate()) {
			employeeHistoryVO.setEndDate(employeeHistoryVO.getEndDate());// 5
		}

		if (null != employeeHistoryVO.getCtc()) {
			employementHistory.setCtc(employeeHistoryVO.getCtc());// 3
		}
		if (null != employeeHistoryVO.getEmployerName()) {
			employementHistory.setEmployerName(employeeHistoryVO.getEmployerName());// 4
		}

		if (null != employeeHistoryVO.getReference()) {
			employementHistory.setReference(employeeHistoryVO.getReference());// 6
		}
		if (addressType.isPresent()) {
			employementHistory.setAddressType(addressType.get());// 9
		}

		if (0 != employeeHistoryVO.getDesignationCode()) {
			employementHistory.setDesignationType(designationType.get());// 7
		}

		employeeHistoryRepository.save(employementHistory);

	}

	@Override
	public EmployeeHistoryVO getEmployeeHistory(int employeeCode) {
		EmployeeHistoryVO empvo = new EmployeeHistoryVO();
		EmployeeAddressVO employeeAddressVO = new EmployeeAddressVO();
		Optional<EmployementHistory> empDeatil = employeeHistoryRepository.findById(employeeCode);
		EmployementHistory emphistory = empDeatil.get();

		Optional<EmployeeAddress> empAddress = employeeAddressRepository.getEmployeeAddress(employeeCode);
		EmployeeAddress employeeAddress = empAddress.get();
		Optional<EmployeeInfo> empinfo = employeeInfoRespository.findById(employeeCode);

		if (null != emphistory) {

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
				empvo.setEmployeeCode(emphistory.getEmployeeInfo().getemployeeCode());
			}

			if (null != emphistory.getEmployerName()) {
				empvo.setEmployerName(emphistory.getEmployerName());
			}

			if (null != emphistory.getEndDate()) {
				empvo.setEndDate(emphistory.getEndDate());
			}

			if (null != emphistory.getReference()) {
				empvo.setReference(emphistory.getReference());
			}
			if (0 != emphistory.getDesignationType().getCode()) {
				empvo.setDesignationCode(emphistory.getDesignationType().getCode());
			}

			if (null != employeeAddress.getAddressLine1()) {
				empvo.setAddressLine1(employeeAddress.getAddressLine1());
			}
			if (null != employeeAddress.getAddressLine2()) {
				empvo.setAddressLine2(employeeAddressVO.getAddressline2());
			}
			if (null != employeeAddress.getCity()) {
				empvo.setCity(employeeAddressVO.getCity());
			}
			if (null != employeeAddress.getCountry()) {
				empvo.setCountry(employeeAddressVO.getCountry());
			}
			if (null != employeeAddress.getPincode()) {
				empvo.setPincode(employeeAddress.getPincode());
			}
			if (null != employeeAddress.getState()) {
				empvo.setState(employeeAddress.getState());
			}
			if (empinfo.isPresent())
				if (0 > empinfo.get().getemployeeCode()) {
					empvo.setEmployeeCode(empinfo.get().getemployeeCode());
				}

		}

		return empvo;
	}

	@Override
	public List<EmployementHistory> getAllEmployeeHistory() {

		List<EmployementHistory> employeHistry = employeeHistoryRepository.findAll();
		for (EmployementHistory empHis : employeHistry) {
			EmployeeHistoryVO empHisVO = new EmployeeHistoryVO();
			if (0 != empHis.getId()) {
				empHisVO.setId(empHis.getId());// 1
			}
			if (null != empHis.getBeginDate()) {
				empHisVO.setBeginDate(empHis.getBeginDate());// 2
			}
			if (null != empHis.getEndDate()) {
				empHisVO.setEndDate(empHis.getEndDate());// 5
			}
			if (null != empHis.getDesignationType()) {
				empHisVO.setDesignationCode(empHis.getDesignationType().getCode());// 8
			}
			if (null != empHis.getEmployerName()) {
				empHisVO.setEmployerName(empHis.getEmployerName());// 4
			}
			if (null != empHis.getReference()) {
				empHisVO.setReference(empHis.getReference());// 6
			}
			if (null != empHis.getEmployeeInfo()) {
				empHisVO.setEmployeeCode(empHis.getEmployeeInfo().getemployeeCode());// 7
			}

			if (0 < empHis.getAddressType().getAddressTypeCode()) {
				empHisVO.setAddressTypeCode(empHis.getAddressType().getAddressTypeCode());// 15
			}
		}
		return employeHistry;
	}

	public boolean editEmployeeHistory(EmployeeHistoryVO employeeHistoryVO) throws NotFoundException {
		EmployementHistory old = null;
		boolean status = false;

		Optional<AddressType> addressType = employeeAddressTypeRepository
				.findById(employeeHistoryVO.getAddressTypeCode());
		if (employeeHistoryVO.getEmployeeCode() <= 0) {
			throw new NotFoundException("Employee not found");
		}
		Optional<EmployementHistory> existEmployeeHist = employeeHistoryRepository
				.findById(employeeHistoryVO.getEmployeeCode());
		Optional<DesignationType> desType = null;
		Optional<EmployeeInfo> empinfo = employeeInfoRespository.findById(employeeHistoryVO.getEmployeeCode());
		if (employeeHistoryVO.getDesignationCode() != -1) {
			desType = employeeDesignationRepository.findById(employeeHistoryVO.getDesignationCode());
		}
		if (existEmployeeHist.isPresent()) {
			old = existEmployeeHist.get();
			old.setBeginDate(employeeHistoryVO.getBeginDate());// 2
			old.setEndDate(employeeHistoryVO.getEndDate());// 5
			old.setAddressType(addressType.get());// 15
			old.setCtc(employeeHistoryVO.getCtc());// 3
			old.setDesignationType(desType.get());// 8
			old.setEmployerName(employeeHistoryVO.getEmployerName());// 4
			old.setId(employeeHistoryVO.getId());// 1
			old.setReference(employeeHistoryVO.getReference());// 6
			old.setEmployeeInfo(empinfo.get());// 7

			status = true;
		}

		employeeHistoryRepository.save(old);
		return status;
	}

	@Override
	public void deleteEmployeeHistory(int employeeCode) {

		employeeHistoryRepository.deleteById(employeeCode);

	}
}
