//Write a Java program to check whether a number is positive , negative or zero.
import java.util.*;
public class PositiveOrNegative
{
 public static void main(String x[])
 {
   Scanner sc= new Scanner(System.in);
   System.out.println("Enter a Fisrt number");
   int num=sc.nextInt();
   String str=(num>0 || num<0)?"Is Positive num":"Is negative number";
   System.out.println(str);
   
 }
}