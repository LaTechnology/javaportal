/**
 * 
 */
package com.lt.erp.portal.dto;

import java.io.Serializable;
import java.util.List;

/**
 * @author admin
 *
 */
public class EmployeePersonalInfoDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6303315167530377844L;
	private String firstName;
	private String lastName;
	private String maritalStatus;

	private boolean status;
	private String marriageDate;
	private String dob;

	private String nationality;
	private String citizen;
	private String genderCode;

	private String countryOfBirth;
	private String stateOfBirth;

	private List<AddressVO> address;
	
	public final String getFirstName() {
		return firstName;
	}

	public final void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public final String getLastName() {
		return lastName;
	}

	public final void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public final String getMaritalStatus() {
		return maritalStatus;
	}

	public final void setMaritalStatus(String maritalStatus) {
		this.maritalStatus = maritalStatus;
	}

	public final boolean isStatus() {
		return status;
	}

	public final void setStatus(boolean status) {
		this.status = status;
	}

	public final String getMarriageDate() {
		return marriageDate;
	}

	public final void setMarriageDate(String marriageDate) {
		this.marriageDate = marriageDate;
	}

	public final String getDob() {
		return dob;
	}

	public final void setDob(String dob) {
		this.dob = dob;
	}

	public final String getNationality() {
		return nationality;
	}

	public final void setNationality(String nationality) {
		this.nationality = nationality;
	}

	public final String getCitizen() {
		return citizen;
	}

	public final void setCitizen(String citizen) {
		this.citizen = citizen;
	}

	public final String getGenderCode() {
		return genderCode;
	}

	public final void setGenderCode(String genderCode) {
		this.genderCode = genderCode;
	}

	public final String getCountryOfBirth() {
		return countryOfBirth;
	}

	public final void setCountryOfBirth(String countryOfBirth) {
		this.countryOfBirth = countryOfBirth;
	}

	public final String getStateOfBirth() {
		return stateOfBirth;
	}

	public final void setStateOfBirth(String stateOfBirth) {
		this.stateOfBirth = stateOfBirth;
	}

}
