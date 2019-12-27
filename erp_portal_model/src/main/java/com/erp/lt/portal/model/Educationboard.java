package com.erp.lt.portal.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the educationboard database table.
 * 
 */
@Entity
@NamedQuery(name="Educationboard.findAll", query="SELECT e FROM Educationboard e")
public class Educationboard implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int code;

	private String boardType;

	//bi-directional many-to-one association to EducationDetail
	@OneToMany(mappedBy="educationboard")
	private List<EducationDetail> educationDetails;

	public Educationboard() {
	}

	public int getCode() {
		return this.code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getBoardType() {
		return this.boardType;
	}

	public void setBoardType(String boardType) {
		this.boardType = boardType;
	}

	public List<EducationDetail> getEducationDetails() {
		return this.educationDetails;
	}

	public void setEducationDetails(List<EducationDetail> educationDetails) {
		this.educationDetails = educationDetails;
	}

	public EducationDetail addEducationDetail(EducationDetail educationDetail) {
		getEducationDetails().add(educationDetail);
		educationDetail.setEducationboard(this);

		return educationDetail;
	}

	public EducationDetail removeEducationDetail(EducationDetail educationDetail) {
		getEducationDetails().remove(educationDetail);
		educationDetail.setEducationboard(null);

		return educationDetail;
	}

}