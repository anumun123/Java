package inheritance.student;
import java.util.Scanner;

public class Student {
	String name;
	int roll;
	void studname()
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the name");
		 name = s.nextLine();
		System.out.println("Enter the roll no:");
		 roll = s.nextInt();
	}
	}