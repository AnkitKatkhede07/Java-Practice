//Q5. Write a java program to find positive and negative number in array.
import java.util.Scanner;
public class PostiveArray
{
  public static void main(String []args)
  {
    Scanner sc = new Scanner(System.in);
	int arr[]=new int[5];
	System.out.println("Enter a number from user:");
	for(int i=0;i<arr.length;i++)
	{
	   arr[i]=sc.nextInt();
	}
	for(int i=0;i<arr.length;i++)
	{
	  if(arr[i]>0)
	  {
	    System.out.println("positive number:"+arr[i]);
	  }
	  else
	  {
	    System.out.println("negative number:"+arr[i]);
	  }
	}
  }
}