//Write a java progarm to calculate the simple intrest.
import java.util.*;
public class SimpleIntrest
{
  public static void main(String x[])
  {
    Scanner sc=new Scanner(System.in);
	//input of user
	 System.out.println("Enter a principal amount:");
	 int principalamount =sc.nextInt();
	 System.out.println("Enter a Rate of interest:");
	 int Rateofinterest=sc.nextInt();
	 System.out.println("Enter a time period:");
	 int timeperiodyear=sc.nextInt();
	 double SI=(principalamount*Rateofinterest*timeperiodyear)/100;
	 System.out.println("Toatl amount of simple intrest:"+SI);
	 
  }
}