package com.springmvc.addrbook.service;

import java.util.List;

import com.springmvc.addrbook.model.dto.AddrBookDTO;

public interface AddrBookService {
	public List <AddrBookDTO> dataList();
	public void insertData(AddrBookDTO vo);
	public AddrBookDTO viewData(String name);
	public void deleteData(String name);
	public void updateData(AddrBookDTO vo);
}
