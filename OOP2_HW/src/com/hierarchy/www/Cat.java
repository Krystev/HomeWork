package com.hierarchy.www;

public class Cat extends Animal {
	
	private static  int ages = 0;
	private static int count = 0;

	public Cat(String catName, int catAge, String catSex) {

		super(catName, catAge, catSex);
		count++;
		ages += catAge;
	}

	@Override
	public void makeSound() {
		System.out.println("Miauuuu Miauuu");
		super.makeSound();
	}
	
	public static void averageAges(){
		System.out.println(ages / count);
	}

}
