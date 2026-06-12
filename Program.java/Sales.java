/*Q39. Calculate commission based on sales amount:
Input: Sales amount
Logic:
Sales < 5000 → 2% commission
Sales 5000–10000 → 5% commission
Sales > 10000 → 10% commission
Output: Display commission amount.
*/
import java.util.*;
public class Sales
{
  public static void main(String x[])
  {
   Scanner sc = new Scanner(System.in);
   System.out.println("Enter amount of sales amount");
   int sale=sc.nextInt();
   if (sale<5000)
   {
    double commission=0.02*sale;
	System.out.println("this is commission:"+commission);
   }
   else if (sale<=10000)
   {
   //int amount=sale-10000;
   double commission=0.05*sale;
   System.out.println("this amount commission:"+commission);
   }
   else if (sale>10000)
   {
    double commission=0.10*sale;
	System.out.println("this amount commission$:"+commission);
   }
   else
   {
   System.out.println("invalid sale:");
   }
  }
}