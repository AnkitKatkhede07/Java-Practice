/*Q12. Write a java program to find missing value in array.
Input : 1 4 6 7 11 15
Output : 2 3 5 8 9 10 12 13 14
*/
import java.util.Scanner;
import java.util.Arrays;
public class MissingEle
{
  public static void main(String []args)
  {
    Scanner sc = new Scanner(System.in);
	System.out.println("Enter size of array:");
	int size=sc.nextInt();
	int arr[]=new int[size];
	System.out.println("Enter element of array:");
	for(int i=0;i<arr.length;i++)
	{
	 arr[i]=sc.nextInt();
	}
	Arrays.sort(arr);
	 int min =arr[0];
	 int max=arr[arr.length-1];
	 System.out.print("Missing number:");
	 for(int num=min;num<=max;num++)
	 {
	   boolean found = false;
	   //check if num exitd in array
	   for(int j=0;j<arr.length;j++)
	   {
		   if(arr[j]==num)
		   {
			   found=true;
			   break;
		   }
	   }
	   if(!found)
	   {
		   System.out.print(num+" ");
	   }
	 }
	}
  }
