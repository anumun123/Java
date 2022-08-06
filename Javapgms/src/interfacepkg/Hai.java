package interfacepkg;

public class Hai implements Newinterf,Abc{
	
	
	public void hello() {
		System.out.println("Hellooo");
	}

	public void work()
	{
		System.out.println("Working");
	}
	
	public static void main(String args[])
	{
		Newinterf f = new Hai();
		f.hello();
		Abc g = new Hai();
		g.work();
	}
	
}
