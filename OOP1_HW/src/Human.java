import java.nio.charset.MalformedInputException;

public class Human {

	private String name;
	private int age;
	private long egn;

	public Human(String yourName, int yourAge, long yourEGN) {
		this.setName(yourName);
		this.setAge(yourAge);
		this.setEGN(yourEGN);
	}

	public Human(long yourEGN) {
		this.setEGN(yourEGN);
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

	public long getEGN() {
		return egn;
	}

	public void setEGN(long egn) {
		this.egn = egn;
	}

	public void getGender() {

		MainEGNExtractor.EGNExtractor gender = new MainEGNExtractor.EGNExtractor(
				getEGN());
		if (gender.isMale(getEGN()) == true) {
			System.out.println("Male");
		} else {
			System.out.println("Female");
		}
	}

}
