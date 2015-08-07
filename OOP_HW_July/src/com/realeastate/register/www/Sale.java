package com.realeastate.register.www;

import java.util.Date;

public class Sale {
	
	private Date dateOfSale;
	private Property property;
	private Client seller;
	private Client buyer;
	private double priceOfDeal;
	private Agent agent;
	private float commission;
	
	public Sale(Property property, Client buyer, double priceOfDeal, Agent agent) {
		
		this.dateOfSale = new Date();
		this.setProperty(property);
		this.seller = property.getOwner();
		this.setBuyer(buyer);
		this.setPriceOfDeal(priceOfDeal);
		this.setAgent(agent);
		this.commission = agent.getCommission();
		changeOwner();
		agent.getSales().add(this);
	}
	
	private void changeOwner(){
		this.seller.getProperties().remove(property);
		this.buyer.getProperties().add(property);
	}

	public Date getDateOfSale() {
		return dateOfSale;
	}

	public Property getProperty() {
		return property;
	}

	public void setProperty(Property property) {
		this.property = property;
	}

	public Client getSeller() {
		return seller;
	}

	public Client getBuyer() {
		return buyer;
	}

	public void setBuyer(Client buyer) {
		this.buyer = buyer;
	}

	public double getPriceOfDeal() {
		return priceOfDeal;
	}

	public void setPriceOfDeal(double priceOfDeal) {
		this.priceOfDeal = priceOfDeal;
	}

	public Agent getAgent() {
		return agent;
	}

	public void setAgent(Agent agent) {
		this.agent = agent;
	}

	public float getCommission() {
		return commission;
	}
	
	
}
