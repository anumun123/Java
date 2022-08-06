package bankif;

import java.util.Scanner;

public class HDFC implements RBI{
	
	@Override
	public void recurringDeposit(float amount,int duration)
	{
		float total = amount*(1+(rate*duration));
		System.out.println("The total amount after"+" "+duration+" "+"years is"+" "+total);
	}
	
	public static void main(String args[])
	{
		RBI r = new HDFC();
		Scanner s =new Scanner(System.in);
		System.out.println("Enter the amount");
		float a = s.nextFloat();
		System.out.println("Enter the duration");
		int b = s.nextInt();
		r.recurringDeposit(a, b);
		
		
	}
}
