//Q.3 Write a java program to enter two angles of a triangle and find the third angle. 
import java.util.*;
public class Triangle
{
 public static void main(String x[])
 {
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter a Angle A");
  int a=sc.nextInt();
  System.out.println("Enter a Angle B");
  int b=sc.nextInt();
  int c;
  c=a+b;
  c=180-c;
  System.out.println("the third angle is :"+c);
  
  
  
  
 }
}