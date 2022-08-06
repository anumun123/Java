package Psswordpkg;
import java.util.Scanner;

public class Password {
	public static boolean valid_pwd(String p)
	{
		if(p.length()<10)
			return false;
		
			int charcount=0;
			int numcount=0;
			for(int i=0;i<p.length();i++)
			{
				char ch=p.charAt(i);
				if (is_letter(ch))
					charcount++;
				else if(is_num(ch))
					numcount++;
				else 
					return false;
			}
			return (charcount>=2 &&numcount>=2); 
	}
	
	public static boolean is_letter(char ch)
	{	
		ch= Character.toUpperCase(ch);
		return (ch>='A'&& ch<='Z');
			

	}
	
	public static boolean is_num(char ch)
	{
		return (ch>='0'&& ch<='9');			

	}
	
	
	
	public static void main(String args[])
	{
		String s;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a password");
		s = sc.nextLine();
		if (valid_pwd(s))
		{
			System.out.println("Password valid");
		}
		else
		{
			System.out.println("Password invalid");
		}
			
	}	
			
			
		
	
	
}
