/**
 * 
 */
package com.erp.lt.portal.VO;

import java.io.Serializable;

/**
 * @author User
 *
 */
public class MobileDetailsVO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -9025950898725704300L;
	
	
	private int code;
	private int mobileNumber1;
	private int moblieNumber2;
	
	public int getCode() {
		return this.code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public int getMobileNumber1() {
		return this.mobileNumber1;
	}

	public void setMobileNumber1(int mobileNumber1) {
		this.mobileNumber1 = mobileNumber1;
	}

	public int getMoblieNumber2() {
		return this.moblieNumber2;
	}

	public void setMoblieNumber2(int moblieNumber2) {
		this.moblieNumber2 = moblieNumber2;
	}

}
