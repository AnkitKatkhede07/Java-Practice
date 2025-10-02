/*1. Find the Maximum Subarray Sum (Brute Force)
 Problem:Find the maximum sum of any subarray.
Example:
Input: [-2, 1,  -3,   4,   -1,  2,  1,   -5.  ,4]  
Output: 6.  (from subarray [4,-1,2,1])
import java.util.Scanner;
public class Subarray
{
  public static void main(String []args)
  {
	int arr[]={-2,1,-3,4, -1,2,1,-5,4};
	int maxSum=Integer.MIN_VALUE;//start with the smallest integer value
	int n=arr.length;
	//System.out.println("Display out of arrays:");
	for(int i=0;i<n;i++)
	{ int currentsum=0;
      for(int j=i;j<n;j++)
	  {
	    currentsum+=arr[j];
		maxSum=Math.max(maxSum,currentsum);
	  }
		
	} System.out.println("sum of mexSum aaryas in element:"+maxSum);
	
  }
  
}*/


public class Subarray{
  public static void main(String []args)
  {
	  int arr[]={-2,1,-3,4,-1,2,1,-5,4};
	  int n=arr.length;
	  int maxSum=Integer.MIN_VALUE;
	  int start=0,end=0;
	  //Brute force Approach
       for(int i=0;i<n;i++){
        int currentsum=0;
		for(int j=i;j<n;j++){
			currentsum +=arr[j];
			if(currentsum>maxSum){
				maxSum = currentsum;
				start = i;
				end = j;
			}
		 }
	   }
       //output
      System.out.println("Maximum Subarray sum:"+maxSum);
      System.out.print("Subarray:[");
      for(int k=start;k<=end;k++){
      System.out.print(arr[k]);
      if(k<end)System.out.print(", ");
     }
      System.out.println("]");  
  }
}