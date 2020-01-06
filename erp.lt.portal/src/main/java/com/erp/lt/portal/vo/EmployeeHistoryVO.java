package com.erp.lt.portal.vo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import com.erp.lt.portal.model.DesignationType;

public class EmployeeHistoryVO implements Serializable {

	private static final long serialVersionUID = 479779926340535942L;

	private int id;//1
	private Date beginDate;//2
	private BigDecimal ctc;//3

	private String employerName;//4

	private Date endDate;//5

	private String reference;//6

	private int employeeCode;//7
	
//	 private String employeeInfo; 
//	 private DesignationType designationType;
		
	private int designationCode;//8
	private String addressLine1;//9
	private String addressLine2;//10
	private String city;//11
	private String country;//12
	private String pincode;//13
	private String state;//14
	private int addressTypeCode;//15
	
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
	
	public int getAddressTypeCode() {
		return addressTypeCode;
	}

	public void setAddressTypeCode(int addressTypeCode) {
		this.addressTypeCode = addressTypeCode;
	}

}
