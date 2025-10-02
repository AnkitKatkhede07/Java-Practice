//Q7. Write a java program to display the reverse array.
import java.util.Scanner;
public class ReverseAarray
{
  public static void main(String args[])
  {
	  Scanner sc = new Scanner(System.in);
	  System.out.println("Enter a size of aaray:");
	  int size=sc.nextInt();
	  int arr[]=new int[size];
	System.out.print("Enter a array in Element user \n");
	for(int i=0;i<arr.length;i++)
	{
	   arr[i]=sc.nextInt();
	}
	System.out.println("Revser number in display:");
	for(int i=arr.length-1;i>=0;i--)
	{
	  System.out.print(arr[i]+" ");	
	}
	
  }
}