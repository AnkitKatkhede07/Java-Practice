//Write a java program to Check Number Is Spy Number or Not.
//Example :
//A number is said to be a Spy number if the sum of all the digits is equal to the product of all digits.
     //Input : 1412
     //Output : Spy Number 

//Explanation :
//sum = (1 + 4 + 1 + 2) = 8
//product = (1 * 4 * 1 * 2) = 8
//since, sum == product == 8

import java.util.*;
public class SpyNum
{
  public static void main(String x[])
  {
    Scanner sc=new Scanner(System.in);
	System.out.println("Enter a Spy num:");
	int num=sc.nextInt();
	
	int num1=1412;
	int d1=1412/1000;
	int d2=(1412/100)%10;
	int d3=(1412/10)%10;
	int d4=1412%10;
	
	int sum=d1+d2+d3+d4;
	int product=d1*d2*d3*d4;
	System.out.println((sum==product)?(num+"is a spy number"):(num+"is not a spy number"));
	
	
	
  }
}