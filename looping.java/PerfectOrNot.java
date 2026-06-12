//Q.22 Write a java program to Check Number Is Perfect Number or Not.
/*Example : perfect number, a positive integer that is equal to the sum of its proper divisors. 
The smallest perfect number is 6,which is the sum of 1, 2, and 3.
 Other perfect numbers are 28, 496, and 8,128.*/
 import java.util.*;
 public class PerfectOrNot
 {
   public static void main(String x[])
   {
      Scanner sc=new Scanner(System.in);
	  System.out.println("Enter a Number");
	  int num=sc.nextInt();
	  int digit=num;
	  int i=1;
	  int rem=0;
	  int sum=0;
	  while(i<num)
	  {
	   if(num%i==0)
	   {
	   sum=sum+i;
	   }
	   i++;
     }
	 if(sum==digit)
	 {
		 System.out.println("perfect number");
	 }
	 else 
	 {
		System.out.println(" Not a perfect number");
	 }
	  
   }
 
 }
