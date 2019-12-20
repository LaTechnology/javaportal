package com.erp.lt.portal.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.erp.lt.portal.dto.EmpAddressVO;
import com.erp.lt.portal.service.EmpAddressService;
@RestController
public class  EmpAddressController {
	
	 @Autowired
	 EmpAddressService empAddressService;

	 @GetMapping(path ="/getaadress/{EmpAddressid}")
	 public EmpAddressVO getAddress(@PathVariable(value = "EmpAddressid") int EmpAddressid)
	 {
	 Optional<EmpAddressVO> optional = empAddressService.getEmpAddress(EmpAddressid);
	 return optional.get();
	 }
	 @PostMapping(path="/addAddress/employeeaddress",consumes= {"application/json"})

	      public void addemployeeadress(@RequestBody EmpAddressVO  empaddressvo )
	 {
	 empAddressService.addemployeeaddress(empaddressvo);
	 }

	 @PutMapping(path = "/editAddress/{empAddressId}")
	 public void getAddress(@PathVariable (value="empAddressId") int empAddressId, @RequestBody EmpAddressVO empaddressvo) {

	 Optional<EmpAddressVO> empdto = empAddressService.getEmpAddress(empAddressId);
	 if(empdto == null) {
	 System.out.println("Employee Not found");
	 }else
	 {
	 empAddressService.addemployeeaddress(empaddressvo);
	 }
	 }


	 @PatchMapping(path = "/patchingAddress/{empAddressId}")
	 public void editedEmployee(@PathVariable (value="empAddressId") int empAddressId, @RequestBody EmpAddressVO EmpAddressVO) {
	 Optional<EmpAddressVO> empdto = empAddressService.getEmpAddress(empAddressId);
	 if(empdto == null) {
	 System.out.println("Employee Not found");
	 }else
	 {
	 empAddressService.addemployeeaddress(EmpAddressVO);
	 }

	 }
	 @DeleteMapping(path = "/deleteAddress/{empAddressId}")
	 public void deleteEmployee(@PathVariable(value = "empAddressId") int empAddressId)
	 {

	 empAddressService.deleteemployeeaddress(empAddressId);

	 }

	 @GetMapping(path = "/getallAddress/empinfo")
	 public List<EmpAddressVO> getAllEmpAddress(@RequestBody EmpAddressVO empAddressVO) {

	 return empAddressService.getallEmpAddress(empAddressVO);
	 }

}
