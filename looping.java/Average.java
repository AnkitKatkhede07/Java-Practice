/*1. Average of Elements
Concept: First compute the sum, then divide by the number of elements.
 arr = [10, 20, 30, 40, 50]
Average of array elements: 30.0
*/
import java.util.Scanner;
public class Average
{
  public static void main(String args[])
  {
	   Scanner sc = new Scanner(System.in);
	   System.out.print("Enter Arrya in Element :");
	   int size=sc.nextInt();
	   int arr[]=new int[size];
	   System.out.println("enter"+size+"Elements:");
	   for(int i=0;i<arr.length;i++)
	   {
		   arr[i]=sc.nextInt();
	   }
	   System.out.println("Arrya in elemets is:");
	    for(int num : arr)
	   {
		   System.out.println(num);
	   }
	   int sum=0;
	   for(int num : arr)
	   {
		   sum+=num;
	   }
	   double avrage=double sum/arr.length;
	   System.out.println("Avarage of sum is :"+avrage);
  }
}