package com.erp.lt.portal2.VO;

import java.io.Serializable;
import java.util.Date;

import org.springframework.web.bind.annotation.RestController;

import Model.GenderType;
import Model.MaritalStatus;

/**
 * The persistent class for the employee_info database table.
 * 
 */
@RestController
public class EmployeeInfoVo implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private int employeeCode;

	private String citizen;

	private String countryofbirth;

	private Date dob;

	private String firstname;

	private String lastName;

	private Date marriageDate;

	private String nationality;

	private String stateofbirth;

	private byte status;

	private GenderType genderType;

	private MaritalStatus maritalStatus;

	public int getEmployeeCode() {
		return this.employeeCode;
	}

	public void setEmployeeCode(int employeeCode) {
		this.employeeCode = employeeCode;
	}

	public String getCitizen() {
		return this.citizen;
	}

	public void setCitizen(String citizen) {
		this.citizen = citizen;
	}

	public String getCountryofbirth() {
		return this.countryofbirth;
	}

	public void setCountryofbirth(String countryofbirth) {
		this.countryofbirth = countryofbirth;
	}

	public Date getDob() {
		return this.dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public String getFirstname() {
		return this.firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastName() {
		return this.lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Date getMarriageDate() {
		return this.marriageDate;
	}

	public void setMarriageDate(Date marriageDate) {
		this.marriageDate = marriageDate;
	}

	public String getNationality() {
		return this.nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	public String getStateofbirth() {
		return this.stateofbirth;
	}

	public void setStateofbirth(String stateofbirth) {
		this.stateofbirth = stateofbirth;
	}

	public byte getStatus() {
		return this.status;
	}

	public void setStatus(byte status) {
		this.status = status;
	}

	public GenderType getGenderType() {
		return this.genderType;
	}

	public void setGenderType(GenderType genderType) {
		this.genderType = genderType;
	}

	public MaritalStatus getMaritalStatus() {
		return this.maritalStatus;
	}

	public void setMaritalStatus(MaritalStatus maritalStatus) {
		this.maritalStatus = maritalStatus;
	}

}