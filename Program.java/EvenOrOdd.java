//Write a Java program to check whether a number is even or odd. 
import java.util.*;
public class EvenOrOdd
{
  public static void main(String x[])
  {
	  Scanner sc = new Scanner(System.in);
	  System.out.println("enter a number");
	  int number = sc.nextInt();
     boolean isMultiple=(number % 2 == 0);
	 String str=isMultiple?"its is Even":" it is odd";
	 System.out.println(str);
  }
}