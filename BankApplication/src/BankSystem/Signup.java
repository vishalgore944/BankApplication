//SignUp
package BankSystem;

import java.util.Scanner;

interface I1 //Abstraction
{
	void signUp(); 
	void next();
	void logIn();
}

public class Signup extends BankAccount implements I1 {
	String ID1;
	String Pass1;
	String sur;
	String mail;
	public void signUp()
	{
		Signup ref5=new Signup();
		
		System.out.println(""
				+ "<<<<<<<<<<<<<<<<<<<<                         >>>>>>>>>>>>>>>>>>>>");
		System.out.println("<<<<<<<<<<<<<<<<<<<< Welcome To The SBI Bank >>>>>>>>>>>>>>>>>>>>");
		System.out.println(" ");
		//Taking the name and user id for log in
		Scanner sc=new Scanner(System.in);
		
		System.out.print("\t> Enter Your Name: ");
		System.out.print("");
		String name=sc.nextLine();
		
		System.out.print("\t> Enter surname: ");
		System.out.print("");
		sur=sc.nextLine();
		
		System.out.print("\t> Enter mail ID: ");
		System.out.print("");
		mail=sc.nextLine();
		
		System.out.print("\t> Enter User ID: ");
		System.out.print("");
		ID1=sc.nextLine();
		
		System.out.print("\t> Enter Password: ");
		System.out.print("");
		Pass1=sc.nextLine();
		
		System.out.println(""
				+ "");
		
		
		System.out.println("\t> Please Verify Your details: ");
		System.out.println("\t> Your name: "+name);
		System.out.println("\t> Your surname: "+sur);
		System.out.println("\t> Your mail ID: "+mail);
		System.out.println("\t> Your User ID: "+ID1);
		System.out.println("\t> Your Password: "+Pass1);
		System.out.println(""
				+ "");
		System.out.println("<><><><><><><><><><><><><><><><><><><><><><><>><<><><><><><><><><><><><><><><><><><><><><><><>"
				+ "");
		
		
		System.out.println("\t> Press 1 for submit and LogIn ");
		System.out.println("\t> Press 2 for changes");
				next();
//		int z=sc.nextInt();
//		if(z==1)
//		{
//			logIn();	
//		}
//		else if(z==2)
//		{
//			signUp();
//		}
//		
//		else
//		{
//			System.out.println(""
//					+ "");
//			System.out.println("\t> Enter valid input! ");
//		}
		
	}
public void next() //Method to be called for user input
{
	Scanner sc=new Scanner(System.in);
	int z=sc.nextInt();
	if(z==1)
	{
		logIn();	
	}
	else if(z==2)
	{
		signUp();
	}
	
	else
	{
		System.out.println(""
				+ "");
		System.out.println("\t> Enter valid input! ");
		next();
	}
}

		public void logIn()
		
		{
			System.out.println("------------------- Your account is created successfully -------------------");
			System.out.println(""
		+ "");
			
			System.out.println("------------------- Enter user ID and Password for Login --------------------");
			System.out.println(""
					+ "");
			
			System.out.print("\t> Enter user ID: ");
			System.out.print(" "
					+ "");
			Scanner sc=new Scanner(System.in);
			String ID=sc.nextLine();
			
			
			System.out.print("\t> Enter the password");
			System.out.print(""
					+ " ");
			String Pass=sc.nextLine();
		
			
//			System.out.println(ID+"   "+ref5.ID1);
//			System.out.println(Pass+"   "+ref5.Pass1);
			
			if(ID1.equals(ID) && Pass1.equals(Pass))
			{
				System.out.println(""
						+ ""
						+ "");
				System.out.println("---------------------------- LogIn Successfull --------------------------");
				
				menu();
				
				
				
			}
			
			else
			{
				System.out.println(""
						+ ""
						+ "");
				System.out.println("\t> Credential does not matched enter your user ID and Password again");
				System.out.println(""
						+ ""
						+ "");
				logIn2();
			}
	}
		
		 public void logIn2()
		{
			System.out.print("\t> Enter user ID: ");
			System.out.print(" "
					+ "");
			Scanner sc=new Scanner(System.in);
			String ID=sc.nextLine();
			
			
			System.out.print("\t> Enter the password");
			System.out.print(""
					+ " ");
			String Pass=sc.nextLine();
			
			if(ID1.equals(ID) && Pass1.equals(Pass))
			{
				System.out.println(""
						+ ""
						+ "");
				System.out.println("---------------------------- LogIn Successfull --------------------------");
				
				menu();
			}
			
			else
			{
				System.out.println(""
						+ ""
						+ "");
				System.out.println("\t> Credential does not matched enter your user ID and Password again");
				System.out.println(""
						+ ""
						+ "");
				logIn2();
			}
		}
}