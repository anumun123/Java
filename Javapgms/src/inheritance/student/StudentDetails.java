package inheritance.student;

import java.util.Scanner;

public class StudentDetails extends Student {
	String addr;
	public void stud()
	{
		super.studname();
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter the address");
		 addr = s1.nextLine();
			
		
	}
	public static void main(String args[])
	{
		StudentDetails sd = new StudentDetails();
		sd.stud();
		System.out.println("STUDENT DETAILS");
	    System.out.println("Student name:"+" "+sd.name);
	    System.out.println("Roll No:"+" "+sd.roll);
	    System.out.println("Address:"+" "+sd.addr);
	}
	
}
