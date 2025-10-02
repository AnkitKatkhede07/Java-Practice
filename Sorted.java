/*4. Check If Array Is Sorted
 Problem:
Determine whether an array is sorted in non-decreasing order.
Example:
Input: [1, 2, 2, 3, 4]  
Output: true */
import java.util.*;
public class Sorted
{
 public static void main(String []args)
 {
   Scanner sc= new Scanner(System.in);
   System.out.println("Enter a array size:");
   int size=sc.nextInt();
   System.out.println("Enter a Element in arrya:");
   int arr[]=new int[size];
   int n=arr.length;
   for(int i=0;i<n;i++)
   {
    arr[i]=sc.nextInt();
   }
   System.out.println("Output Display:");
   boolean isSorted=false;
   Arrays.sort(arr);
   for(int i=0;i<n;i++)
   {
	   int originalArray=arr[i];
	   if(originalArray==arr[i])
	   isSorted=true;
   }System.out.println(isSorted);
 }
}

