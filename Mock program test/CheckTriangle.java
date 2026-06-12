//Q7.Write a Java program to check whether a triangle is equilateral , isoscale 
//or scalene. 
import java.util.*;
public class CheckTriangle
{
  public static void main(String []args)
  {
    Scanner sc = new Scanner(System.in);
	System.out.println("Enter angle A");
	int a=sc.nextInt();
	System.out.println("Enter angle B");
	int b=sc.nextInt();
	System.out.println("Enter angle C");
	int c=sc.nextInt();
	if(a==b&&b==c&&a==c)
	{
	 System.out.println("triangle is equilateral");
	}
	else if(a==b||b==c||a==c)
	{
	  System.out.println("triangle is isoscale");
	}
	else
	{
	System.out.println("triangle is scalene");
	}
	
  }
}