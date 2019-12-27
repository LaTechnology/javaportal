package com.erp.lt.portal.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the gender_type database table.
 * 
 */
@Entity
@Table(name="gender_type")
@NamedQuery(name="GenderType.findAll", query="SELECT g FROM GenderType g")
public class GenderType implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int code;

	private String title;

	//bi-directional many-to-one association to EmployeeInfo
	@OneToMany(mappedBy="genderType")
	private List<EmployeeInfo> employeeInfos;

	public GenderType() {
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
		employeeInfo.setGenderType(this);

		return employeeInfo;
	}

	public EmployeeInfo removeEmployeeInfo(EmployeeInfo employeeInfo) {
		getEmployeeInfos().remove(employeeInfo);
		employeeInfo.setGenderType(null);

		return employeeInfo;
	}

}