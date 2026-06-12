// Write a Java program to check whether character is alphabetic or not.
import java.util.*;
public class CheckCharacter
{
 public static void main(String x[])
 {
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter a char");
  char ch=sc.next().charAt(0);
  int value=(int)ch;
  String str=(value>=97&&value<=122)||(value>=65&&value<=90)?"character Is alphabetic":"Is not alphabetic";
  System.out.println(str);
 }
}