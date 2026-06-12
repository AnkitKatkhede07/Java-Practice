//Q3. Write a Java program to check whether a triangle is equilateral , isoscale  or scalene.
import java.util.*;
public class CheckTriangle1
{
 public static void main(String x[])
 {
   Scanner sc = new Scanner(System.in);
   System.out.println("Enter a number A");
   int a=sc.nextInt();
   System.out.println("Enter a number B");
   int b=sc.nextInt();
   System.out.println("Enter a number C");
   int c=sc.nextInt();
   if(a==b&&a==c)
   {
      System.out.println("This Triangle is equilateral ");

   }
   else if(a==b||a==c)
   {
      System.out.println("This Triangle is isoscale");

   }
   else
   {
     System.out.println("This Triangle is Scalene");
   }
   
 }
}