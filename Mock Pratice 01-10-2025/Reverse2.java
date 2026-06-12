//2. Write a program to input numbers using Scanner class and reverse it?
import java.util.Scanner;
public class Reverse2
{
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
	System.out.println("Enter digit from User:");
	int no=sc.nextInt();
	int last=0;
	// while(no!=0)
	// {
	  // int digit=no%10;
	   // last=last*10+digit;
	   // no=no/10;
	  
	// }System.out.println("reverse is:"+last);
	// int rev=0;
	// for(;no!=0;no=no/10)
	// {
		 // int digit=no%10;
		 // rev=rev*10+digit;
		 
	// }System.out.println("reverse no is:"+rev);
	int rev=0;
	do{
		int digit=no%10;
		rev=rev*10+digit;
		no=no/10;
	}while(no!=0);
	System.out.println("reverse no is:"+rev);
  }
}