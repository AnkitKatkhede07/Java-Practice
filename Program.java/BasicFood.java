/*Q60. Create a Java program to simulate a basic food ordering system using switch:
 1: Burger
 2: Pizza
 3: Pasta
 4: Sandwich
 Display the price for the selected item.
Explanation:
 Switch on food item number. Print item name and price. Default for invalid selection.*/
 import java.util.*;
 public class BasicFood 
 {
  public static void main(String x[])
  {
   Scanner sc= new Scanner(System.in);
   System.out.println("Enter a Selection");
   int selection=sc.nextInt();
   switch(selection)
   {
   case 1:
    int price=50;
   System.out.println("item name:"+"Burger:"+"price:"+price);
   break;
   case 2:
   price=300;
   System.out.println("item name:"+"Pizza:"+"price:"+price);
   break;
   case 3:
   price=40;
   System.out.println("item name:"+"Pasta:"+"price:"+price);
   break;
   case 4:
    price=100;
   System.out.println("item name:"+"Sandwich:"+"price:"+price);
   break;
   default:
   System.out.println("invalid selection");
   }
  }
 }
