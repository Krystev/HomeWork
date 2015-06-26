public class Student extends Human {
	private int facultyNumber;
	private String specialty;
	private int course;

	public Student(String yourName, int yourAge, long yourEGN, int facNum,
			String spec, int yourCourse) {
		super(yourName, yourAge, yourEGN);
		this.setFacultyNumber(facNum);
		this.setSpecialty(spec);
		this.setCourse(yourCourse);
	}

	public String getSpecialty() {
		return specialty;
	}

	public void setSpecialty(String specialty) {
		this.specialty = specialty;
	}

	public int getFacultyNumber() {
		return facultyNumber;
	}

	public void setFacultyNumber(int facultyNumber) {
		this.facultyNumber = facultyNumber;
	}

	public int getCourse() {
		return course;
	}

	public void setCourse(int course) {
		this.course = course;
	}

	public boolean isLastCourse() {
		if (getCourse() < 4) {
			return false;
		}
		return true;
	}

}
