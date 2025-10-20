package service.impl;

import dao.impl.MemberDaoImpl;
import model.Member;
import service.MemberService;

public class MemberServiceImpl implements MemberService{

	public static void main(String[] args) {
		Member m=new Member("Happy","haveaniceday","333","beautiful world","66666");
		System.out.println(new MemberServiceImpl().addMember(m));
		
		System.out.println(new MemberServiceImpl().Login("haveaniceday","333"));
	}

	private MemberDaoImpl mdi=new MemberDaoImpl();
	
	@Override
	public int addMember(Member member) {		
		if(mdi.selectUsername(member.getUsername()))
		{
			return 1;
		}
		else
		{
			mdi.insert(member);
			return 0;
		}
	}

	@Override
	public Member Login(String username, String password) {
		return mdi.selectByUsernameAndPassword(username,password);
	}
}