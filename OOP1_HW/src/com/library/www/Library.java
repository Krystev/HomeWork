package com.library.www;

import java.util.ArrayList;

public class Library extends Book {
	private String name;
	private ArrayList<Book> books;

	public Library(String yourLibrary) {
		this.setName(yourLibrary);
		this.books = new ArrayList<>();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		if (name != null || name != "") {
			this.name = name;
		}
	}

	public void addBook(Book newBook) {
		books.add(newBook);

	}

	public ArrayList<Book> searchByAuthors(String authorName) {

		ArrayList<Book> yourBooks = new ArrayList<>();

		for (int i = 0; i < books.size(); i++) {

			if (authorName.equalsIgnoreCase(books.get(i).getAuthor())) {
				yourBooks.add(books.get(i));
			}

		}

		return yourBooks;
	}

	public ArrayList<Book> getBooks() {
		return books;
	}

	public void getInfo(Book book) {
		System.out
				.printf("%nTitle: %s%nAuthor: %s%nPublishing house: %s%nPublished year: %d%nISBN: %d%n",
						book.getTitle(), book.getAuthor(),
						book.getPublishingHouse(), book.getPublishYear(),
						book.getISBN());
	}

	public void getAllInfo() {

		for (Book currentBook : books) {
			System.out
					.printf("%nTitle: %s%nAuthor: %s%nPublishing house: %s%nPublished year: %d%nISBN: %d%n",
							currentBook.getTitle(), currentBook.getAuthor(),
							currentBook.getPublishingHouse(),
							currentBook.getPublishYear(), currentBook.getISBN());
		}

	}

	public void dellBook(Book book) {
		for (int i = 0; i < books.size(); i++) {
			if (book.equals(books.get(i))) {
				books.remove(book);
			}
		}
	}

}
