/**
 * 
 */
package com.erp.lt.portal.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.erp.lt.portal.model.EmployeeInfo;
import com.erp.lt.portal.model.GenderType;
import com.erp.lt.portal.model.LoginDetails;
import com.erp.lt.portal.model.MaritalStatus;
import com.erp.lt.portal.repository.EmployeeInfoRepository;
import com.erp.lt.portal.repository.GenderTypeRepository;
import com.erp.lt.portal.repository.MaritalStatusRepository;
import com.erp.lt.portal.service.EmployeeInfoService;
import com.erp.lt.portal.vo.EmployeeInfoVO;

import javassist.NotFoundException;

@Service
public class EmployeeInfoServiceImpl implements EmployeeInfoService {
	@Autowired
	EmployeeInfoRepository employeeInfoRepository;
	@Autowired
	GenderTypeRepository genderTypeRepository;
	@Autowired
	MaritalStatusRepository maritalStatusRepository;

	@Override
	public void addEmployeeInfo(EmployeeInfoVO employeeInfoVO) {
		EmployeeInfo empinfo = new EmployeeInfo();
		LoginDetails loginDetails = new LoginDetails();
		Optional<GenderType> genderType = null;
		Optional<MaritalStatus> maritalStatusOptional = null;
		if (employeeInfoVO.getGenderCode() > 0) {
			genderType = genderTypeRepository.findById(employeeInfoVO.getGenderCode());
		}
		if (employeeInfoVO.getMaritalStatusCode() > 0) {
			maritalStatusOptional = maritalStatusRepository.findById(employeeInfoVO.getMaritalStatusCode());
		}
		if (null != employeeInfoVO.getEmployeeCode()) {
			empinfo.setemployeeCode(getEmployeeCode());

		}

		if (null != employeeInfoVO.getFirstname()) {
			empinfo.setFirstname(employeeInfoVO.getFirstname());
		}
		if (null != employeeInfoVO.getCitizen()) {
			empinfo.setCitizen(employeeInfoVO.getCitizen());
		}

		if (null != employeeInfoVO.getCountryofbirth()) {
			empinfo.setCountryofbirth(employeeInfoVO.getCountryofbirth());
		}
		if (null != employeeInfoVO.getNationality()) {
			empinfo.setNationality(employeeInfoVO.getNationality());
		}
		if (null != employeeInfoVO.getDob()) {
			empinfo.setDob(employeeInfoVO.getDob());
		}
		if (null != employeeInfoVO.getStateofbirth()) {
			empinfo.setStateofbirth(employeeInfoVO.getStateofbirth());
		}
		if (null != genderType) {
			empinfo.setGenderType(genderType.get());
		}
		if (null != employeeInfoVO.getMarriageDate()) {
			empinfo.setMarriageDate(employeeInfoVO.getMarriageDate());
		}	
		if (0 != employeeInfoVO.getStatus()) {
			empinfo.setStatus(employeeInfoVO.getStatus());
		}
		if (null != employeeInfoVO.getLastName()) {
			empinfo.setLastname(employeeInfoVO.getLastName());
		}
		if (null != employeeInfoVO.getEmailId()) {
			empinfo.setLoginEmailId(employeeInfoVO.getEmailId());
		}

		if (null != maritalStatusOptional) {
			empinfo.setMaritalStatus(maritalStatusOptional.get());
		}
		if (null != employeeInfoVO.getEmployeePrefix()) {
			empinfo.setEmployeePrefix(employeeInfoVO.getEmployeePrefix());
		}
		employeeInfoRepository.save(empinfo);
		
		
		
		
	}

