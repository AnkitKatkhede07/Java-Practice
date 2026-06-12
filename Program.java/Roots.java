/*Write a java program to find all roots of a quadratic equation using if else.
 How to find all roots of a quadratic equation using if else in java programming.
 
Example
Input a: 8 ,  b: -4 , c: -2
Output Root1: 0.80
Root2: -0.30
*/
import java.util.*;
public class Roots
{
  public static void main(String x[])
  {
  double a,b,c;
    Scanner sc = new Scanner(System.in);
	System.out.println("Enter a value of A");
	a=sc.nextDouble();
	System.out.println("Enter a value of B");
	b=sc.nextDouble();
	System.out.println("Enter a value of C");
	c=sc.nextDouble();
	//step 2
	double d=b*b-4*a*c;
	double root1=(-b+Math.sqrt(d))/(2*a);
	double root2=(-b-Math.sqrt(d))/(2*a);
	//System.out.println("Roots are real and distinct:");
	if (0<root1 && 0>root2){
	System.out.println("Roots 1:"+root1);
    System.out.println("Roots 2:"+root2);
	}
	else
	{
	  System.out.println("Is not quadratic equation");
	}
  }
}