import java.util.ArrayList;


public class Course extends CourseIterator {

	Student student1, student2, student3;
	
	public Course() {
		ArrayList<Course> studentList= new ArrayList<Course>();
		
		student1 = new Student(54321,"Joe Schmoe");
		student2 = new Student();
		student3 = new Student(10101,"Fred Flintstone");
		
		studentList.add(student1);
		studentList.add(student2);
		studentList.add(student3);
	}
	
} // End Course
