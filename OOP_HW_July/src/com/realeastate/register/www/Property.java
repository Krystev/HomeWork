package com.realeastate.register.www;

public class Property implements Comparable<Property>{
	private Address address;
	private double size;
	private int price;
	private Client owner;
	
	public Property(Address address, double size, int price, Client owner) {
		
		this.setAddress(address);
		this.setSize(size);
		this.setPrice(price);
		this.setOwner(owner);
		owner.getProperties().add(this);
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public double getSize() {
		return size;
	}
	public void setSize(double size) {
		this.size = size;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public Client getOwner() {
		return owner;
	}
	public void setOwner(Client owner) {
		this.owner = owner;
	}
	public int compareTo(Property property) {
		
		if (this.getPrice() > property.getPrice()) {
			return 1;
		}
		
		if (this.getPrice() < property.getPrice()) {
			return -1;
		}
			return 0;
		
	}
}
