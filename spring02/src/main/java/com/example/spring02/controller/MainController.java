package com.example.spring02.controller;

import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.example.spring02.model.dto.ProductDTO;

@Controller
public class MainController {
	private static final Logger logger = LoggerFactory.getLogger(MainController.class);
	
	//URL pattern mapping으로 get이나 post방식 모두 사용가능
	@RequestMapping("/")
	public String main(Model model) {
		//Model : 데이터에 담을 그릇 역할, map형태 --> 'map(key,value)'
		
		//model.addAttribute("변수","값");
		model.addAttribute("message","저의 홈페이지 입니다.");
		
		//view folder가 root -> main.jsp으로 이동
		return "main";
	}
	
	@RequestMapping(value="gugu.do", method=RequestMethod.GET)
	public String gugu(int dan, Model model) {
		String result="";
		for(int i=1; i<=9; i++) {
			result += dan + "X" + i + "=" +(dan*i) +"<br>";
		}
		model.addAttribute("result",result);
		
		//view folder가 root -> test folder의 gugu.jsp로 이동
		return "test/gugu";
	}
	
//	public String gugu(Model model) {
//		int dan=7;
//		String result="";
//		for(int i=1; i<=9; i++) {
//			result += dan + "X" + i + "=" +(dan*i) +"<br>";
//		}
//		model.addAttribute("result",result);
//		
//		//view folder가 root -> test folder의 gugu.jsp로 이동
//		return "test/gugu";
//	}
	
	@RequestMapping(value="test")
	//리턴 타입이 void인 경우 RequestMapping과 동일한 페이지로 이동합니다.
	//이 경우 value값인 test.jsp로 넘어감.
	public void test() {
	}
	
	// test/doA 매핑시키기
	@RequestMapping(value="test/doA")
	public String doA(Model model) {
		model.addAttribute("message", "홈페이지 방문을 환영합니다.");
		
		return "test/doB";
	}
	
	// test/doB 매핑시키기
	@RequestMapping(value="test/doB")
	public void doB() {
		System.out.println("hi");
	}
	
	// test/doC 매핑시키기
	// model and view로 객체와 출력 페이지를 함께 가지고 전달.
	// Model: 데이터 저장소, view: 화면
	// 데이터와 포워드할 페이지 정보 함께 전달
	// forward : 주소 그대로 화면 전환, 대량의 데이터 전달
	// redirect : 주소가 변하면서 대량의 데이터를 전달, 소량의 get방식
	@RequestMapping("test/doC")
	public ModelAndView doC() {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("product", new ProductDTO("샤프",1000));
		return new ModelAndView("test/doC","map",map);
	}
	
	
}
