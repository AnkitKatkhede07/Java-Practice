/*
Q16. Write a java program to find second highest value of array.
Input : 10 30 50 20 40
Output : 40
*/
import java.util.Scanner;
public class FindSecound
{
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
	System.out.print("Enter a Array size:");
	int size=sc.nextInt();
	int arr[]=new int[size];
	System.out.println("Enter a Array Element in Array:");
	for(int i=0;i<arr.length;i++)
	{
	  arr[i]=sc.nextInt();
	}
	int secondmax = Integer.MIN_VALUE;
	int max=arr[0];
	for(int i=0;i<arr.length;i++)
	{
	 if(arr[i]>max)
	 {
	  secondmax=max;
	  max=arr[i];
	 }
	 else if(arr[i]>secondmax&&arr[i]!=max)
	 {
	   secondmax=arr[i];
	 }
	 else
	 {
	 
	 }
	}
	if (secondmax != Integer.MIN_VALUE)//(secondmax!=Integer.MIN_VAlUE)
	{
	  System.out.println("Second max value is:"+secondmax);
	}
	else
	{
	 System.out.println("There is  no second max value");
	}
  }
}

