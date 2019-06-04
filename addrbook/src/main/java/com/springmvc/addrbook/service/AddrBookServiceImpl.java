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
		return addrBookDao.dataList();
	}

	@Override
	public void insertData(AddrBookDTO vo) {
		addrBookDao.insertData(vo);

	}

	@Override
	public AddrBookDTO viewData(String name) {
		return addrBookDao.viewData(name);
	}

	@Override
	public void deleteData(String name) {
		addrBookDao.deleteData(name);
	}

	@Override
	public void updateData(AddrBookDTO vo) {
		addrBookDao.updateData(vo);
	}

}
