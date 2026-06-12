//Write a java program to find the sum of all natural numbers between 1 to n.
import java.util.*;
public class AllSum 
{
  public static void main(String x[])
  {
     Scanner sc = new Scanner(System.in);
	 System.out.println("Enter a numbers");
	 int num=sc.nextInt();
	 int i=1;
	 int sum=0;
	 while(i<=num)
	 {
	   sum=sum+i;
	   
	   i++;
	 }
	System.out.println(sum); 
  }
}