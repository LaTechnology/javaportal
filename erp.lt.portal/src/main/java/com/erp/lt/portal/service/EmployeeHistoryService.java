package com.erp.lt.portal.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.erp.lt.portal.model.EmployementHistory;
import com.erp.lt.portal.vo.EmployeeHistoryVO;
@Service
public interface EmployeeHistoryService {
	
	public void addEmployeeHistory(EmployeeHistoryVO employeeHistoryVO);

	public void editEmployeeHistory(EmployementHistory employeeHistoryVO);

	public void deleteEmployeeHistory(int employeeCode);

	public List<EmployementHistory> getAllEmployeeHistory(EmployementHistory employementHistory);

	public EmployeeHistoryVO getEmployeeHistory(int employeeCode);

}
