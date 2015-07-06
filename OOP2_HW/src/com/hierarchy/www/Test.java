package com.hierarchy.www;

public class Test {

	public static void main(String[] args) {
		Animal[] animals = new Animal[5];
			animals[0]	= new Frog("Jabcho", 2, "Male");
			animals[1]	= new Cat("Leon", 3, "Male");
			animals[2]	= new Dog("Sara", 4, "Female");
			animals[3]	= new Kitten("Kitty", 1);
			animals[4]	= new Tomcat("Tommy", 1);
			
			
			animals[0].makeSound();
			animals[1].makeSound();
			animals[2].makeSound();
			animals[3].makeSound();
			animals[4].makeSound();
			
			Cat.averageAges();
			Dog.averageAges();
			Frog.averageAges();

			
			
			
	}
	
	

}
