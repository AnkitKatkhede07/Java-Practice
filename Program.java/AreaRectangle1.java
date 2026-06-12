import java.util.*;
public class AreaRectangle1
{
  public static void main(String x[])
  {
    Scanner sc = new Scanner(System.in);
	//input scanner
	System.out.println("Enter a Length");
	float Length= sc.nextFloat();
	System.out.println("Enter a breadth");
	float breadth = sc.nextFloat();
	//area of rectangle
	float area=Length*breadth;
	System.out.println("Area of Rectangle is:"+area);
  }
}