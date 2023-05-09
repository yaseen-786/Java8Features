package com.citiustech.datatransformation;

import java.util.List;

public class Customer {
	private int id;
	private String name;
	private String address;
	private List<String> phoneNumbers;
	public Customer(int id, String name, String address, List<String> phoneNumbers) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.phoneNumbers = phoneNumbers;
	}
	
	public Customer() {
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public List<String> getPhoneNumbers() {
		return phoneNumbers;
	}
	public void setPhoneNumbers(List<String> phoneNumbers) {
		this.phoneNumbers = phoneNumbers;
	}
	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", address=" + address + ", phoneNumbers=" + phoneNumbers
				+ "]";
	}
	

}
