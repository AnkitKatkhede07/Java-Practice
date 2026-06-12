// Write a program to calculate sum of first and last digit of a number without using loop.
//Input : 123
//Output : 4
import java.util.*;
public class WithOutUsingLoop
{
 public static void main(String x[])
 {
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter three digit number:");
   int num=sc.nextInt();
   int d1=num%10;
    num=num/10;
	int d2=num%10;
	num=num/10;
	int d3=num;
	int sum=d1+d3;
	System.out.println("this is first and last digit sum:"+sum);
	System.out.println("Second logic in this program");
	int num1=123;
	int a=num1%10;
	 num1=num1/10;
	 int b=num1%10;
	 num1=num1/10;
	 
	 int c=num1;
	 int sum1=a+c;
	System.out.println("this is first and last digit sum:"+sum1);

	 
   
 }
}