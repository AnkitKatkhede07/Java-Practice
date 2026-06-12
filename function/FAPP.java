/*Calculate Factorial


Write a function factorial(int n) that returns the factorial of a given number.


Call it from main() and display the factorial.*/
import java.util.*;
public class FAPP
{
 public static int getshow(int no)
 {
     int p=1;
	 for(int i=1;i<no;i++)
	 {
	   p=p*i;
	 }
	 return p;
 }
 public static void main (String x[])
 {
   Scanner sc = new Scanner(System.in);
   System.out.print("Enter a Number:");
   int num=sc.nextInt();
   int fact=getshow(num);
 }
}


