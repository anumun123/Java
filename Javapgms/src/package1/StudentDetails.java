package package1;

public class StudentDetails {
	public static void main(String args[])
	{
		Student st = new Student();
		st.studname();
		Address ad = new Address();
		ad.stud();
	    System.out.println("STUDENT DETAILS");
	    System.out.println("Student name:"+" "+st.name);
	    System.out.println("Roll No:"+" "+st.roll);
	    System.out.println("Address:"+" "+ad.addr);
	}

}
