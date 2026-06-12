//Q2.  Write a Java program to check whether a given year is a leap year or not.
import java.util.Scanner;
public class leap
{
public static void main(String x[])
{
  Scanner sc = new Scanner(System.in);
System.out.println("Enter number from User:");
int num=sc.nextInt();
checkleap(num);
}
public static void checkleap(int year)
{
 if(year%400==0 ||(year%4==0  && year%100!=0))
{
  System.out.println("this is leap Year");
}
else
{
  System.out.println("this is not leap Year");
}

}
}