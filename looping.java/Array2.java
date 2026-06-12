//Q2. Write a java program to calculate sum of array is size 5.

import java.util.Scanner;
public class Array2
{
 public static void main(String []args)
 {
    Scanner sc = new Scanner(System.in);
	int a[]=new int[5];
	int sum=0;
	System.out.println("Enter a array for user");
	for(int i=0; i<a.length;i++)
	{
		a[i]=sc.nextInt();
	 
	}
	for(int i=0; i<a.length;i++)
	{
		 sum=sum+a[i]; 
	}System.out.println("sum of array is:"+sum);
 }
}