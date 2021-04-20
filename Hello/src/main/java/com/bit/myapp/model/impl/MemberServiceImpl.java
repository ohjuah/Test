package com.bit.myapp.model.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import org.springframework.stereotype.Service;

import com.bit.myapp.model.beans.Member;
import com.bit.myapp.model.jdbc.JDBCConnection;
import com.bit.myapp.model.service.MemberService;

@Service
public class MemberServiceImpl implements MemberService {
	private Connection connection = JDBCConnection.getConnection();
	
	@Override
	public int insert(Member member) {
		PreparedStatement statement = null;
		
		try {
			statement = connection.prepareStatement("insert into MemberDTO (id,pw,name,nickName ) values (?,?,?,?)" );
			statement.setString(1, member.getId());
			statement.setString(2, member.getPw());
			statement.setString(3, member.getName());
			statement.setString(4, member.getNickName());
			return statement.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 

		System.out.println("MemberServiceImpl 의 insert(Member member)");
		return 0;
	}

	@Override
	public List<Member> listAll() {
		System.out.println("MemberServiceImpl 의 List<Member> listAll()");
		return null;
	}

}
