package com.erp.lt.portal.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the designation_type database table.
 * 
 */
@Entity
@Table(name="designation_type")
@NamedQuery(name="DesignationType.findAll", query="SELECT d FROM DesignationType d")
public class DesignationType implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int code;

	private String description;

	private byte status;

	//bi-directional many-to-one association to EmployementHistory
	@OneToMany(mappedBy="designationType")
	private List<EmployementHistory> employementHistories;

	public DesignationType() {
	}

	public int getCode() {
		return this.code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public byte getStatus() {
		return this.status;
	}

	public void setStatus(byte status) {
		this.status = status;
	}

	public List<EmployementHistory> getEmployementHistories() {
		return this.employementHistories;
	}

	public void setEmployementHistories(List<EmployementHistory> employementHistories) {
		this.employementHistories = employementHistories;
	}

	public EmployementHistory addEmployementHistory(EmployementHistory employementHistory) {
		getEmployementHistories().add(employementHistory);
		employementHistory.setDesignationType(this);

		return employementHistory;
	}

	public EmployementHistory removeEmployementHistory(EmployementHistory employementHistory) {
		getEmployementHistories().remove(employementHistory);
		employementHistory.setDesignationType(null);

		return employementHistory;
	}

}