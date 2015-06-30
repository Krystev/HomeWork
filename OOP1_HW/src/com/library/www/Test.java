package com.library.www;

import java.util.ArrayList;

public class Test {

	public static void main(String[] args) {

		Book book1 = new Book("The Talisman", "Stephen King", "Viking", 1984,
				1234);
		Book book2 = new Book("A Game of Thrones", "George R. R. Martin",
				"Bantam Spectra", 1996, 1235);
		Book book3 = new Book("Dreamcatcher", "Stephen King", "Scribner", 2001,
				1236);
		Book book4 = new Book("The Dark Half", "Stephen King", "Viking", 1989,
				1237);
		Book book5 = new Book("The Fellowship of the Ring", "J. R. R. Tolkien",
				"George Allen & Unwin", 1954, 1238);

		Library lib1 = new Library("Tito");

		lib1.addBook(book1);
		lib1.addBook(book2);
		lib1.addBook(book3);
		lib1.addBook(book4);
		lib1.addBook(book5);
		
		ArrayList<Book> books = lib1.getBooks();

		for (Book book : books) {
			lib1.getInfo(book);
		}
		
		ArrayList<Book> stivKingBooks = lib1.searchByAuthors("Stephen King");
		
		for (int i = 0; i < stivKingBooks.size(); i++) {
			lib1.dellBook(stivKingBooks.get(i));
		}
		
		
		for (Book book : books) {
			lib1.getInfo(book);
		}
	}

}
