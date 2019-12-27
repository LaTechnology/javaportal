package com.erp.lt.portal.model;

import java.io.Serializable;
import javax.persistence.*;


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
	private int id;

	@Column(name="address_line_1")
	private String addressLine1;

	@Column(name="address_line_2")
	private String addressLine2;

	private String city;

	private String country;

	private String pincode;

	private String state;

	//bi-directional many-to-one association to AddressType
	@ManyToOne
	@JoinColumn(name="address_type_code")
	private AddressType addressType;

	//bi-directional many-to-one association to EmployeeInfo
	@ManyToOne
	@JoinColumn(name="employee_code")
	private EmployeeInfo employeeInfo;

	public EmployeeAddress() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
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

	public EmployeeInfo getEmployeeInfo() {
		return this.employeeInfo;
	}

	public void setEmployeeInfo(EmployeeInfo employeeInfo) {
		this.employeeInfo = employeeInfo;
	}

}