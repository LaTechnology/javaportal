package erp.ladera.portal.service;

import org.springframework.stereotype.Service;

import erp.ladera.portal.vo.LoginPageVo;

@Service
public interface LoginPageService {

	
	public Boolean checkLoginDetails(LoginPageVo loginPageVo);
}
