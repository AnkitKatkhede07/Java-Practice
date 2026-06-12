//Given a number 1–7, print the day name.
import java.util.*;
public class PrintDay
{
  public static void main(String []args)
  {
    Scanner sc = new Scanner(System.in);
	System.out.println("Enter a day");
	int day=sc.nextInt();
	String print=(day==1)?"Monday":(day==2)?"Tuesday":(day==3)?"wednesday":(day==4)?"Thursday":
	(day==5)?"friday":(day==6)?"Saturday":(day==7)?"Sunday":"this is not day";
	System.out.println("the day:"+print);
  }
}