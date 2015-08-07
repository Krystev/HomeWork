package com.realeastate.register.www;

import java.util.ArrayList;
import java.util.List;

public class Client {
	private String name;
	private Address address;
	private long phone;
	private boolean isIndividual; 
	private List<Property> properties;
	
	
	
	public Client(String name, Address address, long phone, boolean isIndividual) {
		
		this.setName(name);
		this.setAddress(address);
		this.setPhone(phone);
		this.setIndividual(isIndividual);
		this.properties = new ArrayList<Property>();
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public long getPhone() {
		return phone;
	}
	public void setPhone(long phone) {
		this.phone = phone;
	}
	public boolean isIndividual() {
		return isIndividual;
	}
	public void setIndividual(boolean isIndividual) {
		this.isIndividual = isIndividual;
	}
	public List<Property> getProperties() {
		return properties;
	}
	
}
