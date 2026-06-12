//Write a Java program to check whether a triangle is valid or not.
import java.util.*;
public class Triangle
{
  public static void main(String x[])
  {
	  Scanner sc = new Scanner(System.in);
	  System.out.println("enter a number");
	  int a = sc.nextInt();
	  System.out.println("enter a number");
	  int b = sc.nextInt();
	  System.out.println("enter a number");
	  int c = sc.nextInt();
	  //int sum=number+number1+number2;
    // boolean isMultiple=(180=sum == 0);
	 String str=(a+b>c&&a+c>b&&b+c>a)?"its is valid":" it is not valid";
	 System.out.println(str);
  }
}