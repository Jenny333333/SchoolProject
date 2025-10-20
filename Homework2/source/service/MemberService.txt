package service;

import model.Member;

public interface MemberService {
	//create
	int addMember(Member member);  
	
	//read	
	Member Login(String username,String password);
}