package com.erp.lt.portal.vo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import com.erp.lt.portal.model.EmployeeInfo;

public class EducationDetailsVO implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 4110880942098735178L;

	private int educationId;

	private String additionalCertification;

	private Date beginDate;

	private BigDecimal cgpa;

	private Date endDate;

	private String instituteName;

	private String universityName;

	 private int employeecode;

	private int educationTypecode;

	public int getEducationTypecode() {
		return educationTypecode;
	}

	public void setEducationTypecode(int educationTypecode) {
		this.educationTypecode = educationTypecode;
	}

	private int educationBoardCode;

	// private EmployeeInfo employeeInfo;

	public int getEducationId() {
		return educationId;
	}

	public void setEducationId(int educationId) {
		this.educationId = educationId;
	}

	public String getAdditionalCertification() {
		return additionalCertification;
	}

	public void setAdditionalCertification(String additionalCertification) {
		this.additionalCertification = additionalCertification;
	}

	public Date getBeginDate() {
		return beginDate;
	}

	public void setBeginDate(Date beginDate) {
		this.beginDate = beginDate;
	}

	public BigDecimal getCgpa() {
		return cgpa;
	}

	public void setCgpa(BigDecimal cgpa) {
		this.cgpa = cgpa;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public String getInstituteName() {
		return instituteName;
	}

	public void setInstituteName(String instituteName) {
		this.instituteName = instituteName;
	}

	public String getUniversityName() {
		return universityName;
	}

	public void setUniversityName(String universityName) {
		this.universityName = universityName;
	}

	/*
	 * public EmployeeInfo getEmployeeInfo() { return employeeInfo; }
	 * 
	 * public void setEmployeeInfo(EmployeeInfo employeeInfo) { this.employeeInfo =
	 * employeeInfo; }
	 */

	/*
	 * public int getEmployeecode() { return employeecode; }
	 * 
	 * public void setEmployeecode(int employeecode) { this.employeecode =
	 * employeecode; }
	 */

	public int getEducationBoardCode() {
		return educationBoardCode;
	}

	public void setEducationBoardCode(int educationBoardCode) {
		this.educationBoardCode = educationBoardCode;
	}

	public int getEmployeecode() {
		return employeecode;
	}

	public void setEmployeecode(int employeecode) {
		this.employeecode = employeecode;
	}

}
