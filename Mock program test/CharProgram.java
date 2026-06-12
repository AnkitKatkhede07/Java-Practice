import java.util.*;
public class CharProgram
{
public static void main(String []args)
{
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter a character");
  char ch=sc.nextLine().charAt(0);
  //int value=(int)ch;
  if(ch>=65&&ch<=122)
  {
   System.out.println("it is alphabet");
  }
  else if(ch>48&&ch<=57)
  {
   System.out.println("it is digit");
  }
  else
  {
   System.out.println(" its special character");
  }
 }
}