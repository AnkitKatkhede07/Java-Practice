//Write a Java program to check whether a number is divisible by 5 and 11 or not. 
import java.util.*;
public class CheckNumber
{
 public static void main(String x[])
 {
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter a number");
  int num=sc.nextInt();
  String str=(num%5==0 && num%11==0)?"number is vaild":"not vaild number";
  System.out.println(str);
 }
 }