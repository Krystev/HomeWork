package com.realeastate.register.www;

public class Plot extends Property {
	private boolean isInRegulation;
	
	public Plot(Address address, double size, int price, Client owner, boolean isInRegulation) {
		super(address, size, price, owner);
		this.setInRegulation(isInRegulation);
	}

	public boolean isInRegulation() {
		return isInRegulation;
	}

	public void setInRegulation(boolean isInRegulation) {
		this.isInRegulation = isInRegulation;
	}

	
}
