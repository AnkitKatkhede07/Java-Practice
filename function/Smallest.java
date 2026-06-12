/*Find Smallest Element in an Array
Write a function findMin(int arr[]) that returns the smallest element in the array.
Call it from main().*/
import java.util.*;
public class Smallest
{
  public static int findMin(int arr[])
  {
    int small=Integer.MAX_VALUE;
	 for(int i=0;i<arr.length;i++)
	 {
		 if(small>arr[i])
		 {
			small=arr[i]; 
		 } 
	 }return small;
  }
  public static void main(String []args)
  {
     Scanner sc = new Scanner(System.in);
	 System.out.print("Enter a Array size:");
	 int size=sc.nextInt();
	  int arr[]=new int[size];
	 System.out.print("Enter a Array element");
	 for(int i=0;i<arr.length;i++)
	 {
	   arr[i]=sc.nextInt();
	 }
	 
	 System.out.println("Smallest Element is:"+findMin(arr));
  }
}


