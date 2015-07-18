import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class ClassInfo {
	
	private String classNumber;
	private String roomNumber;
	private String classManager;
	private List<Students> students;
	private List<Teacher> teachers;
	
	public ClassInfo(String classNumber, String roomNumber, String classManager) {
		super();
		this.students = new ArrayList<>();
		this.teachers = new ArrayList<>();
		this.classNumber = classNumber;
		this.roomNumber = roomNumber;
		this.classManager = classManager;
	}
	
	public void addStudent(Students stud) {
		this.students.add(stud);
	}
	
	public void addTeacher(Teacher teach) {
		this.teachers.add(teach);
	}
	
	public double classGPA() {
		double gpa = 0;
		int count = 0;
		
		for (int i = 0; i < students.size(); i++) {
			gpa = gpa + students.get(i).getGpa();
			count++;
		}
		
		return (gpa/count);
	}
	
	public int allTeachersExp() {
		int years = 0;
		for (int i = 0; i < teachers.size(); i++) {
			years = years + teachers.get(i).getExp();
		}
		return years;
	}
	
	public ArrayList<Human> gotBirthday(String date) {
		ArrayList<Human> allBirthdays = new ArrayList<>();
		
		for (Iterator iterator = teachers.iterator(); iterator.hasNext();) {
			Human human = (Human) iterator.next();
			if (date.equals(human.getBornDate())) {
				allBirthdays.add(human);
			}
		}
		
		for (Iterator iterator = students.iterator(); iterator.hasNext();) {
			Human human = (Human) iterator.next();
			
			if (date.equals(human.getBornDate())) {
				allBirthdays.add(human);
			}
			
		}
		
		return allBirthdays;
		
	}
	
	public String getClassNumber() {
		return classNumber;
	}
	public void setClassNumber(String classNumber) {
		this.classNumber = classNumber;
	}
	public String getRoomNumber() {
		return roomNumber;
	}
	public void setRoomNumber(String roomNumber) {
		this.roomNumber = roomNumber;
	}
	public String getClassManager() {
		return classManager;
	}
	public void setClassManager(String classManager) {
		this.classManager = classManager;
	}
	

}
