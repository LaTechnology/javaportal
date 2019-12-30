package com.erp.lt.portal.service.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.erp.lt.portal.model.Educationboard;
import com.erp.lt.portal.repository.EducationBoardRepository;
import com.erp.lt.portal.service.EducationBoardService;
import com.erp.lt.portal.vo.EducationBoardVO;

@Service
public class EducationBoardServiceImpl implements EducationBoardService {
    
	@Autowired
	EducationBoardRepository educationBoardRepository;
	
	@Override
	public EducationBoardVO getBoardType(int code) {
		   EducationBoardVO boardVO = new EducationBoardVO();
	  Optional<Educationboard> educationboard =educationBoardRepository.findById(code);
	      Educationboard board= educationboard.get();
       
	      if(0 != board.getCode()) {
	    	  boardVO .setCode(board.getCode());
		   }
		   if(null != board.getBoardType()) {
			  boardVO.setBoardType( board.getBoardType());
		   }	
		return null;
	}

}
