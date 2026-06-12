import java.util.*;
public class check
{
  public static void main (String args[])
{
 Scanner sc = new Scanner (System.in);
System.out.println("Enter a Charter from User");
char ch=sc.nextLine().charAt(0);
if((ch>='A'&& ch<='Z')||(ch>='a'&& ch<='z'))
{
 System.out.println("this is alpahabet");
}
else if((ch>='0' && ch<='9'))
{
 System.out.println("this is digit");

}
else
{
  System.out.println("this spiecal charater");
}
}
}