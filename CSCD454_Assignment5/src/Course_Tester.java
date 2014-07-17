import java.util.ArrayList;


public class Course_Tester {
	
	public static void main(String[] args) {
		
		CourseIterator studentIterator = new CourseIterator();
		ArrayList<Student> students= new ArrayList<Student>();
		
		for(Student s : students)
		{
			if(!studentIterator.hasNext())
				return;
			
			s = studentIterator.next();
			System.out.println(s.toString());
		}
		
	} // End main

} // End Course_Tester
