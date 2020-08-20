package erp.ladera.portal.vo;

import java.io.Serializable;

public class DetailsStoreVo implements Serializable {

	
	private static final long serialVersionUID = -3550087672106092314L;
	
	private String name;
	private String password;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "DetailsStoreVo [name=" + name + ", password=" + password + ", getName()=" + getName()
				+ ", getPassword()=" + getPassword() + "]";
	}
	
	
	
	
	

}
