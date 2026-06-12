/*****5. E-commerce Checkout Simulation**

**Description:**

* Display a list of items with prices.
* Use a do-while loop to let the user keep adding items to the cart until they type "checkout".
* If they type "skip", use **continue** to skip adding that item.
* On checkout, print the total and exit the loop.

---****/
import java.util.*;
public class Ecommerce
{
  public static void main(String args[])
  {
     Scanner sc = new Scanner(System.in);
	 String choice;
	 int totalbill=0;
	 do
	 { 
	  System.out.println("list of number E-commerce");
	  System.out.println("----------------------------");
      System.out.println("1  Pendrive   cost  400");
	  System.out.println("2 CD cost 20");
	  System.out.println("3 HDD cost 1200");
	  System.out.println("4 RAM cost 2000");
	  System.out.println("checkout for exit");
	  System.out.println("Enter choice");
	  choice=sc.next();
	  choice=choice.toLowerCase();
	  switch(choice){
	  case"1":totalbill+=400;
	  break;
	  case"2":totalbill+=20;
	  break;
	  case"3":totalbill+=1200;
	  break;
	  case"4":totalbill+=2000;
	  break;
	  case "checkout" : 
	  System.out.println("Total Bill="+totalbill);
	  break;	
      case "skip":
	  break;
	  default:
	  System.out.println("Wrong choice");
	  }
	 }
	 while(!choice.equalsIgnoreCase("checkout"));
	  System.out.println("End of main");
   }
}
