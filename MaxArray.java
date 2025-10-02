//Q3. Write a java program to find maximum and minimum number in array.
import java.util.Scanner;
public class MaxArray
{
  public static void main(String []args)
  {
    Scanner sc= new Scanner(System.in);
	int a[]= new int [5];
	System.out.println("Enter a value of array");
	for(int i=0;i<a.length;i++)
	{
	  a[i]=sc.nextInt();
	}
	int max=a[0];
	int min=a[0];
	for(int i=1;i<a.length;i++)
	{
	 if(a[i]>max)
		   { 
	          max=a[i];
		   }
	 if(a[i]<min)
		{
			min=a[i];	
	    }	
	}System.out.println("min value of array is:"+min);
	System.out.println("max value of array is:"+max);	
	}
  }
