/*Write a java program to find the total number of notes in a given 
amount.   
Enter the amount: 2528  
Expected output : 500=5 , 100=0 , 50=0 , 20=1 , 10=0 , 5=1 , 2=1 , 1=1
*/
import java.util.*;

public class NoteCounter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the amount: ");
        int amount = sc.nextInt();

        int note500 = amount / 500;
        amount = amount % 500;

        int note100 = amount / 100;
        amount = amount % 100;

        int note50 = amount / 50;
        amount = amount % 50;

        int note20 = amount / 20;
        amount = amount % 20;

        int note10 = amount / 10;
        amount = amount % 10;

        int note5 = amount / 5;
        amount = amount % 5;

        int note2 = amount / 2;
        amount = amount % 2;

        int note1 = amount;

System.out.println("500=" + note500 + " , 100=" + note100 + " , 50=" + note50 + " , 20=" + note20 +
          " , 10=" + note10 + " , 5=" + note5 + " , 2=" + note2 + " , 1=" + note1);
        
        sc.close();
    }
}
