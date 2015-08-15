package com.realeastate.register.www;

public class Office extends Apartment{
	
	
	private boolean isInternetConnected;
	
	public Office(Address address, double size, int price, Client owner, int yearOfConstruction, int floor,
			int numberOfRooms, int numberOfBathrooms, boolean isFurnished, boolean isInternetConnected) {
		super(address, size, price, owner, numberOfBathrooms, numberOfBathrooms, numberOfBathrooms, numberOfBathrooms, isFurnished);
	
		this.setInternetConnected(isInternetConnected);
	}

	

	public boolean isInternetConnected() {
		return isInternetConnected;
	}

	public void setInternetConnected(boolean isInternetConnected) {
		this.isInternetConnected = isInternetConnected;
	}
	
	
}
