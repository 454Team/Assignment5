import java.util.ArrayList;
import java.util.Iterator;

/*
 * @author Kevin Borling
 * @author Anatoliy Kozlov
 * @author Quyen Ha
 * CSCD 454 | Design Patterns
 * Assignment 5 | Iterator
 */

public class Course implements Iterable<Student> {

	ArrayList<Student> students;

	public Course(ArrayList<Student> students) {
		this.students = students;
	} // End Course Constructor
	
	@Override
	public Iterator<Student> iterator() {
		return new CourseIterator(students);
	} // End Iterator Constructor





	

} // End Course
