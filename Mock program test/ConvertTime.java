//Q1.Write a Java program to convert seconds to hours, minutes and seconds.
import java.util.*;
public class ConvertTime
{
  public static void main(String []args)
  {
    Scanner sc = new Scanner(System.in);
	System.out.println("Enter a seconds");
	int seconds=sc.nextInt();
	int hours=seconds/3600;
	int remaingsecondsAfterhours=seconds%3600;
	int min=remaingsecondsAfterhours/60;
	 seconds=remaingsecondsAfterhours%60;
	System.out.println("Hours:"+hours);
	System.out.println("Min:"+min);
	System.out.println("Seconds:"+seconds);
  }
}
