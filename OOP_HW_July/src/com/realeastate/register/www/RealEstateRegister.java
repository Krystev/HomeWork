package com.realeastate.register.www;

import java.util.ArrayList;
import java.util.List;

public class RealEstateRegister {
	public static void main(String[] args) {
		Client pepi = new Client("Pepi", new Address("Vratsa", "Hristo Botev", 
				1), 359123123, true);
		House house = new House(new Address("Vratsa", "Kokiche", 14), 102, 80000, pepi, 2001, 5);
		Plot plot = new Plot(new Address("Vratsa", "Kokiche", 14), 1000, 40000, pepi, true);
		Apartment ap = new Apartment(new Address("Vratsa", "Kokiche", 14), 60, 50000, pepi, 2000, 2, 2, 1, true);
		Office off = new Office(new Address("Vratsa", "Kokiche", 14), 40, 30000, pepi, 2000, 2, 2, 1, true, true);
		
		Client mitko = new Client("Mitko", new Address("Vratsa", "Kokiche", 17), 359987987, true);
		Agent tito = new Agent("Tito", 359878722855L, 10);
		
	List<Property> properties = new ArrayList<Property>();
	List<Agent> agents = new ArrayList<Agent>();
	List<Client> clients = new ArrayList<Client>();
	
	clients.add(pepi);
	properties.add(house);
	properties.add(plot);
	properties.add(off);
	properties.add(ap);
	clients.add(mitko);
	agents.add(tito);
	
	Catalog cat = new Catalog();
	cat.setProperties(properties);
	cat.sort();
	
	for (int i = 0; i < pepi.getProperties().size(); i++) {
		System.out.println(pepi.getProperties().get(i).getPrice());
	}
	
	System.out.println();
	System.out.println(tito.getSales().isEmpty());
	for (int i = 0; i < cat.getProperties().size(); i++) {
		System.out.println(cat.getProperties().get(i).getPrice());
	}
	cat.sell(off, mitko, tito, 20000);
	
	
	
	System.out.println();
	for (int i = 0; i < pepi.getProperties().size(); i++) {
		System.out.println(pepi.getProperties().get(i).getPrice());
	}
	System.out.println();
	
	System.out.println(tito.getSales().get(0).getDateOfSale());
	System.out.println();
	
	System.out.println(mitko.getProperties().get(0).getPrice());
	
	}
}
