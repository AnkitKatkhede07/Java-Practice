//Q4. Write a java program to display following series using function recursion. 
          //  1  4  9  16  25  36  49  64  81  100
import java.util.Scanner;
public class SquareSeries {
    
    // Recursive function to print squares
    static void printSeries(int n) {
        if (n == 0)
            return; // base case
        
        printSeries(n - 1); // recursive call

        System.out.print((n * n) + " ");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of terms: ");
        int n = sc.nextInt();
        System.out.println("Series of squares:");
        printSeries(n);
    }
}
