package com.erp.lt.portal.vo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

//import com.erp.lt.portal.model.DesignationType;
import com.erp.lt.portal.model.EmployeeInfo;

public class EmployeeHistoryVO implements Serializable {

	private static final long serialVersionUID = 479779926340535942L;

	private int id;

	private int addressAddressCode;

	private Date beginDate;

	private BigDecimal ctc;

	private String employerNmae;

	private Date endDate;

	private String reference;

	// private DesignationType designationType;
	private int designationCode;

	public int getDesignationCode() {
		return designationCode;
	}

	public void setDesignationCode(int designationCode) {
		this.designationCode = designationCode;
	}

	private String employeeCode;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getAddressAddressCode() {
		return addressAddressCode;
	}

	public void setAddressAddressCode(int addressAddressCode) {
		this.addressAddressCode = addressAddressCode;
	}

	public BigDecimal getCtc() {
		return ctc;
	}

	public void setCtc(BigDecimal ctc) {
		this.ctc = ctc;
	}

	public String getEmployerNmae() {
		return employerNmae;
	}

	public void setEmployerNmae(String employerNmae) {
		this.employerNmae = employerNmae;
	}

	public Date getBeginDate() {
		return beginDate;
	}

	public void setBeginDate(Date beginDate) {
		this.beginDate = beginDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public String getReference() {
		return reference;
	}

	public void setReference(String reference) {
		this.reference = reference;
	}

	public String getEmployeeCode() {
		return employeeCode;
	}

	public void setEmployeeCode(String employeeCode) {
		this.employeeCode = employeeCode;
	}

}
