package com.springmvc.addressbook.model.dto;

import java.util.List;

public interface AddressBookDAO {
	public List <AddressBookDTO> dataList();
	public void insertData(AddressBookDTO vo);
	public AddressBookDTO viewData(String userid);
	public void deleteData(String userid);
	public void updateData(AddressBookDTO vo);
}
