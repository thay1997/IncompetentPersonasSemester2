
import java.util.ArrayList;
import java.util.Iterator;

//Implements the List interface that means we can make a generic array list containing this object
public class ListOfTeachers implements List {
	
	private ArrayList<Teacher> LoT = new ArrayList<Teacher>();
	
	//Constructor is empty, no attributes are passed when created
	//Could this be deleted???
	public ListOfTeachers() {
		
	}
	
	//returns the list of teachers
	public ArrayList<Teacher> getTeachers() {
		return LoT;
	}
	
	//add teachers to the list of teachers
	public void addTeacher(Teacher t) {
		LoT.add(t);
	}
	
	//subtract teachers from the list of teachers
	public void subTeacher(Teacher t) {
		int pos = LoT.indexOf(t);
		LoT.remove(pos);
	}
	
	//returns the names of the teachers in the List, method from the List Interface
	public String getNames() {
		String line = "";
		for(Teacher teacher: LoT) {
			line += teacher.getName() + "\n";
		}
		return line;
	}
	
	//toString method
	public String toString() {
		String line = "";
		Iterator<Teacher> i = LoT.iterator();
		if(i.hasNext())
			line += i.next();
		while(i.hasNext())
			line += "\n" + i.next();
		
		return line;
	}

}
