//Write a java program to check whether number is neon or not.
//Input : 9
//Output : Neon Number Explanation: square is 9*9 = 81 and sum of the digits of the square is 9.
import java.util.*;
public class NeonNumber
{
   public static void main(String x[])
   {
     Scanner sc=new Scanner(System.in);
	 System.out.println("Enter a number:");
	 int num=sc.nextInt();
	 int Square=(num*num);
	 int d1=num/10;
	 int d2=num%10;
	 int sum=d1+d2;
	  
	 System.out.println((num==sum)?"neon number":"not a neon number");
   }
}
