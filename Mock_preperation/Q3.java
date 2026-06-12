/* Q3. Write a java program to take input array from user and perform operations in array. 
  Store only prime number at the same index of digit. 
   Input :-  5732  8659  2534  9625  7354  1325 
    Output :- 2573  5  253  25  357  235 */
	import java.util.*;
public class Q3{
 public static void main(String args[])
 {
   Scanner sc = new Scanner(System.in);
   System.out.println("Enter a number:");
   int n=sc.nextInt();
   int a[]=new int[n];
   
   for(int j=0;j<a.length;j++)
   {
     a[j]=sc.nextInt();
	 int sum=0;
	 int num=0;
    while(a[j]>0)
	{	
     int d=a[j]%10;
     boolean flag=true;
		  for(int i=2;i<=d/2;i++)
		  { 
			   if(d%i==0)
			   {
				    flag=false;
					break;
			   }
		  }if(flag)
		  {
			  num=num*10+d;
			   
			   
		  }a[j]=a[j]/10;
	 }
	 System.out.println(num);
	 num=0;
	 
	}
    
   }
}
