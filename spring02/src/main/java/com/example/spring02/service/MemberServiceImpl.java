package com.example.spring02.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.example.spring02.model.dto.MemberDAO;
import com.example.spring02.model.dto.MemberDTO;

@Service
//service에는 어노테이션 필수추가.
public class MemberServiceImpl implements MemberService {

	@Inject
	MemberDAO memberDao;
	@Override
	public List<MemberDTO> memberList() {
		return memberDao.memberList();
	}

	@Override
	public void insertMember(MemberDTO vo) {
		memberDao.insertMember(vo);

	}

	@Override
	public MemberDTO viewMember(String userid) {
		return memberDao.viewMember(userid);
	}

	@Override
	public void deleteMember(String userid) {
		memberDao.deleteMember(userid);

	}

	@Override
	public void updateMember(MemberDTO vo) {
		memberDao.updateMember(vo);

	}

	@Override
	public boolean checkPw(String userid, String passwd) {
		// TODO Auto-generated method stub
		return memberDao.checkPw(userid, passwd);
	}

}
