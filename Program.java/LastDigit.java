//Write a program to find first and last digit of a number without using loop in three digit.
import java.util.*;
public class LastDigit
{
 public static void main(String x[])
 {
    Scanner sc=new Scanner(System.in);
	System.out.println("Enter three digit:");
	int num=sc.nextInt();
	int d1=num%10;
	num=num/10;
	int d2=num%10;
	num=num/10;
	int d3=num;
	System.out.println("this is fisrt digit number:"+d3+ " second digit num:"+d1);
 }
}