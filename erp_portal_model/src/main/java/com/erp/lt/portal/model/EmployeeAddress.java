package com.erp.lt.portal.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the employee_address database table.
 * 
 */
@Entity
@Table(name="employee_address")
@NamedQuery(name="EmployeeAddress.findAll", query="SELECT e FROM EmployeeAddress e")
public class EmployeeAddress implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="address_code")
	private int addressCode;

	@Column(name="address_line_1")
	private String addressLine1;

	@Column(name="address_line_2")
	private String addressLine2;

	@Temporal(TemporalType.DATE)
	@Column(name="begin_date")
	private Date beginDate;

	private String city;

	private String country;

	@Column(name="employee_code")
	private int employeeCode;

	@Temporal(TemporalType.DATE)
	@Column(name="end_date")
	private Date endDate;

	private int idEmployee_address;

	private String pincode;

	private String state;

	//bi-directional many-to-one association to AddressType
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="address_type_code")
	private AddressType addressType;

	public EmployeeAddress() {
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

	public int getEmployeeCode() {
		return this.employeeCode;
	}

	public void setEmployeeCode(int employeeCode) {
		this.employeeCode = employeeCode;
	}

	public Date getEndDate() {
		return this.endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public int getIdEmployee_address() {
		return this.idEmployee_address;
	}

	public void setIdEmployee_address(int idEmployee_address) {
		this.idEmployee_address = idEmployee_address;
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

}