//1. Find the Largest Element in an Array
import java.util.Scanner;
public class Largest
 {
    void findlargest(int arr[])
         {
     int Largest=Integer.MIN_VALUE;
	  for(int i=0;i<arr.length;i++){
	  if(Largest<arr[i])
	 {
		  Largest=arr[i];
		  
	  }
    }System.out.println("the largest element is:"+Largest);
   }
  void findSmallest(int arr[])
  {
  int samllest=Integer.MAX_VALUE;
    for(int i=0;i<arr.length;i++)
	{
	 if(samllest>arr[i])
	 {
		 samllest=arr[i];
		 System.out.println("Smallest Element is:"+samllest);
	 }
	}		
  }
  public static void main(String args[])
  {
     Scanner sc = new Scanner(System.in);
	 System.out.print("Enter size of Array:");
	 int size=sc.nextInt();
	 int arr[]=new int[size];
	 System.out.print("Enter Element in Array:");
	 for(int i=0;i<arr.length;i++)
	 {
	   arr[i]=sc.nextInt();
	 }
	 Largest la=new Largest();
	 la.findlargest(arr);
	 la.findSmallest(arr);
  }
}