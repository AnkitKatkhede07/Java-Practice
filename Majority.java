//Q17.  Write a java program to check majority element of array.
//
import java.util.Scanner;
import java.util.Arrays;
public class Majority
{
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
	System.out.println("Enter arrya size:");
	int size=sc.nextInt();
	int arr[]=new int[size];
	System.out.println("Enter a Element of Array:");
	int count,i,j,temp,flag=0;
	for( i=0;i<arr.length;i++)
	{
	 arr[i]=sc.nextInt();
	}
	 // Manual sorting
	/*for( i=0;i<arr.length;i++)
	{
	  for( j=i+1;j<arr.length;j++)
	  {
	  if(arr[i]>arr[j])
	  {
		  temp=arr[i];
		  arr[i]=arr[j];
		  arr[j]=temp;
	   }
	  }
	}*/
	
	// Sort using Arrays.sort()
	Arrays.sort(arr);
	                                                 // Check majority element
	count=1;
	for(i=0;i<arr.length;i++)
	{
		 if(i==arr.length-1)
		 {
			if(count>arr.length/2)
			{
				flag=1;
				System.out.println("Majority element is "+arr[i]);
			}				
		 }
		 else if(arr[i]==arr[i+1])
		 {
			 count++;
		 }
		 else
		 {
			 if(count>arr.length/2)
			 {
				 flag=1;
				 System.out.print("majority element is:"+arr[i]);
				 
			 }
			 count=1;
		 }
	}
	if(flag==0)
		System.out.println("There is no majority element");
	
  }
}