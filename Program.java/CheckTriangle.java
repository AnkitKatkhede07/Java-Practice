//Write a Java program to check whether a triangle is equilateral , isoscale or scalene. 
import java.util.*;
public class CheckTriangle
{
  public static void main(String x[])
  {
   Scanner sc = new Scanner(System.in);
   System.out.println("Enter value of a");
   int a=sc.nextInt();
   System.out.println("Enter value of b");
   int b=sc.nextInt();
   System.out.println("Enter value of c");
   int c=sc.nextInt();
   String str=(a==b&&a==c)?"equilateral":(a==b||a==c)?"isoscale":"scalene";
   System.out.println(str);
  }
}