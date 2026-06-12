import java.util.Scanner;
public class C1 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number for User:");
        int a=sc.nextInt();
        int b=sc.nextInt();
        boolean c=a>=b;
        System.out.println(c);

        sc.close();
    }
}
