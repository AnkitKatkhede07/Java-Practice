// Write a java program to check whether number is palindrome or not palindrome using   
//ternary operators.  
 import java.util.*;
 public class CheckPalin
 {
  public static void main(String []args)
  {
	Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number three");
	int num=sc.nextInt();
	int rem=num;
	int sum=0;
	//int rem=num;
	sum=sum+num%10*100;
	num=num/10;
	sum=sum+num%10*10;
	num=num/10;
	sum=sum+num%10*1;
	num=num/10;
	
	String str = (rem == sum)? "palindrome":"not palindrome";
	System.out.println(str);
	
  }
 }