/*Sum of Digits
Write a function sumOfDigits(int n) that calculates and returns the sum of digits of a given number.
Example: Input 123 → Output: 6.*/
import java.util.*;
public class Sum
{
 public static void main(String x[])
 {
   Scanner sc = new Scanner(System.in);
   System.out.print("Enter a Number:");
   int n=sc.nextInt();
   int result=getSum(n);
 }
 public static int getSum(int no)
 {int sum=0;
   for(int i=0;i<no;i++)
   {
      
	  sum+=i;
   }
   return sum;
 }
}


