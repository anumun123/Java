package eligibility;

public class Eligible {
	public void checkeligibility(int a)
	{
		if(a>18)
		{
			System.out.println("Eligible");
		}
		else
		{
			throw new ArithmeticException("Not eligible");
		}
	}
	public static void main(String args[])
	{
		Eligible ec = new Eligible();
		try
		{
		ec.checkeligibility(16);
		}
		catch(ArithmeticException e)
		{
			System.out.println(e.getLocalizedMessage());
		}
	}

}
