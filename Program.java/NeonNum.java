//Write a java program to check whether a number is neon or not.      	
        	//Input : 9
        	//Output : Neon Number
        	//Explanation: square is 9*9 = 81 and
        	//The sum of the digits of the square is 9. 
import java.util.*;
public class NeonNum
{
 public static void main(String x[])
 {
	 int sum;
   Scanner sc = new Scanner(System.in);
   System.out.println("Enter a num");
   int num=sc.nextInt();
   int square=num*num;
   int d1=num/10;
   int d2=num%10;
   sum=d1+d2;
   if (sum==num)
   {
     System.out.println("this is Neon number");
   }
   else
   {
    System.out.println("this is not Neon number");
   }
 }
}			