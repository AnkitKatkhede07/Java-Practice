/* 2) Armstrong Number
The sum of each digit raised to the power of the number of digits equals the number.
 Example: 153
 → 13+53+33=1531³ + 5³ + 3³ = 15313+53+33=153 */
import java.util.Scanner;
public class Armstrong
{
 public static void main(String args[])
 {
   Scanner sc = new Scanner(System.in);
   System.out.print("Enter a Number: ");
   int no=sc.nextInt();
   int temp=no;
   int sum=0;
   while(no!=0)
   {
      int digit=no%10;
	  sum+=digit*digit*digit;
	  no=no/10;
   }
   if(temp==sum)
   System.out.println("Number is Armstrong");
else
	System.out.println("Number is not Armstrong");
 }
}
