
public class Student extends Course{
	
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
	} // End getID

	public void setID(int iD) {
		ID = iD;
	} // End setID

	public String getName() {
		return name;
	} // End getName

	public void setName(String name) {
		this.name = name;
	} // End setName
	
	public String toString() {
		return this.getName() + " " + this.getID() + "\n";
	} // End toString

} // End Student
