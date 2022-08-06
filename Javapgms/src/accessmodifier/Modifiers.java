package accessmodifier;

public class Modifiers {
private int  rollno;
public int n;
protected int l;
protected void abc(int r,int s,int b)
{
	System.out.println(r);
	System.out.println(s);
	System.out.println(b);
	
}
public static void main(String args[])
{
	Modifiers m = new Modifiers();
	m.abc(12,44,66);
}
}
