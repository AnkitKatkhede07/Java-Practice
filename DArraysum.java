//Q1. WAP to create two matrix of 3 x3  and calculate addition of two matrix and store in third matrix
import java.util.*;
public class DArraysum
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter a Arrays size");
int s=sc.nextInt();
  int arr1[][]=new int[s][s];
  int arr2[][]=new int[s][s];
  int n=arr1.length;
  int sum[][]=new int[s][s];
  System.out.println("Enter elements of first 3x3 matrix:");
  for(int i=0;i<n;i++)
  {
  for(int j=i;j<n;j++)
     arr1[i][j]=sc.nextInt();
  }
  System.out.println("Enter elements of second 3x3 matrix:");
  for(int i=0;i<n;i++)
  {
     for(int j=i;j<n;j++)
	 {
	    arr2[i][j]=sc.nextInt();
	 }
  }
  // matrix addition
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                sum[i][j] = arr1[i][j] + arr2[i][j];
            }
        }
}
}
