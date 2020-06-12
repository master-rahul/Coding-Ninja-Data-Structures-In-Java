package classes_and_objects;

public class Student {
	//Properties
	String name;
	private final int rollNumber;
	private static int numberOfStudents = 0;
	//Functions
	public Student(String s) {
		name = s;
		rollNumber = -1;
		numberOfStudents++;
	}
	
	public Student(String name, int rollNumber) {
		System.out.println(this);
		this.name = name;
		this.rollNumber = rollNumber;
		numberOfStudents++;
	}
	
//	public void setRollNumber(int m) {
//		if(m < 0)
//			return;
//		rollNumber = m;
//	}
	
	public static int getNumberOfStudents() {
		return numberOfStudents;
	}
	
	public int getRollNumber() {
		return rollNumber;
	}
	
	public void print() {
		System.out.println("Name : "+name+", Roll Number : "+rollNumber);
	}
}
