//Driver Class
package BankSystem;

public class BankApplication {
		public static void main(String[] args) {
			
//			Login ref2=new Login();
//			ref2.logIn();
//			
//			P1 ref1=new P1(); Method Shadowing run time polymorphism 
//			ref1.too();
//			
//			P2 ref2=new P2(); Method Shadowing run time polymorphism
//			ref2.too();
			
			P1 ref3 =new P2(); //Method Shadowing run time polymorphism Upcasting
			ref3.too();			
		}
}

class P1
{
	public void too()
	{
	Signup ref2=new Signup();
	ref2.signUp();
	}
}

class P2 extends P1
{
	public void too()
	{
		Signup ref2=new Signup();
		ref2.signUp();
	}
}