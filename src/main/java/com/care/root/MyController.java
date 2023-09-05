package com.care.root;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyController {
	@RequestMapping("/index") // 요청에대해서 mapping(연결)해주겠다~ // url연결 경로
	public String memberIndex() {
		System.out.println("index 실행");	
		return "member/index"; // views폴더에 경로	
	}
	
	@RequestMapping(value="/logout")
	public String memberLogout(Model model) {
		model.addAttribute("test","로그아웃 페이지입니다.");
		// request랑 같은 범위 (키(test)가 logout.jsp로 전달)
		return "member/logout";
	}
	@RequestMapping("/login")
	public ModelAndView memberLogin() {
		ModelAndView model = new ModelAndView();
		model.addObject("abc","로그인 페이지 입니다");
		model.setViewName("member/login");
		return model;
	}
}

