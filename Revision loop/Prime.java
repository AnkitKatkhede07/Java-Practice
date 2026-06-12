import java.util.*;
public class Prime
{
  public static void main (String args[])
  {
     Scanner sc= new Scanner(System.in);
	 int n=sc.nextInt();
	/*  boolean flag=false;
	 if(n<=1)
	 {
	  flag=true;
	 }
	 for(int i=2;i<=n/2;i++)
	 {
	   if(n%i==0)
	   {
	      flag=true;
		  break;
	   }
	 }
	 if(!flag)
	 System.out.println("IS Prime Number");
	 else
	 	 System.out.println("IS Not Prime Number"); */
	 /* if(n==2)
	 {
		 System.out.println("is prime Number");
		 return;
	 }
	 else
	 {
		  for(int i=2;i<n/2;i++)
		  {
			   if(n%i==0)
			   {
				  System.out.println("Is prime not Number");
				   return;
			   } 
		  }
	 }System.out.println("Is prime  Number"); */
	 int count=0;
	 for(int j=2;j<=n;j++)
	 {
		   boolean flag=false;
		   for(int i=2;i<=j/2;i++)
		   {
			   if(j%i==0)
			   {
				   flag=true;
				   break;
			   }
		   }if(!flag)
			   count++;
			   System.out.println(j+" ");
		   
	 }System.out.println("is count "+count);
	 //using while loop
	 /* int num=2;
	 int count=0;
	 while(num<=n)
	 {
		  boolean flag=true;
		  for(int i=2;i<=num/2;i++)
		  { 
			   if(num%i==0)
			   {
				    flag=false;
					break;
			   }
		  }if(flag)
		  {
			   System.out.println(num+"");
			   count++;
			   
		  }num++;
	 }System.out.println("Count is : "+count); */
  }
}