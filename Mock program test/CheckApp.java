//Q5.Write a java program to input any character and check whether it is alphabet, digit or special 
//character.
import java.util.*;
public class CheckApp
{
 public static void main(String[]args)
 {
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter a character");
  char ch=sc.nextLine().charAt(0);
  int value=(int)ch;
  if(ch>=65&&ch<=122)
  {
   System.out.println("it is alphabet");
  }
  else if(ch>48&&ch<=57)//enter a value ascii
  {
   System.out.println("it is digit");
  }
  else
  {
   System.out.println("it is special character");
  }
 }
}