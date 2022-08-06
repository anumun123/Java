package Polymorphism;
import java.util.Scanner;

public class Offseason {
public  void discount()
{
   int totalprice;
   String season;
   String t = "Offseason";
   Scanner s = new Scanner(System.in);
   System.out.println("Enter the season");
   season = s.nextLine();
   System.out.println("Enter the total price");
   totalprice = s.nextInt();
   
   if(season.equals(t))
   {
	   
	   double d = totalprice*15/100;
	   System.out.println("The total price is"+d);
   
   }
}
}
