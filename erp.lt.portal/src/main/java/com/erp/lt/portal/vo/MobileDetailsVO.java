/**
 * 
 */
package com.erp.lt.portal.vo;

import java.io.Serializable;

import com.erp.lt.portal.model.CommunicationDetail;

/**
 * @author User
 *
 */
public class MobileDetailsVO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2726086685544811796L;

	private int code;

	private int mobileNumber1;

	private int moblieNumber2;

	private int communicationDetail;
	
	private int status;
	
	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public int getMobileNumber1() {
		return mobileNumber1;
	}

	public void setMobileNumber1(int mobileNumber1) {
		this.mobileNumber1 = mobileNumber1;
	}

	public int getMoblieNumber2() {
		return moblieNumber2;
	}

	public void setMoblieNumber2(int moblieNumber2) {
		this.moblieNumber2 = moblieNumber2;
	}

	public int getCommunicationDetail() {
		return communicationDetail;
	}

	public void setCommunicationDetail(int communicationDetail) {
		this.communicationDetail = communicationDetail;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}


}
