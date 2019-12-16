/**
 * 
 */
package com.lt.erp.portal.dto;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * @author admin
 *
 */
@Entity(name = "customer_address")
public class AddressVO implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer customer_address_id;
	private String addressLine1;
	private String addressLine2;
	private String city;
	private String country;
	private String pincode;
	private String state;

	public final String getAddressLine1() {
		return addressLine1;
	}

	public final void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}

	public final String getAddressLine2() {
		return addressLine2;
	}

	public final void setAddressLine2(String addressLine2) {
		this.addressLine2 = addressLine2;
	}

	public final String getCity() {
		return city;
	}

	public final void setCity(String city) {
		this.city = city;
	}

	public final String getCountry() {
		return country;
	}

	public final void setCountry(String country) {
		this.country = country;
	}

	public final String getZipcode() {
		return pincode;
	}

	public final void setZipcode(String zipcode) {
		this.pincode = zipcode;
	}

	public final String getState() {
		return state;
	}

	public final void setState(String state) {
		this.state = state;
	}

}
