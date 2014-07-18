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
		
		Course course = new Course();
		
		Iterator<Student> studentIterator = course.iterator();
	
		System.out.println("Course: " + course.toString());
		System.out.println("\nStudent List:\nName - ID:");
		
		for(Student s : course) {
			
			if(!studentIterator.hasNext())
				return;
			
			s = studentIterator.next();
			
			System.out.println(s.toString());
		} // End for each
		
	} // End main

} // End Course_Tester
