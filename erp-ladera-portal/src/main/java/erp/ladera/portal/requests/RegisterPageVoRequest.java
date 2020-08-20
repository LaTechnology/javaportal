package erp.ladera.portal.requests;

import java.io.Serializable;

import erp.ladera.portal.vo.RegisterPageVo;

public class RegisterPageVoRequest implements Serializable {

	
	private RegisterPageVo registerPageVo;

	public RegisterPageVo getRegisterPageVo() {
		return registerPageVo;
	}

	public void setRegisterPageVo(RegisterPageVo registerPageVo) {
		this.registerPageVo = registerPageVo;
	}
}
