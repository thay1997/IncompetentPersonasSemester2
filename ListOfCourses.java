import java.util.ArrayList;
import java.util.Iterator;

//Implements the List interface that means we can make a generic array list containing this object
public class ListOfCourses implements List{
	private ArrayList<Course> LoC = new ArrayList<Course>();
	
	//Constructor is empty, no attributes are passed when created
	//Could this be deleted???
	public ListOfCourses() {
		
	}
	
	//returns the List of courses array
	public ArrayList<Course> getCourses(){
		return LoC;
	}
	//adds courses to the list of courses array
	public void addCourse(Course c) {
		LoC.add(c);
	}
	//subtracts courses to the list of courses array
	public void subCourse(Course c) {
		int pos = LoC.indexOf(c);
		LoC.remove(pos);
	}
	//returns the names of the courses, method from the List interface
	public String getNames() {
		String line = "";
		for(Course courseNames: LoC) {
			line += courseNames.getName() + "\n";
		}
		return line;
	}
	//toString method 
	public String toString() {
		String line = "";
		Iterator<Course> i = LoC.iterator();
		if(i.hasNext())
			line += i.next();
		while(i.hasNext())
			line += i.next();
		
		return line;
	}
}
