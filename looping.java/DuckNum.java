/*
Q23. Write a java program to Check Number Is Duck Number or Not.
Example : A Duck number is a positive number which has zeroes present in it, 
For example 3210, 8050896, 70709 are all Duck numbers.
Please note that a number with only leading 0s is not considered a Duck Number.
For example, numbers like 035 or 0012 are not considered as Duck Numbers.
*/
import java.util.*;
public class DuckNum
{
 public static void main(String []args)
 {
   Scanner sc = new Scanner(System.in);
   int num,rem;
   System.out.println("Enter a number");
   num=sc.nextInt();
   boolean flag=false;
   while(num!=0)
   {
   rem=num%10;
   num=num/10;
   if(rem==0)
   {
    flag=true;
	break;
   }
   }
   if(flag)
   {
   System.out.println("is duck num");
   }
   else
   {
   System.out.println("is not duck num");
   }
   }
 }
 