	 @Override
	public boolean editEmployeeInfo(EmployeeInfoVO modified) throws NotFoundException {

		EmployeeInfo old = null;
		boolean status = false;

		Optional<EmployeeInfo> eixstingEmployeeInfo = employeeInfoRepository
				.getEmployeeInfo(Integer.parseInt(modified.getEmployeeCode()));
		Optional<GenderType> genderType = null;
		Optional<MaritalStatus> maritalStatusOptional = null;
		if (modified.getGenderCode() != -1) {
			genderType = genderTypeRepository.findById(modified.getGenderCode());
		}
		if (modified.getMaritalStatusCode() != -1) {
			maritalStatusOptional = maritalStatusRepository.findById(modified.getMaritalStatusCode());
		}
		if (eixstingEmployeeInfo.isPresent()) {
			old = eixstingEmployeeInfo.get();
			old.setCitizen(modified.getCitizen());
			old.setFirstname(modified.getFirstname());
			old.setCountryofbirth(modified.getCountryofbirth());
			old.setDob(modified.getDob());
			
			old.setNationality(modified.getNationality());
			old.setMarriageDate(modified.getMarriageDate());
			old.setStateofbirth(modified.getStateofbirth());
			old.setStatus(modified.getStatus());
			old.setMaritalStatus(maritalStatusOptional.get());
			old.setGenderType(genderType.get());
			old.setEmployeePrefix(modified.getEmployeePrefix());
			old.setLoginEmailId(modified.getEmailId());
			 old.setLastname(modified.getLastName());
		}
		employeeInfoRepository.save(old);
		status = true;

		return status;

	}

	@Override
	public EmployeeInfoVO getEmployeeInfoByEmpId(int employeeCode) {
		EmployeeInfoVO empInfoVo = new EmployeeInfoVO();
		Optional<EmployeeInfo> optional = employeeInfoRepository.getEmployeeInfo(employeeCode);
		EmployeeInfo employeeInfo = optional.get();
		if (null != employeeInfo) {
			if (0 < employeeInfo.getemployeeCode()) {
				empInfoVo.setEmployeeCode(String.valueOf(employeeInfo.getemployeeCode()));
				
			}
			if (null != employeeInfo.getFirstname()) {
				empInfoVo.setFirstname(employeeInfo.getFirstname());
			}
			if (null != employeeInfo.getCitizen()) {
				empInfoVo.setCitizen(employeeInfo.getCitizen());
			}

			if (null != employeeInfo.getCountryofbirth()) {
				empInfoVo.setCountryofbirth(employeeInfo.getCountryofbirth());
			}
			if (null != employeeInfo.getNationality()) {
				empInfoVo.setNationality(employeeInfo.getNationality());
			}
			if (null != employeeInfo.getDob()) {
				empInfoVo.setDob(employeeInfo.getDob());
			}
			if (null != employeeInfo.getStateofbirth()) {
				empInfoVo.setStateofbirth(employeeInfo.getStateofbirth());
			}
			if (0 != employeeInfo.getGenderType().getCode()) {
				empInfoVo.setGenderCode(employeeInfo.getGenderType().getCode());
			}
			if (0 != employeeInfo.getMaritalStatus().getCode()) {
				empInfoVo.setMaritalStatusCode(employeeInfo.getMaritalStatus().getCode());
			}
			if (null != employeeInfo.getMarriageDate()) {
				empInfoVo.setMarriageDate(employeeInfo.getMarriageDate());
			}
			if (0 != employeeInfo.getStatus()) {
				empInfoVo.setStatus(employeeInfo.getStatus());
			}
			if (null != employeeInfo.getEmployeePrefix()) {
				empInfoVo.setEmployeePrefix(employeeInfo.getEmployeePrefix());
			}
			if (null != employeeInfo.getLoginEmailId()) {
				empInfoVo.setEmailId(employeeInfo.getLoginEmailId());
			}
			if (null != employeeInfo.getLastname()) {
				empInfoVo.setLastName(employeeInfo.getLastname());
			}
			
		
		}
		return empInfoVo;

	}

