package com.bit.myapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bit.myapp.model.beans.Member;
import com.bit.myapp.model.impl.MemberServiceImpl;
import com.bit.myapp.model.service.MemberService;

// 1:1 할 필요없다
// delete.do => DeleteServlet ,  doGet() or doPost() 
// listAll.do => ListAllServlet ,  doGet() or doPost() 
// searchName.do => SearchNameServlet ,  doGet() or doPost()
// MemberController 
// ==> member 관련 view, model , 컨트롤적인 
// 메소드를 여러개 만들어놓고 그 메소드를 매핑시켜서 사용한다. (클래스 갯수가 줄어듬)


@Controller
public class MemberController {
	
	MemberService service2 = new MemberServiceImpl();
	
	@Autowired
	MemberService memberService;
	
	@RequestMapping("insert")
	public String insert() {
		Member member = new Member("lee999","999","kkk","qqq"); 
		memberService.insert(member);
		return "insert"; 
	}
	
	@RequestMapping("delete")
	public String delete() {
		
		return "delete"; 
	}
	
	@RequestMapping("update")
	public String update() {
		
		return "update"; 
	}
	
	@RequestMapping("listAll")
	public String listAll() {
		List<Member> members = memberService.listAll();
		return "listAll"; 
	}
}
