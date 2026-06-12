//Write a java program to check whether a number is palindrome or not. 
import java.util.*;
public class PalindromeFind
{
 public static void main(String x[])
 {
 int sum;
   Scanner sc = new Scanner(System.in);
   System.out.println("Enter a number");
   int num=sc.nextInt();
   sum=0;
   int n=num;
   //step 1
   sum=sum+(num%10)*1000;
   num=num/10;
   //step 2
   sum=sum+(num%10)*100;
   num=num/10;
   //step 3
   sum=sum+(num%10)*10;
   num=num/10;
   //step 4
   sum=sum+(num%10)*1;
   num=num/10;
   if (n==sum)
   {
   System.out.println("is palindrome num");
   }
   else
   {
   System.out.println("is palindrome not num");
   }
   
 }
 
}