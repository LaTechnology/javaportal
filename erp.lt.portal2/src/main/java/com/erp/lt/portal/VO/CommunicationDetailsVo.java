/**
 * 
 */
package com.erp.lt.portal.VO;

import java.io.Serializable;
import java.util.Date;

/**
 * @author User
 *
 */
public class CommunicationDetailsVo implements Serializable {
	
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 89819066551024177L;
	private int code;
	private String clientEmailId;
	private String companyEmailId;
	private String emergencyComunicationNumber;
	private int employeeCode;
	private Date endDate;
	private String personalEmailId;
	private Date beginDate;

	
	public int getCode() {
		return this.code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public Date getBeginDate() {
		return this.beginDate;
	}

	public void setBeginDate(Date beginDate) {
		this.beginDate = beginDate;
	}

	public String getClientEmailId() {
		return this.clientEmailId;
	}

	public void setClientEmailId(String clientEmailId) {
		this.clientEmailId = clientEmailId;
	}

	public String getCompanyEmailId() {
		return this.companyEmailId;
	}

	public void setCompanyEmailId(String companyEmailId) {
		this.companyEmailId = companyEmailId;
	}

	public String getEmergencyComunicationNumber() {
		return this.emergencyComunicationNumber;
	}

	public void setEmergencyComunicationNumber(String emergencyComunicationNumber) {
		this.emergencyComunicationNumber = emergencyComunicationNumber;
	}

	public int getEmployeeCode() {
		return this.employeeCode;
	}

	public void setEmployeeCode(int employeeCode) {
		this.employeeCode = employeeCode;
	}

	public Date getEndDate() {
		return this.endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public String getPersonalEmailId() {
		return this.personalEmailId;
	}

	public void setPersonalEmailId(String personalEmailId) {
		this.personalEmailId = personalEmailId;
	}
}
