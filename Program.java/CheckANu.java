//Q4. Write a Java program to check whether a number is positive , negative or zero.
import java.util.*;
public class CheckANum
{
  public static void main(String x[])
  {
    Scanner sc = new Scanner(System.in);
	System.out.println("Enter a number");
	int num=sc.nextInt();
	String str=(num>0)?"Is positive":(num<0)?"Is negative":"number is zero";
	System.out.println(str);
  }
}