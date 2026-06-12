/*Q6. Write a Java program to find the second non-repeating character. 
 
Description: Find the second character appearing once. 
Input: Enter string: swiss 
Output: Second non repeating character: i */
import java.util.*;

public class Q6 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter string:");
        String s = sc.nextLine();

        int count[] = new int[256];

        //  frequency count
        for(int i = 0; i < s.length(); i++) {
            count[s.charAt(i)]++;
        }

        int found = 0;

        //   second non-repeating
        for(int i = 0; i < s.length(); i++) {
            if(count[s.charAt(i)] == 1) {
                found++;

                if(found == 2) {
                    System.out.println("Second non repeating character: " + s.charAt(i));
                    return;
                }
            }
        }

        System.out.println("Not found");
    }
}