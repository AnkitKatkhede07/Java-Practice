/*Q8. Write a program in java to count the number of inversion in a given array
 Expected Output :
 The given array is : 1 9 6 4 5
 The inversions are: (9, 6) (9, 4) (9, 5) (6, 4) (6, 5)
 The number of inversion can be formed from the array is: 5*/
 import java.util.*;
 public class Inversions
 {
  public static void main(String []args)
  {
    // Given array
      int[] arr = {1, 9, 6, 4, 5};
      int n = arr.length;

      System.out.print("The given array is: ");
      for (int num : arr) {
	  System.out.print(num + " ");
        }
      System.out.println();
      System.out.print("The inversions are: ");
     int count = 0;

     // Brute-force approach: Check each pair
     for (int i = 0; i < n - 1; i++) {
        for (int j = i + 1; j < n; j++) {
           if (arr[i] > arr[j]) {
             System.out.print("(" + arr[i] + ", " + arr[j] + ") ");
              count++;
                }
            }
        }

        System.out.println();
        System.out.println("The number of inversions can be formed from the array is: " + count);
    }
   } 
 
