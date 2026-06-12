/**9. Restaurant Ordering System**

**Description:**

* Show menu items and let user order.
* If they choose "skip", **continue** to next iteration without adding to order.
* If "done" is entered, **break** and print final bill.
* Implement using a do-while loop.
*/
import java.util.*;
public class Restaurant
{
 public static void main(String x[])
 {
    Scanner sc= new Scanner(System.in);
	System.out.println("Enter a order items in user");
	//String them;
	int bill=0;
	String choose;
	 //String done,skip;
	do{
	System.out.println("Menu for order............!");
	System.out.println("1 manog jus -50");
	System.out.println("2 Banana shek -50");
	System.out.println("3 Samosa -30");
	System.out.println("4 Kachore -50");
	System.out.println("5 vadhapav -20");
	System.out.println("6 mesal  -90");
	System.out.println("Type 'skip' to skip this turn");
	System.out.println("Type 'done' finish ordering");
	System.out.print("ENter your choose: ");
	choose=sc.next();
	if(choose.equalsIgnoreCase("done"))
	{
	 System.out.println("user has be done the order:");
	 break;
	}//check if user is done
	if(choose.equalsIgnoreCase("skip"))
	{
		continue;
	}
	switch(choose){
	case "1":
	bill+=50;
	break;
	case "2":
	bill+=50;
	break;
	case "3":bill+=30;
	break;
	case "4":bill+=50;
	break;
	case "5":bill+=20;
	break;
	case "6":bill+=90;
	break;
	//case 7:skip.IgnoreCase("skip");
	//continue;
	default :
	 System.out.println("invaild input ! Please choose from menu");
	}
	
	}while(true);
	System.out.println("\nFinal Bill: RS."+bill);
	System.out.println("Thank you for visiting!");
 }
}