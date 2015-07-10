package net.library.com;

public class Newspaper extends Publication{
	
	private String releaseDate;
	
	public Newspaper(String newsName, String date) {
		super(newsName);
		this.setReleaseDate(date);
	}

	public String getReleaseDate() {
		return releaseDate;
	}

	public void setReleaseDate(String releaseDate) {
		this.releaseDate = releaseDate;
	}

	

}
