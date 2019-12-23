package com.erp.lt.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the educationtype database table.
 * 
 */
@Entity
@NamedQuery(name="Educationtype.findAll", query="SELECT e FROM Educationtype e")
public class Educationtype implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int code;

	private String educationStandards;

	//bi-directional many-to-one association to EducationDetail
	@OneToMany(mappedBy="educationtype")
	private List<EducationDetail> educationDetails;

	public Educationtype() {
	}

	public int getCode() {
		return this.code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getEducationStandards() {
		return this.educationStandards;
	}

	public void setEducationStandards(String educationStandards) {
		this.educationStandards = educationStandards;
	}

	public List<EducationDetail> getEducationDetails() {
		return this.educationDetails;
	}

	public void setEducationDetails(List<EducationDetail> educationDetails) {
		this.educationDetails = educationDetails;
	}

	public EducationDetail addEducationDetail(EducationDetail educationDetail) {
		getEducationDetails().add(educationDetail);
		educationDetail.setEducationtype(this);

		return educationDetail;
	}

	public EducationDetail removeEducationDetail(EducationDetail educationDetail) {
		getEducationDetails().remove(educationDetail);
		educationDetail.setEducationtype(null);

		return educationDetail;
	}

}