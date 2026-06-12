import java.util.Scanner;
class PasswordLoop
{
	 public static void main(String args[])
	 {
		 Scanner sc=new Scanner(System.in);
		 String password;
		    do
			{
				System.out.println("Enter Password");
				password=sc.next();
				//password=password.toLowerCase();
				
				 
				  if(password.length()<6 )
				  {
					  if((password.equalsIgnoreCase("quit")==false))
					  System.out.println("Password must be greater than 6 characters!!!");
					  continue;
				  }
				  else
				  {
					  System.out.println("Password accepted  !!!");
					    break;
				  }
				  
				   //password=quit   QUIT   Quit    qUIT
				   
			}while(!password.equalsIgnoreCase("quit"));
			
			System.out.println("End of main");
	 }
}