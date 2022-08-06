package abstractpkg;
import java.util.Scanner;

public class Fulltimeemployee extends Employee{

	float pay = 1000f;
	float total;
	
	void calculateSalary()
	{
		total = pay*8;	
		System.out.println("The total salary is"+total);		
	
	}
	public static void main(String args[])
	{
		int a;
		Scanner g  = new Scanner(System.in);
		System.out.println("Choose the type of employee");
		System.out.println("1.Part time employee");
		System.out.println("2.Full time employee");
		a = g.nextInt();
		switch(a)
		{
			case 1: Employee e = new Contractor(); 
					  e.calculateSalary();
					  break;
					  
			case 2: Employee f = new Fulltimeemployee();
					  f.calculateSalary();
					  break;
			
		    default:System.out.println("Invalid case");
		}
		
		
		
		
	}
}
