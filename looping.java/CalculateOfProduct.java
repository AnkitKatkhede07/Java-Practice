//12. Write a java program to calculate the product of digits of a number.
import java.util.*;
public class CalculateOfProduct
{
 public static void main(String x[])
 {
 int num;
 int product=1;
    Scanner sc = new Scanner(System.in);
	System.out.println("Enter a number");
	num=sc.nextInt();
	while(num!=0)
	{
	   product=num%10*product;
	   num=num/10;
	}
		System.out.println("Number is product:"+product);
 }
}
