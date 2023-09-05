package com.care.root;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyController {
	@RequestMapping("/index") // ��û�����ؼ� mapping(����)���ְڴ�~ // url���� ���
	public String memberIndex() {
		System.out.println("index ����");	
		return "member/index"; // views������ ���	
	}
	
	@RequestMapping(value="/logout")
	public String memberLogout(Model model) {
		model.addAttribute("test","�α׾ƿ� �������Դϴ�.");
		// request�� ���� ���� (Ű(test)�� logout.jsp�� ����)
		return "member/logout";
	}
	@RequestMapping("/login")
	public ModelAndView memberLogin() {
		ModelAndView model = new ModelAndView();
		model.addObject("abc","�α��� ������ �Դϴ�");
		model.setViewName("member/login");
		return model;
	}
}

