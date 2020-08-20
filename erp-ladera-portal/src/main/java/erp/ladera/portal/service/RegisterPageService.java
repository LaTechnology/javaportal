package erp.ladera.portal.service;

import org.springframework.stereotype.Service;

import erp.ladera.portal.vo.RegisterPageVo;

@Service
public interface RegisterPageService {
	
	public void saveRegisterDetails(RegisterPageVo registerPageVo);

	public void updateRegisterDetails(RegisterPageVo registerPageVo);
}
