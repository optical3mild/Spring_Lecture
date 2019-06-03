package com.example.spring02.model.dto;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

@Repository
// 컨트롤러나 모델을 사용자가 직접 관리해도 되지만
//스프링에서는 의존성 주입(DI)라고 하여 스프링에게 맡긴다.
//@Repository 어노테이션을 붙여주면 서버가 구동되면서 자동으로 메모리에 로드된다.
//이렇게 올라가 있는 객체들은 new로 생성하지 않아도 
//@Inject라는 어노테이션을 붙여주어서 객체를 삽입할 수 있음.
public class MemberDAOImpl implements MemberDAO {

	@Inject
	SqlSession sqlSession;
	@Override
	public List<MemberDTO> memberList() {
		// TODO Auto-generated method stub
		return sqlSession.selectList("member.memberList");
	}

	@Override
	public void insertMember(MemberDTO vo) {
		// TODO Auto-generated method stub

	}

	@Override
	public MemberDTO viewMember(String userid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteMember(String userid) {
		// TODO Auto-generated method stub

	}

	@Override
	public void updateMember(MemberDTO vo) {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean checkpw(String userid, String passwd) {
		// TODO Auto-generated method stub
		return false;
	}

}
