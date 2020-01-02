package com.erp.lt.portal.vo;

import java.io.Serializable;
import java.util.List;

import com.erp.lt.portal.model.EmployeeAddress;

public class EmployeeAddressTypeVO implements Serializable

{

	private static final long serialVersionUID = 8066169032253813215L;
	private int code;

	private String title;

	 
	private List<EmployeeAddress> employeeAddresses;




	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public List<EmployeeAddress> getEmployeeAddresses() {
		return employeeAddresses;
	}


	public void setEmployeeAddresses(List<EmployeeAddress> employeeAddresses) {
		this.employeeAddresses = employeeAddresses;
	}


	public int getCode() {
		return code;
	}


	public void setCode(int code) {
		this.code = code;
	}
}