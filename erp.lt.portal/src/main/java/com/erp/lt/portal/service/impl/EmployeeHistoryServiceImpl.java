package com.erp.lt.portal.service.impl;

import java.util.ArrayList;
//import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.erp.lt.portal.model.DesignationType;
import com.erp.lt.portal.model.EmployeeAddress;
import com.erp.lt.portal.model.EmployeeInfo;
import com.erp.lt.portal.model.EmployementHistory;
import com.erp.lt.portal.repository.EmployeeAddressRepository;
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

	@Override
	public void addEmployeeHistory(EmployeeHistoryVO employeeHistoryVO) {
		EmployementHistory employementHistory = new EmployementHistory();
        Optional<EmployementHistory>empinfo=null;
        Optional<EmployeeInfo> employeeInfo=null;
       
        if(employeeHistoryVO.getEmployeeCode()<0) {
        	empinfo=employeeHistoryRepository.findById(employeeHistoryVO.getEmployeeCode());
        }
		
		
		if (0 != employeeHistoryVO.getId()) {
			employementHistory.setId(employeeHistoryVO.getId());
		}

		if (0 != employeeHistoryVO.getAddressAddressCode()) {
			employementHistory.setAddressAddressCode(employeeHistoryVO.getAddressAddressCode());
		}
		/*
		 * if(empinfo.isPresent()) { if(0!=employeeHistoryVO.getEmployeeCode()) {
		 * employementHistory.setEmployeeInfo(employeeHistoryVO.getEmployeeCode()); } }
		 */
		if(null!=empinfo) {
			employementHistory.setEmployeeInfo(empinfo.get().getEmployeeInfo());
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
		if (null != employeeHistoryVO.getEmployerName()) {
			employementHistory.setEmployerName(employeeHistoryVO.getEmployerName());
		}

		if (null != employeeHistoryVO.getReference()) {
			employementHistory.setReference(employeeHistoryVO.getReference());
		}
		employeeHistoryRepository.save(employementHistory);
	}

	
	

	@Override
	public void deleteEmployeeHistory(int employeeCode) {

		employeeHistoryRepository.deleteById(employeeCode);

	}

	

	@Override
	public EmployeeHistoryVO getEmployeeHistory(int employeeCode) {
		EmployeeHistoryVO empvo = new EmployeeHistoryVO();
		EmployeeAddressVO employeeAddressVO =new EmployeeAddressVO ();
		Optional<EmployementHistory> empDeatil = employeeHistoryRepository.findById(employeeCode);
		EmployementHistory emphistory = empDeatil.get();
		Optional<EmployeeAddress> empAddress=employeeAddressRepository. getEmployementHistory(employeeCode);
		EmployeeAddress employeeAddress=empAddress.get();
		EmployeeInfo empinfo =  employeeInfoRespository.getOne(employeeCode);
		
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
			/*if (0 != emphistory.getDesignationType().getCode()) {
				empvo.setDesignationCode(emphistory.getDesignationType().getCode());
			}

			
			 * if (null != emphistory.getEmployeeInfo()) {
			 * empvo.setEmployeeCode(emphistory.getEmployeeInfo().getEmployeeCode()); }
			 */
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
			
			
			if (null !=employeeAddress.getAddressLine1()) {
				empvo.setAddressLine1( employeeAddress.getAddressLine1());
			}
			if (null != employeeAddress.getAddressLine2()) {
				empvo.setAddressLine2( employeeAddressVO.getAddressline2());
			}
			if (null != employeeAddress.getCity()) {
				empvo.setCity( employeeAddressVO.getCity());
			}
			if (null != employeeAddress.getCountry()) {
				empvo.setCountry( employeeAddressVO.getCountry());
			}
			if (null !=employeeAddress.getPincode()) {
				empvo.setPincode(employeeAddress.getPincode());
			}
			if (null !=employeeAddress.getState()) {
				empvo.setState(employeeAddress.getState());
			}
			
			if(0>empinfo.getEmployeeCode()) {
				empvo.setEmployeeCode(empinfo.getEmployeeCode());
			}
		
		}

		return empvo;
	}

	@Override
	public List<EmployementHistory> getAllEmployeeHistory() {

		List<EmployementHistory>employeHistry=employeeHistoryRepository.findAll();
		List<EmployeeHistoryVO>historyVO=new ArrayList<>();
		for(EmployementHistory empHis:employeHistry) {
			EmployeeHistoryVO empHisVO=new EmployeeHistoryVO();
			if(0!=empHis.getAddressAddressCode()) {
				empHisVO.setAddressAddressCode(empHis.getAddressAddressCode());
			}
			if(0!=empHis.getId()) {
				empHisVO.setId(empHis.getId());
			}
			if(null!=empHis.getBeginDate()) {
				empHisVO.setBeginDate(empHis.getBeginDate());
			}
			if(null!=empHis.getEndDate()) {
				empHisVO.setEndDate(empHis.getEndDate());
			}
			if(null!=empHis.getDesignationType()) {
				empHisVO.setDesignationCode(empHis.getDesignationType().getCode());
			}
			if(null!=empHis.getEmployerName()) {
				empHisVO.setEmployerName(empHis.getEmployerName());
			}
			if(null!=empHis.getReference()) {
				empHisVO.setReference(empHis.getReference());
			}
			if(null!=empHis.getEmployeeInfo()) {
				empHisVO.setEmployeeCode(empHis.getEmployeeInfo().getEmployeeCode());
			}
		}
		return null;
	}




	
	public boolean editEmployeeHistory(EmployeeHistoryVO employeeHistoryVO) throws NotFoundException  {
		EmployementHistory old=null;
		boolean status=false;
		if(employeeHistoryVO.getEmployeeCode()<=0) {
			throw new NotFoundException("Employee not found");
		}
		Optional<EmployementHistory>existEmployeeHist=employeeHistoryRepository.findById(employeeHistoryVO.getEmployeeCode());
		Optional<DesignationType>desType=null;
		Optional<EmployeeInfo>empinfo=null;
		if(employeeHistoryVO.getDesignationCode()!=-1) {
			desType=employeeDesignationRepository.findById(employeeHistoryVO.getDesignationCode());
		}
		if(existEmployeeHist.isPresent()) {
			old=existEmployeeHist.get();
			old.setAddressAddressCode(employeeHistoryVO.getAddressAddressCode());
			old.setBeginDate(employeeHistoryVO.getBeginDate());
			old.setEndDate(employeeHistoryVO.getEndDate());
			old.setCtc(employeeHistoryVO.getCtc());
			old.setDesignationType(desType.get());
			old.setEmployerName(employeeHistoryVO.getEmployerName());
			old.setEmployeeInfo(empinfo.get());
			old.setId(employeeHistoryVO.getId());
			old.setReference(employeeHistoryVO.getReference());
			
		}
		return false;
	}

}
