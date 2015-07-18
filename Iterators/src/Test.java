import java.util.Scanner;

import net.dictionary.com.Dictionary;


public class Test {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Dictionary dict = new Dictionary("Hello", "Здравей");
		
		dict.addTranslation("Cat", "Котка");
		dict.addTranslation("Dog", "Куче");
		
		
		System.out.println(dict.charSearch('H'));
		
		System.out.println("Insert word: ");
		
		dict.lookup(sc.nextLine());
		dict.lookupEN(sc.nextLine());
		
		
		
		
		ClassInfo myClass = new ClassInfo("12A", "205", "Georgi Petkov");
		Students student1 = new Students("Ivo Ivov", "26.01.1990", 3.37);
		Students student2 = new Students("Ivan Ivov", "28.03.1990", 4.40);
		Students student3 = new Students("Ivailo Ivov", "11.02.1990", 5.83);
		
		Teacher teach1 = new Teacher("Georgi Borisov", "28.01.1966", 12);
		Teacher teach2 = new Teacher("Bobi Bobov", "23.02.1971", 10);
		Teacher teach3 = new Teacher("Miro Mironov", "31.01.1976", 9);
		
		myClass.addStudent(student1);
		myClass.addStudent(student2);
		myClass.addStudent(student3);
		myClass.addTeacher(teach1);
		myClass.addTeacher(teach2);
		myClass.addTeacher(teach3);
		
		System.out.println(myClass.classGPA());
		System.out.println(myClass.allTeachersExp());
		
		int count = myClass.gotBirthday("28.03.1990").size();
		for (int j = 0; j < count; j++) {
			System.out.println(myClass.gotBirthday("28.03.1990").get(j).getName());
		}
		
		
	}

}
