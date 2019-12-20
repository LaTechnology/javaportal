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
@Entity(name = "employeeeducationdetails")
public class EducationDetailsDto implements Serializable {
	
	/**
	 * 
	 */
	
	private static final long serialVersionUID = 216633747406277081L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long eduId;
	private long empId;
	private String instituteName;
	private long registerNumber;
	private String cgpa;
	private String beginDate;
	private String endDate;
	private int  eduTypId;

	public long getEduId() {
	return eduId;
	}
	public void setEduId(long eduId) {
	this.eduId = eduId;
	}
	public String getInstituteName() {
	return instituteName;
	}
	public void setInstituteName(String instituteName) {
	this.instituteName = instituteName;
	}
	public long getRegisterNumber() {
	return registerNumber;
	}
	public void setRegisterNumber(long registerNumber) {
	this.registerNumber = registerNumber;
	}
	public String getCgpa() {
	return cgpa;
	}
	public void setCgpa(String cgpa) {
	this.cgpa = cgpa;
	}
	public String getBeginDate() {
	return beginDate;
	}
	public void setBeginDate(String beginDate) {
	this.beginDate = beginDate;
	}
	public String getEndDate() {
	return endDate;
	}
	public void setEndDate(String endDate) {
	this.endDate = endDate;
	}
	public int getEduTypId() {
	return eduTypId;
	}
	public void setEduTypId(int eduTypId) {
	this.eduTypId = eduTypId;
	}
	public long getEmpId() {
	return empId;
	}
	public void setEmpId(long empId) {
	this.empId = empId;
	}

}
