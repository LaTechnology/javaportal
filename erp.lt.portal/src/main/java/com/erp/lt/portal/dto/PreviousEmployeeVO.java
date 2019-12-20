/**
 * 
 */
package com.erp.lt.portal.dto;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * @author User
 *
 */
@Entity(name = "previousemployee")
public class PreviousEmployeeVO implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 3760132215319943425L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long EmpId;
	private String previousOrganization;
	private String address;
	private String previousDesignation;
	private int salary;
	private String beginDate;
	private String endDate;
	public Long getEmpId() {
	return EmpId;
	}
	public void setEmpId(Long empId) {
	EmpId = empId;
	}
	public String getPreviousOrganization() {
	return previousOrganization;
	}
	public void setPreviousOrganization(String previousOrganization) {
	this.previousOrganization = previousOrganization;
	}
	public String getAddress() {
	return address;
	}
	public void setAddress(String address) {
	this.address = address;
	}
	public String getPreviousDesignation() {
	return previousDesignation;
	}
	public void setPreviousDesignation(String previousDesignation) {
	this.previousDesignation = previousDesignation;
	}
	public int getSalary() {
	return salary;
	}
	public void setSalary(int salary) {
	this.salary = salary;
	}
	public String getBeginDate() {
	return beginDate;
	}
	public void setBeginDate(String beginDate) {
	this.beginDate = beginDate;
	}
	public String getEndDate() {
	return endDate;
	}
	public void setEndDate(String endDate) {
	this.endDate = endDate;
	}


}
