package com.library.www;

public class Book {
	private static String title;
	private static String author;
	private static String publishingHouse;
	private static int publishYear;
	private static int isbn;

	public Book(String newTitle, String newAuth, String house, int year,
			int newISBN) {
		Book.setTitle(newTitle);
		Book.setAuthor(newAuth);
		Book.setPublishingHouse(house);
		Book.setPublishYear(year);
		Book.setISBN(newISBN);

	}
	public Book() {
		
	}

	public static String getTitle() {
		return title;
	}

	public static void setTitle(String newTitle) {
		Book.title = newTitle;
	}

	public String getAuthor() {
		return author;
	}

	public static void setAuthor(String author) {
		Book.author = author;
	}

	public String getPublishingHouse() {
		return publishingHouse;
	}

	public static void setPublishingHouse(String publishingHouse) {
		Book.publishingHouse = publishingHouse;
	}

	public int getPublishYear() {
		return publishYear;
	}

	public static void setPublishYear(int publishYear) {
		Book.publishYear = publishYear;
	}

	public int getISBN() {
		return isbn;
	}

	public static void setISBN(int newISBN) {
		Book.isbn = newISBN;
	}

}
