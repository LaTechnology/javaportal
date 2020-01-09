/**
 * 
 */
package com.erp.lt.portal.vo;

import java.io.Serializable;
import java.util.Date;

/**
 * @author admin
 *
 */
public class ERPAccountVO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8215302343634014922L;
	private String emailId;
	private Date lastLoginDate;
	
	private String newPassword;
	private int status;
	private String confirmPassword;
	private int employeeCode;

	
	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getConfirmPassword() {
		return confirmPassword;
	}

	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}

	public int getEmployeeCode() {
		return employeeCode;
	}

	public void setEmployeeCode(int employeeCode) {
		this.employeeCode = employeeCode;
	}

	public Date getLastLoginDate() {
		return lastLoginDate;
	}

	public void setLastLoginDate(Date lastLoginDate) {
		this.lastLoginDate = lastLoginDate;
	}

	public String getNewPassword() {
		return newPassword;
	}

	public void setNewPassword(String newPassword) {
		this.newPassword = newPassword;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

}
