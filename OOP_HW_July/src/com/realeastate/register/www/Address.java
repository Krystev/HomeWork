package com.realeastate.register.www;

public class Address {
	private String town;
	private String street;
	private int number;
	
	
	public Address(String town, String street, int number) {
		
		this.setTown(town);
		this.setStreet(street);
		this.setNumber(number);
	}
	
	public String getTown() {
		return town;
	}
	public void setTown(String town) {
		this.town = town;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
}
