package dao;

import model.Member;

public interface MemberDao {
		//create
		void insert(Member member);  
		
		//read
		String selectAll();  
		boolean selectUsername(String username);
		Member selectByUsernameAndPassword(String username,String password);
		
		
}