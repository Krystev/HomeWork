package com.realeastate.register.www;

import java.util.ArrayList;
import java.util.Arrays;
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
	
	public void sort(List<Property> properties){
		Property[] array = new Property[properties.size()];
		for (int i = 0; i < array.length; i++) {
			array[i] = properties.get(i);
		}
		
		for (int i = 1; i < array.length; i++) {
			for (int j = array.length - 1; j >= i; j--) {
				if (array[j].compareTo(array[j - 1]) == 1) {
					
					Property temp = array[j - 1];
					array[j - 1] = array[j];
					array[j] = temp;
					
				}
			}
		}
		
		this.setProperties(Arrays.asList(array));
	}

	public List<Property> getProperties() {
		return properties;
	}

	public void setProperties(List<Property> properties) {
		this.properties = properties;
	}

	
}
