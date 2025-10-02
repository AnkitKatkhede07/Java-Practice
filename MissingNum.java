/*5. Find Missing Number in 1 to N
Problem:
Find a missing number from 1 to N in array of N-1 size.
Example:
Input: [1, 2, 4, 5], N = 5  
Output: 3 */
import java.util.*;
public class MissingNum
{
  public static void main(String []args)
  {
    Scanner sc= new Scanner(System.in);
	System.out.println("Enter a Array size");
	int size=sc.nextInt();
	// Read N
    System.out.println("Enter N (last number):");
     int N = sc.nextInt();
     // Create array of size N-1
    int arr[] = new int[N - 1];
	System.out.println("Enter " + (N - 1) + " elements:");
	int n=arr.length;
	for(int i=0;i<n;i++)
	{
	   arr[i]=sc.nextInt();
	}
	 // Expected sum of 1 to N
        int expectedSum = N * (N + 1) / 2;

        // Actual sum of array
        int actualSum = 0;
        for (int num : arr) {
            actualSum += num;
        }

        // Missing number
        int missing = expectedSum - actualSum;

        System.out.println("Missing Number: " + missing);
  }
}

