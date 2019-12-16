package com.lt.erp.portal.dto;

import java.io.Serializable;

public class EducationDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 148944013052637559L;
	private String title;
	private String yearOfPassing;
	private String cgpa;
	private String school;
	
	private String comments;
	
	private AddressVO location;

	public final String getTitle() {
		return title;
	}

	public final void setTitle(String title) {
		this.title = title;
	}

	public final String getYearOfPassing() {
		return yearOfPassing;
	}

	public final void setYearOfPassing(String yearOfPassing) {
		this.yearOfPassing = yearOfPassing;
	}

	public final String getCgpa() {
		return cgpa;
	}

	public final void setCgpa(String cgpa) {
		this.cgpa = cgpa;
	}

	public final String getSchool() {
		return school;
	}

	public final void setSchool(String school) {
		this.school = school;
	}

	public final String getComments() {
		return comments;
	}

	public final void setComments(String comments) {
		this.comments = comments;
	}

	public final AddressVO getLocation() {
		return location;
	}

	public final void setLocation(AddressVO location) {
		this.location = location;
	}

	public static final long getSerialversionuid() {
		return serialVersionUID;
	}
	
}
