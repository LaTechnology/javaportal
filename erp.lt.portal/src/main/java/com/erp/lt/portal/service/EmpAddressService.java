/**
 * 
 */
package com.erp.lt.portal.service;

import java.util.List;
import java.util.Optional;

import com.erp.lt.portal.dto.EmpAddressVO;

/**
 * @author User
 *
 */
public interface EmpAddressService {
	
	public List<EmpAddressVO> getallEmpAddress(EmpAddressVO empAddressVO);
	
	public void addemployeeaddress(EmpAddressVO empaddressVO);

	public Optional<EmpAddressVO> getEmpAddress(int Emp_Address_id);

	public void editemployeeaddress(EmpAddressVO empaddressVO);

	public void deleteemployeeaddress(int EmpAddressid);


}
