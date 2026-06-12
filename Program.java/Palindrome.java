//Q25. Write a java program to check whether number is palindrome or not. 
import java.util.*;
public class Palindrome
{
public static void main(String x[])
{
 Scanner sc=new Scanner(System.in);
 System.out.println("Enter a any three or four digit number");
  int num=sc.nextInt();
  //step1
  int n=num;
  int sum=0;
  sum=sum+(num%10)*100;
  num=num/10;
  //step2
  sum=sum+(num%10)*10;
  num=num/10;
  //step3
  sum=sum+(num%10)*1;
  num=num/10;
  
  String str=(n==sum)?"palindrome":"not palindrome";
  System.out.println(str); 
 
}
}
