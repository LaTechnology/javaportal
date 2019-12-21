/**
 * 
 */
package com.erp.lt.portal.dto;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * @author User
 *
 */
@Entity(name= "employeeaddressinfo")
public class EmpAddressVO implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 7013161131704897124L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO) 
	private int empAddressId;
	private int empid;
	private String CurrentAddress;	
	private String PermanentAddress;
	private String MailingAddress;
	private String OfficeAddress;
	private String EmergencyContactAddress;
	private String city;
	private String country;
	private String pincode;
	private String state;

	public int getEmpAddressId() {
	return empAddressId;
	}
	public void setEmpAddressId(int empAddressId) {
	this.empAddressId = empAddressId;
	}
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getCurrentAddress() {
	return CurrentAddress;
	}
	public void setCurrentAddress(String currentAddress) {
	CurrentAddress = currentAddress;
	}
	public String getPermanentAddress() {
	return PermanentAddress;
	}
	public void setPermanentAddress(String permanentAddress) {
	PermanentAddress = permanentAddress;
	}
	public String getMailingAddress() {
	return MailingAddress;
	}
	public void setMailingAddress(String mailingAddress) {
	MailingAddress = mailingAddress;
	}
	public String getOfficeAddress() {
	return OfficeAddress;
	}
	public void setOfficeAddress(String officeAddress) {
	OfficeAddress = officeAddress;
	}
	public String getEmergencyContactAddress() {
	return EmergencyContactAddress;
	}
	public void setEmergencyContactAddress(String emergencyContactAddress) {
	EmergencyContactAddress = emergencyContactAddress;
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

}
