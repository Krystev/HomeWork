package com.library.www;

public class Test {

	public static void main(String[] args) {
		
		Book book1 = new Book("The Talisman", "Stephen King", "Viking", 1984, 1234);
		Book book2 = new Book("A Game of Thrones", "George R. R. Martin", "Bantam Spectra", 1996, 1235);
		Book book3 = new Book("Dreamcatcher", "Stephen King", "Scribner", 2001, 1236);
		Book book4 = new Book("The Dark Half", "Stephen King", "Viking", 1989, 1237);
		Book book5 = new Book("The Fellowship of the Ring", "J. R. R. Tolkien", "George Allen & Unwin", 1954, 1238);
		
		Library lib1 = new Library("Tito");
		
		lib1.addBook(book1);
		lib1.addBook(book2);
		lib1.addBook(book3);
		lib1.addBook(book4);
		lib1.addBook(book5);
		
		for (Book books : lib1.getBooks()) {
			lib1.getInfo(books);
		}
		
		for (int i = 0; i < lib1.searchByAuthors("Stephen King").length; i++) {
			for (int j = 0; j < lib1.getBooks().size() - 1; j++) {
				if (lib1.searchByAuthors("Stephen King")[i].equals(lib1.getBooks().get(j))){
					lib1.dellBook(lib1.getBooks().get(j));
				}
			}
			
		}
		
		for (Book books : lib1.getBooks()) {
			lib1.getInfo(books);
		}
	}

}
