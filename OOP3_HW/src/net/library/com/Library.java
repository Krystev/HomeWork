package net.library.com;

import java.util.ArrayList;

public class Library {
	
	private String libraryName;
	private String libraryAddress;
	private String workingTime;
	private ArrayList<Publication> allPublications;
	
	public Library (String name, String address, String workingTime) {
		this.setLibraryName(name);
		this.setLibraryAddress(address);
		this.setWorkingTime(workingTime);
		allPublications = new ArrayList<>();
	}
	
	public void add(Publication pub) {
		allPublications.add(pub);
	}
	
	public void booking(Publication pub) {
		for (int i = 0; i < allPublications.size(); i++) {
			if (allPublications.get(i).equals(pub)) {
				allPublications.get(i).book();
			}
		}
	}
	
	
	public ArrayList<Publication> getAllPublications() {
		return allPublications;
	}

	public void setAllPublications(ArrayList<Publication> allPublications) {
		this.allPublications = allPublications;
	}

	public String getLibraryName() {
		return libraryName;
	}
	public void setLibraryName(String libraryName) {
		this.libraryName = libraryName;
	}
	public String getLibraryAddress() {
		return libraryAddress;
	}
	public void setLibraryAddress(String libraryAddress) {
		this.libraryAddress = libraryAddress;
	}
	public String getWorkingTime() {
		return workingTime;
	}
	public void setWorkingTime(String workingTime) {
		this.workingTime = workingTime;
	}

}
