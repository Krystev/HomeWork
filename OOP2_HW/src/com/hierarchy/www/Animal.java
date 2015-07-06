package com.hierarchy.www;

public class Animal implements ISound{
	
	private String name;
	private int age;
	private String sex;
	
	public Animal(String animalName, int animalAge, String animalSex) {
		this.setName(animalName);
		this.setAge(animalAge);
		this.setSex(animalSex);
	}
	
	public void makeSound(){
		
	}
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

}
