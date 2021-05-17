import java.util.ArrayList;
public class Teacher {

	private String teacherName;
	private ArrayList<String> trainingCoursesAttended = new ArrayList<String>();
	private ArrayList<String> trainingCoursesToAttend = new ArrayList<String>();
	
	public Teacher(String a, ArrayList<String> b) {
		teacherName = a;
		trainingCoursesAttended = b;
	}
	public String getTeacherName() {
		return teacherName;
	}
	public void setTeacherName(String x) {
		x = teacherName;
	}
	public ArrayList<String> getTrainingCoursesAttended() {
		return trainingCoursesAttended;
	}	
	public ArrayList<String> getTrainingCoursesToAttend() {
		return trainingCoursesToAttend;	
	}
	public ArrayList<String> addTrainingAttended(String x) {
		trainingCoursesAttended.add(x);
		return trainingCoursesAttended;
	}
	public ArrayList<String> addTrainingToAttend(String x) {
		trainingCoursesToAttend.add(x);
		return trainingCoursesToAttend;
	}
	public String toString() {
		String teacherString = this.getTeacherName() + "\n" + "Courses attended: " + this.getTrainingCoursesAttended() + "\n" + "Courses to attend: " + this.getTrainingCoursesToAttend();
		System.out.print(teacherString);
		return teacherString;
	}
	
	
	
}
