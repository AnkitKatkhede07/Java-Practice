//Q.write a java program to enter radius of a circle and find its diameter,area and circumference.?
import java.util.*;
public class AreaOfCircle
{
 public static void main(String x[])
 {
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter a radius");//input is 10
   float radius=sc.nextFloat();
   float diameter=2*radius; //2*10=20
   double circumference=2*3.14*radius;//16.28
   double area=3.14*radius*radius;//314
   System.out.println("Diameter of radius :"+diameter);
   System.out.println("circumference of radius :"+circumference);
   System.out.println("A area of radius:"+area);
 }
}