// WAP to input number from keyboard and check number is armstrong or not?
//Example with source code 

import java.util.*;
public class CountNum
{
 public static void main(String x[])
 {
   Scanner sc = new Scanner(System.in);
   System.out.println("Enter a number");
   int num=sc.nextInt();
   int temp;
   int sum=0;
   temp=num;
   int count=0;
   
   while(num!=0)
   {
   ++count;
   num=num/10;
   }
   num=temp;
   while(num!=0)
   {
    int rem=num%10;
	num=num/10;
	int p=1,j=1;
   while(j<=count)
   {
    p=p*rem;
	j++;
   }
   sum=sum+p;
   }
 String massage=(temp==sum)?"Armstrong":"not Armstrong";
 System.out.println(massage);
 }
}