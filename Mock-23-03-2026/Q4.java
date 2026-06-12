/*Q4. Write a program in java to rotate an array by N positions without using other array. 
  
 Input:  
 The given array is: 0  3  6  9  12  14  18  20  22  25  27 
 
 From 4th position the values of the array are: 12 14 18 20 22 25 27  
 Before 4th position the values of the array are: 0  3  6  9  
 After rotating from 4th position the array is: 12 14 18 20 22 25 27 0 3  6 9*/
 
 
 import java.util.*;
public class Q4
{
 public static void main(String args[])
 {
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter a arrya size");
  int n=sc.nextInt();
  int arr[]= new int[n];
  int a=0;
  int b=0;
  System.out.println("Enter a arrya Element");
  for(int i=0;i<arr.length;i++)
  {
     arr[i]=sc.nextInt(); 
  }
  System.out.println("enter rotate value");
  int k=sc.nextInt(); 
	// rotation 
        for(int i = 0; i < k; i++) {
            int temp = arr[0];   // first element add

            for(int j = 0; j < n - 1; j++) {
                arr[j] = arr[j + 1];   // shift left
            }

            arr[n - 1] = temp;  // last in number
        }

        System.out.println("Rotated array:");
        for(int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
 }
}