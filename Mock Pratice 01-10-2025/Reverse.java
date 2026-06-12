//2. Write a program to input numbers using Scanner class and reverse it?
import java.util.Scanner;
public class Reverse
{
public static void main(String args[])
{
  Scanner sc= new Scanner(System.in);
  System.out.print("Enter three Digit Number : ");
  int no=sc.nextInt();
  int rev=0;
  int digit=no%10;
  rev=rev*10+digit;
   no=no/10;
  
  digit=no%10;
  rev=rev*10+digit;
  no=no/10;
  
  digit=no%10;
  rev=rev*10+digit;
  no=no/10;
  System.out.println("reverse Number is:"+rev);
}
}