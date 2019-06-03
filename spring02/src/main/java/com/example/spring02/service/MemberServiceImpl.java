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
		// TODO Auto-generated method stub
		return memberDao.memberList();
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
