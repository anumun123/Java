package package1;
import java.util.Scanner;

public class Student {
	String name;
	int roll;
	void studname()
	{
		Scanner s2 = new Scanner(System.in);
		System.out.println("Enter the name");
		 name = s2.nextLine();
		System.out.println("Enter the roll no:");
		 roll = s2.nextInt();
	}
	

}
