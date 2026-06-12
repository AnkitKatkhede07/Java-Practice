/* 
Q5. Write a java program to implement binary search from array. 
 
Input: 
Array: 10 20 30 40 50 60 
Search: 40 
Output: Element found at index 3*/

import java.util.*;
public class Q5
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
  System.out.println("enter Sreach Elemnt");
  int S=sc.nextInt(); //search element
  
int low = 0;
        int high = n - 1;
        int mid;

        while(low <= high) {
            mid = (low + high) / 2;

            if(arr[mid] == S) {
                System.out.println("Element found at index " + mid);
                return;
			}else if(S < arr[mid]) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
		} System.out.println("Element not found");
		
		//linear search
    /* for(int i=0;i<arr.length;i++)
	{
	  if(arr[i]==S)//comper element in array
	  {
	    System.out.println("Element found at index "+i);
	  }
	} */
 }
}