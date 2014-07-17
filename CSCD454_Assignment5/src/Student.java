
public class Student {
	
	private int ID;
	private String name;
	
	public Student() {
		this.setID(12345);
		this.setName("Billy Bob");
	} // End Student DVC
	
	public Student(int ID, String name) {
		this.setID(ID);
		this.setName(name);
	} // End Student EVC

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

} // End Student
