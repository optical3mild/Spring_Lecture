package com.example.spring03.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MainController {
	@RequestMapping("/")
	public String main(Model model) {
		model.addAttribute("message", "연습문서");
		return "main";
	}
	
	@RequestMapping(value="menu1", method=RequestMethod.GET)
	public String menu1(int num1, int num2, Model model) {
		int result = num1+num2;
		model.addAttribute("result", result);
		return "test/menu1";
	}

}
