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
@Entity(name = "employeecommunicationinfo")
public class EmployeeComuniVO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4485369931584677194L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)

	private long empId;
	private String mobno;
	private String companymailid;
	private String Internetemailid;

	private String Emailid;
	private String EmergencyConNo;
	private String VOIP;

	public final long getEmpId() {
		return empId;
	}

	public final void setEmpId(long empId) {
		this.empId = empId;
	}

	public final String getMobno() {
		return mobno;
	}

	public final void setMobno(String mobno) {
		this.mobno = mobno;
	}

	public final String getCompanymailid() {
		return companymailid;
	}

	public final void setCompanymailid(String companymailid) {
		this.companymailid = companymailid;
	}

	public final String getInternetemailid() {
		return Internetemailid;
	}

	public final void setInternetemailid(String internetemailid) {
		Internetemailid = internetemailid;
	}

	public final String getEmailid() {
		return Emailid;
	}

	public final void setEmailid(String emailid) {
		Emailid = emailid;
	}

	public final String getEmergencyConNo() {
		return EmergencyConNo;
	}

	public final void setEmergencyConNo(String emergencyConNo) {
		EmergencyConNo = emergencyConNo;
	}

	public final String getVOIP() {
		return VOIP;
	}

	public final void setVOIP(String vOIP) {
		VOIP = vOIP;
	}

	public static final long getSerialversionuid() {
		return serialVersionUID;
	}

}
