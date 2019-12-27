package com.erp.lt.portal.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.erp.lt.portal.service.EducationBoardService;
import com.erp.lt.portal.vo.EducationBoardVO;


@RestController
public class EducationBoardController {

	@Autowired
	EducationBoardService boardService;
	
	@GetMapping(path = "/get/boarddetails/{code}")
	public EducationBoardVO getEmployeeEdu(@PathVariable(value = "code") int code) {		
		
		return boardService.getBoardType(code);
		
	}
}
