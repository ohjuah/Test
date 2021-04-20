package com.bit.myapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ViewNameTestController {
	@RequestMapping("l1")
	public ModelAndView 메소드1() {
		ModelAndView mav = new ModelAndView ();
		mav.addObject("list", new String[]{"123","abc"});
		mav.setViewName("listAll");
		return mav;
	}
	
	@RequestMapping("l2")
	public String 메소드2() {
		return "listAll";
	}
	//리턴 타입이 Model이나 Map인 경우
	@RequestMapping("listAll.model")
	public Model method3(Model model) {
		model.addAttribute("list", "아무거나");
		return model;
	}
	//리턴 타입이 void
	@RequestMapping("listAll.void")
	public void method4(Model model) {
		model.addAttribute("list", "void");
	}	
	
	//redirect
	@RequestMapping("re")
	public String method5() {
		return "redirect:/";
	}
	
	
}
