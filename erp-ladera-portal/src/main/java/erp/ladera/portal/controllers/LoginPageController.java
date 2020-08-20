package erp.ladera.portal.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

import erp.ladera.portal.service.LoginPageService;
import erp.ladera.portal.service.impl.DefaultLoginPageService;
import erp.ladera.portal.vo.LoginPageVo;

@Controller
@RequestMapping("api/v1")
@SessionAttributes("loginPage")
public class LoginPageController {
	@Autowired
	LoginPageService loginPageService;
	public LoginPageService getLoginPageService() {
		return loginPageService;
	}

	public void setLoginPageService(LoginPageService loginPageService) {
		this.loginPageService = loginPageService;
	}


	@RequestMapping(value="/login",method=RequestMethod.GET)
	public String loginSetupForm(Model model) {
		
		model.addAttribute("loginPage", new LoginPageVo());
		return "login";
	}

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String checkRegisterDetails(@ModelAttribute("loginPage") LoginPageVo loginPageVo,
			BindingResult bindingResult, SessionStatus session) {

		Boolean status=getLoginPageService().checkLoginDetails(loginPageVo);
		if(status) {
		return "loginSuccess";
		}
		
			return "login";

	}
	@RequestMapping(value="/loginSuccess")
	public String loginSuccess(Model model) {
		
		return "loginSuccess";
		
	}
	
	
	

	
	

	
}
