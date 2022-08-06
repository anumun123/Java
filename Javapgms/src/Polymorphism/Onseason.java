package Polymorphism;

import java.util.Scanner;
import Polymorphism.Offseason;


public class Onseason extends Offseason{
	@Override
	public  void discount()
	{
	   int t,result;
	   String season;
	   String d = "Onseason";
	   Scanner s = new Scanner(System.in);
	   System.out.println("Enter the season");
	   season = s.nextLine();
	   System.out.println("Enter the total price");
	   t = s.nextInt();
	   if(season.equals(d))
	   {
		   result = t*15/100;
		   System.out.println("The discount price is"+result);
	   }
	}
	public static void main(String args[])
	{
		
		Offseason f = new Offseason();
		Onseason o = new Onseason();
		f.discount();
		o.discount();
	}
	}



