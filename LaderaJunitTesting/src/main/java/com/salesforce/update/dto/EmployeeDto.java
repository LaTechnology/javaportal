/**
 * 
 */
package com.salesforce.update.dto;

import java.io.Serializable;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

/**
 * @author admin
 *
 */
@Setter
@Getter
@Data
public class EmployeeDto implements Serializable {
	public String getEmpId() {
		return empId;
	}
	public void setEmpId(String empId) {
		this.empId = empId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String empId;
	private String firstName;
	private String lastName;
}
