//Q6. Write a java program to find the sum of all natural numbers between 1 to n.
import java.util.*;
public class Sum
{
	public static void main(String args[])
	{
   Scanner sc = new Scanner(System.in);
   System.out.println("Enter a number for user");
   int no=sc.nextInt();
   int i=1;
   int sum=0;
 while(i<=no)
 {
   sum+=i;
   i++;
 }   System.out.println(sum);
}
}