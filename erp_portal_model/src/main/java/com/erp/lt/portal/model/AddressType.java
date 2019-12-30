package com.erp.lt.portal.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the address_type database table.
 * 
 */
@Entity
@Table(name="address_type")
@NamedQuery(name="AddressType.findAll", query="SELECT a FROM AddressType a")
public class AddressType implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int code;

	private String title;

	//bi-directional many-to-one association to EmployeeAddress
	@OneToMany(mappedBy="addressType")
	private List<EmployeeAddress> employeeAddresses;

	public AddressType() {
	}

	public int getCode() {
		return this.code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public List<EmployeeAddress> getEmployeeAddresses() {
		return this.employeeAddresses;
	}

	public void setEmployeeAddresses(List<EmployeeAddress> employeeAddresses) {
		this.employeeAddresses = employeeAddresses;
	}

	public EmployeeAddress addEmployeeAddress(EmployeeAddress employeeAddress) {
		getEmployeeAddresses().add(employeeAddress);
		employeeAddress.setAddressType(this);

		return employeeAddress;
	}

	public EmployeeAddress removeEmployeeAddress(EmployeeAddress employeeAddress) {
		getEmployeeAddresses().remove(employeeAddress);
		employeeAddress.setAddressType(null);

		return employeeAddress;
	}

}