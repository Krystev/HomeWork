package net.library.com;

public class Publication {

	private String name;
	private boolean isFree;

	public Publication(String pubName) {
		this.setName(pubName);
		this.setFree(true);
	}

	public void book() {
		this.setFree(false);
	}

	public void returned() {
		this.setFree(true);
	}

	public void getDetails(Publication pub) {
		if (pub instanceof Book) {
		System.out.printf("Book Name: %s, Author: %s, Year: %d, Is free: %b%n",
				pub.getName(), ((Book) pub).getBookAuthor(), ((Book) pub).getReleaseYear(), pub.isFree);
		} else {
			System.out.printf("Newspaper name: %s, Date: %s, Is free: %b%n",
					pub.getName(), ((Newspaper) pub).getReleaseDate(), pub.isFree);
		}
	}

	public void getDetails(Newspaper news) {
		
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isFree() {
		return isFree;
	}

	public void setFree(boolean isFree) {
		this.isFree = isFree;
	}

}
