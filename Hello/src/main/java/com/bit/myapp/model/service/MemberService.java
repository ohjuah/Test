package com.bit.myapp.model.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.bit.myapp.model.beans.Member;

// 데이터베이스와 연동해서 작업할 메소드를 가지고 있다. 
// 메소드명 insert, delete 등등..


public interface MemberService {
	int insert (Member member);
	List<Member> listAll();
	
}
