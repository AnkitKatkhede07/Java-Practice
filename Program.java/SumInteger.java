//Write a Java program and compute the sum of an integer's digits.
//Input : 123
//Output : 6
import java.util.*;
public class SumInteger
{
  public static void main(String x[])
  {
    Scanner sc=new Scanner(System.in);
	System.out.println("Enter a three digits number:");
    int number=sc.nextInt();
	System.out.println("Enter a three digits number:");
	 int number1=sc.nextInt();
	 System.out.println("Enter a three digits number:");
	 int number2=sc.nextInt();
    int sum=number+number1+number2;
	System.out.println("sum of three digits is :"+sum);
  }
}