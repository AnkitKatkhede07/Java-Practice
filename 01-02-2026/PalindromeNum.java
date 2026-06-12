import java.util.Scanner;
public class PalindromeNum
{
   public static void main (String args[])
     {
          Scanner sc = new Scanner(System.in);
          System.out.println("Enter Number From User: ");
           int no=sc.nextInt();
           int temp=no;
            int rev=0;
          while(no>0)
         {
              int digit=no%10;
              rev=rev*10+digit;
              no=no/10;
         }
            System.out.println((temp==rev?"Number is palindorem":"Number is not Palindrome"));
   }
}