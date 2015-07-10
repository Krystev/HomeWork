package net.library.com;

public class Book extends Publication{
	
	private String bookAuthor;
	private int releaseYear;
	
	public Book(String bookName, String author, int year) {
		super(bookName);
		this.setBookAuthor(author);
		this.setReleaseYear(year);
		
	}
	
	public String getBookAuthor() {
		return bookAuthor;
	}

	public void setBookAuthor(String bookAuthor) {
		this.bookAuthor = bookAuthor;
	}

	public int getReleaseYear() {
		return releaseYear;
	}

	public void setReleaseYear(int releaseYear) {
		this.releaseYear = releaseYear;
	}

	
	
	
	

}
