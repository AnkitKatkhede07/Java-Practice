//Write program of java  to calculate compound intrest
import java.util.*;
public class CompoundIntrest
{
  public static void main(String x[])
  {
	  Scanner sc=new Scanner(System.in);
	   System.out.println("enetr a amount of prinipal");
   double p=sc.nextDouble();
   System.out.println("enter amount of rate");
   double r=sc.nextDouble();
    System.out.println("enter amount of number of year");
	double yn=sc.nextDouble();
	 System.out.println("enter amount of time");
	 double nt=sc.nextDouble();
	 //double i=rate/100;
   double total =p*Math.pow(1+(r/yn),yn*nt);
   double CI=total-p;
   System.out.println("total:"+total);
   System.out.println("compond interst:"+CI);
  }
}