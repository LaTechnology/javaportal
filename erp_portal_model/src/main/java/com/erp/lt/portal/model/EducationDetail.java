package com.erp.lt.portal.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the education_details database table.
 * 
 */
@Entity
@Table(name="education_details")
@NamedQuery(name="EducationDetail.findAll", query="SELECT e FROM EducationDetail e")
public class EducationDetail implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int educationId;

	private String additionalCertification;

	@Temporal(TemporalType.DATE)
	private Date beginDate;

	private BigDecimal cgpa;

	@Temporal(TemporalType.DATE)
	private Date endDate;

	private String instituteName;

	private String universityName;
	
	

	//bi-directional many-to-one association to Educationboard
	@ManyToOne
	@JoinColumn(name="education_board_code")
	private Educationboard educationboard;

	//bi-directional many-to-one association to Educationtype
	@ManyToOne
	@JoinColumn(name="education_type_code")
	private Educationtype educationtype;

	//bi-directional many-to-one association to EmployeeInfo
	@ManyToOne
	@JoinColumn(name="employee_code")
	private EmployeeInfo employeeInfo;

	public EducationDetail() {
	}

	public int getEducationId() {
		return this.educationId;
	}

	public void setEducationId(int educationId) {
		this.educationId = educationId;
	}

	public String getAdditionalCertification() {
		return this.additionalCertification;
	}

	public void setAdditionalCertification(String additionalCertification) {
		this.additionalCertification = additionalCertification;
	}

	public Date getBeginDate() {
		return this.beginDate;
	}

	public void setBeginDate(Date beginDate) {
		this.beginDate = beginDate;
	}

	public BigDecimal getCgpa() {
		return this.cgpa;
	}

	public void setCgpa(BigDecimal cgpa) {
		this.cgpa = cgpa;
	}

	public Date getEndDate() {
		return this.endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public String getInstituteName() {
		return this.instituteName;
	}

	public void setInstituteName(String instituteName) {
		this.instituteName = instituteName;
	}

	public String getUniversityName() {
		return this.universityName;
	}

	public void setUniversityName(String universityName) {
		this.universityName = universityName;
	}

	public Educationboard getEducationboard() {
		return this.educationboard;
	}

	public void setEducationboard(Educationboard educationboard) {
		this.educationboard = educationboard;
	}

	public Educationtype getEducationtype() {
		return this.educationtype;
	}

	public void setEducationtype(Educationtype educationtype) {
		this.educationtype = educationtype;
	}

	public EmployeeInfo getEmployeeInfo() {
		return this.employeeInfo;
	}

	public void setEmployeeInfo(EmployeeInfo employeeInfo) {
		this.employeeInfo = employeeInfo;
	}

	

	
	


}