/*Q7. Write a program to check whether a string is palindrome or not.
 Input : madam
 Output : Palindrome
*/
import java.util.Scanner;
public class PalindromeCheck{
  public static void main(String args[])
  {
     Scanner sc = new Scanner(System.in);
	 System.out.println("Enter a String ");
	  String str=sc.nextLine();
	  System.out.println(isPalindrome(str));
	  
  }

public static boolean isPalindrome(String s)
{
	for(int i=0;i<s.length()/2;i++)
	{
	  int n=s.length();
	  if(s.charAt(i)!=s.charAt(n-1-i))
	  {
		   return false;	
	  }
	}	
   return true ;	
}
}