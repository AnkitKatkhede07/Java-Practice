//Write a Java program to reverse a number without using loop.
//Input a number: 123 Reverse number: 321
import java.util.*;
public class ReverseNumber1
{
  public static void main(String x[])
  {
  int rem,num,rev=0;
    Scanner sc=new Scanner(System.in);
	System.out.println("Enter a three  digit number:");
     num=sc.nextInt();
	//step1
	rem=num%10;
	rev=rev*10+rem;
	num=num/10;
	//step 2
    rem=num%10;
    rev=rev*10+rem;
    num=num/10;	
	//step 3
	rem=num%10;
	rev=rev*10+rem;
	num=num/10;
	System.out.println("Reverse Number is : "+rev);
  }
}
 
