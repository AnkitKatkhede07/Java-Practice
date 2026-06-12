//Write a Java program to input cost price and selling price of a product and check profit or loss.
import java.util.*;
public class CheckProfit
{
  public static void main(String x[])
  {
   Scanner sc = new Scanner(System.in);
   System.out.println("Enter a cost price:");
   int price=sc.nextInt();
   System.out.println("Enter a  selling price:");
   int sellingprice=sc.nextInt();
   if(price<sellingprice)
   {
      System.out.println("this is profit");
   }
   else
   {
   System.out.println("this is loss");
   }
  }
}