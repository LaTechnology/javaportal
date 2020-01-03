package com.erp.lt.portal.service.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.erp.lt.portal.model.EmployeeAddress;
import com.erp.lt.portal.repository.EmployeeAddressRepository;
import com.erp.lt.portal.service.EmployeeAddressService;
import com.erp.lt.portal.vo.EmployeeAddressVO;

@Service
public class EmployeeAddressServiceImpl implements EmployeeAddressService {
	@Autowired
	EmployeeAddressRepository addressRepository;

	@Override
	public EmployeeAddressVO getEmployeeAddress(int Id) {
		EmployeeAddressVO addressVO = new EmployeeAddressVO();
		Optional<EmployeeAddress> employeeaddress = addressRepository.getEmployeeAddress(Id);
		EmployeeAddress address = employeeaddress.get();
		
		  if (0 != address.getId()) { addressVO.setAddressCode(address.getId()); }
		  
		  if (null != address.getEmployeeInfo()) {
		  addressVO.setEmployeeInfo(address.getEmployeeInfo()); }
		  
		  if (null != address.getAddressline1()) {
		  addressVO.setAddressline1(address.getAddressline1()); } if (null !=
		  address.getAddressline2()) {
		  addressVO.setAddressline2(address.getAddressline2()); } if (null !=
		  address.getCity()) { addressVO.setCity(address.getCity()); } if (null !=
		  address.getCountry()) { addressVO.setCountry(address.getCountry()); } if
		  (null != address.getState()) { addressVO.setState(address.getState()); } if
		  (0 != address.getPincode()) { addressVO.setPincode(address.getPincode()); }
		  
		  if (0 != address.getId()) { addressVO.setAddressCode(address.getId()); } if
		  (0 != address.getAddressType().getCode()) {
		  addressVO.setAddressCode(address.getAddressType().getCode()); }
		 
		return addressVO;
	}
	@Override
	public void editemployeaddress(EmployeeAddressVO addressVO) {
		EmployeeAddress address= new EmployeeAddress();

		
		 if (0 != addressVO.getAddressCode()) {
		  address.setId(addressVO.getAddressCode());
		  
		  } if (null != addressVO.getAddressline1()) {
		  address.setAddressline1(addressVO.getAddressline1()); } if (null !=
		  addressVO.getAddressline2()) {
		  address.setAddressline2(addressVO.getAddressline2()); }
		  
		  if (null != addressVO.getEmployeeInfo()) {
		  address.setEmployeeInfo(addressVO.getEmployeeInfo()); }
		 
		if (null != addressVO.getCity()) {
			address.setCity(addressVO.getCity());
		}
		if (null != addressVO.getCountry()) {
			address.setCountry(addressVO.getCountry());
		}
		if (null != addressVO.getState()) {
			address.setState(addressVO.getState());

		}
		/*
		 * if (0 != addressVO.getPincode()) {
		 * address.setPincode(addressVO.getPincode()); }
		 */
		addressRepository.save(address);

	}

	@Override
	public void deleteemployeaddress(String employeeNumber) {
		if (employeeNumber != null)
			addressRepository.deleteById(Integer.parseInt(employeeNumber));
	}

	@Override
	public void addemployeaddress(EmployeeAddressVO employeeaddressvo) {
		EmployeeAddress address = new EmployeeAddress();

		/*
		 * if (0 != employeeaddressvo.getAddressCode()) {
		 * address.setId(employeeaddressvo.getAddressCode()); }
		 */

		if (null != employeeaddressvo.getCity()) {
			address.setCity(employeeaddressvo.getCity());
		}
		if (null != employeeaddressvo.getCountry()) {
			address.setCountry(employeeaddressvo.getCountry());
		}
		if (null != employeeaddressvo.getState()) {
			address.setState(employeeaddressvo.getState());

		}
		/*
		 * if (0 != employeeaddressvo.getPincode()) {
		 * address.setPincode(employeeaddressvo.getPincode()); }
		 */
		addressRepository.save(address);
	}
}