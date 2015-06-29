import java.awt.Color;
import java.util.Date;

import com.flappybird.www.FlappyBird;
import com.flappybird.www.GameObject;
import com.flappybird.www.MovingObject;
import com.library.www.Book;
import com.library.www.Library;

public class Test {

	public static void main(String[] args) {

		// FlappyBird birdRed = new FlappyBird("Red Bird", 25, false, true,
		// Color.RED, true);
		//
		// NewDate date1 = new NewDate(2015, 01, 01);
		//
		// System.out.println(date1.isHoliday());
//		Human hum = new Human("T", 25, 9001261855L);
//		Teacher teach = new Teacher("Pesho", 21, 9001261880L, "IT", "FMI");
//		Student stud = new Student("Tito", 25, 9011111867L, 117499, "IT", 3);
//		
		Book book1 = new Book("The Talisman", "Stephen King", "Viking", 1984, 1234);
		Book book2 = new Book("A Game of Thrones", "George R. R. Martin", "Bantam Spectra", 1996, 1235);
		Book book3 = new Book("Dreamcatcher", "Stephen King", "Scribner", 2001, 1236);
		Book book4 = new Book("The Dark Half", "Stephen King", "Viking", 1989, 1237);
		Book book5 = new Book("The Fellowship of the Ring", "J. R. R. Tolkien", "George Allen & Unwin", 1954, 1238);
		
		Library lib1 = new Library("Tito");
		
		lib1.addBook(book1);
		lib1.addBook(book2);
		lib1.addBook(book3);
		lib1.addBook(book4);
		lib1.addBook(book5);
		
//		lib1.getAllInfo();
		
		lib1.dellBook(lib1.searchByAuthors("Stephen King"));
		
		lib1.getAllInfo();
		
//		lib1.getInfo(book2);
		
		
			
		
		
		
		
		
//		System.out.println(stud.isLastCourse());
//
//		teach.workingTime();
//		hum.getGender();

		//
		// System.out.println(birdRed.isSummerField());
		//
		// System.out.println(birdRed.isFlying());
		//
		// birdRed.point();
		// System.out.println(birdRed.getPoints());
		//
		// System.out.println(birdRed.click());
		//
		// birdRed.startGame();
		//
		// birdRed.setPlayerName("Tito");
		// birdRed.startGame();
		//
		//
		//
		//
		//
	}

}
