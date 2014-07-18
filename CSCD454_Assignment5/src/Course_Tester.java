import java.util.ArrayList;
import java.util.Iterator;
/*
 * @author Kevin Borling
 * @author Anatoliy Kozlov
 * @author Quyen Ha
 * CSCD 454 | Design Patterns
 * Assignment 5 | Iterator
 * Implemented using an ArrayList of type Student.
 * The remove method was created, but returns an UnsupportedOperationException.
 */
public class Course_Tester {
	
	public static void main(String[] args) {
		
		// Initialize and create student list
		ArrayList<Student> students = new ArrayList<Student>();
		students.add(new Student());
		students.add(new Student(54321, "Chester Copperpot"));
		students.add(new Student(10101, "Binary Bill"));
		
		Course course = new Course(students);
		
		Iterator<Student> studentIterator = course.iterator();

		
		for(Student s : course) {
			
			if(!studentIterator.hasNext())
				return;
			
			s = studentIterator.next();
			
			System.out.println(s.toString());
		} // End for each
		
	} // End main

} // End Course_Tester
