/*2. Check for Triplets with Zero Sum
Problem:
Check if any three elements in the array sum to 0.
Example:
Input: [-1, 0, 1, 2, -1, -4]  
Output: (-1, 0, 1), (-1, -1, 2)*/
public class Triplets
{
  public static void main(String []args)
  {
    int arr[]={-1, 0, 1, 2, -1, -4};
	// int n=arr.length;
	 for(int i=0;i<arr.length;i++)
	 {
	    for(int j=i+1;j<arr.length;j++)
		{
		  for(int k=j+1;k<arr.length;k++)
		  {
		   if(arr[i]+arr[j]+arr[k]==0)
		  {
		   System.out.println(arr[i]+" "+arr[j]+" "+arr[k]);
		   }
		 }
		}
	 }
  }
}

