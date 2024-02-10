import java.util.*;

abstract class Student
{
	// Data Members
	
	String name;
	int Id;
	int Age;
	String Adderss;
	
	// Counstructor Parameters
	
	public Student(String n,int I, Int A, String Ad)
	{
		 namen = n;
		 Id = I;
		 Age = A;
		 Adderss = Ad;
	}
	public abstract void findGrade(double persent);
}

public class Grade extends Student
{
	public Grade(String name,int Id, Int Age, String Adderss)
	{
		super (name,Id,Age,Adderss);
	}
	
	public void findGrade(double persent)
	{
		char grade;
		
		if(persent >= 90)
		{
			grade ="First !";
		}
		else if(persent >= 80)
		{
			grade = "Second !";
		}
		else if(persent >= 60)
		{
			grade = "Third !";
		}
		else
		{
			grade = "Fail Bhik Mange Padh Ke Aana !";
		}
		System.out.println("Id" + Id + "Name" + Name + "Your Grade Is" + grade );
	}
	
}


public class Test
{
	public static void main(String[] args)
	{
		Grade student1 = new Grade
		(
			Scanner sc = new  Scanner(System.in);
			System.out.println("Enter Your Id --> ");
			System.out.println("Enter Your Name --> ");
			System.out.println("Enter Your Age --> ");
			System.out.println("Enter Your Adderss --> ");
			System.out.println("Enter Your Percentage --> ");
		
			int a = sc.nextInt();
			String b = sc.nextLine();
			int c = sc.nextInt();
			String d = sc.nextLine();
			double e = sc.nextDouble();
		)
		student1.findGrade(e);
	}
}
