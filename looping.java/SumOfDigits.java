//Q11. Write a java program to calculate the sum of digits of a number.
import java.util.*;
public class SumOfDigits
{
 public static void main(String x[])
 {
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter a digit A");
  int number=sc.nextInt();
  
	int temp=number;
	int sum=0;
	while(temp!=0)
	{
	 int digit=temp%10;
	 sum+=digit;
	 temp=temp/10;
	}
System.out.println("Sum of digits of " + number + " is: " + sum);
 }
}