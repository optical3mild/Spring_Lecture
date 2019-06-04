package com.springmvc.addrbook.model.dto;

import java.util.List;

public interface AddrBookDAO {
	public List <AddrBookDTO> dataList();
	public void insertData(AddrBookDTO vo);
	public AddrBookDTO viewData(String name);
	public void deleteData(String name);
	public void updateData(AddrBookDTO vo);
}
