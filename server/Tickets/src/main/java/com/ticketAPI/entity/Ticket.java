package com.ticketAPI.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Ticket {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO )
	private Long pId;
	private String name;
	private String phone;
	private String location;
	private String pin;
	private String address;
	private String problem;

	public Long getpId() {
		return pId;
	}

	public void setpId(Long pId) {
		this.pId = pId;
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

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getPin() {
		return pin;
	}

	public void setPin(String pin) {
		this.pin = pin;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getProblem() {
		return problem;
	}

	public void setProblem(String problem) {
		this.problem = problem;
	}

	public Ticket(Long pId, String name, String phone, String location, String pin, String address, String problem) {
		super();
		this.pId = pId;
		this.name = name;
		this.phone = phone;
		this.location = location;
		this.pin = pin;
		this.address = address;
		this.problem = problem;
	}

	public Ticket() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Ticket [pId=" + pId + ", name=" + name + ", phone=" + phone + ", location=" + location + ", pin=" + pin
				+ ", address=" + address + ", problem=" + problem + "]";
	}

}
