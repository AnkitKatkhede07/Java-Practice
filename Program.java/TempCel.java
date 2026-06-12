/*Classify temperature reading:
 
Input: Temperature in Celsius
Logic:
<0 → Freezing
0–20 → Cold
21–35 → Warm
35 → Hot
Output: Display weather type.
*/
import java.util.*;
public class TempCel
{
  public static void main(String x[])
  {
   Scanner sc = new Scanner(System.in);
   System.out.println("Enter a temperature");
   int temp=sc.nextInt();
   if(temp<0)
   {
   System.out.println("weather type is: Freezing");
   }
      else if(temp>0&&temp<=20)
	  {
	  System.out.println("weather type is:Cold");
	  }
	  else if(temp>21&&temp<=35)
	  {
	  System.out.println("weather type is:Warm");
	  }
	else
	{
	System.out.println("weather type is: Hot");
	}
	  
  }
}