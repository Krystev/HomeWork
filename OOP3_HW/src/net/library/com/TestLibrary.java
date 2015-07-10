package net.library.com;

public class TestLibrary {

	public static void main(String[] args) {
		Library lib = new Library("Razvitie", "Vratsa", "09:00 - 18:00");
		
		Book book1 = new Book("Game of thrones 1", "Martin", 1996);
		Book book2 = new Book("Game of thrones 2", "Martin", 1997);
		Book book3 = new Book("Game of thrones 3", "Martin", 1998);
		
		Newspaper news1 = new Newspaper("Telegraph", "26.01.1990");
		Newspaper news2 = new Newspaper("Daily Mail", "26.02.1993");
		Newspaper news3 = new Newspaper("Mirror", "01.05.2006");
		
		lib.add(book1);
		lib.add(book2);
		lib.add(book3);
		lib.add(news1);
		lib.add(news2);
		lib.add(news3);
		
		lib.booking(book2);
		lib.booking(news2);
		
		for (int i = 0; i < lib.getAllPublications().size(); i++) {
			lib.getAllPublications().get(i).getDetails(lib.getAllPublications().get(i));
		}
		
		

	}

}
