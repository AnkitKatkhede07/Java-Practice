/*Q9. Write a Java program to find the maximum of all subarrays of size k. 
 
  Example: 
    Input: arr = [1,3,-1,-3,5,3,6,7], k = 3 
    Output: [3,3,5,5,6,7] 
    Explanation: Each window gives a maximum →  
    [1,3,-1] → 3   
    [3,-1,-3] → 3   
    [-1,-3,5] → 5   
    [-3,5,3] → 5   
    [5,3,6] → 6   
    [3,6,7] → 7*/
	
	public class Maxm
	{
	public static void getMax(int arr[],int k)
	{
	int n=arr.length;
	//loop for each subarrays of size k
	for(int i=0;i<n-k;i++)
	{
	   int max=arr[i];
	   //find max in current window
	   for(int j=i;j<i+k;j++){
	     if(arr[j]>max){
		 max=arr[j];
		 }
	   }
	   System.out.print(max+" ");
	}
	}
	public static void main(String x[])
	{
	 int arr[]={1,3,-1,-3,5,3,6,7};
	  int k=3;
	  System.out.println("Maximun of all Subarrays of size "+k+":");
	  getMax(arr,k);
	}
	}