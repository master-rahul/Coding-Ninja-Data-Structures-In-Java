package classes_and_objects;
import java.util.Scanner;

public class StudentUse {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		Student s1 = new Student("none",1);
		//System.out.println(s1);
		Student s2 = new Student("none",2);
		//System.out.println(s2);
		Student s3 = new Student("Praphul Singh", 3); 
		//System.out.println(s3);
		s1.name = "Rahul Verma";
		s2.name = "Pooja Verma";
//		s1.setRollNumber(1);
//		s2.setRollNumber(2);
		System.out.println(s1.name+" "+s1.getRollNumber());
		System.out.println(s2.name+" "+s2.getRollNumber());
		s1.print();
		s2.print();
		s3.print();
		System.out.println(Student.getNumberOfStudents());
		s.close();
	}
}
