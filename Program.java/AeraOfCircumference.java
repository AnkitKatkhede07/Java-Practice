 /*
 Write a java program to enter radius of a circle and find its diameter,area and circumference.
Formula :-
diameter=2 * radius;
circumference = 2 * 3.14 * radius; area = 3.14 * radius * radius;

 */
 import java.util.*;
 public class AeraOfCircumference
{
public static void main(String x[])

   { 
   Scanner sc = new Scanner(System.in);
   System.out.println("Enter a radius");
   int radius=sc.nextInt();
   //radius formula
  // int radius = 10;
   int Diameter=2*radius;
   
   //circumferenceformula
   float pi=3.14f;
   float circumference=2*pi*radius;
   
   //area of radius
   float area=pi*radius*radius;
   
   System.out.println("Area of Diameter:" +Diameter);
   System.out.println("Area of circumference:" +circumference);
   System.out.println("Total Area:" +area);
   //System.out.println();


    }


}
