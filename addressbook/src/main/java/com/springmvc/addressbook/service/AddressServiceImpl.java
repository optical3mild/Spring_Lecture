package com.springmvc.addressbook.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.springmvc.addressbook.model.dto.AddressBookDAO;
import com.springmvc.addressbook.model.dto.AddressBookDTO;

@Service
public class AddressServiceImpl implements AddressService {

	@Inject
	AddressBookDAO addressBookDao;
	@Override
	public List<AddressBookDTO> dataList() {
		
		return addressBookDao.dataList();
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
