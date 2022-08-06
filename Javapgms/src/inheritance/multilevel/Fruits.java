package inheritance.multilevel;

public class Fruits extends Greenapple{
void  dismulti()
{
	System.out.println("Multilevel inheritance");
}
public static void main(String args[])
{
	Fruits f = new Fruits();
	f.getname();
	f.dis();
	f.dismulti();
}
}
