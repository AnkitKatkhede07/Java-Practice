import java.util.*;

public class GptSum {
    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of square matrices:");
        int size = sc.nextInt();

        int arr1[][] = new int[size][size];
        int arr2[][] = new int[size][size];
        int arr3[][] = new int[size][size];

        System.out.println("Enter elements of 1st Array:");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                arr1[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter elements of 2nd Array:");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                arr2[i][j] = sc.nextInt();
            }
        }

        System.out.println("Resultant Matrix (Addition):");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                arr3[i][j] = arr1[i][j] + arr2[i][j];
                System.out.print(arr3[i][j] + "\t"); // better formatting
            }
            System.out.println(); // new line after each row
        }
    }
}
