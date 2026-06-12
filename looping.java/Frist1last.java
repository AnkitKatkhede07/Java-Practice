//Q19. Write a java program to find the sum of the first and last digit of a number.
import java.util.*;
public class Frist1last
{
 public static void main(String x[])
 {
   Scanner sc = new Scanner(System.in);
   System.out.println("Enter a number");
   int num=sc.nextInt();
   int lastdigit=num%10;
   int firstdigit=num;
   // Handle negative numbers
   num = Math.abs(num);
   while(firstdigit>=10)
   {
   firstdigit=firstdigit/10;
   }
   System.out.println("First digit: " + firstdigit);
   System.out.println("Last digit: " + lastdigit);
   int sum=firstdigit+lastdigit;
   System.out.println(" the sum of First digit: lastdigit " + sum);
 }
}