package excphandling;

public class Arithmaticcal {
	int a=10;;
	int b=5;
	int c;
	
	void sum()
	{
		c=a+b;
		System.out.println("Sum"+c);
	}
	
	void diff()
	{
		c=a-b;
		System.out.println("Difference"+c);
	}
	
	
	
	void div()
	{
		c=a/b;
		System.out.println("Div"+c);
		try
		{
		int d=a/0;
		System.out.println("Division by zero"+d);
		}
		catch(ArithmeticException e) {
			System.out.println(e.fillInStackTrace());
		
		}
		finally {
			System.out.println("Finally executed");
		}
	}
	
	
	public static void main(String args[])
	{
		Arithmaticcal ar = new Arithmaticcal();
		ar.sum();
		ar.diff();
		ar.div();
	}

}
