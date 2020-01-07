package com.erp.lt.portal.service;

import java.util.ArrayList;
import java.util.List;


import org.springframework.stereotype.Service;

import com.erp.lt.portal.model.EmployementHistory;
import com.erp.lt.portal.vo.EmployeeHistoryVO;

import javassist.NotFoundException;
@Service
public interface EmployeeHistoryService {
	
	public void addEmployeeHistory(EmployeeHistoryVO employeeHistoryVO);

	public boolean editEmployeeHistory(EmployeeHistoryVO employeeHistoryVO) throws NotFoundException;

	public void deleteEmployeeHistory(int employeeCode);

	public List<EmployeeHistoryVO> getEmployeeHistory(int employeeCode);
	
	

}
