//Q14. Write a java program to check whether a number is palindrome or not.
import java.util.*;
public class PalindromeNum
{
 public static void main(String x[])
 {
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter a number");
  int num=sc.nextInt();
  int originalNum = num;
  int reverse=0;
  while(num!=0)
  {
    int digit =num%10;
	 reverse=reverse*10+digit;
	num=num / 10;
  }
	if(originalNum==reverse)
	{
	System.out.println("a number is palindrome");
	}
	else
	{
	System.out.println("a number is not a palindrome");
	}
		System.out.println("Num of reverse:"+reverse);
   }
 }
