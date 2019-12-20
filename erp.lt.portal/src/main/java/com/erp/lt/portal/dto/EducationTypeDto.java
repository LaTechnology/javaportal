/**
 * 
 */
package com.erp.lt.portal.dto;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * @author User
 *
 */
@Entity (name = "educationtype")
public class EducationTypeDto implements Serializable {
	
	/**
	 * 
	 */
	
	private static final long serialVersionUID = 6973545071896821454L;
	@Id
	private int  eduTypId;
	private String educationType;

	public int getEduTypId() {
	return eduTypId;
	}
	public void setEduTypId(int eduTypId) {
	this.eduTypId = eduTypId;
	}
	public String getEducationType() {
	return educationType;
	}
	public void setEducationType(String educationType) {
	this.educationType = educationType;
	}

}
