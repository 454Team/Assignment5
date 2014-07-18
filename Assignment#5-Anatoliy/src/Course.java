import java.util.Iterator;

public class Course implements Iterable {
	static final int MAX_STUDENTS = 6;
	int numberOfStudents = 0;
	Student[] students;
	
	public Course() {
		students = new Student[MAX_STUDENTS];
 
		addItem(100001, "Mark");
		addItem(100002, "Anna");
		addItem(100003, "Artem");
		addItem(100004, "David");
		addItem(100005, "Marina");
		addItem(100006, "Dan");
	}
  
	public void addItem(int id, String name) 
	{
		Student student1 = new Student(id, name);
		if (numberOfStudents >= MAX_STUDENTS) {
			System.err.println("Sorry, course is full!  Can't add student to course");
		} else {
			students[numberOfStudents] = student1;
			numberOfStudents = numberOfStudents + 1;
		}
	}
	
	@Override
	public Iterator iterator() {
		return new CourseIterator(students);
	}

}
