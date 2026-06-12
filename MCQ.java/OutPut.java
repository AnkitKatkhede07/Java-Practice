/*13. Output?
 int a = 6;
boolean result = !(a < 5);
System.out.println(result);
A) true
 B) false
 C) Error
 D) 6
*/
import java.util.*;
public class OutPut
{
  public static void main(String x[])
  {
     Scanner sc = new Scanner(System.in);
	 System.out.println("Enter a number of A");
	 int a=sc.nextInt();
	 boolean result=!(a < 5);
	 System.out.println(result);
  }
}