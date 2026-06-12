//Q2. Write a java program to print all natural numbers in reverse (from n to 1).
// using a while loop.
import java.util.*;
public class ReverseNum1
{
 public static void main(String[]args)
 {
   Scanner sc = new Scanner(System.in);
   System.out.println("Enter a number");
   int num=sc.nextInt();
   int i=1;
   while(num>=i)
   {
   System.out.println(num);
   num--;
   }
 }
}
