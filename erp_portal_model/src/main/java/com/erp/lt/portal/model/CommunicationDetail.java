package com.erp.lt.portal.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * The persistent class for the communication_details database table.
 * 
 */
@Entity
@Table(name = "communication_details")
@NamedQuery(name = "CommunicationDetail.findAll", query = "SELECT c FROM CommunicationDetail c")
public class CommunicationDetail implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
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
	@ManyToOne
	@JoinColumn(name = "employee_code")
	private EmployeeInfo employeeInfo;

	/*
	 * //bi-directional many-to-one association to MobileDetail
	 * 
	 */
	@OneToMany(mappedBy = "communicationDetail")
	private List<MobileDetail> mobileDetails;

	public CommunicationDetail() {
	}

	public int getCode() {
		return this.code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public Date getBeginDate() {
		return this.beginDate;
	}

	public void setBeginDate(Date beginDate) {
		this.beginDate = beginDate;
	}

	public String getClientEmailId() {
		return this.clientEmailId;
	}

	public void setClientEmailId(String clientEmailId) {
		this.clientEmailId = clientEmailId;
	}

	public String getCompanyEmailId() {
		return this.companyEmailId;
	}

	public void setCompanyEmailId(String companyEmailId) {
		this.companyEmailId = companyEmailId;
	}

	public String getEmergencyComunicationNumber() {
		return this.emergencyComunicationNumber;
	}

	public void setEmergencyComunicationNumber(String emergencyComunicationNumber) {
		this.emergencyComunicationNumber = emergencyComunicationNumber;
	}

	public Date getEndDate() {
		return this.endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public String getPersonalEmailId() {
		return this.personalEmailId;
	}

	public void setPersonalEmailId(String personalEmailId) {
		this.personalEmailId = personalEmailId;
	}

	public EmployeeInfo getEmployeeInfo() {
		return this.employeeInfo;
	}

	public void setEmployeeInfo(EmployeeInfo employeeInfo) {
		this.employeeInfo = employeeInfo;
	}

	public List<MobileDetail> getMobileDetails() {
		return this.mobileDetails;
	}

	public void setMobileDetails(List<MobileDetail> mobileDetails) {
		this.mobileDetails = mobileDetails;
	}

	public MobileDetail addMobileDetail(MobileDetail mobileDetail) {
		getMobileDetails().add(mobileDetail);
		mobileDetail.setCommunicationDetail(this);

		return mobileDetail;
	}

	public MobileDetail removeMobileDetail(MobileDetail mobileDetail) {
		getMobileDetails().remove(mobileDetail);
		mobileDetail.setCommunicationDetail(null);
		return mobileDetail;
	}

}