//Q8. Write a Java program to accept a 3-digit number and check whether it is an Armstrong number or not.
import java.util.*;
public class Armstrong
{
 public static void checkNum(int num)
{
   int sum=0;
   int origial=num;
   while(num!=0)
  {
   int digit =num%10;
   sum=sum+digit*digit*digit;
   num=num/10;
  }

if(sum==origial)
{
  System.out.println("Number is Armstrong");
}
else
{
 System.out.println("Number is not Armstrong");
}
}

  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
System.out.println("Enter Three Digit Number from User:"); 
int no=sc.nextInt();
checkNum(no);
 
  }
}