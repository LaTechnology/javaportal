package com.erp.lt.portal.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "employee_address")
@NamedQuery(name = "EmployeeAddress.findAll", query = "SELECT e FROM EmployeeAddress e")
public class EmployeeAddress implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "address_code")
	private int addressCode;

	@Column(name = "address_line_1")
	private String addressLine1;

	@Column(name = "address_line_2")
	private String addressLine2;

	@Temporal(TemporalType.DATE)
	@Column(name = "begin_date")
	private Date beginDate;

	private String city;

	private String country;

	@Temporal(TemporalType.DATE)
	@Column(name = "end_date")
	private Date endDate;

	private String pincode;

	private String state;
	@Column(name = "Status")
	private int status;
	// bi-directional many-to-one association to AddressType

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "address_type_code")
	private AddressType addressType;

	@ManyToOne
	@JoinColumn(name = "employee_code")
	private EmployeeInfo employeeInfo;

	// bi-directional many-to-one association to EmployementHistory
	@ManyToOne
	@JoinColumn(name = "oragnization_id")
	private EmployementHistory employementHistory;

	public EmployeeAddress() {
	}

	public EmployeeInfo getEmployeeInfo() {
		return employeeInfo;
	}

	public void setEmployeeInfo(EmployeeInfo employeeInfo) {
		this.employeeInfo = employeeInfo;
	}

	public int getAddressCode() {
		return this.addressCode;
	}

	public void setAddressCode(int addressCode) {
		this.addressCode = addressCode;
	}

	public String getAddressLine1() {
		return this.addressLine1;
	}

	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}

	public String getAddressLine2() {
		return this.addressLine2;
	}

	public void setAddressLine2(String addressLine2) {
		this.addressLine2 = addressLine2;
	}

	public Date getBeginDate() {
		return this.beginDate;
	}

	public void setBeginDate(Date beginDate) {
		this.beginDate = beginDate;
	}

	public String getCity() {
		return this.city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCountry() {
		return this.country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public Date getEndDate() {
		return this.endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public String getPincode() {
		return this.pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

	public String getState() {
		return this.state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public AddressType getAddressType() {
		return this.addressType;
	}

	public void setAddressType(AddressType addressType) {
		this.addressType = addressType;
	}

	public EmployementHistory getEmployementHistory() {
		return this.employementHistory;
	}

	public void setEmployementHistory(EmployementHistory employementHistory) {
		this.employementHistory = employementHistory;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

}