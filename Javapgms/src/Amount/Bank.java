package Amount;
import java.util.Scanner;

public class Bank {
	float amt;
	float balance;
	float withdraw;
	public float deposit()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the amount to deposit");
		amt = sc.nextFloat();
		System.out.println("Enter the amount to withdraw");
		withdraw = sc.nextFloat();
		balance = amt - withdraw;
		return balance;
		
	}
public static void main(String args[])
{
	Bank b = new Bank();
	System.out.println("The balance amount is"+b.deposit());
}
}
