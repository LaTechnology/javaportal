package erp.ladera.portal.vo;

import java.io.Serializable;



public class RegisterPageVo implements Serializable{

	
	
	private static final long serialVersionUID = 1L;
		private Integer id;
	    private String firstName;
	   
	    private String lastName;
	    private String email;
	    private String password;
	    private String gender;
	    private String sendTo;
	    public AddressVo getAddressVo() {
			return addressVo;
		}
		public void setAddressVo(AddressVo addressVo) {
			this.addressVo = addressVo;
		}
		private AddressVo addressVo;
		public String getGender() {
			return gender;
		}
		public void setGender(String gender) {
			this.gender = gender;
		}
		public Integer getId() {
			return id;
		}
		public void setId(Integer id) {
			this.id = id;
		}
		public String getFirstName() {
			return firstName;
		}
		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}
		public String getLastName() {
			return lastName;
		}
		public void setLastName(String lastName) {
			this.lastName = lastName;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		@Override
		public String toString() {
			return "RegisterPageVo [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", email="
					+ email + ", gender=" + gender + ", addressVo=" + addressVo + ", getAddressVo()=" + getAddressVo()
					+ ", getGender()=" + getGender() + ", getId()=" + getId() + ", getFirstName()=" + getFirstName()
					+ ", getLastName()=" + getLastName() + ", getEmail()=" + getEmail() + "]";
		}
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
		public String getSendTo() {
			return sendTo;
		}
		public void setSendTo(String sendTo) {
			this.sendTo = sendTo;
		}
		
		
		

}
