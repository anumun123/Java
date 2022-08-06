package package1;

public class Divisible extends Addition {
	public void result()
	{
	int r = super.add(b, a);
	if(r%10==0)
	{
		System.out.println("Divisible");
	}
	else
	{
		System.out.println("Not Divisible");
	}	
	}


}
