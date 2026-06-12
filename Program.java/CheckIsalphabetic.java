//Write a Java program to check whether a character is alphabetic or not.
import java.util.*;
public class CheckIsalphabetic
{
 public static void main(String x[])
 {
   Scanner sc = new Scanner(System.in);
   System.out.println("Enter a character");
   char ch=sc.next().charAt(0);
   int value=(int)ch;
   if(ch>=65&&ch<=90||ch>=97 && ch<=122)
   {
   System.out.println("This is a character");
   }
   else
   {
   System.out.println(" it is not character");
   }
 }
}