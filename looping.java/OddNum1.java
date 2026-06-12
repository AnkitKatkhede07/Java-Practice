//Write a C program to find the sum of all odd numbers between 1 to n.
import java.util.*;
public class OddNum1
{
  public static void main(String x[])
  {
    Scanner sc = new Scanner(System.in);
	System.out.println("Enter a numbers");
	int num=sc.nextInt();
	int i=1;
	while(i<=num)
	{
	i=i+2;
	
	System.out.println(i);
	  i++;
	}
  }
}
/*
int i=1;
 while(i<=num)
 {
 System.out.println(i);
   i=i+2;
*/