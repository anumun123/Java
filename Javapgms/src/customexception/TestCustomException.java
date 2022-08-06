package customexception;

public class TestCustomException {
	static void validate(int age) throws InvalidAgeException{
		if(age<18)
		{
			throw new InvalidAgeException("invalid age");
		}
		else
		{
			System.out.println("valid age");
		}
		
	}
	public static void main(String args[])
	{
		try
		{
			validate(13);
		}
		catch(InvalidAgeException e)
		{
			System.out.println("exception handled");
			System.out.println("Exception occured: " + e);  
		}
	}
  }



