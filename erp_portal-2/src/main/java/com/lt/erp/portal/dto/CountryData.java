/**
 * 
 */
package com.lt.erp.portal.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author admin
 *
 */
@Entity(name = "country")
public class CountryData {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String code;
	private String countrydesc;
	private String prefix;
	
	private String prefixdes;
	public final String getPrefixdes() {
		return prefixdes;
	}
	public final void setPrefixdes(String prefixdes) {
		this.prefixdes = prefixdes;
	}
	public final String getCode() {
		return code;
	}
	public final void setCode(String code) {
		this.code = code;
	}
	public final String getCountrydesc() {
		return countrydesc;
	}
	public final void setCountrydesc(String countrydesc) {
		this.countrydesc = countrydesc;
	}
	public final String getPrefix() {
		return prefix;
	}
	public final void setPrefix(String prefix) {
		this.prefix = prefix;
	} 
	
}
