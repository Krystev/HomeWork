package com.address.book.www;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

public class AddressBookProgram {

	public static void main(String[] args) {
		AddressBook tito = new AddressBook();

		Scanner sc = new Scanner(System.in);
		boolean check = true;
		while (check) {
			System.out.printf("Please select an option:%n1 - Add contact%n2 - Add category%n3 - Show all contacts"
					+ "%n4 - Show all categories%n5 - Search by name%n6 - Search by categories%n7 - Save contacts to txt file"
					+ "%n0 - For Exit\n");
			int option = sc.nextInt();
			switch (option) {

			case 1:
				System.out.println("Please enter name:");

				String name = null;
				try {
					name = sc.next();
				} catch (IllegalArgumentException iae) {
					System.out.println("Please enter correct name!");
					name = sc.next();
				}

				System.out.println("Please enter phone:");
				long phone = sc.nextLong();

				System.out.println("Please enter email:");
				String email = sc.next();

				System.out.println("Please enter town:");
				String town = sc.next();

				System.out.println("Please enter street:");
				String street = sc.next();

				System.out.println("Please enter str number:");
				int number = sc.nextInt();

				tito.add(new Contact(name, phone, email, new Address(town, street, number)));
				break;
			case 2:
				System.out.println("Please enter category name:");
				String categoryName = null;
				try {
					categoryName = sc.next();
				} catch (IllegalArgumentException e) {
					System.out.println("Please enter correct name!");
					categoryName = sc.next();
				}
				tito.add(new Category(categoryName));
				break;
			case 3:
				for (int i = 0; i < tito.getContacts().size(); i++) {
					System.out.printf("Name: %s, Phone: %d, Email: %s, Address: %s, %s, %d%n",
							tito.getContacts().get(i).getName(), tito.getContacts().get(i).getPhone(),
							tito.getContacts().get(i).getEmail(), tito.getContacts().get(i).getAddress().getTown(),
							tito.getContacts().get(i).getAddress().getStreet(),
							tito.getContacts().get(i).getAddress().getNumber());
				}

				break;
			case 4:
				tito.getCategories();
				break;
			case 5:
				System.out.println("Enter name:");
				tito.search(sc.next());
				break;
			case 6:
				System.out.println("Enter category name:");
				tito.searchByCategory(sc.next());
				break;
			case 7:
				PrintStream fileOutput = null;
				try {
					fileOutput = new PrintStream(new File("contacts"));
					for (int i = 0; i < tito.getContacts().size(); i++) {
						fileOutput.println("Name: " + tito.getContacts().get(i).getName() + " Phone: "
								+ tito.getContacts().get(i).getPhone() + " Email: "
								+ tito.getContacts().get(i).getEmail() + " Town: "
								+ tito.getContacts().get(i).getAddress().getTown() + " Street: "
								+ tito.getContacts().get(i).getAddress().getStreet() + " Number: "
								+ tito.getContacts().get(i).getAddress().getNumber());
					}

				} catch (FileNotFoundException e) {
					e.printStackTrace();
				} finally {
					fileOutput.close();
				}
				break;
			case 0:
				check = false;
				System.out.println("Thank you, bye bye!");
				break;

			default:
				System.out.println("Please select correct option!");
				break;
			}
		}
		sc.close();
	}

}
