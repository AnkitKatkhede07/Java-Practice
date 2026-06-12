//Q21.  Write a java program to check Number Is Prime Number or Not.
import java.util.*;
public class CheckNumIsPrime
{
public static void main(String x[])
{
Scanner sc = new Scanner(System.in);
System.out.println("enter a number");
int num=sc.nextInt();
int i;
boolean flag=true;
if(num<=1)
{
  flag=false;	
}
else{
for(i=2;i<=num/2;i++)
{
	if(num%i==0)
	{
		flag=false;
		break;
	}
	
 }
    }
if(flag)
   {
      System.out.println(num+":Is Prime Number");
   }
   else 
   {
      System.out.println(num+":Is not a Prime Number");
   }
  }
}
