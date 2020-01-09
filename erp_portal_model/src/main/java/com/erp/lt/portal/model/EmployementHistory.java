package com.erp.lt.portal.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

/**
 * The persistent class for the employement_history database table.
 * 
 */
@Entity
@Table(name = "employement_history")
@NamedQuery(name = "EmployementHistory.findAll", query = "SELECT e FROM EmployementHistory e")
public class EmployementHistory implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	@Temporal(TemporalType.DATE)
	@Column(name = "begin_date")
	private Date beginDate;	
	private BigDecimal ctc;

	private String employerName;

	@Temporal(TemporalType.DATE)
	@Column(name = "end_date")
	private Date endDate;

	private String reference;
	@Column(name = "Status")
	private int status;

	// bi-directional many-to-one association to DesignationType
	@ManyToOne
	@JoinColumn(name = "designation_type_code")
	private DesignationType designationType;

	// bi-directional many-to-one association to EmployeeInfo
	@ManyToOne
	@JoinColumn(name = "employee_code")
	private EmployeeInfo employeeInfo;

	// bi-directional many-to-one association to AddressType
	@ManyToOne
	@JoinColumn(name = "address_type_code")
	private AddressType addressType;

	public EmployementHistory() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}


	public Date getBeginDate() {
		return this.beginDate;
	}

	public void setBeginDate(Date beginDate) {
		this.beginDate = beginDate;
	}

	public BigDecimal getCtc() {
		return this.ctc;
	}

	public void setCtc(BigDecimal ctc) {
		this.ctc = ctc;
	}

	public String getEmployerName() {
		return employerName;
	}

	public void setEmployerName(String employerName) {
		this.employerName = employerName;
	}

	public Date getEndDate() {
		return this.endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public String getReference() {
		return this.reference;
	}

	public void setReference(String reference) {
		this.reference = reference;
	}

	public DesignationType getDesignationType() {
		return this.designationType;
	}
	
	public AddressType getAddressType() {
		return this.addressType;
	}

	public void setAddressType(AddressType addressType) {
		this.addressType = addressType;
	}

	public void setDesignationType(DesignationType designationType) {
		this.designationType = designationType;
	}

	public EmployeeInfo getEmployeeInfo() {
		return this.employeeInfo;
	}

	public void setEmployeeInfo(EmployeeInfo employeeInfo) {
		this.employeeInfo = employeeInfo;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

}