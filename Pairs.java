/*3. Count All Pairs with Difference k
 Problem:
Find all pairs (i, j) such that |arr[i] - arr[j]| = k.
Example:
Input: arr = [1, 5, 3, 4, 2], k = 2  
Output: (1,3), (5,3), (3,1), (4,2)*/
import java.util.*;
public class Pairs
{
  public static void main(String []args)
  {
    Scanner sc=new Scanner(System.in);
	int arr[]={1,5,3,4,2,6,9,8,5,7,1,2,8};
	System.out.println("Enter a K value:");
	int k=sc.nextInt();
	int n=arr.length;
	for(int i=0;i<n;i++)
	{
	  for(int j=i+1;j<n;j++)
	  {
	    if (i != j && Math.abs(arr[i] - arr[j]) == k) {
       System.out.println("(" + arr[i] + ", " + arr[j] + ")");
	  }
	  }
	}
  }
}
