//Q. Write a java program to find a minimum between three numbers.
import java.util.*;
public class FindThreeNum
{
 public static void main(String x[])
 {
 int a,b,c;
    Scanner sc = new Scanner(System.in);
	System.out.println("Enter a number A");
	a=sc.nextInt();
	System.out.println("Enter a number B");
	b=sc.nextInt();
	System.out.println("Enter a number C");
	c=sc.nextInt();
	if (a<b)
	{
	 System.out.println("A is minimum");
	}
	else if (b<c)
	{
	 System.out.println("B is minimum");
	}
	else
	{
	 System.out.println("C is minimum");
	}
 }
}