package com.erp.lt.portal.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.apache.solr.common.StringUtils;
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
import com.erp.lt.portal.service.EmployeeAddressService;
import com.erp.lt.portal.service.EmployeeHistoryService;
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
	@Autowired
	EmployeeAddressService employeeAddressService;

	@Override
	public void addEmployeeHistory(EmployeeHistoryVO employeeHistoryVO) {
		EmployementHistory employementHistory = new EmployementHistory();
		Optional<AddressType> addressType = employeeAddressTypeRepository
				.findById(employeeHistoryVO.getAddressTypeCode());
		Optional<DesignationType> designationType = employeeDesignationRepository
				.findById(employeeHistoryVO.getDesignationCode());
		EmployeeAddress employeeAddress = new EmployeeAddress();

		Optional<EmployeeInfo> employeeInfo = employeeInfoRespository.findById(employeeHistoryVO.getEmployeeCode());

		employeeHistoryRepository.findById(employeeHistoryVO.getEmployeeCode());

		if (0 != employeeHistoryVO.getId()) {
			employementHistory.setId(employeeHistoryVO.getId());
		}

		if (null != employeeInfo) {
			employementHistory.setEmployeeInfo(employeeInfo.get());
		}
		if (null != employeeHistoryVO.getBeginDate()) {
			employementHistory.setBeginDate(employeeHistoryVO.getBeginDate());
		}
		if (null != employeeHistoryVO.getEndDate()) {
			employementHistory.setEndDate(employeeHistoryVO.getEndDate());
		}

		if (null != employeeHistoryVO.getCtc()) {
			employementHistory.setCtc(employeeHistoryVO.getCtc());
		}
		if (null != employeeHistoryVO.getEmployerName()) {
			employementHistory.setEmployerName(employeeHistoryVO.getEmployerName());
		}

		if (null != employeeHistoryVO.getReference()) {
			employementHistory.setReference(employeeHistoryVO.getReference());
		}
		if (addressType.isPresent()) {
			employementHistory.setAddressType(addressType.get());
		}

		if (0 != employeeHistoryVO.getDesignationCode()) {
			employementHistory.setDesignationType(designationType.get());
		}
		employementHistory.setStatus(1);

		employeeHistoryRepository.save(employementHistory);

		if (employeeHistoryVO.getEmployeeCode() != 0 && employeeHistoryVO.getAddressTypeCode() == 5) {

			employeeAddress.setAddressLine1(employeeHistoryVO.getAddressLine1());

			employeeAddress.setAddressLine2(employeeHistoryVO.getAddressLine2());

			employeeAddress.setBeginDate(employeeHistoryVO.getBeginDate());

			employeeAddress.setEndDate(employeeHistoryVO.getEndDate());

			employeeAddress.setCity(employeeHistoryVO.getCity());

			employeeAddress.setCountry(employeeHistoryVO.getCountry());

			employeeAddress.setState(employeeHistoryVO.getState());

			employeeAddress.setAddressType(addressType.get());

			employeeAddress.setPincode(employeeHistoryVO.getPincode());

			employeeAddress.setEmployementHistory(employementHistory);

			employeeAddress.setEmployeeInfo(employeeInfo.get());

			employeeAddress.setStatus(1);

			employeeAddressRepository.save(employeeAddress);

		}

	}

	@Override
	public List<EmployeeHistoryVO> getEmployeeHistory(int employeeCode) {
		List<EmployeeHistoryVO> employeeHistoryVOs = new ArrayList<EmployeeHistoryVO>();

		EmployeeHistoryVO empvo = null;
		List<EmployementHistory> empDeatils = employeeHistoryRepository.getEmployementHistory(employeeCode);
		List<EmployeeAddress> employeeAddress = null;

		Optional<EmployeeInfo> empinfo = employeeInfoRespository.findById(employeeCode);
		for (EmployementHistory empDeatil : empDeatils) {
			empvo = new EmployeeHistoryVO();
			if (null != empDeatil) {

				if (0 != empDeatil.getId()) {
					empvo.setId(empDeatil.getId());
				}

				if (null != empDeatil.getBeginDate()) {
					empvo.setBeginDate(empDeatil.getBeginDate());
				}

				if (null != empDeatil.getCtc()) {
					empvo.setCtc(empDeatil.getCtc());
				}

				if (0 != empDeatil.getDesignationType().getCode()) {
					empvo.setDesignationCode(empDeatil.getDesignationType().getCode());
				}

				if (null != empDeatil.getEmployeeInfo()) {
					empvo.setEmployeeCode(empDeatil.getEmployeeInfo().getemployeeCode());
				}

				if (null != empDeatil.getEmployerName()) {
					empvo.setEmployerName(empDeatil.getEmployerName());
				}

				if (null != empDeatil.getEndDate()) {
					empvo.setEndDate(empDeatil.getEndDate());
				}

				if (null != empDeatil.getReference()) {
					empvo.setReference(empDeatil.getReference());
				}
				if (0 != empDeatil.getDesignationType().getCode()) {
					empvo.setDesignationCode(empDeatil.getDesignationType().getCode());
				}
				if (empDeatil.getStatus() == 1 || empDeatil.getStatus() == 0) {
					empvo.setStatus(empDeatil.getStatus());
				}
			}
			employeeAddress = employeeAddressRepository
					.getEmployeeAddressHistory(empDeatil.getEmployeeInfo().getemployeeCode(), empDeatil.getId());
			for (EmployeeAddress address : employeeAddress) {
				if (null != address.getAddressLine1()) {
					empvo.setAddressLine1(address.getAddressLine1());
				}
				if (null != address.getAddressLine2()) {
					empvo.setAddressLine2(address.getAddressLine2());
				}
				if (null != address.getCity()) {
					empvo.setCity(address.getCity());
				}
				if (null != address.getCountry()) {
					empvo.setCountry(address.getCountry());
				}
				if (null != address.getPincode()) {
					empvo.setPincode(address.getPincode());
				}
				if (null != address.getState()) {
					empvo.setState(address.getState());
				}
				if (empinfo.isPresent())
					if (0 > empinfo.get().getemployeeCode()) {
						empvo.setEmployeeCode(empinfo.get().getemployeeCode());
					}
				if (address != null) {
					empvo.setAddressTypeCode(address.getAddressType().getAddressTypeCode());
				}
				break;
			}
			employeeHistoryVOs.add(empvo);
		}

		return employeeHistoryVOs;

	}

	public boolean editEmployeeHistory(EmployeeHistoryVO employeeHistoryVO) throws NotFoundException {
		EmployementHistory old = null;
		boolean status = false;
		EmployeeAddress employeeAddress = new EmployeeAddress();
		Optional<AddressType> addressType = employeeAddressTypeRepository
				.findById(employeeHistoryVO.getAddressTypeCode());
		if (employeeHistoryVO.getEmployeeCode() <= 0) {
			throw new NotFoundException("Employee not found");
		}
		EmployementHistory existEmployeeHist = employeeHistoryRepository
				.editEmployeeHistoryByEmpIdAndOrgId(employeeHistoryVO.getEmployeeCode(), employeeHistoryVO.getId());
		Optional<DesignationType> desType = null;
		Optional<EmployeeInfo> empinfo = employeeInfoRespository.findById(employeeHistoryVO.getEmployeeCode());
		if (employeeHistoryVO.getDesignationCode() > 0) {
			desType = employeeDesignationRepository.findById(employeeHistoryVO.getDesignationCode());
		}
		if (null != existEmployeeHist) {
			old = existEmployeeHist;
			old.setBeginDate(employeeHistoryVO.getBeginDate());
			old.setEndDate(employeeHistoryVO.getEndDate());
			old.setAddressType(addressType.get());
			old.setCtc(employeeHistoryVO.getCtc());
			old.setDesignationType(desType.get());
			old.setEmployerName(employeeHistoryVO.getEmployerName());
			old.setId(employeeHistoryVO.getId());
			old.setReference(employeeHistoryVO.getReference());
			old.setEmployeeInfo(empinfo.get());

			employeeHistoryRepository.save(old);

			if (employeeHistoryVO.getEmployeeCode() != 0 && employeeHistoryVO.getId() != 0
					&& employeeHistoryVO.getAddressTypeCode() == 5) {

				EmployeeAddress existingaddress = employeeAddressRepository.editEmployeeHistoryByEmpIdAndOrgId(
						employeeHistoryVO.getEmployeeCode(), employeeHistoryVO.getId());
				employeeAddress = existingaddress;

				employeeAddress.setAddressLine1(employeeHistoryVO.getAddressLine1());

				employeeAddress.setAddressLine2(employeeHistoryVO.getAddressLine2());

				employeeAddress.setBeginDate(employeeHistoryVO.getBeginDate());

				employeeAddress.setEndDate(employeeHistoryVO.getEndDate());

				employeeAddress.setCity(employeeHistoryVO.getCity());

				employeeAddress.setCountry(employeeHistoryVO.getCountry());

				employeeAddress.setState(employeeHistoryVO.getState());

				employeeAddress.setAddressType(addressType.get());

				employeeAddress.setPincode(employeeHistoryVO.getPincode());

				employeeAddress.setEmployementHistory(old);

				employeeAddress.setEmployeeInfo(empinfo.get());

				employeeAddressRepository.save(employeeAddress);
				status = true;
			}

		}

		return status;
	}

	@Override
	public void deleteEmployeeHistory(int employeeCode) {
		int status = 0;
		employeeHistoryRepository.softDeleteByEmpID(employeeCode, status);

		employeeAddressRepository.softDeleteByEmpID(employeeCode, status);

	}
}
