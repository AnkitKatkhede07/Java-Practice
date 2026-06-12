//Example: WAP to input number and reverse and return reverse number from function using a recursion 
import java.util.Scanner;
public class reverse
{
 public static int getRev(int n,int rev)
 {
    if(n!=0)
	   { int rem = n % 10;
	      n  = n /10;
		  rev=rev*10+rem;
		 return getRev(n,rev);
	   }
	   else{
	    return rev;
	   }

 }
 public static void main(String []args)
 {
   Scanner sc = new Scanner(System.in);
   System.out.println("Enter Number user:");
   int n=sc.nextInt();
   int result=getRev(n,0);
   System.out.println("reverse value is"+result);
 }
}
