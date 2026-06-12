//. Write a java program to find the minimum between two numbers.
import java.util.*;
public class FindMinimum 
{
 public static void main(String x[])
 {
 int a,b;
   Scanner sc = new Scanner(System.in);
   System.out.println("Enter value A");
   a=sc.nextInt();
   System.out.println("Enter value B");
   b=sc.nextInt();
   if (a<b)
   {
     System.out.println("A is a Minimum numbers");
   }
   else
   {
     System.out.println("B is a Minimum numbers");
   }
   
 }
}