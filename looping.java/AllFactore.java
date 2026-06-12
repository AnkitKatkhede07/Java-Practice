//Q17. Write a java program to find all factors of a number.
import java.util.*;
public class AllFactore
{
 public static void main(String x[])
 {
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter a number");
  int num=sc.nextInt();
  int i=1;
  int fact=1;
  while(i<=num)
  {
    fact=fact*i;
   i++;
  }
  System.out.println("factors of a number:"+fact);
 }
}