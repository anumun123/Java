package Calpkg;
import java.util.Scanner;
public class Calculator {
	float a;
	float b;
	float d;
	void calc()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two numbers");
		a = sc.nextFloat();
		b = sc.nextFloat();
		d = (a+b)/2;
		
		System.out.println(d);
		
	}
	public static void main(String args[])
	{
		Calculator c = new Calculator();
		c.calc();
	}

}
