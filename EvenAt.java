/*Q11. Print array elements at even indices.
Input: arr = [4, 9, 7, 11, 6]
Output: 4 7 6*/
import java.util.Scanner;
public class EvenAt
{
  public static void main(String []args)
  {
     Scanner sc = new Scanner(System.in);
	 System.out.print("Enter size of array: ");
	 int size=sc.nextInt();
	 int arr[]=new int[size];
	 System.out.println("Enter array elements:");
	 for(int i=0;i<arr.length;i++)
	 {
	   arr[i]=sc.nextInt();
	 }
	 System.out.println("indices array in elements:");
	// for(int i=0;i<arr.length;i++)
	 /*{ if(i%2==0)//first logic
		 {
			 System.out.println(arr[i]+" ");
		 }*/
		 for (int i = 0; i < arr.length; i =i + 2) //even indices
		 {
              System.out.print(arr[i] + " ");
         }
	 //}
	 
  }
}
