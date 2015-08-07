package com.realeastate.register.www;

import java.util.ArrayList;
import java.util.List;

public class Agent {
	private String name;
	private long phone;
	private float commission;
	private List<Sale> sales;
	
	
	
	
	public Agent(String name, long phone, int commissionInPercent) {
		
		this.setName(name);
		this.setPhone(phone);
		this.setCommission(commissionInPercent);
		this.sales = new ArrayList<Sale>();
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getPhone() {
		return phone;
	}
	public void setPhone(long phone) {
		this.phone = phone;
	}
	public int getCommission() {
		return (int) (commission * 100);
	}
	public void setCommission(float commission) {
		this.commission = commission / 100;
	}
	public List<Sale> getSales() {
		return sales;
	}
}
