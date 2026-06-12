/***8. Email Address Validator**

**Description:**

* Ask the user for an email address.
* If email doesn’t contain '@', **continue** to ask again.
* If user enters "cancel", **break**.
* Use a do-while loop to validate and accept only proper emails.

---*/
import java.util.Scanner;
public class Email
{
  public static void main(String []args)
  {
    Scanner sc = new Scanner(System.in);
	String email;
	//String Cancel;
	do{
	System.out.println("user for an email address:");
	email=sc.next();
		if(email.equalsIgnoreCase("Cancel"))
	   {
		break;
	   }
	if(!email.contains("@"))
		{
			System.out.println("Invalid email. Missing '@'. Try again.");
			continue;
		}
		System.out.println("Valid email accepted: " + email);
            break; // Exit after a valid emails
	
	
	 }while(true);
	 System.out.println("End the program:");
  }
}
