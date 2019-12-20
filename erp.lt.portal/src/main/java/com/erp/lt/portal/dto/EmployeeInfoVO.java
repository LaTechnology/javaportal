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
@Entity(name = "employeeinfo")
public class EmployeeInfoVO implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 489428074889108671L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int empId;
	private String firstName;
	private String lastName;
	private String gender;
	private String dob;
	private String maritalStatus;
	private String marriageDate;
	private String nationality;
	private String citizen;
	private String countryOfBirth;
	private String stateOfBirth;


	public int getEmpId() {
	return empId;
	}
	public void setEmpId(int empId) {
	this.empId = empId;
	}
	public String getFirstName() {
	return firstName;
	}
	public void setFirstName(String firstName) {
	this.firstName = firstName;
	}
	public String getLastName() {
	return lastName;
	}
	public void setLastName(String lastName) {
	this.lastName = lastName;
	}
	public String getGender() {
	return gender;
	}
	public void setGender(String gender) {
	this.gender = gender;
	}
	public String getDob() {
	return dob;
	}
	public void setDob(String dob) {
	this.dob = dob;
	}
	public String getMaritalStatus() {
	return maritalStatus;
	}
	public void setMaritalStatus(String maritalStatus) {
	this.maritalStatus = maritalStatus;
	}
	public String getMarriageDate() {
	return marriageDate;
	}
	public void setMarriageDate(String marriageDate) {
	this.marriageDate = marriageDate;
	}
	public String getNationality() {
	return nationality;
	}
	public void setNationality(String nationality) {
	this.nationality = nationality;
	}
	public String getCitizen() {
	return citizen;
	}
	public void setCitizen(String citizen) {
	this.citizen = citizen;
	}
	public String getCountryOfBirth() {
	return countryOfBirth;
	}
	public void setCountryOfBirth(String countryOfBirth) {
	this.countryOfBirth = countryOfBirth;
	}
	public String getStateOfBirth() {
	return stateOfBirth;
	}
	public void setStateOfBirth(String stateOfBirth) {
	this.stateOfBirth = stateOfBirth;
	}

}
