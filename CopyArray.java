//Q13. Write a java program to copy one array to another array.
/*import java.util.Scanner;
public class CopyArray
{
  public static void main(String []args)
  {
    Scanner sc = new Scanner(System.in);
	System.out.println("Enter a arraya element size:");
	int size=sc.nextInt();
	int arr1[]=new int[size];
	int arr2[]=new int[size];
	System.out.println("Enter :"+size+"Element in aaray:");
	for(int i=0;i<size;i++)
	{
		arr1[i]=sc.nextInt();
	}
	for(int i=0;i<size;i++)
	{
	  arr2[i]=arr1[i];//copy element
    }
	System.out.println("Copiede array:");
	for(int i=0;i<size;i++)
	{
		System.out.println(arr2[i]+"");
	}
  }
}
*/
/*
import java.util.*;
public class CopyArray
{
	public static void main(String []args)
	{
	int arr1[] = {1,2,4,5,6,7};
	int arr2[]=new int[arr1.length];
	for(int i=0;i<arr1.length;i++)
	{
		arr2[i]=arr1[i];
	}
	System.out.print("Copy Array:");
	for(int i=0;i<arr2.length;i++)
	{
		System.out.println(arr2[i]+"");
	}
	}
}
*/
//Every array in Java has a built-in clone() method.
public class CopyArray {
    public static void main(String[] args) {
        int arr1[] = {1, 2, 3, 4, 5};
        int arr2[] = arr1.clone();
        
        System.out.print("Copied Array: ");
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i]+" ");
        }
    }
}