package com.example.spring02.controller;

import java.util.List;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.spring02.model.dto.MemberDTO;
import com.example.spring02.service.MemberService;

@Controller //현재 클래스를 controller bean으로 등록시킴.
public class MemberController {
	
	private static final Logger Logger = LoggerFactory.getLogger(MemberController.class);
	
	@Inject //의존성 주입.
	MemberService memberService;

	@RequestMapping("member/list.do")
	public String memberList(Model model) {
		List <MemberDTO> list = memberService.memberList();
		model.addAttribute("list", list);
		return "member/member_list";
	}
}
