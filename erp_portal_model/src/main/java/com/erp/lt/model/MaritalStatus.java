package com.erp.lt.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the marital_status database table.
 * 
 */
@Entity
@Table(name="marital_status")
@NamedQuery(name="MaritalStatus.findAll", query="SELECT m FROM MaritalStatus m")
public class MaritalStatus implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int code;

	private String title;

	//bi-directional many-to-one association to EmployeeInfo
	@OneToMany(mappedBy="maritalStatus")
	private List<EmployeeInfo> employeeInfos;

	public MaritalStatus() {
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

	public List<EmployeeInfo> getEmployeeInfos() {
		return this.employeeInfos;
	}

	public void setEmployeeInfos(List<EmployeeInfo> employeeInfos) {
		this.employeeInfos = employeeInfos;
	}

	public EmployeeInfo addEmployeeInfo(EmployeeInfo employeeInfo) {
		getEmployeeInfos().add(employeeInfo);
		employeeInfo.setMaritalStatus(this);

		return employeeInfo;
	}

	public EmployeeInfo removeEmployeeInfo(EmployeeInfo employeeInfo) {
		getEmployeeInfos().remove(employeeInfo);
		employeeInfo.setMaritalStatus(null);

		return employeeInfo;
	}

}