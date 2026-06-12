//Q2. Write a java program to print all natural numbers in reverse (from n to 1). using a while loop.
import java.util.Scanner;
public class RevserNo
{
 public static void main(String []args)
 {
   Scanner sc = new Scanner(System.in);
   System.out.println("Enter a number for user");
   int no=sc.nextInt();
   int i=1;
   while(i<=no)
   {
     System.out.println(no);
     no--;
   }
 }
}