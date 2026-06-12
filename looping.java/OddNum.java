//. Write a java program to print all odd numbers between 1 to 100.
import java.util.*;
public class OddNum
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
   i=i+2;
 }
}
}