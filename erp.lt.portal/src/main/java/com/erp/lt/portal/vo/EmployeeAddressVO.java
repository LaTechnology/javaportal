package com.erp.lt.portal.vo;

import java.io.Serializable;
import java.util.Date;

import com.erp.lt.portal.model.AddressType;
import com.erp.lt.portal.model.EmployeeInfo;

public class EmployeeAddressVO implements Serializable {

	private static final long serialVersionUID = -7799807974972674074L;

	private int addressCode;
	private int employeeCode;

	public int getAddressCode() {
		return addressCode;
	}

	public void setAddressCode(int addressCode) {
		this.addressCode = addressCode;
	}

	public int getEmployeeCode() {
		return employeeCode;
	}

	public void setEmployeeCode(int employeeCode) {
		this.employeeCode = employeeCode;
	}

	private String addressline1;

	private String addressline2;

	private String city;

	private String country;

	private int pincode;
	
	private Date begindate;
	
	public Date getBegindate() {
		return begindate;
	}

	public void setBegindate(Date begindate) {
		this.begindate = begindate;
	}

	public Date getEnddate() {
		return enddate;
	}

	public void setEnddate(Date enddate) {
		this.enddate = enddate;
	}

	private Date enddate;
	

	private String state;
	
	private AddressType addressType;
    // private int addressType;
	private EmployeeInfo employeeInfo;

	
	public String getAddressline1() {
		return addressline1;
	}

	public void setAddressline1(String addressline1) {
		this.addressline1 = addressline1;
	}

	public String getAddressline2() {
		return addressline2;
	}

	public void setAddressline2(String addressline2) {
		this.addressline2 = addressline2;
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

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public EmployeeInfo getEmployeeInfo() {
		return employeeInfo;
	}

	public void setEmployeeInfo(EmployeeInfo employeeInfo) {
		this.employeeInfo = employeeInfo;
	}

	public void setCode(int code) {
		// TODO Auto-generated method stub
		
	}

	public void setTitle(String title) {
		// TODO Auto-generated method stub
		
	}

	public AddressType getAddressType() {
		return addressType;
	}

	public void setAddressType(AddressType addressType) {
		this.addressType = addressType;
	}

	/*
	 * public int getAddressType() { return addressType; }
	 * 
	 * public void setAddressType(int addressType) { this.addressType = addressType;
	 * }
	 */
}