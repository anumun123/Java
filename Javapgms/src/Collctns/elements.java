package Collctns;
import java.util.*;

public class elements {
	public static void main(String args[])
	{
		ArrayList<Integer> a1 = new ArrayList<Integer>();
		a1.add(100);
		a1.add(200);
		a1.add(300);
		a1.remove(2);
		Iterator l1 = a1.iterator();
		while(l1.hasNext())
		{
			System.out.println(l1.next());
		}
	}

}
