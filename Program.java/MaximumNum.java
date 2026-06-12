//Write a java program to find maximum between three numbers.
import java.util.*;
public class MaximumNum
{
 public static void main(String x[])
 {
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter a num");
   int num1=sc.nextInt();
   System.out.println("Enter a num");
   int num2=sc.nextInt();
   System.out.println("Enter a num");
   int num3=sc.nextInt();
   String str=(num1>num2 && num1>num3)?"num1":(num2>num3)?"num2":"num3";
   System.out.println(str);
   
 }
}