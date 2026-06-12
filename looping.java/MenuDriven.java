/***2. Menu-Driven Calculator**

**Description:**

* Display a menu with 4 operations: Add, Subtract, Multiply, Divide.
* Use a do-while loop to keep showing the menu until the user chooses "Exit".
* Use **continue** to skip calculation if the user enters an invalid choice.
* If the user enters "Exit", **break** the loop.*/
import java.util.Scanner;
public class MenuDriven
{
  public static void main(String []args)
  {
	  Scanner sc = new Scanner(System.in);

  System.out.println("Enter a operations number:");
			int num=sc.nextInt();	
     int a=10;
	 int b=5;
  do{
	  if (num < 1 || num > 5)		  
	 { // Invalid choice
          System.out.println("Invalid choice! Try again.");
          continue;  
	  }
	if(num==1)
	 {
	 int c=a+b;
	 System.out.println("add:"+c);
	 continue;
	 }
	 else if(num==2){
		int c=a-b;
	 System.out.println("sub:"+c);
	 continue;
	 }
	 else if(num==3){
	 int c=a*b;
	 System.out.println("multiply:"+c);
	 continue;
	 }
	 else if(num==4){
	   int c=a/b;
	 System.out.println("div:"+c);
	 continue;
	 } 
	else
	 {
	 System.out.println("Exit");
	  continue;
	 }
	 }while(num<=0);//if(num>=4)System.out.println("user enters an invalid choice...");
  
  }
 }

