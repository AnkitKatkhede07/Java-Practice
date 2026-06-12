//Write a java program to check whether a character is uppercase or lowercase alphabet.
import java.util.*;
public class CheckUpperCase
{
 public static void main(String x[])
 {
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter a character");
  char ch =sc.next().charAt(0);
  int value=(int)ch;
  if (ch >=97)
  {
    System.out.println("lower case");
   }
   else
   {
     System.out.println("upper case");
   }
   String Upperlower=(ch<=97)?"uppercase":"lowercase";
   System.out.println(Upperlower);
 }
}