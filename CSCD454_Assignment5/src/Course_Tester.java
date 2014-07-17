import java.util.ArrayList;


public class Course_Tester {
	
	public static void main(String[] args) {
		
		ArrayList<Course> course = new ArrayList<Course>();
		
		CourseIterator courseIterator = new CourseIterator();
		
		for(Course c : course) {
			
			if(!courseIterator.hasNext())
				return;
			
			courseIterator.next();
			System.out.println(c.toString());
			
			// Remove every student after each print
			courseIterator.remove();
		} // End for each
		
	} // End main

} // End Course_Tester
