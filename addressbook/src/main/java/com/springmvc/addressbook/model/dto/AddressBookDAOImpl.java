package com.springmvc.addressbook.model.dto;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;

public class AddressBookDAOImpl implements AddressBookDAO {

	@Inject
	SqlSession sqlSession;
	@Override
	public List<AddressBookDTO> dataList() {
		// TODO Auto-generated method stub
		return sqlSession.selectList("addresbook.dataList");
	}

	@Override
	public void insertData(AddressBookDTO vo) {
		// TODO Auto-generated method stub

	}

	@Override
	public AddressBookDTO viewData(String userid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteData(String userid) {
		// TODO Auto-generated method stub

	}

	@Override
	public void updateData(AddressBookDTO vo) {
		// TODO Auto-generated method stub

	}

}
