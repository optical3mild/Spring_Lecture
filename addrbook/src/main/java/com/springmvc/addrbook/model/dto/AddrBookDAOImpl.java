package com.springmvc.addrbook.model.dto;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

@Repository
public class AddrBookDAOImpl implements AddrBookDAO {

	@Inject
	SqlSession sqlSession;
	@Override
	public List<AddrBookDTO> dataList() {
		// TODO Auto-generated method stub
		return sqlSession.selectList("addrBook.dataList");
	}

	@Override
	public void insertData(AddrBookDTO vo) {
		// TODO Auto-generated method stub

	}

	@Override
	public AddrBookDTO viewData(String name) {
		// TODO Auto-generated method stub
		return sqlSession.selectOne("addrBook.viewData",name);
	}
	
	@Override
	public void deleteData(String name) {
		// TODO Auto-generated method stub

	}

	@Override
	public void updateData(AddrBookDTO vo) {
		// TODO Auto-generated method stub

	}

}
