package com.example.spring02.model.dto;

import java.util.List;

public interface MemberDAO {
	//C.R.U.D
	
	public List <MemberDTO> memberList();
	public void insertMember(MemberDTO vo);
	public MemberDTO viewMember(String userid);
	public void deleteMember(String userid);
	public void updateMember(MemberDTO vo);
	public boolean checkpw(String userid, String passwd);
	
}
