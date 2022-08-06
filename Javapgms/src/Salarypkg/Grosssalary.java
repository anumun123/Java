package Salarypkg;
import java.util.Scanner;

public class Grosssalary {
	float basicsal;
	float da;
	float hra;
	float gross;

public void grosssal()
{
Scanner s = new Scanner(System.in);
System.out.println("Enter basic salary");
basicsal = s.nextFloat();
da = basicsal*40/100;
hra = basicsal*20/100;
gross = basicsal+da+hra;
System.out.println("The gross salary is"+gross);
}

public static void main(String args[])
{
	Grosssalary g = new Grosssalary();
	g.grosssal();
}
}
