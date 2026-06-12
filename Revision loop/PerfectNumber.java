import java.util.*;
public class PerfectNumber
{
  public static void main(String args[])
  {
     Scanner sc= new Scanner(System.in);
	 int n=sc.nextInt();
	 /* int temp=n;
	 int sum=0;
	 for(int i=1;i<temp;i++)
	 {
	   if(temp%i==0)
	   {
	      sum=sum+i;
	   }
	 }
	 if(n==sum)
	 {
	    System.out.println("Perfect Number"+sum);
	 }
	 else
	 {
	  System.out.println("is not Perfect Number");
	 } */
	 int count=0, num=1;
	 while(count<n)
	 {
		  int sum=0;
		  for(int i=1;i<=num/2;i++)
		  {
			  if(num%i==0)
			  {
				  sum=sum+i;
			  }
		  }
		  if(num==sum)
		  {
			   System.out.println(num);
			   count++;
		  }num++;
		 
	 }
  }
}