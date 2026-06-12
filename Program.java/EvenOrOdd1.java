//Q1. Write a Java program to check whether a number is even or odd.
import java.util.*;
public class EvenOrOdd1
{
  public static void main(String x[])
  {
    Scanner sc= new Scanner(System.in);
	System.out.println("Enter a number");
	int num=sc.nextInt();
	if(num%2==0)
	{
	System.out.println("Even number");
	}
	else
	{
	System.out.println("Is odd number");
	}
  }
}