package BankSystem;

import java.util.Scanner;

public class BankAccount
{
	private double bal;
    double prevTrans;
    String customerName;
    String customerId;
    
    BankAccount(){
    	
    }
    BankAccount(String customerName,String customerId)
    {
        this.customerName=customerName;
        this.customerId=customerId;
    }

    void deposit(double amount)
    {
        if(amount!=0){
            bal+=amount;
            prevTrans=amount;
        }
    }

    void withdraw(double amt){
        if(amt!=0 && bal>=amt){
            bal-=amt;
            prevTrans=-amt;
        }
        else if(bal<amt){
            System.out.println("\t> Bank balance insufficient");
        }
    }

    void getPreviousTrans(){
        if(prevTrans>0){
            System.out.println("\t> Deposited: "+prevTrans);
        }
        else if(prevTrans<0){
            System.out.println("\t> Withdrawn: "+Math.abs(prevTrans));
        }
        else{
            System.out.println("\t> No transaction occured");
        }
    }
    

    public void getBal() //Encapsulation
    {
    	return; 				
    }
    
    public void setBal()  //Encapsulation
    {
    	this.bal=bal;
    }
	
	public void menu(){
        char option;
        Scanner sc=new Scanner(System.in);
        System.out.println(" "
        		+ ""
        		+ "");
		System.out.println("---------------------------- What you want to do -----------------------------");
       
		
		System.out.println("\n");
        System.out.println("\t> a) Check Balance");
        System.out.println("\t> b) Deposit Amount");
        System.out.println("\t> c) Withdraw Amount");
        System.out.println("\t> d) Previous Transaction");
        System.out.println("\t> e) Exit");
        System.out.println(""
        		+ " ");
        
        do{
        	
        	
        	System.out.println("<><><><><><><><><><><><><><><><><><><><><><><>><<><><><><><><><><><><><><><><><><><><><><><><>"
    				+ "");
        	
        	System.out.println(""
            		+ " ");
    	      
        	System.out.print("\t> Choose an option: ");
        	System.out.println(" ");
     
        	
            option=sc.next().charAt(0);
            System.out.println("\n");

            switch (option){
                case 'a':
                    System.out.println("......................");
                    System.out.println("\t> Balance ="+bal);
                    System.out.println("......................");
                    System.out.println("\n");
                    getBal();     
                    break;
                case 'b':
                    System.out.println("......................");
                    System.out.println("\t> Enter a amount to deposit :");
                    System.out.println("......................");
                    double amt=sc.nextDouble();
                    setBal();
                    deposit(amt);
                    System.out.println("\n");
                    break;
                case 'c':
                    System.out.println("......................");
                    System.out.println("\t> Enter a amount to Withdraw :");
                    System.out.println("......................");
                    double amtW=sc.nextDouble();
                    withdraw(amtW);
                    System.out.println("\n");
                    break;
                case 'd':
                    System.out.println("......................");
                    System.out.println("\t> Previous Transaction:");
                    getPreviousTrans();
                    System.out.println("......................");
                    System.out.println("\n");
                    break;

                case 'e':
                    System.out.println(""
                    		+ "");
                    break;
                default:
                    System.out.println("\t> Choose a correct option to proceed");
                    break;
            }

        }while(option!='e');

        
        System.out.println("------- Thank you for using our banking services --------");
	
        
	
	}
}