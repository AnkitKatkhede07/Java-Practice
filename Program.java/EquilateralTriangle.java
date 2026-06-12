// write a java progarm to calulate area of an equilateral triangle?
import java.util.*;
public class EquilateralTriangle
{
  public static void main(String x[])
  {
   Scanner sc=new Scanner(System.in);
   //input for user 5
   System.out.println("Enter a area of EquilateralTriangle side:");
   int side = sc.nextInt();
   double area=Math.sqrt(3)/4*side*side;
   System.out.println("the area of EquilateralTriangle is:"+area);
   
   
  }
}
