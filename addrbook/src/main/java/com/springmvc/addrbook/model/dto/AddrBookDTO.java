package com.springmvc.addrbook.model.dto;

public class AddrBookDTO {
	private String name;
	private String tel;
	private String party;
	private String email;
	private String address;
	
	public AddrBookDTO() {
		super();
	}
	
	public AddrBookDTO(String name, String tel, String party, String email, String address) {
		super();
		this.name = name;
		this.tel = tel;
		this.party = party;
		this.email = email;
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getParty() {
		return party;
	}

	public void setParty(String party) {
		this.party = party;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
}
