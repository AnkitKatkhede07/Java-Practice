// Write a Java program to input cost price and selling price of a product and check profit or loss
import java.util.*;

 public class ProfitLoss
 {
   public static void main(String x[])
   {
     Scanner sc=new Scanner(System.in);
	 System.out.println("Enter a cost price");
	 int num=sc.nextInt();
	 System.out.println("Enter a selling price");
	 int num1=sc.nextInt();
	 String str=(num<=num1)?"Profit":"loss";
	 System.out.println(str);
   }
}