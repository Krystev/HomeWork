import java.util.LinkedList;
import java.util.Queue;


public class Messages {

	public static void main(String[] args) {
		Queue<String> msgs = new LinkedList<String>();
		msgs.offer("- Hello!");
		msgs.offer("- Hi!");
		msgs.offer("- How are you?");
		msgs.offer("- I am fine, thanks! And you?");
		msgs.offer("- Me too!");
		
		while (msgs.size() > 0) {
			String msg = msgs.poll();
			System.out.println(msg);
		}
		
	}

}
