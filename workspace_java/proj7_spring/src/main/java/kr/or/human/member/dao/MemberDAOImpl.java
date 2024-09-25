package kr.or.human.member.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

// DAO 클래스에서 사용
@Repository
//@Repository("memberDAOImpl")
public class MemberDAOImpl implements MemberDAO{

	@Override
	public List selectMember() {
		List list = new ArrayList();
		list.add(1);
		list.add(2);
		list.add(3);
		
		return list;
	}
	
}
