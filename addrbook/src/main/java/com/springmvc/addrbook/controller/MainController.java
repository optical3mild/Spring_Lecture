package com.springmvc.addrbook.controller;

import java.util.List;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
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
	
	@RequestMapping("addr/write.do")
	public String write() {
		return "addr/write";
	}
	
	@RequestMapping("addr/insert.do") //사용자가 요청한 주소
	public String insert(@ModelAttribute AddrBookDTO dto) {
		addrBookService.insertData(dto);
		return "redirect:/";
	}
	
	@RequestMapping("addr/update.do")
	public String update(@ModelAttribute AddrBookDTO dto, Model model) {
		
		if(dto.getName()!=null && dto.getTel()!=null) {
			addrBookService.updateData(dto); //레코드 수정
			return "redirect:/";
		} else {
			model.addAttribute("dto", dto);
			model.addAttribute("message", "(필수)이름과 전화번호를 입력해주세요.");
			return "member/view";
		}
	}
	
	@RequestMapping("addr/delete.do")
	public String delete(@ModelAttribute AddrBookDTO dto, Model model) {
		addrBookService.deleteData(dto.getName()); //레코드 삭제
		return "redirect:/";
	}
	
}
