package com.erp.lt.portal.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.erp.lt.portal.model.EducationDetail;
import com.erp.lt.portal.model.Educationboard;
import com.erp.lt.portal.model.Educationtype;
import com.erp.lt.portal.model.EmployeeInfo;
import com.erp.lt.portal.repository.EducationBoardRepository;
import com.erp.lt.portal.repository.EducationRepository;
import com.erp.lt.portal.repository.EducationTypeRepository;
import com.erp.lt.portal.repository.EmployeeInfoRepository;
import com.erp.lt.portal.service.EducationService;
import com.erp.lt.portal.vo.EducationDetailsVO;

import javassist.NotFoundException;

@Service
public class EducationServiceImpl implements EducationService {

	@Autowired
	EducationRepository educationrepository;

	@Autowired
	EducationTypeRepository educationTypeRepository;

	@Autowired
	EducationBoardRepository educationBoardRepository;

	@Autowired
	EmployeeInfoRepository employeeinforepo;

	@Override
	public void deleteEmployeeEducation(int eduId) {
		if (eduId != 0) {
			educationrepository.deleteById(eduId);
		}

	}

	@Override
	public List<EducationDetailsVO> getEmployeeEducationDetail(int empId) {
		EducationDetailsVO detailsVO = null;
		List<EducationDetailsVO> educationDetailList = new ArrayList<EducationDetailsVO>();
		List<EducationDetail> educationDetails = educationrepository.getEducationDetail(empId);
		for (EducationDetail entity : educationDetails) {
			detailsVO = new EducationDetailsVO();
			if (0 != entity.getEducationId()) {
				detailsVO.setEducationId(entity.getEducationId());
			}
			if (null != entity.getAdditionalCertification()) {
				detailsVO.setAdditionalCertification(entity.getAdditionalCertification());
			}

			if (null != entity.getCgpa()) {
				detailsVO.setCgpa(entity.getCgpa());
			}
			if (null != entity.getBeginDate()) {
				detailsVO.setBeginDate(entity.getBeginDate());
			}
			if (null != entity.getEndDate()) {
				detailsVO.setEndDate(entity.getEndDate());
			}
			if (null != entity.getInstituteName()) {
				detailsVO.setInstituteName(entity.getInstituteName());
			}

			if (null != entity.getUniversityName()) {
				detailsVO.setUniversityName(entity.getUniversityName());
			}

			if (0 != entity.getEducationtype().getCode()) {
				detailsVO.setEducationTypecode(entity.getEducationtype().getCode());
			}

			if (0 != entity.getEducationboard().getCode()) {
				detailsVO.setEducationBoardCode(entity.getEducationboard().getCode());
			}

			if (null != entity.getEmployeeInfo()) {
				detailsVO.setEmployeecode(entity.getEmployeeInfo().getemployeeCode());
			}
			educationDetailList.add(detailsVO);
		}
		return educationDetailList;
	}

	@Override
	public boolean editEmployeeEducation(EducationDetailsVO detailsVO) throws NotFoundException {
		EducationDetail old = null;
		boolean status = false;

		Optional<EducationDetail> exisitingEducationDetails = educationrepository.findById(detailsVO.getEducationId());
		Optional<Educationtype> EducationType = null;
		Optional<Educationboard> EducationBoard = null;

		if (detailsVO.getEducationBoardCode() != -1) {
			EducationBoard = educationBoardRepository.findById(detailsVO.getEducationBoardCode());
		}
		if (detailsVO.getEducationTypecode() != -1) {
			EducationType = educationTypeRepository.findById(detailsVO.getEducationTypecode());
		}

		if (detailsVO.getEducationId() <= 0) {
			throw new NotFoundException("Employee not founded");
		}
		if (exisitingEducationDetails.isPresent()) {
			old = exisitingEducationDetails.get();
			old.setAdditionalCertification(detailsVO.getAdditionalCertification());
			old.setBeginDate(detailsVO.getBeginDate());
			old.setCgpa(detailsVO.getCgpa());
			old.setInstituteName(detailsVO.getInstituteName());
			old.setUniversityName(detailsVO.getUniversityName());
			old.setEndDate(detailsVO.getEndDate());
			old.setEducationboard(EducationBoard.get());
			old.setEducationtype(EducationType.get());
		}

		educationrepository.save(old);
		status = true;
		if (!exisitingEducationDetails.isPresent()) {
			throw new NotFoundException("Employee not found");
		}
		return status;

	}

	@Override
	public void addemployeeEducation(EducationDetailsVO detailsVO) {
		EducationDetail detail = new EducationDetail();
		Optional<Educationtype> EducationType = null;
		Optional<Educationboard> EducationBoard = null;
		Optional<EmployeeInfo> employeeinfo = null;

		if (detailsVO.getEducationBoardCode() > 0) {
			EducationBoard = educationBoardRepository.findById(detailsVO.getEducationBoardCode());
		}
		if (detailsVO.getEducationTypecode() > 0) {
			EducationType = educationTypeRepository.findById(detailsVO.getEducationTypecode());
		}

		if (detailsVO.getEmployeecode() > 0) {
			employeeinfo = employeeinforepo.findById(detailsVO.getEmployeecode());
		}
		  
		
  		if (0 != detailsVO.getEducationId()) {
			detail.setEducationId(detailsVO.getEducationId());
		}
		if (null != detailsVO.getAdditionalCertification()) {
			detail.setAdditionalCertification(detailsVO.getAdditionalCertification());
		}

		if (null != detailsVO.getBeginDate()) {
			detail.setBeginDate(detailsVO.getBeginDate());
		}

		if (null != detailsVO.getCgpa()) {
			detail.setCgpa(detailsVO.getCgpa());
		}

		if (null != detailsVO.getEndDate()) {
			detail.setEndDate(detailsVO.getEndDate());
		}

		if (null != detailsVO.getInstituteName()) {
			detail.setInstituteName(detailsVO.getInstituteName());
		}

		if (null != detailsVO.getUniversityName()) {
			detail.setUniversityName(detailsVO.getUniversityName());
		}

		if (null != EducationType) {

			detail.setEducationtype(EducationType.get());
		}

		if (null != EducationBoard) {
			detail.setEducationboard(EducationBoard.get());
		}

		if (null != employeeinfo) {
			detail.setEmployeeInfo(employeeinfo.get());
		}

		educationrepository.save(detail);
	}

}
