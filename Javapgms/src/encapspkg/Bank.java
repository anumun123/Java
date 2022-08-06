package encapspkg;

import java.util.Scanner;

public class Bank {
	float amt;
	float bal;
	float withdraw;
	public void withdraw()
	{
		
		Scanner e = new Scanner(System.in);
		System.out.println("Enter the deposit amount");
		amt = e.nextFloat();
		System.out.println("Enter the amount to withdraw");
		withdraw = e.nextFloat();
		bal = amt - withdraw;
		if(bal<withdraw)
		{
			System.out.println("Invalid balance");
		}
		else
			System.out.println("Balance amount is"+" "+bal);
	}
	
	public void pinvalidate(int pin)
	{
		if (pin == 1001 || pin == 1234 || pin == 1212)
		{
			System.out.println("Pin is valid");
			withdraw();
		}
		else
		{
			System.out.println("Pin is invalid.Try again");
			
			
		}
	}
	
	public static void main(String args[])
	{
		User u = new User();
		Bank b = new Bank();
		Scanner c = new Scanner(System.in);
		System.out.println("Enter the pin");
		int p = c.nextInt();
		u.setPin(p);
		b.pinvalidate(u.getPin());
		
		
		
		
	}
	
	
	
	
}
