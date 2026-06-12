/*Q5. Write a Java program to display the following series using function :  
 3   6   12   24   48   96  192  
 (Each term doubles from the previous term starting at 3)*/
import java.util.*;
public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of terms: ");
        int t = sc.nextInt();

        printSeries(t);

    }

    public static void printSeries(int t) {
        long val = 3;
        for (int i = 1; i <= t; i++) {
            System.out.print(val + (i == t ? "" : "   "));
            val *= 2;
        }
        System.out.println();
    }
}