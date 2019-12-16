/**
 * 
 */
package com.lt.erp.portal.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.lt.erp.portal.dto.AddressVO;
import com.lt.erp.portal.repository.impl.AddressRepository;

/**
 * @author admin
 *
 */
@RestController  

// @ComponentScan(basePackages={"com.lt.erp.portal"})
public class EmployeeAddressEndpoint {
	@Autowired
	private AddressRepository addressRepository;

	@RequestMapping("/")
	@ResponseBody
	public String helloHandler() {
		return "<h1>Hello World!</h1>";
	}

	@PostMapping(path = "/add")
	public ResponseEntity<String> addAddress(@RequestParam String addressLine1, @RequestParam String addressLine2,
			@RequestParam String city, @RequestParam String country, @RequestParam String zipcode) {
		// @ResponseBody means the returned String is the response, not a view name
		// @RequestParam means it is a parameter from the GET or POST request

		AddressVO addressVO = new AddressVO();
		addressVO.setAddressLine1(addressLine1);
		addressVO.setAddressLine2(addressLine2);
		addressVO.setCity(city);
		addressVO.setCountry(country);
		addressVO.setZipcode(zipcode);
		addressRepository.save(addressVO);
		return new ResponseEntity<>("Sucess", HttpStatus.OK);
	}

	@RequestMapping(value = "/address/hello", method = RequestMethod.GET)
	public ResponseEntity<String> hello() {
		return new ResponseEntity<>("Hello World", HttpStatus.OK);
	}
	@GetMapping(path = "/hello")
	public ResponseEntity<String> hello1() {
		return new ResponseEntity<>("Hello World", HttpStatus.OK);
	}
	@GetMapping(path = "/all") 
	public @ResponseBody List<AddressVO> getAllUsers() {
		return (List<AddressVO>) addressRepository.findAll();
	}
}
