//Q8. Write a java program to find the sum of all odd numbers between 1 to n.
import java.util.*;
public class SumOddNum
{
public static void main(String x[])
{
 Scanner sc = new Scanner(System.in);
 System.out.println("Enter a number");
 int num=sc.nextInt();
 int i=1;
 int sum=0;
 while(i<=num)
 {
	 System.out.println(i);
	 sum=sum+i;
   i=i+2;  
 }
 System.out.println("the sum of all odd numbers:"+sum);
}
}