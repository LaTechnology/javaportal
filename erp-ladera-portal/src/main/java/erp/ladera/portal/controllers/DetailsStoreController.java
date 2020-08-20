package erp.ladera.portal.controllers;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.support.SessionStatus;

import erp.ladera.portal.vo.DetailsStoreVo;

@Controller



public class DetailsStoreController {
	
	private static Logger logger = Logger.getLogger(DetailsStoreController.class);
	
	@RequestMapping(value="/details",method=RequestMethod.GET)
	public String getDetails(Model model) {
		model.addAttribute("detailsPage", new DetailsStoreVo());
		
		
		return "details";
	}
	@RequestMapping(value="/details",method=RequestMethod.POST)
	
	public String postDetails(@ModelAttribute("detailsPage")DetailsStoreVo detailspageVo,BindingResult bindingResult,SessionStatus status) {
		
		
		logger.debug(detailspageVo);
		return "loginSuccess";
	}

}
