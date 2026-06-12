/*Palindrome Check (Number or String)
Write a function isPalindrome(int n) that checks whether a number is palindrome or not.
Example: Input 121 → true.*/
import java.util.*;
public class Palindrome
{

  public static int isPalindrome(int num)
  {
	  int rev=0;
	int original=num;
	while(num>0)
	{
    int last =num%10;
	rev=rev*10+last;
	num=num/10;
	}
	if(rev==original)
	{
	  System.out.println("Number is palindrome");
	}
	else
	{
       System.out.println("Number is not  palindrome");	
	}
	return rev;
  }
  public static void main(String []args)
  {
     Scanner sc = new Scanner(System.in);
	 System.out.println("Enter a Three Digit number:");
	 int num=sc.nextInt();
	 System.out.println("number is "+isPalindrome(num));
  }
}


