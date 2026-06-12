/*Q6. Calculate commission based on sales amount: 
• Input: Sales amount 
• Logic: 
o Sales < 5000 → 2% commission 
o Sales 5000–10000 → 5% commission 
o Sales > 10000 → 10% commission 
• Output: Display commission amount.
*/
import java.util.*;
public class SaleBase
{
 public static void main(String x[])
 {
   Scanner sc= new Scanner(System.in);
   System.out.println("Enter a sales amount");
   double amount=sc.nextInt();
   double commission=0;
   
   if(amount<5000)
   {
    commission=amount/100*2;
   }
   else if(amount>5000&&amount<10000)
   {
     commission=amount*5/100;
   }
   else if(amount>10000)
   {
    commission=amount*10/100;
   }
   System.out.println("commission amount is:"+commission);
 }
}