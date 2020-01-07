package com.erp.lt.portal.service;

import java.util.Map;

import com.erp.lt.portal.vo.MailRequestVO;
import com.erp.lt.portal.vo.MailResponseVO;

public interface EmailService {


	public MailResponseVO sendEmail(MailRequestVO request, Map<String, Object> model);
}
