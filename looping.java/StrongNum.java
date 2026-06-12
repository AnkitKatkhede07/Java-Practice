// Write a java program to Check Number Is Strong Number or Not.
//Example : A strong number is one in which the factorial of the digits equals the number itself.
// 1, 2, 145,
import java.util.*;
public class StrongNum
{
 public static void main(String x[])
 {
   Scanner sc = new Scanner(System.in);
   System.out.println("Enter a number");
   int num,rem;
   
   num=sc.nextInt();
   int temp=num,sum;
  
   //boolean flag=flase;
   while(num!=0)
   {
     rem=num%10;
	  int i=1;
	   sum=1;
	   while(i<=rem)
	   {
		    sum=sum*i;
			 i--;
	   }
	     num=num/10;
	   //System.out.println(sum);
	      
   } System.out.println(sum);
	 
   
 }
}