//Q15. Write a java program to print all ASCII characters with their values.
import java.util.*;
public class ASCII
{
public static void main(String x[])
{
 Scanner sc = new Scanner(System.in);
 System.out.println("Enter a characters");
 char ch=sc.next().charAt(0);
 while(ch<=127)
 {
  System.out.println(ch+ "=" +(int)ch);
   ch++;
 }
}
}
