//Q.Write a Java program that takes an alphabet character
// and toggles its case using ASCII values and operators.
       // Example: a → A, Z → z.
import java.util.*;
 public class AscciiOpreatore
 {
 public static void main(String x[])
 {
   Scanner sc= new Scanner(System.in);
   System.out.println("enter character");
   char ch=sc.next().charAt(0);
  // char toggled = (char) (ch+32);
   String str=(ch>= 'a' && ch<='z')?"toggled :"+(char)(ch-32):(ch>='A'&&ch <='Z')?"Toggled character:"+(char)(ch+32):"Invalid input! Please enter an alphabet";
   System.out.println(str);
 }
}
////invalid progarm//