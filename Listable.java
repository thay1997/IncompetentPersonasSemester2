
public interface Listable { 
	//both methods are stubs, defined within the respective list classes - allows us to list objects implementing these methods together
	void populate(); //defined within teacher/course lists respectively in order to create an ArrayList output to be fed to the GUI
	void giveName(String x); //intended to take first element of the string being parsed and return it as either the teacher or course name.
}
