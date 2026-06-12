/*Q7. Write a java program to find the unique value from array. 
 
 Input array elements: 1, 2, 3, 5, 1, 5, 20, 2, 12, 10  
 All unique elements in the array are: 3, 20, 12, 10 */
import java.util.Scanner;
public class UniqueArray {
    public static void main(String[] args) 
      {
        int[] arr = {1, 2, 3, 5, 1, 5, 20, 2, 12, 10};

        System.out.println("Input array elements:");
        for (int i = 0; i < arr.length; i++) 
       {
            System.out.print(arr[i] + " ");
        }

        System.out.println("\nAll unique elements in the array are:");

        
            int count = 0;

            // Count how many times arr[i] appears
            for (int j = 0; j < arr.length; j++)
             {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }

            //  count is 1 its unique
          for (int i = 0; i < arr.length; i++) {
            if (count == 1) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}
