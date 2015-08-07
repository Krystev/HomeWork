package com.address.book.www;

public class Contact {
	private String name;
	private long phone;
	private String email;
	private Address address;
	
	
	public Contact(String name, long phone, String email, Address address) {
		super();
		this.setName(name);
		this.setPhone(phone);
		this.setEmail(email);
		this.setAddress(address);
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		if (name == null || name.equals("")) {
			throw new IllegalArgumentException();
		} else {
			this.name = name;
		}
	}
	public long getPhone() {
		return phone;
	}
	public void setPhone(long phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}

}
