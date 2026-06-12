/*Q58. Develop a program to simulate a basic banking menu:
 1: Deposit
 2: Withdraw
 3: Check Balance
 4: Exit
 Use a switch to handle user choice and print appropriate messages.
 Explanation:
 Switch on user choice. Use variables for balance and update accordingly.*/
import java.util.*;
public class SimulateBasic
{
 public static void main(String[]args)
 {
   Scanner sc = new Scanner(System.in);
   System.out.println("Enter a choice print appropriate messages");
   int choice=sc.nextInt();
   System.out.println("Enter a balance of banking");
   int balance=sc.nextInt();
   switch(choice)
   {
   case 1:
   System.out.println("Enter a amount of banking deposit");
   double deposit=sc.nextInt();
   if(deposit>0){
   deposit+=balance;
   System.out.println("Your bank balance is with adding deposit:"+deposit);
   }
   else
   {
    System.out.println("invalid amount plz vist a bank");
   }
   break;
   case 2:
   System.out.println("Enter withdraw amount");
   int amount=sc.nextInt();
   if(amount>0){
   amount-=balance;
   System.out.println("Your bank balance is withdraw amount:"+amount);
   }
   else{
   System.out.println("invalid amount recorrect amount");
   }
   break;
   case 3:
   int checkBalance=balance;
   System.out.println("Your bank balance is :"+checkBalance);
   break;
   case 4:
   System.out.println("Exiting... Thank you!");
   break;
   default :
   System.out.println("Invalid choice. Please select from 1 to 4");
   }
 }
}