	@Override
	public List<EmployeeInfoVO> getAllEmployeeInfo() {
		List<EmployeeInfo> employeeInfos = employeeInfoRepository.findAll();
		List<EmployeeInfoVO> infoVOs = new ArrayList<>();
		for (EmployeeInfo empInfo : employeeInfos) {
			EmployeeInfoVO infoVO = new EmployeeInfoVO();
			if (0 < empInfo.getemployeeCode()) {
				infoVO.setEmployeeCode(String.valueOf(empInfo.getemployeeCode()));
			}
			if (null != empInfo.getFirstname()) {
				infoVO.setFirstname(empInfo.getFirstname());
			}
			if (null != empInfo.getCitizen()) {
				infoVO.setCitizen(empInfo.getCitizen());
			}

			if (null != empInfo.getCountryofbirth()) {
				infoVO.setCountryofbirth(empInfo.getCountryofbirth());
			}
			if (null != empInfo.getNationality()) {
				infoVO.setNationality(empInfo.getNationality());
			}
			if (null != empInfo.getDob()) {
				infoVO.setDob(empInfo.getDob());
			}
			if (null != empInfo.getStateofbirth()) {
				infoVO.setStateofbirth(empInfo.getStateofbirth());
			}
			if (0 != empInfo.getGenderType().getCode()) {
				infoVO.setGenderCode(empInfo.getGenderType().getCode());
			}
			if (0 != empInfo.getMaritalStatus().getCode()) {
				infoVO.setMaritalStatusCode(empInfo.getMaritalStatus().getCode());
			}
			if (null != empInfo.getMarriageDate()) {
				infoVO.setMarriageDate(empInfo.getMarriageDate());
			}
			if (0 != empInfo.getStatus()) {
				infoVO.setStatus(empInfo.getStatus());
			}
			if (null != empInfo.getEmployeePrefix()) {
				infoVO.setEmployeePrefix(empInfo.getEmployeePrefix());
			}
			if (null != empInfo.getLoginEmailId()) {
				infoVO.setEmailId(empInfo.getLoginEmailId());
			}
			if (null != empInfo.getLastname()) {
				infoVO.setLastName(empInfo.getLastname());
			}
			infoVOs.add(infoVO);
		}
		return infoVOs;
	}

	@Override
	public boolean patchEmployeeInfo(EmployeeInfoVO employeeInfoVo) throws NotFoundException {
		EmployeeInfo old = null;
		boolean status = false;
		Optional<EmployeeInfo> eixstingEmployeeInfo = employeeInfoRepository
				.findById(Integer.parseInt(employeeInfoVo.getEmployeeCode()));
		Optional<GenderType> genderType = null;
		Optional<MaritalStatus> maritalStatusOptional = null;
		if (employeeInfoVo.getGenderCode() != -1) {
			genderType = genderTypeRepository.findById(employeeInfoVo.getGenderCode());
		}
		if (employeeInfoVo.getMaritalStatusCode() != -1) {
			maritalStatusOptional = maritalStatusRepository.findById(employeeInfoVo.getMaritalStatusCode());
		}
		if (eixstingEmployeeInfo.isPresent()) {
			old = eixstingEmployeeInfo.get();
			old.setCitizen(employeeInfoVo.getCitizen());
			old.setFirstname(employeeInfoVo.getFirstname());
			old.setCountryofbirth(employeeInfoVo.getCountryofbirth());
			old.setDob(employeeInfoVo.getDob());
			old.setEmployeePrefix(employeeInfoVo.getEmployeePrefix());
			old.setLoginEmailId(employeeInfoVo.getEmailId());
			 old.setLastname(employeeInfoVo.getLastName());
			 old.setStatus(employeeInfoVo.getStatus());
			old.setNationality(employeeInfoVo.getNationality());
			old.setMarriageDate(employeeInfoVo.getMarriageDate());
			old.setStateofbirth(employeeInfoVo.getStateofbirth());
			old.setStatus(employeeInfoVo.getStatus());
			old.setMaritalStatus(maritalStatusOptional.get());
			old.setGenderType(genderType.get());
		}
		employeeInfoRepository.save(old);
		status = true;

		return status;

	}

	@Override
	public int getEmployeeCode() {
		
		return employeeInfoRepository.getEmployeeCode()+1;
	}
}
