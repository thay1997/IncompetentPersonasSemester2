
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

import org.json.JSONArray;

//Implements the List interface that means we can make a generic array list containing this object
public class TeacherList implements List {
	
	private ArrayList<Teacher> LoT = new ArrayList<Teacher>();
	
	//Constructor uses the teacher array created by file parser to make Teachers and add them to the LoT
	public TeacherList(ArrayList<String> teachersFromFile) {

		//Takes the String array list and make teacher object for each element and adds it to the LoT
		for(String input :teachersFromFile) {
        	String line = input;
        	Scanner s = new Scanner(line);
        	ArrayList<String> training = new ArrayList<String>();
        	String name = s.next();
        	while(s.hasNext())
        		training.add(s.next());

//        	******Another way to create teachers from the file, requires changing FileHandler slightly******
//    		for(int i = 0; i<teachersFromFile.size();i++) {
//        	String[] tokens = line.split(",");
//        	String name = tokens[0]; //First element in the array is always the teachers name
//        	ArrayList<String> training = new ArrayList<String>();
//        	for(int j = 1; j< tokens.length;j++) { //The remaining elements are all training 
//        		training.add(tokens[j]);
//        	}
        	Teacher t = new Teacher(name,training);
        	LoT.add(t);
        	s.close();
        
        }
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
	
	public static void main(String[] args) {
		FileHandler fileHandler = new FileHandler();
        // Read the file
        JSONArray array = fileHandler.readFile();

        // Parse the teachers
        ArrayList<String> parsedTeachers = fileHandler.parseTeachers(array);
        
        TeacherList teachers = new TeacherList(parsedTeachers);
        
        
        System.out.println(teachers);
	}

}
