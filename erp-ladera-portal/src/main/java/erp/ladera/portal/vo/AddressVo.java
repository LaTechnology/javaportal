package erp.ladera.portal.vo;

import java.io.Serializable;

public class AddressVo  implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -6241550001193651288L;
	
	private Integer addressId;
	private String line1;
	private String line2;
	private String city;
	private String state;
	private String country;
	private Integer pincode;
	public String getLine1() {
		return line1;
	}
	public void setLine1(String line1) {
		this.line1 = line1;
	}
	public String getLine2() {
		return line2;
	}
	public void setLine2(String line2) {
		this.line2 = line2;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public Integer getPincode() {
		return pincode;
	}
	public void setPincode(Integer pincode) {
		this.pincode = pincode;
	}
	public Integer getAddressId() {
		return addressId;
	}
	public void setAddressId(Integer addressId) {
		this.addressId = addressId;
	}
	
	@Override
	public String toString() {
		return "AddressVo [line1=" + line1 + ", line2=" + line2 + ", city=" + city + ", state=" + state + ", country="
				+ country + ", pincode=" + pincode + ", getLine1()=" + getLine1() + ", getLine2()=" + getLine2()
				+ ", getCity()=" + getCity() + ", getState()=" + getState() + ", getCountry()=" + getCountry()
				+ ", getPincode()=" + getPincode() + "]";
	}
}
