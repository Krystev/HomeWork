package com.hierarchy.www;

public class Frog extends Animal {
	
	private static int ages = 0;
	private static int count = 0;

	public Frog(String frogName, int frogAge, String frogSex) {
		super(frogName, frogAge, frogSex);
		count++;
		ages += frogAge;
	}

	@Override
	public void makeSound() {
		System.out.println("Kwak Kwak");
		super.makeSound();
	}
	
	public static void averageAges(){
		System.out.println(ages / count);
	}

}
