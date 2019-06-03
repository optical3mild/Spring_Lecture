package com.example.spring02.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.spring02.model.dto.ProductDTO;

//ajax 처리 전용 컨트롤러(백그라운드에서 실행)
//스프링 4.0이상 부터 사용가능

@RestController
public class SampleRestController {
	private static final Logger logger = LoggerFactory.getLogger(MainController.class);
	
	@ResponseBody
	@RequestMapping("test/doF")
	public ProductDTO doF() {
		logger.info("SampleRestController doF");
		//JSON 데이터가 처리됨.
		return new ProductDTO("냉장고", 5000000);
	}
	
	//@RestController 대신 @Controller를 사용해도 됨.
	//하지만 현업에서는 3.0버전을 사용하고 있음
	//만약 3.0버전에서 @Controller를 사용한다면 반드시 @ResponseBody를 해주어야 됩니다.
	//@RestController는 @ResponseBody를 생략가능
	//페이지를 로드하는 것이 아닌 데이터가 처리되는 것임.
}
