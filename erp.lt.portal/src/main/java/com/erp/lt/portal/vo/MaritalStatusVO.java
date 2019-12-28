/**
 * 
 */
package com.erp.lt.portal.vo;

import java.io.Serializable;

/**
 * @author admin
 *
 */
public class MaritalStatusVO implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1968523884074160749L;

	private int code;

	private String title;

	
	
	public int getCode() {
		return this.code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
}
