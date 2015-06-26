package com.library.www;

import java.util.Arrays;



public class Library extends Book{
	private String name;
	private Book[] list = new Book[0];
	

	public Library(String yourLibrary) {
		this.setName(yourLibrary);
	}
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void addBook(Book newBook) {
		
		list  = Arrays.copyOf(list, list.length + 1);
	    list[list.length - 1] = newBook;
	    
	    
		
	}
	
	public void print(){
		for (int i = 0; i < list.length; i++) {
			System.out.println(list[i] + "/n");
		}
	}
	
	
//	public String searchByAuthors(String authorName){
//		if (authorName.toLowerCase().equals(getAuthor().toLowerCase())) {
//			
//		}
//	}
}
