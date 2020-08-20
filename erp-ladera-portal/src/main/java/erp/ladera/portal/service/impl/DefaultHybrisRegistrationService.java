package erp.ladera.portal.service.impl;

import java.security.KeyStore;
import java.util.Arrays;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.google.gson.Gson;

import erp.ladera.portal.requests.RegisterPageVoRequest;
import erp.ladera.portal.response.RegisterPageVoResponse;
import erp.ladera.portal.service.HybrisRegistrationService;
import erp.ladera.portal.vo.RegisterPageVo;

public class DefaultHybrisRegistrationService implements HybrisRegistrationService {
	
	@Autowired
	private RestTemplate restTemplate;
	public RestTemplate getRestTemplate() {
		return restTemplate;
	}


	public void setRestTemplate(RestTemplate restTemplate) {
		this.restTemplate = restTemplate;
	}
	
	private Logger logger = Logger.getLogger(DefaultHybrisRegistrationService.class);

	
	
	
	  public void sendRegisterDetails(RegisterPageVo registerPageVo) {
	  
	  
	  Gson gson = new Gson();
	  
	  RegisterPageVoRequest registerPageVoRequest = new RegisterPageVoRequest();
	  registerPageVoRequest.setRegisterPageVo(registerPageVo); String
	  gsonString=gson.toJson(registerPageVoRequest);
	  System.out.println(gsonString); logger.debug(gsonString); HttpHeaders headers
	  = new HttpHeaders(); headers.setContentType(MediaType.APPLICATION_JSON);
	  headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON)); final
	  HttpEntity<RegisterPageVoRequest> httpEntity = new
	  HttpEntity<RegisterPageVoRequest>(registerPageVoRequest, headers);
	  
	  String url="http://goldelectronics.local:9001/goldelectronicscommerceservices/v2/api/v1/integration/fromErp";
	  
	  String url1="http://localhost:9001/goldelectronicswebservices/api/v1/integration/fromErp";
	  ResponseEntity<RegisterPageVoResponse> responseEntity =
	  getRestTemplate().exchange(url, HttpMethod.GET,
	  httpEntity,RegisterPageVoResponse.class);
	  
	  
	  }
	 
	 
	/*
	 * public void sendRegisterDetails(RegisterPageVo registerPageVo) {
	 * 
	 * Gson gson = new Gson(); RegisterPageVoRequest registerPageVoRequest = new
	 * RegisterPageVoRequest();
	 * registerPageVoRequest.setRegisterPageVo(registerPageVo); String
	 * gsonString=gson.toJson(registerPageVoRequest);
	 * System.out.println(gsonString); logger.debug(gsonString);
	 * 
	 * HttpHeaders headers = new HttpHeaders();
	 * headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
	 * HttpEntity<RegisterPageVoRequest> entity = new
	 * HttpEntity<RegisterPageVoRequest>(registerPageVoRequest,headers);
	 * 
	 * getRestTemplate().exchange(
	 * "http://goldelectronics.local:9001/goldelectronicsstorefront/integration/fromErp",
	 * HttpMethod.GET, entity, String.class).getBody(); }
	 */
	}
	


	

	

