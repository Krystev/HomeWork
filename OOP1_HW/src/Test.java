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
		Book book1 = new Book("newTitle", "newAuth", "house", 1990, 1234);
		Library lib1 = new Library("Tito");
		lib1.addBook(book1);
		lib1.print();
		
		
		
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
