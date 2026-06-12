//Q1. Write a Java program to check whether a given number is positive, negative, or zero using if-else.
import java.util.Scanner;
class Num
{
  public static void main(String x[])
{
  Scanner sc = new Scanner(System.in);
System.out.println("Enter a number from user:");
int no=sc.nextInt();
checkNum(no);
   
}
public static void checkNum(int n)
{
  if(n>0)
{
  System.out.println("Number is Positive :"+n);
}
else if(n<0)
{
  System.out.println("Number is Negative :"+n);
}
else
{
  System.out.println("Number is Zero");
}


}
}