package com.erp.lt.portal.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the login_details database table.
 * 
 */
@Entity
@Table(name="login_details")
@NamedQuery(name="LoginDetail.findAll", query="SELECT l FROM LoginDetails l")
public class LoginDetails implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue (strategy=GenerationType.AUTO)
	@Column(name="login_id")
	private int loginId;

	@Column(name="confirm_password")
	private String confirmPassword;

	@Column(name="email_id")
	private String emailId;

	@Temporal(TemporalType.DATE)
	@Column(name="last_login_date")
	private Date lastLoginDate;

	@Column(name="new_password")
	private String newPassword;

	private int status;

	//bi-directional many-to-one association to EmployeeInfo
	@OneToMany(mappedBy="loginDetail")
	private List<EmployeeInfo> employeeInfos;

	//bi-directional many-to-one association to EmployeeInfo
	@ManyToOne
	@JoinColumn(name="employee_code")
	private EmployeeInfo employeeInfo;

	public LoginDetails() {
	}

	public int getLoginId() {
		return this.loginId;
	}

	public void setLoginId(int loginId) {
		this.loginId = loginId;
	}

	public String getConfirmPassword() {
		return this.confirmPassword;
	}

	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}

	public String getEmailId() {
		return this.emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public Date getLastLoginDate() {
		return this.lastLoginDate;
	}

	public void setLastLoginDate(Date lastLoginDate) {
		this.lastLoginDate = lastLoginDate;
	}

	public String getNewPassword() {
		return this.newPassword;
	}

	public void setNewPassword(String newPassword) {
		this.newPassword = newPassword;
	}

	public int getStatus() {
		return this.status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public List<EmployeeInfo> getEmployeeInfos() {
		return this.employeeInfos;
	}

	public void setEmployeeInfos(List<EmployeeInfo> employeeInfos) {
		this.employeeInfos = employeeInfos;
	}

	public EmployeeInfo addEmployeeInfo(EmployeeInfo employeeInfo) {
		getEmployeeInfos().add(employeeInfo);
		employeeInfo.setLoginDetail(this);

		return employeeInfo;
	}

	public EmployeeInfo removeEmployeeInfo(EmployeeInfo employeeInfo) {
		getEmployeeInfos().remove(employeeInfo);
		employeeInfo.setLoginDetails(null);

		return employeeInfo;
	}

	public EmployeeInfo getEmployeeInfo() {
		return this.employeeInfo;
	}

	public void setEmployeeInfo(EmployeeInfo employeeInfo) {
		this.employeeInfo = employeeInfo;
	}

}