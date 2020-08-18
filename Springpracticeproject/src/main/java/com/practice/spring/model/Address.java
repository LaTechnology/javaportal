package com.practice.spring.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Address {


	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private int AddId;
	
	private String permanentaddress;

	
	


	public int getAddId() {
		return AddId;
	}


	public void setAddId(int addId) {
		AddId = addId;
	}


	public void setPermanentaddress(String permanentaddress) {
		this.permanentaddress = permanentaddress;
	}


	public String getPermanentaddress() {
		return permanentaddress;
	}


	

	

	

	
	}
