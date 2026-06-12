//3.Write program to character from keyboard and check character is alphabet digit or special  //symbols?
import java.util.*;
public class Check
{
  public static void main(String args[])
{
   Scanner sc= new Scanner(System.in);
System.out.println("Enter user from Input:");
Char ch=sc.nextLine().Char(0);
if(ch>122 || ch<=65)
{
   System.out.println("The number is Charater");
}
else if(ch>0|| ch<=9)
{
      System.out.println("The number is digit");

}
else
{
     System.out.println("The number is special symbol");

}
}
}
