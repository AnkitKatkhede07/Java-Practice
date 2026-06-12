/* Output of this code?
int a = 5, b = 3;
System.out.println((a > b) && (a + b > 10));
A) true
 B) false
 C) Error
 D) 8
*/
import java.util.*;
public class Code
{
 public static void main(String x[])
 {
 int a,b;
   Scanner sc = new Scanner(System.in);
   System.out.println("Enter a value of A");
   a=sc.nextInt();
   System.out.println("Enter a value of B");
   b=sc.nextInt();
   System.out.println((a>b)&&(a+b>10));
 }
}