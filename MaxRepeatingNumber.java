/*Q10. Write a program in java to find the maximum repeating number in a given array.
The array range is [0..n-1] and the elements are in the range [0..k-1] and k<=n..
 Expected Output:
 The given array is:
 2 3 3 5 3 4 1 7 7 7 7
 The maximum repeating number is: 7*/
import java.util.*;

public class MaxRepeatingNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input array size
        System.out.println("Enter size of array:");
        int n = sc.nextInt();
        int arr[] = new int[n];

        // Input array elements
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
		// Input value of k
        System.out.println("Enter value of k (k <= n):");
        int k = sc.nextInt();
		 System.out.println("The given array is:");
        for (int i=0;i<n;i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        
		 for (int i = 0; i < n; i++) {
            arr[arr[i] % k] += k;
        }

        // Find the maximum repeating element
        int max = arr[0];
        int result = 0;
        for (int i = 1; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
                result = i;
            }
        }

        System.out.println("The maximum repeating number is: " + result);
    }
}
