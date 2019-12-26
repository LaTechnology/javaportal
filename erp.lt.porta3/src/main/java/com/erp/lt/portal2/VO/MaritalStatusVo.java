package com.erp.lt.portal2.VO;

import java.io.Serializable;

import org.springframework.web.bind.annotation.RestController;

/**
 * The persistent class for the marital_status database table.
 * 
 */
@RestController
public class MaritalStatusVo implements Serializable {
	private static final long serialVersionUID = 1L;

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