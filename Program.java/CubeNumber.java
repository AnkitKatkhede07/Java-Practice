//Write a Java program that reads a number and display the cube.
import java.util.*;
public class CubeNumber
{
  public static void main(String x[])
   {
     Scanner sc=new Scanner(System.in);
     System.out.println("please enter a any number");
	 int number=sc.nextInt();
	  int cude=number*number*number;
	  System.out.println( "A number is cube num : "+cude);
	 
   }
}