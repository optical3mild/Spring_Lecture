package com.springmvc.addrbook.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.springmvc.addrbook.model.dto.AddrBookDAO;
import com.springmvc.addrbook.model.dto.AddrBookDTO;

@Service
public class AddrBookServiceImpl implements AddrBookService {
	
	@Inject
	AddrBookDAO addrBookDao;
	@Override
	public List<AddrBookDTO> dataList() {
		// TODO Auto-generated method stub
		return addrBookDao.dataList();
	}

	@Override
	public void insertData(AddrBookDTO vo) {
		// TODO Auto-generated method stub

	}

	@Override
	public AddrBookDTO viewData(String name) {
		// TODO Auto-generated method stub
		return addrBookDao.viewData(name);
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
