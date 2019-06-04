package com.springmvc.addrbook.model.dto;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.jdbc.SQL;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

@Repository
public class AddrBookDAOImpl implements AddrBookDAO {

	@Inject
	SqlSession sqlSession;
	@Override
	public List<AddrBookDTO> dataList() {
		return sqlSession.selectList("addrBook.dataList");
	}

	@Override
	public void insertData(AddrBookDTO vo) {
		sqlSession.insert("addrBook.insertData",vo);
	}

	@Override
	public AddrBookDTO viewData(String name) {
		return sqlSession.selectOne("addrBook.viewData",name);
	}
	
	@Override
	public void deleteData(String name) {
		sqlSession.delete("addrBook.deleteData",name);
	}

	@Override
	public void updateData(AddrBookDTO vo) {
		sqlSession.update("addrBook.updateData",vo);
	}

}
