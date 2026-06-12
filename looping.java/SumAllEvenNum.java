//. Write a java program to find the sum of all even numbers between 1 to n.
import java.util.*;
public class SumAllEvenNum
{
 public static void main(String x[])
 {
   Scanner sc = new Scanner(System.in);
   System.out.println("Enter a numbers");
   int num=sc.nextInt();
   int i=2;
   int sum=0;
   while(i<=num)
   {
    if (i%2==0)
	{
	  System.out.println(i+" ");
	  sum+=i;
	} 
	i++;
   }
    System.out.println("sum of all even num:"+sum);
 }
}