// Write a java program to Check Number Is Spy Number or Not.
//Example :A number is said to be a Spy number if the sum of all the digits is equal 
//to the product of all digits.
	 //Input : 1412
	//Output : Spy Number
	//Explanation :
	//sum = (1 + 4 + 1 + 2) = 8
	//product = (1 * 4 * 1 * 2) = 8
	//since, sum == product == 8
	import java.util.*;
	public class SpyNumber
	{
	 public static void main(String x[])
	 {
	 
	 
	  Scanner sc = new Scanner(System.in);
	  System.out.println("Enter a number");
	  int num=sc.nextInt();
	  int sum=0;
	  int n=num;
	  int sum1=(num%10);//2
	  num=num/10;//141
	 int sum2=(num%10);//1
	  num=num/10;//14
	  int sum3=(num%10);//4
	  num=num/10;//1
	  
	  int y=num+sum1+sum2+sum3;
	  int z=num*sum1*sum2*sum3;
	  if (y==z){
	  System.out.println("is a spy number");
	  }
	  else
	  {
	   System.out.println("is a spy not number");
	  }
	  
	 }
	}
