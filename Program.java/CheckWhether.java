//Write a Java program to check whether a year is leap year or not.
import java.util.*;
public class CheckWhether
{
 public static void main(String x[])
 {
   Scanner sc = new Scanner(System.in);
   System.out.println("Enter a year");
   int year=sc.nextInt();
   String str=((year%400==0)||(year%4==0&&year%100!=0))?"Is leap year":"Is not leap Year";
   System.out.println(str);
 }
 }