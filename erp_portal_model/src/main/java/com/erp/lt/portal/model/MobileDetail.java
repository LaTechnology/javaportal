package com.erp.lt.portal.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the mobile_details database table.
 * 
 */
@Entity
@Table(name="mobile_details")
@NamedQuery(name="MobileDetail.findAll", query="SELECT m FROM MobileDetail m")
public class MobileDetail implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int code;

	@Column(name="mobile_number_1")
	private int mobileNumber1;

	@Column(name="moblie_number_2")
	private int moblieNumber2;

	//bi-directional many-to-one association to CommunicationDetail
	@ManyToOne
	@JoinColumn(name="comminication_details_code")
	private CommunicationDetail communicationDetail;

	public MobileDetail() {
	}

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

	public CommunicationDetail getCommunicationDetail() {
		return this.communicationDetail;
	}

	public void setCommunicationDetail(CommunicationDetail communicationDetail) {
		this.communicationDetail = communicationDetail;
	}

}