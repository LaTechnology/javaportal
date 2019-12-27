/**
 * 
 */
package com.erp.lt.portal.vo;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import com.erp.lt.portal.model.EmployeeInfo;
import com.erp.lt.portal.model.MobileDetail;

/**
 * @author User
 *
 */
public class CommunicationDetailsVO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1053736679110683910L;
	
	 
	private int code;//1

	 
	private Date beginDate;//2
 
	private String clientEmailId;//3
 
	private String companyEmailId;//4
 
	public int getCode() {
		return code;
	}


	public void setCode(int code) {
		this.code = code;
	}


	public Date getBeginDate() {
		return beginDate;
	}


	public void setBeginDate(Date beginDate) {
		this.beginDate = beginDate;
	}


	public String getClientEmailId() {
		return clientEmailId;
	}


	public void setClientEmailId(String clientEmailId) {
		this.clientEmailId = clientEmailId;
	}


	public String getCompanyEmailId() {
		return companyEmailId;
	}


	public void setCompanyEmailId(String companyEmailId) {
		this.companyEmailId = companyEmailId;
	}


	public String getEmergencyComunicationNumber() {
		return emergencyComunicationNumber;
	}


	public void setEmergencyComunicationNumber(String emergencyComunicationNumber) {
		this.emergencyComunicationNumber = emergencyComunicationNumber;
	}


	public Date getEndDate() {
		return endDate;
	}


	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}


	public String getPersonalEmailId() {
		return personalEmailId;
	}


	public void setPersonalEmailId(String personalEmailId) {
		this.personalEmailId = personalEmailId;
	}


	public EmployeeInfo getEmployeeInfo() {
		return employeeInfo;
	}


	public void setEmployeeInfo(EmployeeInfo employeeInfo) {
		this.employeeInfo = employeeInfo;
	}


	public List<MobileDetail> getMobileDetails() {
		return mobileDetails;
	}


	public void setMobileDetails(List<MobileDetail> mobileDetails) {
		this.mobileDetails = mobileDetails;
	}


	private String emergencyComunicationNumber;
 
	private Date endDate;

 
	private String personalEmailId;
 
	private EmployeeInfo employeeInfo;

	
	private List<MobileDetail> mobileDetails;

}
