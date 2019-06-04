package com.springmvc.addrbook.controller;

import java.util.List;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.springmvc.addrbook.model.dto.AddrBookDTO;
import com.springmvc.addrbook.service.AddrBookService;


@Controller
public class MainController {
	private static final Logger logger = LoggerFactory.getLogger(MainController.class);

	@Inject //의존성 주입.
	AddrBookService addrBookService;
	@RequestMapping("/")
	public String main(Model model) {
		
		List <AddrBookDTO> list = addrBookService.dataList();
		model.addAttribute("list", list);
		return "main";
	}
	
	@RequestMapping("addr/view.do")
	public String view(@RequestParam String name, Model model) {
		model.addAttribute("dto", addrBookService.viewData(name));
		return "addr/view";
	}
}
