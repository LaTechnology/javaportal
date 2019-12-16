/**
 * 
 */
package com.lt.erp.portal.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.lt.erp.portal.dto.CountryData;
import com.lt.erp.portal.repository.impl.CountryRepository;

/**
 * @author admin
 *
 */
@RestController
public class CountryEndpoint {
	@Autowired
	CountryRepository countryRepository;
	
	@GetMapping(path = "/getAllCountry") 
	public @ResponseBody List<CountryData> getAllCountry() {
		return (List<CountryData>) countryRepository.findAll();
	}
}
