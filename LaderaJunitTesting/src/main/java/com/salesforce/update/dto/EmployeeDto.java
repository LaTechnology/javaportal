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
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String empId;
	private String firstName;
	private String lastName;
}
