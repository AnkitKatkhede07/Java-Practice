/*3. Password Strength Checker**

**Description:**

* Ask the user to enter a password in a do-while loop.
* If the password length is less than 6 characters, display a message 
and **continue** to re-ask.
* If the password is "quit", stop asking (**break**).
* Otherwise, print "Password accepted" and exit.*/
import java.util.Scanner;
public class StrengthCheckar
{
  public static void main(String []args)
  {
    Scanner sc = new Scanner(System.in);
	String password;
	do{
	 System.out.print("Enter a password to user:  ");
	  password=sc.next();
	 if(password.equalsIgnoreCase("quit"))
	 {
		 break;					  
	 }
	if(password.length()<6)
	{
	  System.out.println("Password must be greater than 6 characters!!!");
	 continue;
	}
	else
	{
     System.out.print("Password accepted");
	
	 break;
	}
	
	}while(!(password.equalsIgnoreCase("quit"))==false);
  }
}
