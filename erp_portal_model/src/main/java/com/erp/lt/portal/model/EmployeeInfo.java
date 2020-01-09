package com.erp.lt.portal.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;

/**
 * The persistent class for the employee_info database table.
 * 
 */
@Entity
@Table(name = "employee_info")
@NamedQuery(name = "EmployeeInfo.findAll", query = "SELECT e FROM EmployeeInfo e")
public class EmployeeInfo implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "employee_code")
	private int employeeCode;

	private String citizen;

	private String countryofbirth;

	@Temporal(TemporalType.DATE)
	private Date dob;

	private String firstname;

	@Temporal(TemporalType.DATE)
	@Column(name = "marriage_date")
	private Date marriageDate;

	private String nationality;

	private String stateofbirth;

	@Column(name = "login_email_id")
	private String loginEmailId;

	private int status;
	private String lastname;
	@Column(name = "employee_prefix")
	private String employeePrefix;

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getEmployeePrefix() {
		return employeePrefix;
	}

	public void setEmployeePrefix(String employeePrefix) {
		this.employeePrefix = employeePrefix;
	}

	// bi-directional many-to-one association to CommunicationDetail
	@OneToMany(mappedBy = "employeeInfo")
	private List<CommunicationDetail> communicationDetails;

	// bi-directional many-to-one association to EducationDetail
	@OneToMany(mappedBy = "employeeInfo")
	private List<EducationDetail> educationDetails;

	// bi-directional many-to-one association to GenderType
	@ManyToOne
	@JoinColumn(name = "gender_type_code")
	private GenderType genderType;


	// bi-directional many-to-one association to MaritalStatus
	@ManyToOne
	@JoinColumn(name = "marital_status_code")
	private MaritalStatus maritalStatus;

	// bi-directional many-to-one association to EmployementHistory
	@OneToMany(mappedBy = "employeeInfo")
	private List<EmployementHistory> employementHistories;

	
	public EmployeeInfo() {
	}

	public int getemployeeCode() {
		return employeeCode;
	}

	public void setemployeeCode(int employeeCode) {
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

	
	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	
	public String getLoginEmailId() {
		return this.loginEmailId;
	}

	public void setLoginEmailId(String loginEmailId) {
		this.loginEmailId = loginEmailId;
	}

	public List<CommunicationDetail> getCommunicationDetails() {
		return this.communicationDetails;
	}

	public void setCommunicationDetails(List<CommunicationDetail> communicationDetails) {
		this.communicationDetails = communicationDetails;
	}

	public CommunicationDetail addCommunicationDetail(CommunicationDetail communicationDetail) {
		getCommunicationDetails().add(communicationDetail);
		communicationDetail.setEmployeeInfo(this);

		return communicationDetail;
	}

	public CommunicationDetail removeCommunicationDetail(CommunicationDetail communicationDetail) {
		getCommunicationDetails().remove(communicationDetail);
		communicationDetail.setEmployeeInfo(null);

		return communicationDetail;
	}

	public List<EducationDetail> getEducationDetails() {
		return this.educationDetails;
	}

	public void setEducationDetails(List<EducationDetail> educationDetails) {
		this.educationDetails = educationDetails;
	}

	public EducationDetail addEducationDetail(EducationDetail educationDetail) {
		getEducationDetails().add(educationDetail);
		educationDetail.setEmployeeInfo(this);

		return educationDetail;
	}

	public EducationDetail removeEducationDetail(EducationDetail educationDetail) {
		getEducationDetails().remove(educationDetail);
		educationDetail.setEmployeeInfo(null);

		return educationDetail;
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

	public List<EmployementHistory> getEmployementHistories() {
		return this.employementHistories;
	}

	public void setEmployementHistories(List<EmployementHistory> employementHistories) {
		this.employementHistories = employementHistories;
	}

	public EmployementHistory addEmployementHistory(EmployementHistory employementHistory) {
		getEmployementHistories().add(employementHistory);
		employementHistory.setEmployeeInfo(this);

		return employementHistory;
	}

	public EmployementHistory removeEmployementHistory(EmployementHistory employementHistory) {
		getEmployementHistories().remove(employementHistory);
		employementHistory.setEmployeeInfo(null);

		return employementHistory;
	}

	//bi-directional many-to-one association to LoginDetail
		@ManyToOne
		@JoinColumn(name="login_id")
		private LoginDetails loginDetail;

		//bi-directional many-to-one association to LoginDetail
		@OneToMany(mappedBy="employeeInfo")
		private List<LoginDetails> loginDetails;
		public LoginDetails getLoginDetail() {
			return this.loginDetail;
		}

		public void setLoginDetail(LoginDetails loginDetail) {
			this.loginDetail = loginDetail;
		}

		public List<LoginDetails> getLoginDetails() {
			return this.loginDetails;
		}

		public void setLoginDetails(List<LoginDetails> loginDetails) {
			this.loginDetails = loginDetails;
		}

		public LoginDetails addLoginDetail(LoginDetails loginDetail) {
			getLoginDetails().add(loginDetail);
			loginDetail.setEmployeeInfo(this);

			return loginDetail;
		}

		public LoginDetails removeLoginDetail(LoginDetails loginDetail) {
			getLoginDetails().remove(loginDetail);
			loginDetail.setEmployeeInfo(null);

			return loginDetail;
		}

	
}