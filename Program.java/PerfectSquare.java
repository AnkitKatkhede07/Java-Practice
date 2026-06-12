//Q50. Given a number, print Perfect Square if its square root is an integer,
 //otherwise Not Perfect Square — using ternary operators.
 import java.util.*;
 public class PerfectSquare
 {
  public static void main(String x[])
  {
    Scanner sc = new Scanner(System.in);
	System.out.println("Enter a number");
	int num=sc.nextInt();
	 int n=(int)Math.sqrt(num);
	String str=(n*n==num)?"Perfect Square":"Not Perfect Square";
	System.out.println(str);
  }
 }
