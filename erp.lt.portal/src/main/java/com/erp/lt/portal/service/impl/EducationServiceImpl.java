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
	
	
	public List<EducationDetailsVO> getEducation(List<EducationDetail> educationDetails){
		EducationDetailsVO detailsVO = null; 
		List<EducationDetailsVO> educationDetailList = new ArrayList<EducationDetailsVO>();
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
				detailsVO.setEmployeecode(entity.getEmployeeInfo().getEmployeeCode());
			}
			if (entity.getStatus() == 1) {

				detailsVO.setStatus(entity.getStatus());
			}
			
			educationDetailList.add(detailsVO);
		}
		return educationDetailList ;
	}

	@Override
	public List<EducationDetailsVO> getEmployeeEducationDetail(int empId){
		List<EducationDetailsVO> educationDetailList = new ArrayList<EducationDetailsVO>();
		List<EducationDetail> educationDetails = educationrepository.getEducationDetail(empId);
		educationDetailList =getEducation(educationDetails);
		return educationDetailList;
	}

	@Override
	public boolean editEmployeeEducation(EducationDetailsVO detailsVO) throws NotFoundException {

		boolean status = false;

		EducationDetail old = educationrepository.editEmployeeByEmpIdAndEduId(detailsVO.getEmployeecode(),
				detailsVO.getEducationId());

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

		old.setAdditionalCertification(detailsVO.getAdditionalCertification());
		old.setBeginDate(detailsVO.getBeginDate());
		old.setCgpa(detailsVO.getCgpa());
		old.setInstituteName(detailsVO.getInstituteName());
		old.setUniversityName(detailsVO.getUniversityName());
		old.setEndDate(detailsVO.getEndDate());
		old.setEducationboard(EducationBoard.get());
		old.setEducationtype(EducationType.get());

		educationrepository.save(old);
		status = true;

		return status;
	}

	@Override
	public void addemployeeEducation(EducationDetailsVO detailsVO) {
		EducationDetail detail = new EducationDetail();
		Optional<Educationtype> educationType = null;
		Optional<Educationboard> educationBoard = null;
		Optional<EmployeeInfo> employeeinfo = null;

		if (detailsVO.getEducationBoardCode() > 0) {
			educationBoard = educationBoardRepository.findById(detailsVO.getEducationBoardCode());
		}
		if (detailsVO.getEducationTypecode() > 0) {
			educationType = educationTypeRepository.findById(detailsVO.getEducationTypecode());
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

		if (null != educationType) {

			detail.setEducationtype(educationType.get());
		}
		if (null != educationBoard) {
			detail.setEducationboard(educationBoard.get());
		}

		if (null != employeeinfo) {
			detail.setEmployeeInfo(employeeinfo.get());
		}
		detail.setStatus(1);
		educationrepository.save(detail);
	}

	@Override
	public List<EducationDetailsVO> deleteEmployeeEducation(int empId) {
		int status = 0;
		educationrepository.softDeleteByEmpId(empId, status);
		List<EducationDetailsVO> softDeletedEmployee = getEmployeeEducationDetail(empId);
		return softDeletedEmployee;
	}

	/*
	 * @Override public EducationDetailsVO getOneEmployeeEducationDetail(int empId)
	 * { EducationDetailsVO educationDetailList = new EducationDetailsVO();
	 * 
	 * return educationDetailList;
	 * 
	 * }
	 */

}
