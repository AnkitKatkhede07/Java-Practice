//reverse any number
import java.util.*;
public class ReverseNumber
{
 public static void main(String args[])
 {
	 Scanner sc = new Scanner(System.in);
	 System.out.println("Enter a number for user:");
	 int no=sc.nextInt();
 for(;no > 0;)
 {
 int lastdigit=no%10;
 System.out.print(+lastdigit);
 no=no/10;
 }
 }
}