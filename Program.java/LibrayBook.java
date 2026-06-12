/*43. Calculate fine for library book return:
Input: Number of days late
Logic:
Up to 5 days → ₹2/day
6–10 days → ₹3/day
11–30 days → ₹5/day
More than 30 days → Membership canceled + ₹500 fine
Output: Total fine + membership status.
*/
import java.util.*;
public class LibrayBook
{
  public static void main(String x[])
  {
	 int fine=0;
    Scanner sc = new Scanner(System.in);
	System.out.println("Number of days late");
	int days=sc.nextInt();
	String status="Membership Active";
	if(days<=5)
	{
	fine=days*2;
	}
	else if(days>=6&&days<=10)
	{
	 fine=days*3;
	}
	else if(days>=11&&days<=30)
	{
	  fine=days*5;
	}
	else
	{
	 fine=500;
	 status="Membership Cancelled";
	 
	}
	System.out.println("Total fine :"+fine);
	System.out.println("Membership status:"+status);
  }
}