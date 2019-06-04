package com.springmvc.addressbook.service;

import java.util.List;

import com.springmvc.addressbook.model.dto.AddressBookDTO;

public interface AddressService {
	public List <AddressBookDTO> dataList();
	public void insertData(AddressBookDTO vo);
	public AddressBookDTO viewData(String userid);
	public void deleteData(String userid);
	public void updateData(AddressBookDTO vo);
}
