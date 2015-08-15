package com.realeastate.register.www;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Catalog{
	private List<Property> properties;
	
	public Catalog() {
		this.setProperties(new ArrayList<Property>());
	}
	
	public Sale sell(Property property, Client buyer, Agent agent, float priceOfDeal) {
		Sale sale = new Sale(property, buyer, priceOfDeal, agent);
		return sale;
		
	}
	
	public void sort(){
		Collections.sort(properties);
		
	}
	
	

	public List<Property> getProperties() {
		return properties;
	}

	public void setProperties(List<Property> properties) {
		this.properties = properties;
	}

	
}
