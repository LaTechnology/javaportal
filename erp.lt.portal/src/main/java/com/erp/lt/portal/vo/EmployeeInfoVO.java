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
public class EmployeeInfoVO implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 5222006776920099426L;

	private String employeeCode;

	private String citizen;

	private String countryofbirth;

	private Date dob;

	private String firstname;

	private String lastName;

	private Date marriageDate;

	private String nationality;

	private String stateofbirth;

	private byte status;

	private int genderCode;

	private int maritalStatusCode;

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

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
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

	public byte getStatus() {
		return status;
	}

	public void setStatus(byte status) {
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
