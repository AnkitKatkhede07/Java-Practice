//Q8. Write a java program to calculate the sum of even or odd numbers.
import java.util.Scanner;
public class EvenOddSum
{
  public static void main(String []args)
  {
     Scanner sc = new Scanner(System.in);
	 System.out.print("Enter a array in element:");
	 int arr[]=new int[5];
	 for(int i=0;i<arr.length;i++)
	 {
	  arr[i]=sc.nextInt();
	 }
	 int Evensum=0; 
	 int oddsum=0;
	 for(int i=0;i<arr.length;i++)
	 {
	   if(arr[i]%2==0)
	   {
	    Evensum+=arr[i];
	    
	   }
	   else//(arr[i]%2!=0)
	   {
	   oddsum+=arr[i];
	   }
	 } System.out.println("Even number:"+Evensum);
	 System.out.println("Odd number:"+oddsum);
  }
}