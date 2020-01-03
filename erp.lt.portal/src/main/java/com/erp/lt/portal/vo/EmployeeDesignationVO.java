package com.erp.lt.portal.vo;

import java.io.Serializable;
import java.util.List;

import com.erp.lt.portal.model.EmployementHistory;

public class EmployeeDesignationVO implements Serializable{

	
	private static final long serialVersionUID = -4511357289320705827L;
	private int code;

	private String description;

	private byte status;
	private List<EmployementHistory> employementHistory;
	
	public List<EmployementHistory> getEmployementHistories() {
		return employementHistory;
	}

	public void setEmployementHistories(List<EmployementHistory> employementHistory) {
		this.employementHistory = employementHistory;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public byte getStatus() {
		return status;
	}

	public void setStatus(byte status) {
		this.status = status;
	}
	

		
}
