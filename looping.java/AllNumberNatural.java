//Write a C program to print all natural numbers from 1 to n. - using while loop
import java.util.*;
public class AllNumberNatural
{
 public static void main(String x[])
 {
   Scanner sc = new Scanner(System.in);
   System.out.println("Enter a number");
   int num=sc.nextInt();
   int i=1;
   while(i<=num)
   {
   System.out.println(i);
   i++;
   }
 }
}