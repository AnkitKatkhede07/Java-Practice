// Write a Java program to check whether a year is a leap year or not.
import java.util.*;
public class CheckLeapYear
{
 public static void main(String x[])
 {
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter a year");
  int year=sc.nextInt();
  if(year%4==0)
  {
    System.out.println("Is leap year");
  }
  else
  {
    System.out.println("It is not leap year");
  }
  String str=(year%4==0)?"Is leap year\n":"It is not leap year\n";
  System.out.println(str);
 }
}