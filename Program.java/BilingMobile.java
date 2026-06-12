/* Mobile plan billing system:
Input: Minutes used in a month
Logic:
Up to 100 mins → Base ₹199
101–300 mins → ₹199 + ₹1/min for extra
301–500 mins → ₹199 + ₹1.5/min for extra
Above 500 mins → ₹199 + ₹2/min for extra
Output: Total monthly bill.
*/
import java.util.*;
public class BilingMobile
{
  public static void main(String x[])
  {
   Scanner sc = new Scanner(System.in);
   System.out.println("Minutes used in a month");
   int min=sc.nextInt();
   //double extra;
   int Base=199;
   if(min<100)
   {
    System.out.println("up to 100 min : Base is $199");
   }
   else if(min>=101&&min<=300)
   {
      Base+=(min -100)*1.0;
    System.out.println("this is for 1/min for extra :"+Base);
   }
   else if(min>=301&&min<=500)
   {
    Base+=(min-100)*1.5;
	System.out.println("this for 1.5/min for extra: "+Base);
   }
   else
   {
   Base+=(min-100)*2;
    System.out.println("for 2/min for extra:"+Base);
   }
  }
}