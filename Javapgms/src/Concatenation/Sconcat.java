package Concatenation;
import java.util.Scanner;

public class Sconcat {
	public static void main(String args[])
	{
		String s1;
		String s2;
		String s3;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string");
		s1 = sc.nextLine();
		System.out.println("Enter another string for concatenation");
		s2 = sc.nextLine();
		s3 = s1.concat(s2);
		System.out.println("After string concatenation"+" "+s3);
		
		
	}
}
