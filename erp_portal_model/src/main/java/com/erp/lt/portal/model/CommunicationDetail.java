package com.erp.lt.portal.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;

/**
 * The persistent class for the communication_details database table.
 * 
 */
@Entity
@Table(name = "communication_details", catalog = "employee_selfservicedb")
@NamedQuery(name = "CommunicationDetail.findAll", query = "SELECT c FROM CommunicationDetail c")
public class CommunicationDetail implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int code;

	@Temporal(TemporalType.DATE)
	@Column(name = "begin_date")
	private Date beginDate;

	@Column(name = "client_email_id")
	private String clientEmailId;

	@Column(name = "company_email_id")
	private String companyEmailId;

	@Column(name = "emergency_comunication_number")
	private String emergencyComunicationNumber;

	@Temporal(TemporalType.DATE)
	@Column(name = "end_date")
	private Date endDate;

	@Column(name = "personal_email_id")
	private String personalEmailId;

	// bi-directional many-to-one association to EmployeeInfo
	@OneToOne
	@JoinColumn(name = "employee_code")
	private EmployeeInfo employeeInfo;

	// bi-directional many-to-one association to MobileDetail
	@OneToOne(mappedBy = "communicationDetail")
	private MobileDetail mobileDetails;

	public CommunicationDetail() {
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public Date getBeginDate() {
		return beginDate;
	}

	public void setBeginDate(Date beginDate) {
		this.beginDate = beginDate;
	}

	public String getClientEmailId() {
		return clientEmailId;
	}

	public void setClientEmailId(String clientEmailId) {
		this.clientEmailId = clientEmailId;
	}

	public String getCompanyEmailId() {
		return companyEmailId;
	}

	public void setCompanyEmailId(String companyEmailId) {
		this.companyEmailId = companyEmailId;
	}

	public String getEmergencyComunicationNumber() {
		return emergencyComunicationNumber;
	}

	public void setEmergencyComunicationNumber(String emergencyComunicationNumber) {
		this.emergencyComunicationNumber = emergencyComunicationNumber;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public String getPersonalEmailId() {
		return personalEmailId;
	}

	public void setPersonalEmailId(String personalEmailId) {
		this.personalEmailId = personalEmailId;
	}

	public EmployeeInfo getEmployeeInfo() {
		return employeeInfo;
	}

	public void setEmployeeInfo(EmployeeInfo employeeInfo) {
		this.employeeInfo = employeeInfo;
	}

	public MobileDetail getMobileDetails() {
		return mobileDetails;
	}

	public void setMobileDetails(MobileDetail mobileDetails) {
		this.mobileDetails = mobileDetails;
	}
 

}