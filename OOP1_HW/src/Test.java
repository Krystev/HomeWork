
import com.flappybird.www.FlappyBird;

public class Test {
	public static void main(String[] args) {

		FlappyBird birdRed = new FlappyBird(true, true);

		birdRed.isDead();

		System.out.println(birdRed.isFlying());

		System.out.println(birdRed.getPoints());

		System.out.println(birdRed.click());

		NewDate date1 = new NewDate(2015, 01, 01);

		System.out.println(date1.isHoliday());
		
		Human hum = new Human("T", 25, 9001261855L);
		Teacher teach = new Teacher("Pesho", 21, 9001261880L, "IT", "FMI");
		Student stud = new Student("Tito", 25, 9011111867L, 117499, "IT", 3);
		
		
		hum.getGender();
		
		teach.workingTime();
		
		System.out.println(stud.isLastCourse());
		

	}

}
