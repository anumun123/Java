package Clockpkg;

public class Clock {
int hours;
int minutes;
int seconds;
Clock(int h,int m,int s)
{
	hours=h;
	minutes=m;
	seconds=s;
}

void timevalid()
{
	if(hours>0 && hours<12 && minutes>0 && minutes<=60 && seconds>0 && seconds<60)
	{
		System.out.println("Time is valid");
	}
	else
	{
		System.out.println("Time is invalid");
	}
}

void checkmode()
{
	if(hours<12)
	{
		System.out.println("Time is"+" "+hours+":"+minutes+":"+seconds+"AM");
	}
	else
	{
		hours = hours-12;
		System.out.println("Time is"+" "+hours+":"+minutes+":"+seconds+"PM");
	}	
}
public static void main(String args[])
{
	Clock c = new Clock(2,40,55);
	c.timevalid();
	c.checkmode();
}
}
