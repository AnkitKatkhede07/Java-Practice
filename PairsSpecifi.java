/*Q9. Write a program in java to count all distinct pairs for a specific difference
Expected Output:
 The given array is:
 5 2 3 7 6 4 9 8
 The distinct pairs for difference 5 are: [7, 2] [8, 3] [9, 4]
 Number of distinct pairs for difference 5 are: 3*/
 
 
 
 /*import java.util.*;
 public class PairsSpecifi
 {
   public static void main(String []args)
   {
	   Scanner sc = new Scanner(System.in);
     System.out.println("Enter Element Size");
	 int size=sc.nextInt();
	 int arr[]=new int[size];
	 System.out.println("Enter difference pairs:");
	 int diff=sc.nextInt();
	 System.out.println("Enter arrays element in aaryas:");
	 int n=arr.length;
	 for(int i=0;i<n;i++)
	 {
	  arr[i]=sc.nextInt();
	 }
	 for(int i=0;i<n;i++)
	 {
	 for(int j=i+1;j<n;j++)
	 {
	   //arr[i]
	   System.out.println(arr[i]+""+arr[j]);
	 }
	 }
	 ////incompletede
	 
   }
 }*/
 import java.util.*;

public class PairsSpecifi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input array
        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();
        int arr[] = new int[n];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the specific difference:");
        int diff = sc.nextInt();

        // Store elements in a set for quick lookup
        HashSet<Integer> set = new HashSet<>();
        for (int num : arr) {
            set.add(num);
        }

        // To store unique pairs
        HashSet<String> pairs = new HashSet<>();

        // Check for pairs with given difference
        for (int num : arr) {
            if (set.contains(num + diff)) {
                int smaller = num;
                int larger = num + diff;
                String pair = "[" + larger + ", " + smaller + "]";
                pairs.add(pair);
            }
            if (set.contains(num - diff)) {
                int smaller = num - diff;
                int larger = num;
                String pair = "[" + larger + ", " + smaller + "]";
                pairs.add(pair);
            }
        }

        // Output result
        System.out.println("The given array is: " + Arrays.toString(arr));
        System.out.print("The distinct pairs for difference " + diff + " are: ");
        for (String p : pairs) {
            System.out.print(p + " ");
        }
        System.out.println("\nNumber of distinct pairs for difference " + diff + " are: " + pairs.size());
    }
}
