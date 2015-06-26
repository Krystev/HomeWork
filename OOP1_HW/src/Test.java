import java.awt.Color;





import java.util.Date;

import com.flappybird.www.FlappyBird;
import com.flappybird.www.GameObject;
import com.flappybird.www.MovingObject;


public class Test {

	public static void main(String[] args) {
		
		
		FlappyBird birdRed = new FlappyBird("Red Bird", 25, false, true, Color.RED, true);
		
		NewDate date1 = new NewDate(2015, 01, 01);
		
		System.out.println(date1.isHoliday());
		MainEGNExtractor hum = new MainEGNExtractor("T", 25, 900126188);
		
		
//		
//		System.out.println(birdRed.isSummerField());
//		
//		System.out.println(birdRed.isFlying());
//		
//		birdRed.point();
//		System.out.println(birdRed.getPoints());
//		
//		System.out.println(birdRed.click());
//		
//			birdRed.startGame();
//			
//			birdRed.setPlayerName("Tito");
//			birdRed.startGame();
//			
//			
//			
//
//		
	}

}
