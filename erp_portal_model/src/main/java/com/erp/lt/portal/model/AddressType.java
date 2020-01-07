package com.erp.lt.portal.model;

import java.io.Serializable;
import javax.persistence.*;

import java.util.List;

/**
 * The persistent class for the address_type database table.
 * 
 */
@Entity
@Table(name = "address_type")
@NamedQuery(name = "AddressType.findAll", query = "SELECT a FROM AddressType a")
public class AddressType implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "code")
	private int addressTypeCode;

	private String title;

	// bi-directional many-to-one association to EmployeeAddress
	@OneToMany(mappedBy = "addressType")
	private List<EmployeeAddress> employeeAddresses;

	// bi-directional many-to-one association to EmployementHistory
	@OneToMany(mappedBy = "addressType")
	private List<EmployementHistory> employementHistories;

	public AddressType() {
	}

	public int getAddressTypeCode() {
		return this.addressTypeCode;
	}

	public void setAddressTypeCode(int addressTypeCode) {
		this.addressTypeCode = addressTypeCode;
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

	public List<EmployementHistory> getEmployementHistories() {
		return this.employementHistories;
	}

	public void setEmployementHistories(List<EmployementHistory> employementHistories) {
		this.employementHistories = employementHistories;
	}

	public EmployementHistory addEmployementHistory(EmployementHistory employementHistory) {
		getEmployementHistories().add(employementHistory);
		employementHistory.setAddressType(this);

		return employementHistory;
	}

	public EmployementHistory removeEmployementHistory(EmployementHistory employementHistory) {
		getEmployementHistories().remove(employementHistory);
		employementHistory.setAddressType(null);

		return employementHistory;
	}

}