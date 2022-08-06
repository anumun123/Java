package abstractpkg;
import java.util.Scanner;

public class Contractor extends Employee{
	float pay = 500;
	float hrs;
	float total;
	
	void calculateSalary()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the total hours worked");
		hrs = sc.nextFloat();
		total = pay*hrs;	
		System.out.println("The total salary is"+total);	
	
	}
	

}
