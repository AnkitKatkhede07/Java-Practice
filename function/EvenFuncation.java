/*Check Even or Odd
Write a function isEven(int n) that returns true if the number is even, otherwise false.
Test the function with user input.*/
import java.util.*;
public class EvenFuncation
{
  public static void main(String []args)
  {
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter a number for user");
  int n=sc.nextInt();
  System.out.println("number is :"+n);
  boolean result=isEven(n);
  //System.out.println("number is :"+n);
  }
  public static  boolean isEven(int n)
  {
    if(n%2==0)
	{
	  System.out.println("number is even");
	  return true;
	}
	else
	{
      System.out.println("number is odd");
	  return false;
	}
  }
}