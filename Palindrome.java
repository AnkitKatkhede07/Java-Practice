//Q10.Write a java program to check array is palindrome or not.
import java.util.Scanner;
public class Palindrome
{
  public static void main(String []args)
  {
    Scanner sc = new Scanner(System.in);
	System.out.print("Enter a array in element:");
	int arr[]=new int[5];
	for(int i=0;i<arr.length;i++)
	{
	  arr[i]=sc.nextInt();
	}
	boolean Ispalindrome=false;
	for(int i=arr.length-1;i>=0;i--)
	{
	 if (arr[i] != arr[arr.length - 1 - i]) 
		{
	      Ispalindrome=true;
	      break;
		}
	}if(!Ispalindrome)
	{
	System.out.println("Number is palindrome");
	}
	else
	{
	System.out.println("Number is not palindrome");
	}
  }
}