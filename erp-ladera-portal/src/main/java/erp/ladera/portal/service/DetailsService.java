package erp.ladera.portal.service;

import java.util.List;

import org.springframework.stereotype.Service;

import erp.ladera.portal.model.RegisterPageModel;
import erp.ladera.portal.vo.RegisterPageVo;

@Service
public interface DetailsService {
	
	public List<RegisterPageVo> getAllDetails();
	
	public RegisterPageVo getDetailsById(Integer id);

}
