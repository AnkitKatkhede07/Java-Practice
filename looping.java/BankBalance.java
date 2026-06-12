
/*
Q1. Problem Statement:
 Write a menu-driven program using do-while and switch-case to perform operations on  a bank account balance (initial balance entered by user):
Deposit money.
Withdraw money (only if sufficient balance).
Check current balance.
Exit.
Program should repeatedly allow operations until exit.
*/
import java.util.Scanner;
public class BankBalance
{
   public static void main(String []args)
   {
      Scanner sc = new Scanner(System.in);
        System.out.println("Enter a amount of user:");
	      int amount=sc.nextInt();
		  int select;
	  do
	  {
	      System.out.println("Menu\n Bank opertaion....");
		  System.out.println("1:deposit Money");
		  System.out.println("2:Withdraw money");
		  System.out.println("3:Check current Balance");
		  System.out.println("4:exit");
		  System.out.print("Select number for opertaion:");
		   select=sc.nextInt();
		    //int balance=0;
switch(select) 
  {
	  case 1:
	 System.out.println("deposit Money:");
	 int deposit=sc.nextInt();
	 if(deposit>0)
	{
	 amount+=deposit;
	 System.out.println("Enter deposit amount is :"+deposit);
	 }
	 else
	 {
	   System.out.println("Invalid deposit amount");
	 }
    continue;
     case 2:System.out.println("withdraw money:");
            int withdrawamount=sc.nextInt();
			 if(withdrawamount<=amount)
			 {
             amount-=withdrawamount;
            System.out.println("withdrawamount for user is :"+withdrawamount);	
			 }
     else{
        System.out.print("Invalid withdraw amount");
         }	
     continue;
    case 3:
    System.out.println("Enter a current balance:"+amount);
	continue;
    case 4://exit
	System.out.println("Enter a user opertaion");
	String exit=sc.next();
    System.out.println("thank you and vist again.......!");
	break;
	default :System.out.println("Invalid number selected......");   			 
	 }  
   }while(select !=4);
	  
  }
}
