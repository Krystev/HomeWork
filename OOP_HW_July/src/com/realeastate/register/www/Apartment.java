package com.realeastate.register.www;

public class Apartment extends Property {

	private int yearOfConstruction;
	private int floor;
	private int numberOfRooms;
	private int numberOfBathrooms;
	private boolean isFurnished;

	public Apartment(Address address, double size, int price, Client owner, int yearOfConstruction, int floor,
			int numberOfRooms, int numberOfBathrooms, boolean isFurnished) {
		super(address, size, price, owner);
		this.setYearOfConstruction(yearOfConstruction);
		this.setFloor(floor);
		this.setNumberOfRooms(numberOfRooms);
		this.setNumberOfBathrooms(numberOfBathrooms);
		this.setFurnished(isFurnished);
	}

	public int getNumberOfBathrooms() {
		return numberOfBathrooms;
	}

	public void setNumberOfBathrooms(int numberOfBathrooms2) {
		this.numberOfBathrooms = numberOfBathrooms2;
	}

	public int getYearOfConstruction() {
		return yearOfConstruction;
	}

	public void setYearOfConstruction(int yearOfConstruction) {
		this.yearOfConstruction = yearOfConstruction;
	}

	public int getFloor() {
		return floor;
	}

	public void setFloor(int floor2) {
		this.floor = floor2;
	}

	public boolean isFurnished() {
		return isFurnished;
	}

	public void setFurnished(boolean isFurnished) {
		this.isFurnished = isFurnished;
	}

	public int getNumberOfRooms() {
		return numberOfRooms;
	}

	public void setNumberOfRooms(int numberOfRooms2) {
		this.numberOfRooms = numberOfRooms2;
	}

}
