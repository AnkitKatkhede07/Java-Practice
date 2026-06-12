//Q43. Write a java program to accept two integers and check whether they are equal or not.
import java.util.*;
public class TwoNum
{
 public static void main(String x[])
 {
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter a number");
  int num1=sc.nextInt();
  System.out.println("Enter a number");
  int num2=sc.nextInt();
  String str=(num1==num2)?" this num is equal":"this num is not equal";
  System.out.println(str);
  
 }
}