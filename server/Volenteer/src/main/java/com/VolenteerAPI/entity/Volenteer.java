package com.VolenteerAPI.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Volenteer {
	
	
	@Id
	@GeneratedValue ( strategy = GenerationType.AUTO)

	private long rId;
	private String name;
	private String phone;
	private String email;
	private String address;
	private String identity;

	public long getrId() {
		return rId;
	}

	public void setrId(long rId) {
		this.rId = rId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
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

	public String getIdentity() {
		return identity;
	}

	public void setIdentity(String identity) {
		this.identity = identity;
	}

	public Volenteer(long rId, String name, String phone, String email, String address, String identity) {
		super();
		this.rId = rId;
		this.name = name;
		this.phone = phone;
		this.email = email;
		this.address = address;
		this.identity = identity;
	}

	public Volenteer() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Volenteer [rId=" + rId + ", name=" + name + ", phone=" + phone + ", email=" + email + ", address="
				+ address + ", identity=" + identity + "]";
	}

}
