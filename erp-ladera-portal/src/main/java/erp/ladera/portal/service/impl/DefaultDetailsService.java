package erp.ladera.portal.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import erp.ladera.portal.model.AddressModel;
import erp.ladera.portal.model.RegisterPageModel;
import erp.ladera.portal.repository.RegisterPageRepository;
import erp.ladera.portal.service.DetailsService;
import erp.ladera.portal.vo.AddressVo;
import erp.ladera.portal.vo.RegisterPageVo;

public class DefaultDetailsService implements DetailsService {

	@Autowired
	RegisterPageRepository registerPageRepository;
	
	private  Logger logger = Logger.getLogger(DefaultDetailsService.class);
	
	public List<RegisterPageVo> getAllDetails() {
		
	List<RegisterPageModel> details = registerPageRepository.getRegisterDetails();
	
	List<RegisterPageVo> detailsVos= new ArrayList<RegisterPageVo>();
	for(RegisterPageModel registerPageModel:details) {
		RegisterPageVo registerPageVo = new RegisterPageVo();
		registerPageVo.setFirstName(registerPageModel.getFirstName());
		registerPageVo.setLastName(registerPageModel.getLastName());
		registerPageVo.setGender(registerPageModel.getGender());
		registerPageVo.setEmail(registerPageModel.getEmail());
		registerPageVo.setId(registerPageModel.getId());
	//	registerPageVo.getAddressVo().setAddressId(registerPageModel.getAddressModel().getAddressId());
		logger.debug(registerPageVo);
		detailsVos.add(registerPageVo);
	}
	
		return detailsVos;
	}

	public RegisterPageVo getDetailsById(Integer id) {
		List<RegisterPageModel> details = registerPageRepository.getRegisterDetailsById(id);
		RegisterPageVo registerPageVo = null;
		logger.debug(details.get(0).getAddressModel().getCity());
		for (RegisterPageModel registerPageModel : details) {
			registerPageVo = new RegisterPageVo();
			registerPageVo.setFirstName(registerPageModel.getFirstName());
			registerPageVo.setLastName(registerPageModel.getLastName());
			registerPageVo.setGender(registerPageModel.getGender());
			registerPageVo.setEmail(registerPageModel.getEmail());
			registerPageVo.setId(registerPageModel.getId());
			AddressModel addressModel = registerPageModel.getAddressModel();
			AddressVo addressVo = new AddressVo();
			addressVo.setPincode(addressModel.getPincode());
			addressVo.setLine1(addressModel.getLine1());
			addressVo.setLine2(addressModel.getLine2());
			addressVo.setState(addressModel.getState());
			addressVo.setCountry(addressModel.getCountry());
			addressVo.setCity(addressModel.getCity());
			registerPageVo.setAddressVo(addressVo);

			logger.debug(registerPageVo);
		}

		return registerPageVo;
	}
}
