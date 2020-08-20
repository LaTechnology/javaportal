package erp.ladera.portal.service.impl;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import erp.ladera.portal.model.RegisterPageModel;
import erp.ladera.portal.repository.RegisterPageRepository;
import erp.ladera.portal.service.LoginPageService;
import erp.ladera.portal.vo.LoginPageVo;

public class DefaultLoginPageService implements LoginPageService {

	@Autowired
	RegisterPageRepository registerPageRepository;

	private Logger logger = Logger.getLogger(DefaultLoginPageService.class);

	public Boolean checkLoginDetails(LoginPageVo loginPageVo) {
		
	List<RegisterPageModel> registerDetialsModel=	registerPageRepository.getRegisterDetails();
	
	for(RegisterPageModel registerPageModel:registerDetialsModel) {
   
	String email=registerPageModel.getEmail();
	String pwd=registerPageModel.getPassword();
		  
			if (loginPageVo.getUsername().equals(email)
					&& loginPageVo.getPassword().equals(pwd)) {
       
				return true;
			}
			
		
	}
		
	logger.debug(registerDetialsModel);
		
		return false;
	}

}
