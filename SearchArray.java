//Q6. Write a java program to search element in array , its element found or not.
import java.util.Scanner;
public class SearchArray
{
  public static void main(String []args)
  {
    Scanner sc = new Scanner(System.in);
	int arr[]=new int[5];
	//int a=5;
	System.out.println("Enter a number :");
	for(int i=0;i<arr.length;i++)
	{
	  arr[i]=sc.nextInt();
	}
	System.out.println("Enter a search element:");
	int search=sc.nextInt();
	boolean found=false;
	for(int i=0;i<arr.length;i++)
	{
	if(arr[i]==search)
	  {
	  System.out.println("Element is found in array"+ i);
         found=true;
		 break;
	  }
	   
	}if(!found)
	{
	   System.out.println("element is not found in array:"+search);
	}
	
  }
}