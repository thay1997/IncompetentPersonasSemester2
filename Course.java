import java.util.ArrayList;

public class Course {
	
	//attributes
	private String courseName;
	private int numStaffRequired;
	private ArrayList<String> trainingCoursesRequired = new ArrayList<String>();
	private ArrayList<Teacher> arrayOfTeachers = new ArrayList<Teacher>();
	
	//constructor
 	public Course (String a, int b, ArrayList<String> c, ArrayList<Teacher> d) {
 		courseName = a;
 		numStaffRequired = b;
 		trainingCoursesRequired = c;
 		arrayOfTeachers = d;
 	}
 	
 	//methods
	public String getCourseName() {
		return courseName;
	}
	
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	
	public int getNumStaffRequired() {
		return numStaffRequired;
	}
	
	public void setNumStaffRequired(int a) {
		numStaffRequired = a;
	}
	
	public ArrayList<String> getTrainingCoursesRequired() {
		return trainingCoursesRequired;
	}
	
	public ArrayList<String> addTrainingCoursesRequired(String a) {
		trainingCoursesRequired.add(a);
		return trainingCoursesRequired;
	}
	
	public ArrayList<Teacher> addTeacher(Teacher a) {
		arrayOfTeachers.add(a);
		return arrayOfTeachers;
	}
	
	public ArrayList<Teacher> getArrayOfTeachers() {
		return arrayOfTeachers;
	}

	public String toString() {
		String courseString = this.getCourseName() + "\n" + "Staff Required: " + this.getNumStaffRequired() //continued on next line
		+"\n" + "Training Courses Required: " + this.getTrainingCoursesRequired() + "\n" + "Teachers Assigned: " + this.getArrayOfTeachers();
		System.out.print(courseString);
		return courseString;
	}
	
	
}
