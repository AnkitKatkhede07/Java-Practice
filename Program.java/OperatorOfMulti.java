//Write a Java program to check whether a number is a multiple of both 3 and 5 using logical AND (&&) operator.
//Input: 15
//Output: Multiple of both 3 and 5
import java.util.*;
public class OperatorOfMulti
{
  public static void main(String x[])
  {
	  Scanner sc = new Scanner(System.in);
	  System.out.println("enter a number");
	  //int number=0;
	  int number = sc.nextInt();
     boolean isMultiple=(number % 3 == 0 && number % 5 == 0);
	 String str=isMultiple?"its is ture":" it is flase";
	 System.out.println(str);
  }
}