package com.realeastate.register.www;

public class House extends Property{
	
	private int yearOfConstruction;
	private int numberOfRooms;
	
	public House(Address address, double size, int price, Client owner, int yearOfConstruction, int i) {
		super(address, size, price, owner);
		this.setYearOfConstruction(yearOfConstruction);
		this.setNumberOfRooms(i);
	}

	public int getYearOfConstruction() {
		return yearOfConstruction;
	}

	public void setYearOfConstruction(int yearOfConstruction) {
		this.yearOfConstruction = yearOfConstruction;
	}

	public int getNumberOfRooms() {
		return numberOfRooms;
	}

	public void setNumberOfRooms(int i) {
		this.numberOfRooms = i;
	}
	
	
	
}
