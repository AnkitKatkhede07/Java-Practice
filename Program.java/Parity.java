/* Print Parity and Divisibility by 3.
Print :
"Even & Div by 3"


"Even"


"Div by 3"


"None"
*/
import java.util.*;
public class Parity
{
 public static void main(String []args)
 {
   Scanner sc = new Scanner(System.in);
   System.out.println("Enter a number");
   int num = sc.nextInt();
   String print=(num % 2 == 0 && num % 3 == 0)?"Even & Div by 3":
   (num % 2 ==0)? "Even":
   (num % 3 ==0)? "Div by 3":
   "None";
   System.out.println(print);
 }
}