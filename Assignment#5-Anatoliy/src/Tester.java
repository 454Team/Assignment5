import java.util.Iterator;

public class Tester {
	static Course newCourse;
	
	public static void main(String[] args) {
		newCourse = new Course();
		printMenu();

	}

	public static void printMenu() {
		Iterator sIterator = newCourse.iterator();

		System.out.println("Course\n----\nID - Name");
		printMenu(sIterator);
	}
 
	private static void printMenu(Iterator iterator) {
		while (iterator.hasNext()) {
			Student menuItem = (Student)iterator.next();
			System.out.println(menuItem.getID() + " - " + menuItem.getName());
		}
	}
}
