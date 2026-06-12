/*Q36. Compare two numbers: greater, smaller, or equal.
 
    Input: Two integers
    Logic: if-else if
    Output: Greater, smaller, or equal.
        	
*/
import java.util.*;
public class TowNum
{
  public static void main(String x[])
  {
  int a,b;
     Scanner sc = new Scanner(System.in);
	 System.out.println("Enter a number A");
	 a=sc.nextInt();
	 System.out.println("Enter a number B");
	 b=sc.nextInt();
	 if(a>b)
	 {
	 System.out.println("greater");
	 }
	 else if(a<b)
	 {
	  System.out.println("smaller");
	 }
	 else 
	 {
	 System.out.println("equal");
	 }
  }
}
