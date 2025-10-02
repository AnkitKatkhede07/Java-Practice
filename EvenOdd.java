//Q4. Write a java program to find even and odd number in array.
import java.util.Scanner;
public class EvenOdd
{
  public static void main(String []args)
  {
     Scanner sc = new Scanner(System.in);
	 int arr[]=new int[6];
	 System.out.println("Enter a number for user:");
	 for(int i=0;i<arr.length;i++)
	 {
	   arr[i]=sc.nextInt();
	 }
	 for(int i=0;i<arr.length;i++)
	 {
	  if(arr[i]%2==0)
	  {
		 System.out.println("Even number :"+arr[i]);
	  }
	  else 
	   {
	    System.out.println("Odd number : "+arr[i]);
	   }
	 }
	 
	 }
  }
