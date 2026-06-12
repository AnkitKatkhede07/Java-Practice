//.Write a C program to print all even numbers between 1 to 100. - using while loop
import java.util.*;
public class PrintEven
{	
 public static void main(String x[])
 { 
 Scanner sc= new Scanner(System.in);
 System.out.println("Enter a numbers");
 int num=sc.nextInt();
   
   int i=2;
   while(i<=num)
   {
   System.out.println(i);
   i+=2;
   }
 }
}