/*Q3. Write a Java program to find the kth largest element in an array without sorting. 
 
Input: 
Enter size: 6 
Enter elements: 10 45 23 67 34 67 
Enter k value: 2 
Output: Second largest element is 45*/

import java.util.*;
public class Q3
{
 public static void main(String args[])
 {
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter a arrya size");
  int n=sc.nextInt();
  int arr[]= new int[n];
  System.out.println("Enter a arrya Element");
  for(int i=0;i<arr.length;i++)
  {
     arr[i]=sc.nextInt(); 
  }
  System.out.println("enter k value");
  int k=sc.nextInt(); 
  int max=0;
  for(int i=0;i<arr.length;i++)//outer loop
  {
	 
   for(int j=0;j<=k;j++)//loop k value inner loop
   {
	  if(arr[j]>max)
	  {
		   max=arr[i];
	  }
   }
   
  }
System.out.println("Second largest element is: "+max);
 }
}