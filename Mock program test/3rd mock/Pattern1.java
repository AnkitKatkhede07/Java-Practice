//Q1. Write a java program to print this pattern. 
public class Pattern1 {
    public static void main(String[] args) {

        // Upper part of pattern
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
                if (j < i) { 
                    System.out.print(" * ");
                }
            }
            System.out.println();
        }

        // Lower part of pattern
        for (int i = 3; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
                if (j < i) {
                    System.out.print(" * ");
                }
            }
            System.out.println();
        }
    }
}
