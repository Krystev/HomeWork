

public class Teacher extends Human{
	
	private String subjectTeaching;
	private String faculty;

	public Teacher(String yourName, int yourAge, long yourEGN, String subject, String fac) {
		super(yourName, yourAge, yourEGN);
		this.setSubjectTeaching(subject);
		this.setFaculty(fac);

	}

	public String getFaculty() {
		return faculty;
	}

	public void setFaculty(String faculty) {
		this.faculty = faculty;
	}

	public String getSubjectTeaching() {
		return subjectTeaching;
	}

	public void setSubjectTeaching(String subjectTeaching) {
		this.subjectTeaching = subjectTeaching;
	}
	
	public void workingTime(){
		System.out.println("08:00h - 16:00h");
	}

}
