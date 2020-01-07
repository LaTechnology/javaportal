package com.erp.lt.portal.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.erp.lt.portal.model.AddressType;
import com.erp.lt.portal.model.EmployeeAddress;
import com.erp.lt.portal.model.EmployeeInfo;
import com.erp.lt.portal.repository.EmployeeAddressRepository;
import com.erp.lt.portal.repository.EmployeeAddressTypeRepository;
import com.erp.lt.portal.repository.EmployeeInfoRepository;
import com.erp.lt.portal.service.EmployeeAddressService;
import com.erp.lt.portal.vo.EmployeeAddressVO;

import javassist.NotFoundException;

@Service
public class EmployeeAddressServiceImpl implements EmployeeAddressService {
	@Autowired
	EmployeeAddressRepository addressRepository;
	
	@Autowired
	EmployeeInfoRepository  employeeInfoRepository;
	
	@Autowired
	EmployeeAddressTypeRepository employeeAddressTypeRepository;

	@Override
	public List<EmployeeAddressVO> getEmployeeAddress(int Id) {
		EmployeeAddressVO addressVO =null;
		List<EmployeeAddressVO> addressDetailList = new ArrayList<EmployeeAddressVO>();
		List<EmployeeAddress> employeeaddress = addressRepository.getEmployeeAddress(Id);
		for(EmployeeAddress address: employeeaddress) {
		addressVO= new EmployeeAddressVO();
		
        EmployeeInfo employeeInfo= employeeInfoRepository.getOne(Id);
        		
		if(0!=address.getAddressCode()) {
			addressVO.setAddressCode(address.getAddressCode());
		}
		  
		 if (null != address.getAddressLine1()) {
		 addressVO.setAddressline1(address.getAddressLine1()); 
		 }
		  
		 if (null !=address.getAddressLine2()) {
		  addressVO.setAddressline2(address.getAddressLine2());
		  } 
		 
		 
		 if (null != address.getCity()) {
			 addressVO.setCity(address.getCity());
			 } 
		 
		 if (null != address.getCountry()) { 
			 addressVO.setCountry(address.getCountry()); 
			 } 
		 
		 if(null != address.getState()) { 
			 addressVO.setState(address.getState()); 
			 } 
		 
		 if(null!= address.getBeginDate()) {
			 addressVO.setEnddate(address.getEndDate());
		 }
		 
		 if(null!= address.getEndDate()) {
			 addressVO.setBegindate(address.getBeginDate());
		 }
		 if(null != address.getPincode()) { 
			 addressVO.setPincode(address.getPincode());
			 }
		 if(0!= employeeInfo.getemployeeCode()) {
			 addressVO.setEmployeeCode(employeeInfo.getemployeeCode());
		 }
		 
		 if(0!=address.getAddressType().getAddressTypeCode()) {
			 addressVO.setAddressTypeCode(address.getAddressType().getAddressTypeCode());
		 }
		 addressDetailList.add(addressVO);
		 
		}
		return addressDetailList;
	
	}
	@Override
	public boolean editemployeaddress(EmployeeAddressVO addressVO) throws NotFoundException {
		
		EmployeeAddress old = null;
		boolean status = false;

		Optional<EmployeeAddress> exisitingEmployeeAddress = addressRepository.findById(addressVO.getAddressCode());
		Optional<AddressType> addressType = null;
		Optional<EmployeeAddress> empaddress=null;
		Optional<EmployeeInfo> empInfo	 = null;

 
		if (addressVO.getAddressTypeCode() != 0) {
			addressType = employeeAddressTypeRepository.findById(addressVO.getAddressTypeCode());
		}
		if (addressVO.getEmployeeCode()!=0) {
			empInfo = employeeInfoRepository.findById(addressVO.getEmployeeCode());
			
		}
         if(addressVO.getEmployeeCode()!=0) {
        	 empaddress=addressRepository.findById(addressVO.getEmployeeCode());

 		}
	     if(null!=exisitingEmployeeAddress) {
	    	old= exisitingEmployeeAddress.get(); 
	        
	    	old.setAddressCode(addressVO.getAddressCode());
	    	old.setAddressLine1(addressVO.getAddressline1());
	    	old.setAddressLine2(addressVO.getAddressline2());
	    	old.setBeginDate(addressVO.getBegindate());
	    	old.setCity(addressVO.getCity());
	    	old.setCountry(addressVO.getCountry());
	    	old.setEndDate(addressVO.getEnddate());
	    	old.setPincode(addressVO.getPincode());
	    	old.setState(addressVO.getState());
	    	old.setAddressType(addressType.get());
	    	old.setEmployeeInfo(empInfo.get());
	     }
	     addressRepository.save(old);
			status = true;
			if (!exisitingEmployeeAddress.isPresent()) {
				throw new NotFoundException("Employee not found");
			}
			return status;
}
		
	@Override
	public void deleteemployeaddress(int Id) {
		if(Id!=0)
             
			addressRepository.deleteById(Id);
 
	}

	@Override
	public void addemployeaddress(EmployeeAddressVO employeeaddressvo) {
		EmployeeAddress address = new EmployeeAddress();
        Optional<EmployeeAddress> empaddress=null;
		Optional<AddressType> addressType = null;
		
		Optional<EmployeeInfo> employeeinfo = null;
 
		if (0!=employeeaddressvo.getAddressTypeCode()) {
			addressType = employeeAddressTypeRepository.findById(employeeaddressvo.getAddressTypeCode());
		}
		

		if (0!=employeeaddressvo.getEmployeeCode()) {
			employeeinfo = employeeInfoRepository.findById(employeeaddressvo.getEmployeeCode());
		}
		  
		
  		if (0 != employeeaddressvo.getAddressCode()) {
			address.setAddressCode(employeeaddressvo.getAddressCode());
 
		}
		if (null !=employeeaddressvo.getAddressline1()){
			address.setAddressLine1(employeeaddressvo.getAddressline1());
		}

		if (null !=employeeaddressvo.getAddressline2()){
			address.setAddressLine2(employeeaddressvo.getAddressline2());
		}
 
 


		if (null !=employeeaddressvo.getBegindate()){
			address.setBeginDate(employeeaddressvo.getBegindate());
		}
 
		if (null !=employeeaddressvo.getEnddate()){
			address.setEndDate(employeeaddressvo.getEnddate());
		} 
		if (null != employeeaddressvo.getCity()) {
			address.setCity(employeeaddressvo.getCity());
		}

		if (null != employeeaddressvo.getState()) {
			address.setState(employeeaddressvo.getState());
		}
 
		
		if(null!= employeeaddressvo.getPincode()) {
			address.setPincode(employeeaddressvo.getPincode());
		}
        
		if(null!= employeeaddressvo.getCity())
		{
			address.setCity(employeeaddressvo.getCity());
		}
		if(null != employeeaddressvo.getCountry()) {
			address.setCountry(employeeaddressvo.getCountry());
		}
        if(null!=addressType) {
        	
        	address.setAddressType(addressType.get());
        }
        
        if(null!= employeeinfo) {
        	address.setEmployeeInfo(employeeinfo.get());
        } 
		addressRepository.save(address);
	}
}