package inheritance.single_inheitance;

public class Fruits extends Apple {
	void display() {
	System.out.println("Parent class");

}
	public static void main(String args[])
	{
		Fruits f = new Fruits();
		f.getname();
		f.display();
	}
}
