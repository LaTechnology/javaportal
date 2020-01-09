/**
 * 
 */
package com.erp.lt.portal.vo;

import java.io.Serializable;
import java.util.Date;

/**
 * @author admin
 *
 */
public class EmployeeInfoVO implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 5222006776920099426L;

	private String employeeCode;

	private String citizen;

	private String countryofbirth;

	private Date dob;

	private String firstname;

	private Date marriageDate;

	private String nationality;

	private String stateofbirth;

	
	private int genderCode;

	private int maritalStatusCode;
	private String lastName;
	private String emailId;
	private String employeePrefix;
      private int status;

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getEmployeePrefix() {
		return employeePrefix;
	}

	public void setEmployeePrefix(String employeePrefix) {
		this.employeePrefix = employeePrefix;
	}


	public String getEmployeeCode() {
	return employeeCode;
	}

	public void setEmployeeCode(String employeeCode) {
	this.employeeCode = employeeCode;
	}

	public String getCitizen() {
	return citizen;
	}

	public void setCitizen(String citizen) {
	this.citizen = citizen;
	}

	public String getCountryofbirth() {
	return countryofbirth;
	}

	public void setCountryofbirth(String countryofbirth) {
	this.countryofbirth = countryofbirth;
	}

	public Date getDob() {
	return dob;
	}

	public void setDob(Date dob) {
	this.dob = dob;
	}

	public String getFirstname() {
	return firstname;
	}

	public void setFirstname(String firstname) {
	this.firstname = firstname;
	}


	public Date getMarriageDate() {
	return marriageDate;
	}

	public void setMarriageDate(Date marriageDate) {
	this.marriageDate = marriageDate;
	}

	public String getNationality() {
	return nationality;
	}

	public void setNationality(String nationality) {
	this.nationality = nationality;
	}

	public String getStateofbirth() {
	return stateofbirth;
	}

	public void setStateofbirth(String stateofbirth) {
	this.stateofbirth = stateofbirth;
	}

	

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public int getGenderCode() {
	return genderCode;
	}

	public void setGenderCode(int genderCode) {
	this.genderCode = genderCode;
	}

	public int getMaritalStatusCode() {
	return maritalStatusCode;
	}

	public void setMaritalStatusCode(int maritalStatusCode) {
	this.maritalStatusCode = maritalStatusCode;
	}
	
 
}
