package com.address.book.www;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class AddressBook {

	private List<Contact> contacts;
	private List<Category> categories;

	public AddressBook() {

		this.contacts = new ArrayList<Contact>();
		this.categories = new ArrayList<Category>();
	}

	public List<Contact> search(String name) {
		List<Contact> result = new ArrayList<Contact>();
		if (!contacts.isEmpty()) {
			for (Contact contact : contacts) {
				if (contact.getName().equalsIgnoreCase(name)) {
					result.add(contact);
				}
			}
		}
		if (result.isEmpty()) {
			System.out.println("Your contact list is empty or no match has been found!");
		}

		for (Contact contact : result) {
			System.out.printf("Name: %s, Phone: %d, Email: %s, Address: %s, %s, %d%n", contact.getName(),
					contact.getPhone(), contact.getEmail(), contact.getAddress().getTown(),
					contact.getAddress().getStreet(), contact.getAddress().getNumber());
		}
		return result;
	}

	public List<Contact> searchByCategory(String name) {
		List<Contact> result = new ArrayList<Contact>();
		if (!categories.isEmpty()) {
			for (Category cat : categories) {
				if (cat.getCategoryName().equalsIgnoreCase(name)) {

					for (Contact contact : cat.getContacts()) {
						result.add(contact);

					}
				}
			}
		}

		if (result.isEmpty()) {
			System.out.println("You haven\'t contacts in this category or category don\'t exist!");
		}
		return result;
	}

	public List<Contact> searchByEmail(String email) {
		List<Contact> result = new ArrayList<Contact>();

		for (Contact contact : contacts) {
			if (contact.getEmail().equalsIgnoreCase(email)) {
				result.add(contact);
			}
		}

		if (result.isEmpty()) {
			throw new NoSuchElementException("No match has been found!");
		}
		return result;

	}

	public List<Contact> searchByAddress(String address) {
		List<Contact> result = new ArrayList<Contact>();

		for (Contact contact : contacts) {
			if (contact.getAddress().getTown().equalsIgnoreCase(address)
					|| contact.getAddress().getStreet().equalsIgnoreCase(address)) {
				result.add(contact);
			}
		}

		if (result.isEmpty()) {
			throw new NoSuchElementException("No match has been found!");
		}
		return result;

	}

	public List<Contact> searchByAddress(int number) {
		List<Contact> result = new ArrayList<Contact>();

		for (Contact contact : contacts) {
			if (contact.getAddress().getNumber() == number) {
				result.add(contact);
			}
		}

		if (result.isEmpty()) {
			throw new NoSuchElementException("No match has been found!");
		}
		return result;

	}

	public List<Contact> searchByAddress(String address, int number) {
		List<Contact> result = new ArrayList<Contact>();

		for (Contact contact : contacts) {
			if (contact.getAddress().getTown().equalsIgnoreCase(address)
					&& contact.getAddress().getStreet().equalsIgnoreCase(address)
					&& contact.getAddress().getNumber() == number) {
				result.add(contact);
			}
		}

		if (result.isEmpty()) {
			throw new NoSuchElementException("No match has been found!");
		}
		return result;

	}

	public List<Contact> getContacts() {

		if (this.contacts == null) {
			throw new NullPointerException("Your contact list is empty!");
		}

		return this.contacts;

	}

	public List<Category> getCategories() {
		if (this.categories == null) {
			throw new NullPointerException("Your category list is empty!");
		}
		for (Category category : categories) {
			System.out.printf("Category: %s%n", category.getCategoryName());
		}

		return this.categories;
	}

	public void add(Contact contact) {

		if (contacts == null) {
			contacts = new ArrayList<Contact>();
		}
		this.contacts.add(contact);
	}

	public void add(Category category) {

		if (categories == null) {
			categories = new ArrayList<Category>();
		}
		this.categories.add(category);
	}

	public void remove(Contact contact) {
		this.contacts.remove(contact);
	}

	public void remove(Category category) {
		if (this.categories == null) {
			throw new NullPointerException("Your category list is empty!");
		}
		this.categories.remove(category);
	}
}
