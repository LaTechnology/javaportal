package erp.ladera.portal.service.impl;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.stereotype.Service;

import erp.ladera.portal.model.AddressModel;
import erp.ladera.portal.model.RegisterPageModel;
import erp.ladera.portal.repository.RegisterPageRepository;
import erp.ladera.portal.service.RegisterPageService;
import erp.ladera.portal.vo.RegisterPageVo;


public class DefaultRegisterPageService implements RegisterPageService {

	@Autowired
	RegisterPageRepository registerPageRepository;
	

	public void saveRegisterDetails(RegisterPageVo registerPageVo) {
		final Logger logger = Logger.getLogger(DefaultRegisterPageService.class);
		logger.debug(registerPageVo);
		RegisterPageModel registerPageModel = new RegisterPageModel();
		AddressModel addressModel= new AddressModel();
		registerPageModel.setFirstName(registerPageVo.getFirstName());
		registerPageModel.setLastName(registerPageVo.getLastName());
		registerPageModel.setEmail(registerPageVo.getEmail());
		registerPageModel.setPassword(registerPageVo.getPassword());
		registerPageModel.setGender(registerPageVo.getGender());
		addressModel.setLine1(registerPageVo.getAddressVo().getLine1());
		addressModel.setLine2(registerPageVo.getAddressVo().getLine2());
		addressModel.setCity(registerPageVo.getAddressVo().getCity());
		addressModel.setState(registerPageVo.getAddressVo().getState());
		addressModel.setCountry(registerPageVo.getAddressVo().getCountry());
		addressModel.setPincode(registerPageVo.getAddressVo().getPincode());
		registerPageModel.setAddressModel(addressModel);
		logger.debug(registerPageModel);
		registerPageRepository.saveRegisterDetails(registerPageModel);

	}

	public void updateRegisterDetails(RegisterPageVo registerPageVo) {
		
		final Logger logger = Logger.getLogger(DefaultRegisterPageService.class);
		logger.debug(registerPageVo);
		RegisterPageModel registerPageModel = new RegisterPageModel();
		AddressModel addressModel= new AddressModel();
		registerPageModel.setId(registerPageVo.getId());
		registerPageModel.setFirstName(registerPageVo.getFirstName());
		registerPageModel.setLastName(registerPageVo.getLastName());
		registerPageModel.setEmail(registerPageVo.getEmail());
		registerPageModel.setPassword(registerPageVo.getPassword());
		registerPageModel.setGender(registerPageVo.getGender());
		
		addressModel.setLine1(registerPageVo.getAddressVo().getLine1());
		addressModel.setLine2(registerPageVo.getAddressVo().getLine2());
		addressModel.setCity(registerPageVo.getAddressVo().getCity());
		addressModel.setState(registerPageVo.getAddressVo().getState());
		addressModel.setCountry(registerPageVo.getAddressVo().getCountry());
		addressModel.setPincode(registerPageVo.getAddressVo().getPincode());
		registerPageModel.setAddressModel(addressModel);
		logger.debug(registerPageModel);
		registerPageRepository.saveRegisterDetails(registerPageModel);
	}

}
