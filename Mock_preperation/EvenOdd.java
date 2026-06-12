import java.util.*;

public class EvenOdd {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size: ");
        int n = sc.nextInt();

        ArrayList<Integer> even = new ArrayList<>();
        ArrayList<Integer> odd = new ArrayList<>();

        for(int i=0;i<n;i++){
            int num = sc.nextInt();

            if(num % 2 == 0)
                even.add(num);
            else
                odd.add(num);
        }

        System.out.println("Even List: " + even);
        System.out.println("Odd List: " + odd);
    }
}