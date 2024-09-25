package kr.or.human.member.service;

import java.util.List;

import kr.or.human.member.dao.MemberDAO;

public interface MemberService {
	
	static final int a = 0;
	
	//public abstract List listMember();
	//public List listMember();
	
	public List listMember();
	void setMemberDAO(MemberDAO memberDAO);
	
	//default void test(){
	
	//}
}
