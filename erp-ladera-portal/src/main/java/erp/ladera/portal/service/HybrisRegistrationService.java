package erp.ladera.portal.service;

import org.springframework.stereotype.Service;

import erp.ladera.portal.vo.RegisterPageVo;

@Service
public interface HybrisRegistrationService {

	
	public void sendRegisterDetails(RegisterPageVo registerPageVo);
}
