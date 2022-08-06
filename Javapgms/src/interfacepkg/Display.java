package interfacepkg;

public class Display implements Interfaces{
	
	@Override
	public void dis()
	{
	System.out.println("Display.......");
	}
	
	
	
	public static void main(String args[])
	{
		Interfaces f = new Display();
		f.dis();
		
	}
}
