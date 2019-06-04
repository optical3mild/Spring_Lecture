package com.springmvc.addressbook.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.springmvc.addressbook.model.dto.AddressBookDTO;
import com.springmvc.addressbook.service.AddressService;


@Controller
public class MainController {
	private static final Logger logger = LoggerFactory.getLogger(MainController.class);
	
//	@Inject //의존성 주입.
//	AddressService addressService;
//	
	//URL pattern mapping으로 get이나 post방식 모두 사용가능
	@RequestMapping("/")
	public String main() {
//		List <AddressBookDTO> list = addressService.dataList();
		
		//view folder가 root -> main.jsp으로 이동
		return "main";
	}
	
}
