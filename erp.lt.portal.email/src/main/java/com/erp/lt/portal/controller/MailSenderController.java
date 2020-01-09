package com.erp.lt.portal.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.erp.lt.portal.service.EmailService;
import com.erp.lt.portal.vo.MailRequestVO;
import com.erp.lt.portal.vo.MailResponseVO;

@RestController
public class MailSenderController {


	@Autowired
	private EmailService service;

	@PostMapping(path="/sendingEmail", consumes = {MediaType.APPLICATION_JSON_VALUE})
	public MailResponseVO sendEmail(@RequestBody MailRequestVO request) {
		Map<String, Object> model = new HashMap<>();
		model.put("Name", request.getName());
		model.put("location", "Guindy,chennai");
		return service.sendEmail(request,model);

	}
	
}
