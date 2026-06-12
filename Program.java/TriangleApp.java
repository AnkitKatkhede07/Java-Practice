//Q2. Write a Java program to check whether a triangle is valid or not.
import java.util.*;
public class TriangleApp
{
  public static void main(String x[])
  {
    Scanner sc = new Scanner(System.in);
	System.out.println("Enter number A");
	int a=sc.nextInt();
	System.out.println("Enter number B");
	int b=sc.nextInt();
	System.out.println("Enter number C");
	int c=sc.nextInt();
	int total=a+b+c;
	if(total==180)
	{
	System.out.println("Triangle is a vaild");
	}
  else 
  {
  	System.out.println("Triangle is a not vaild");

  }
}
}