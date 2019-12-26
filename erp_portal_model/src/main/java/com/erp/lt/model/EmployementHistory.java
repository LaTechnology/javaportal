package com.erp.lt.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the employement_history database table.
 * 
 */
@Entity
@Table(name="employement_history")
@NamedQuery(name="EmployementHistory.findAll", query="SELECT e FROM EmployementHistory e")
public class EmployementHistory implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	@Column(name="address_address_code")
	private int addressAddressCode;

	@Temporal(TemporalType.DATE)
	private Date beginDate;

	private BigDecimal ctc;

	private String employerNmae;

	@Temporal(TemporalType.DATE)
	private Date endDate;

	private String reference;

	//bi-directional many-to-one association to DesignationType
	@ManyToOne
	@JoinColumn(name="designation_type_code")
	private DesignationType designationType;

	//bi-directional many-to-one association to EmployeeInfo
	@ManyToOne
	@JoinColumn(name="employee_code")
	private EmployeeInfo employeeInfo;

	public EmployementHistory() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getAddressAddressCode() {
		return this.addressAddressCode;
	}

	public void setAddressAddressCode(int addressAddressCode) {
		this.addressAddressCode = addressAddressCode;
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

	public String getEmployerNmae() {
		return this.employerNmae;
	}

	public void setEmployerNmae(String employerNmae) {
		this.employerNmae = employerNmae;
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

	public void setDesignationType(DesignationType designationType) {
		this.designationType = designationType;
	}

	public EmployeeInfo getEmployeeInfo() {
		return this.employeeInfo;
	}

	public void setEmployeeInfo(EmployeeInfo employeeInfo) {
		this.employeeInfo = employeeInfo;
	}

}