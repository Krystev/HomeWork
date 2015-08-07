package com.address.book.www;

import java.util.ArrayList;
import java.util.List;

public class Category {
	
	private String categoryName;
	private List<Contact> contacts;
	
	


	public Category(String categoryName) {
		super();
		this.categoryName = categoryName;
		this.contacts = new ArrayList<Contact>();
	}
	
	public void add(Contact contact) {
		contacts.add(contact);
	}
	
	public void remove(Contact contact) {
		contacts.remove(contact);
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		if (categoryName == null || categoryName.equals("")) {
			throw new IllegalArgumentException();
		} else {
		this.categoryName = categoryName;
		}
	}

	public List<Contact> getContacts() {
		return contacts;
	}

	public void setContacts(List<Contact> contacts) {
		this.contacts = contacts;
	}

	
}
