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

	private ArrayList<Student> students;
	private String courseName;
	
	public Course() {
		this.students = createStudentList();
		this.courseName = "CPLA 3000";
	} // End Course Constructor
	
	@Override
	public Iterator<Student> iterator() {
		return new CourseIterator(students);
	} // End Iterator Constructor

	/*
	 * Creates student list for the course
	 */
	private ArrayList<Student> createStudentList()
	{
		ArrayList<Student> studentList = new ArrayList<Student>();
		studentList.add(new Student());
		studentList.add(new Student(54321, "Chester Copperpot"));
		studentList.add(new Student(10101, "Binary Bill"));
		return studentList;
	} // End createStudentList

	public String toString() {
		return this.courseName;
	}
	

} // End Course
