 
/* Q1. Write a java program to print this pattern. 
 
 1 
 2 * 2 
 3 * 3 * 3 
 4 * 4 * 4 * 4 
 3 * 3 * 3 
 2 * 2 
 1 */
import java.util.Scanner;

public class Pattern {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();

        // Upper part
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(i);
                if(j<i) System.out.print(" * ");
            }
            System.out.println();
        }

        // Lower part
       /*  for(int i=n-1; i>=1; i--){
            for(int j=1; j<=i; j++){
                System.out.print(i);
                if(j<i) System.out.print(" * ");
            }
            System.out.println();
        } */
    }
}