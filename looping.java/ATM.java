/*1. ATM PIN Validation**

**Description:**
Write a program that:

* Asks the user for a 4-digit ATM PIN.
* Gives **max 3 attempts** to enter the correct PIN using a do-while loop.
* If the PIN is correct, print "Access Granted" and **break** the loop.
* If attempts are over, print "Card Blocked".*/
import java.util.Scanner;
public class ATM
{
public static void main(String []args)
{
  Scanner sc = new Scanner(System.in);
  int count=1;
  int OrigianlNum=1212;
  do{
     System.out.println("Enter a 4-digit number");
     int num=sc.nextInt();
     if(OrigianlNum==num)
	 {
	   System.out.println("Access Granted");
	   break;
	 } 
	 count++; 
    }while(count<=3);if(count>=4);
	 System.out.println("Card Blocked");
	
}
}

