package erp.ladera.portal.controllers;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

import erp.ladera.portal.service.DetailsService;
import erp.ladera.portal.service.HybrisRegistrationService;
import erp.ladera.portal.service.RegisterPageService;
import erp.ladera.portal.vo.RegisterPageVo;

@Controller
@RequestMapping("/api/v1")
@SessionAttributes("registerPage")

public class RegisterPageController {
	
	@Autowired
	RegisterPageService registerPageService;
	@Autowired
	HybrisRegistrationService hybrisRegistrationService;
	@Autowired
	DetailsService detailsService;
	public HybrisRegistrationService getHybrisRegistrationService() {
		return hybrisRegistrationService;
	}

	public void setHybrisRegistrationService(HybrisRegistrationService hybrisRegistrationService) {
		this.hybrisRegistrationService = hybrisRegistrationService;
	}
    

	public DetailsService getDetailsService() {
		return detailsService;
	}

	public void setDetailsService(DetailsService detailsService) {
		this.detailsService = detailsService;
	}

	
	public RegisterPageService getRegisterPageService() {
		return registerPageService;
	}

	public void setRegisterPageService(RegisterPageService registerPageService) {
		this.registerPageService = registerPageService;
	}

	@RequestMapping(value = "/addNew", method = RequestMethod.GET)

	public String setupForm(Model model) {
		RegisterPageVo registerPageVo = new RegisterPageVo();
		model.addAttribute("registerPage", registerPageVo);
		
		List<String> gender=Arrays.asList(" ","Male","Female");
		model.addAttribute("gender", gender);
		
		List<String> sendTo=Arrays.asList("Both","Local","Hybris");
		model.addAttribute("sendTo", sendTo);
		return "register";
	}

	@RequestMapping(value = "/addNew", method = RequestMethod.POST)
	public String submitForm(@ModelAttribute("registerPage") RegisterPageVo registerPageVo, BindingResult result,
			SessionStatus status) {
	if(registerPageVo.getSendTo().equals("Both")||registerPageVo.getSendTo().equals("Local")) {
		getRegisterPageService().saveRegisterDetails(registerPageVo);
	}
	if(registerPageVo.getSendTo().equals("Both")||registerPageVo.getSendTo().equals("Hybris")) {

	getHybrisRegistrationService().sendRegisterDetails(registerPageVo);
	}
		return "redirect:addNew/success";
	}

	@RequestMapping(value = "/addNew/success", method = RequestMethod.GET)
	public String success(Model model) {
		return "addSuccess";
	}
	@RequestMapping(value = "/allDetails", method = RequestMethod.GET)
	public String registerDetails(Model model) {
		
	List<RegisterPageVo> detailsVos=getDetailsService().getAllDetails();
	model.addAttribute("detailList", detailsVos);
		
		return "details";
	}
    @RequestMapping(value="/update/{id}",method=RequestMethod.GET)
	public String updateDetailsGet(Model model,@PathVariable(value="id") Integer id) {
    	
    	RegisterPageVo registerPageVo=getDetailsService().getDetailsById(id);
    	model.addAttribute("registerPage", registerPageVo);
    	List<String> gender=Arrays.asList(" ","Male","Female");
		model.addAttribute("gender", gender);
		
		return "updatedetails";
	}
    @RequestMapping(value="/update/{id}",method=RequestMethod.POST)

	public String updateDetailsPost(@ModelAttribute("registerPage") RegisterPageVo registerPageVo, BindingResult result,
			SessionStatus status) {
		getRegisterPageService().updateRegisterDetails(registerPageVo);

		return "addSuccess";
	}
    
    @RequestMapping(value="/view/{id}",method=RequestMethod.GET)
	public String getDetailsById(Model model,@PathVariable(value="id") Integer id) {
    	
    	RegisterPageVo registerPageVo=getDetailsService().getDetailsById(id);
    	model.addAttribute("registerPage", registerPageVo);
    	List<String> gender=Arrays.asList(" ","Male","Female");
		model.addAttribute("gender", gender);
		
		return "viewDetails";
	}

	
}
