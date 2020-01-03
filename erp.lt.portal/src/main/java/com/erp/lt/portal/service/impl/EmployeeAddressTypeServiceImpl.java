package com.erp.lt.portal.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.erp.lt.portal.model.AddressType;
import com.erp.lt.portal.repository.EmployeeAddressTypeRepository;
import com.erp.lt.portal.service.EmployeeAddressTypeService;
import com.erp.lt.portal.vo.EmployeeAddressTypeVO;

@Service
public class EmployeeAddressTypeServiceImpl implements EmployeeAddressTypeService {
	@Autowired
	EmployeeAddressTypeRepository empaddresstyperepository;
	@Override
	public EmployeeAddressTypeVO  getemployeeaddresstype(int empcode) {

		EmployeeAddressTypeVO employeeaddrsstypeVO = new EmployeeAddressTypeVO();
	    Optional<AddressType> type	=empaddresstyperepository.findById(empcode);
	    AddressType addresstype= type.get();
		
	   if(0 != addresstype.getAddressTypeCode()) {
		   employeeaddrsstypeVO.setCode(addresstype.getAddressTypeCode());
	   }
	   if(null != addresstype.getTitle()) {
		   employeeaddrsstypeVO.setTitle(addresstype.getTitle());
	   }
	   return employeeaddrsstypeVO;
	}
}
	/*@Override
	public List<EmployeeAddressTypeVO> getallemployeeaddresstype(EmployeeAddressTypeVO employeeaddresstypevo) {
		// TODO Auto-generated method stub
		return null;
	}

}

	
	
	
	
	
	/*@Override
	public List<EmployeeAddressTypeVO> getallemployeeaddresstype(EmployeeAddressTypeVO employeeaddresstypevo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addemployeeaddresstype(EmployeeAddressTypeVO employeeaddresstypevo) {
		// TODO Auto-generated method stub

	}

	

	@Override
	public void editemployeeaddresstype(EmployeeAddressTypeVO employeeaddresstypevo) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteemployeeaddresstype(int code) {
		// TODO Auto-generated method stub

	}

	@Override
	public EmployeeAddressTypeVO getemployeeaddresstype(int empcode) {
		// TODO Auto-generated method stub
		return null;
	}
}  */