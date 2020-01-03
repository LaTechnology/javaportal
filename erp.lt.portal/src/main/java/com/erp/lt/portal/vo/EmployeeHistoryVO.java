package com.erp.lt.portal.vo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class EmployeeHistoryVO implements Serializable {

	private static final long serialVersionUID = 479779926340535942L;

	private int id;
	private int addressAddressCode;//
	private Date beginDate;
	private BigDecimal ctc;

	private String employerName;

	private Date endDate;

	private String reference;

	private int employeeCode;
	
	/*
	 * private String employeeInfo; // private DesignationType designationType;
	 */	
	private int designationCode;
	private String addressLine1;
	private String addressLine2;
	private String city;
	private String country;
	private String pincode;
	private String state;

	public String getAddressLine1() {
		return addressLine1;
	}

	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}

	public String getAddressLine2() {
		return addressLine2;
	}

	public void setAddressLine2(String addressLine2) {
		this.addressLine2 = addressLine2;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	
	public int getDesignationCode() {
		return designationCode;
	}

	public void setDesignationCode(int designationType) {
		this.designationCode = designationType;
	}

	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getAddressAddressCode() {
		return addressAddressCode;
	}

	public void setAddressAddressCode(int addressAddressCode) {
		this.addressAddressCode = addressAddressCode;
	}

	public BigDecimal getCtc() {
		return ctc;
	}

	public void setCtc(BigDecimal ctc) {
		this.ctc = ctc;
	}

	

	public String getEmployerName() {
		return employerName;
	}

	public void setEmployerName(String employerName) {
		this.employerName = employerName;
	}

	public Date getBeginDate() {
		return beginDate;
	}

	public void setBeginDate(Date beginDate) {
		this.beginDate = beginDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public String getReference() {
		return reference;
	}

	public void setReference(String reference) {
		this.reference = reference;
	}

	public int getEmployeeCode() {
		return employeeCode;
	}

	public void setEmployeeCode(int employeeCode) {
		this.employeeCode = employeeCode;
	}

	/*
	 * public String getEmployeeInfo() { return employeeInfo; }
	 * 
	 * public void setEmployeeInfo(String employeeInfo) { this.employeeInfo =
	 * employeeInfo; 
	 * }
	 */
	

}
