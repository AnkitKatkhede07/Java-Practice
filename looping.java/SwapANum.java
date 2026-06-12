//Q20. Write a java program to swap first and last digits of a number.
import java.util.*;
public class SwapANum
{
  public static void main(String x[])
  {
    int no,p,temp,count=0;
    Scanner sc = new Scanner(System.in);
	System.out.println("Enter a number");
	no=sc.nextInt();
	  temp=no;
	   System.out.println("Before swap  "+no);
	   while(no!=0)
	   {
	     ++count;
		 no  = no /10;
	   }
	   no=temp;
	   p=(int)Math.pow(10,--count);	  //calcualte power 
	   no=( ( no%10 ) * p)+( ( (no%p) / 10)*10) + (no/p);                  
	   System.out.printf("AFter swap %d\n",no);
  }
}