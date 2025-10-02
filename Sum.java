import java.util.*;
public class Sum
{
 public static void main(String []args)
 {
    Scanner sc = new Scanner(System.in);
	System.out.println("Enter a Square Array size");
	int size=sc.nextInt();
	int arr1[][]=new int[size][size];
	int arr2[][]=new int[size][size];
	int arr3[][]=new int[size][size];
	System.out.println("Enter a 1st Array");
	for(int i=0;i<size;i++)
	{
	  for(int j=0;j<size;j++)
	   {
	      arr1[i][j]=sc.nextInt();
	   }
	}
	System.out.println("Enter a 2st Array");
	for(int i=0;i<size;i++)
	{
	  for(int j=0;j<size;j++)
	   {
	      arr2[i][j]=sc.nextInt();
	   }
	}
	System.out.println("Display matrix in arrays");
	for(int i=0;i<size;i++)
	{
	  for(int j=0;j<size;j++)
	  {
	      arr3[i][j]=arr1[i][j]+arr2[i][j];
		  System.out.print(arr3[i][j]+ "\t");
	  }
	  System.out.println();
	}
 }
}