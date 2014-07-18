import java.util.ArrayList;
import java.util.Iterator;
/*
 * @author Kevin Borling
 * @author Anatoliy Kozlov
 * @author Quyen Ha
 * CSCD 454 | Design Patterns
 * Assignment 5 | Iterator
 */

public class CourseIterator implements Iterator<Student> {
	
	ArrayList<Student> students;
	int index;
	
	public CourseIterator(ArrayList<Student> students) {
		this.students = students;
	} // End CourseIterator Constructor
	
	public boolean hasNext() {
		if (index >= students.size() || students.get(index) == null)
			return false;
		return true;
	} // End hasNext

	public Student next() {
		Student student = students.get(index);
		index += 1;
		return student;
	} // End next

	public void remove() {
		throw new UnsupportedOperationException("Course Iterator does not support remove()");
	} // End remove

}
